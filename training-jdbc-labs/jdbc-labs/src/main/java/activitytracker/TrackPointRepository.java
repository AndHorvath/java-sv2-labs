package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrackPointRepository {

    // --- attributes ---------------------------------------------------------

    private DataSource dataSource;

    private static final double LATITUDE_MIN = -90.0;
    private static final double LATITUDE_MAX = 90.0;
    private static final double LONGITUDE_MIN = -180.0;
    private static final double LONGITUDE_MAX = 180.0;
    private static final double EPSILON = Math.pow(10.0, -5.0);

    // --- constructors -------------------------------------------------------

    public TrackPointRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // --- getters and setters ------------------------------------------------

    public DataSource getDataSource() { return dataSource; }

    // --- public methods -----------------------------------------------------

    public void saveTrackPoint(LocalDate time, double latitude, double longitude, Long activityId) {
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                //language=SQL
                "insert into track_points (time, latitude, longitude, activity_id) values (? , ?, ?, ?)"
            )
        ) {
            executeUpdate(preparedStatement, time, latitude, longitude, activityId);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute update.", sqlException);
        }
    }

    public void saveTrackPointsForActivity(List<TrackPoint> trackPoints, Long activityId) {
        try (Connection connection = dataSource.getConnection()) {
            connection.setAutoCommit(false);
            executeUpdates(connection, trackPoints, activityId);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute update.", sqlException);
        }
    }

    public TrackPoint getTrackPointById(Long id) {
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                //language=SQL
                "select * from track_points where id = ?"
            )
        ) {
            return executeSelectForTrackPoint(preparedStatement, id);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute query.", sqlException);
        }
    }

    public Long getActivityIdByTrackPointId(Long trackPointId) {
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                //language=SQL
                "select * from track_points where id = ?"
            )
        ) {
            return executeSelectForActivityId(preparedStatement, trackPointId);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute query.", sqlException);
        }
    }

    public List<TrackPoint> getAllTrackPoints() {
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                //language=SQL
                "select * from track_points"
            )
        ) {
            return executeSelects(resultSet);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot execute query.");
        }
    }

    // --- private methods ----------------------------------------------------

    private void executeUpdate(
        PreparedStatement preparedStatement,
        LocalDate time, double latitude, double longitude, Long activityId) throws SQLException {

        validateCoordinates(latitude, longitude);

        preparedStatement.setDate(1, Date.valueOf(time));
        preparedStatement.setDouble(2, latitude);
        preparedStatement.setDouble(3, longitude);
        preparedStatement.setLong(4, activityId);
        preparedStatement.executeUpdate();
    }

    private void executeUpdates(
        Connection connection, List<TrackPoint> trackPoints, Long activityId) throws SQLException {

        try (PreparedStatement preparedStatement = connection.prepareStatement(
            //language=SQL
            "insert into track_points (time, latitude, longitude, activity_id) values (?, ?, ?, ?)"
        )) {
            executeUpdateTransaction(connection, preparedStatement, trackPoints, activityId);
        }
    }

    private void executeUpdateTransaction(
        Connection connection, PreparedStatement preparedStatement,
        List<TrackPoint> trackPoints, Long activityId) throws SQLException {

        for (TrackPoint trackPoint : trackPoints) {
            try {
                executeUpdate(
                    preparedStatement,
                    trackPoint.getTime(), trackPoint.getLatitude(), trackPoint.getLongitude(),
                    activityId);
            } catch (IllegalArgumentException illegalArgumentException) {
                connection.rollback();
            }
        }
        connection.commit();
    }

    private TrackPoint executeSelectForTrackPoint(
        PreparedStatement preparedStatement, Long id) throws SQLException {

        preparedStatement.setLong(1, id);
        TrackPoint trackPoint = getTrackPoint(preparedStatement);
        trackPoint.setId(id);
        return trackPoint;
    }

    private List<TrackPoint> executeSelects(ResultSet resultSet) throws SQLException {
        List<TrackPoint> trackPoints = new ArrayList<>();
        while (resultSet.next()) {
            trackPoints.add(createTrackPointFromResult(resultSet));
        }
        return trackPoints;
    }

    private TrackPoint createTrackPointFromResult(ResultSet resultSet) throws SQLException {
        TrackPoint trackPoint = new TrackPoint(
            resultSet.getDate("time").toLocalDate(),
            resultSet.getDouble("latitude"),
            resultSet.getDouble("longitude")
        );
        trackPoint.setId(resultSet.getLong("id"));
        return trackPoint;
    }

    private TrackPoint getTrackPoint(PreparedStatement preparedStatement) throws SQLException {
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                return new TrackPoint(
                    resultSet.getDate("time").toLocalDate(),
                    resultSet.getDouble("latitude"),
                    resultSet.getDouble("longitude")
                );
            }
            throw new IllegalArgumentException("No track point with specified id in database.");
        }
    }

    private Long executeSelectForActivityId(
        PreparedStatement preparedStatement, Long trackPointId) throws SQLException {

        preparedStatement.setLong(1, trackPointId);
        return getActivityId(preparedStatement);
    }

    private Long getActivityId(PreparedStatement preparedStatement) throws SQLException {
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getLong("activity_id");
            }
            throw new IllegalArgumentException("No activity with specified track point id in database.");
        }
    }

    private void validateCoordinates(double latitude, double longitude) {
        if (
            isLess(latitude, LATITUDE_MIN) || isGreater(latitude, LATITUDE_MAX) ||
                isLess(longitude, LONGITUDE_MIN) || isGreater(longitude, LONGITUDE_MAX)
        ) {
            throw new IllegalArgumentException("At least one of the specified coordinates is invalid.");
        }
    }

    private boolean isGreater(double value, double other) {
        return value > other + EPSILON;
    }

    private boolean isLess(double value, double other) {
        return value < other - EPSILON;
    }
}