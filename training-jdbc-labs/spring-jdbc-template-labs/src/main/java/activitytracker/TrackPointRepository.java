package activitytracker;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class TrackPointRepository {

    // --- attributes ---------------------------------------------------------

    private JdbcTemplate jdbcTemplate;

    // --- constructors -------------------------------------------------------

    public TrackPointRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // --- getters and setters ------------------------------------------------

    public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }

    // --- public methods -----------------------------------------------------

    //language=SQL
    public void saveTrackPoint(LocalDate time, double latitude, double longitude, Long activityId) {
        jdbcTemplate.update(
            "insert into track_points (time, latitude, longitude, activity_id) values (?, ?, ?, ?)",
            time, latitude, longitude, activityId
        );
    }

    //language=SQL
    public TrackPoint getTrackPointById(Long id) {
        return jdbcTemplate.queryForObject(
            "select * from track_points where id = ?",
            (resultSet, rowNumber) -> createTrackPointFromResult(resultSet), id
        );
    }

    //language=SQL
    public Long getActivityIdByTrackPointId(Long trackPointId) {
        return jdbcTemplate.queryForObject(
            "select * from track_points where id = ?",
            (resultSet, rowNumber) -> resultSet.getLong("activity_id"), trackPointId
        );
    }

    //language=SQL
    public List<TrackPoint> getAllTrackPoints() {
        return jdbcTemplate.query(
            "select * from track_points",
            (resultSet, rowNumber) -> createTrackPointFromResult(resultSet)
        );
    }

    // --- private methods ----------------------------------------------------

    private TrackPoint createTrackPointFromResult(ResultSet resultSet) throws SQLException {
        TrackPoint trackPoint = new TrackPoint(
            resultSet.getDate("time").toLocalDate(),
            resultSet.getDouble("latitude"),
            resultSet.getDouble("longitude")
        );
        trackPoint.setId(resultSet.getLong("id"));
        return trackPoint;
    }
}