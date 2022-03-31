package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityRepository {

    // --- attributes ---------------------------------------------------------

    private DataSource dataSource;

    // --- constructors -------------------------------------------------------

    public ActivityRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // --- getters and setters ------------------------------------------------

    public DataSource getDataSource() { return dataSource; }

    // --- public methods -----------------------------------------------------

    public void saveActivity(Activity activity) {
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                //language=SQL
                "insert into activities (start_time, description, activity_type) values (?, ?, ?)"
            )
        ) {
            executeSave(preparedStatement, activity);
        } catch (SQLException sqlException) {
            throw new IllegalStateException(getInsertExceptionMessage(), sqlException);
        }
    }

    public Long saveActivityAndGetId(Activity activity) {
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                //language=SQL
                "insert into activities (start_time, description, activity_type) values (?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS
            )
        ) {
            return executeSaveAndGetId(preparedStatement, activity);
        } catch (SQLException sqlException) {
            throw new IllegalStateException(getInsertExceptionMessage(), sqlException);
        }
    }

    public Activity saveAndGetActivity(Activity activity) {
        Long id = saveActivityAndGetId(activity);
        activity.setId(id);
        return activity;
    }

    public Activity findActivityById(Long id) {
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                //language=SQL
                "select * from activities where id = ?"
            )
        ) {
            return executeSelect(preparedStatement, id);
        } catch (SQLException sqlException) {
            throw new IllegalStateException(getQueryExceptionMessage(), sqlException);
        }
    }

    public List<Activity> listActivities() {
        try (
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement()
        ) {
            return getActivitiesList(statement);
        } catch (SQLException sqlException) {
            throw new IllegalStateException(getQueryExceptionMessage(), sqlException);
        }
    }

    // --- private methods ----------------------------------------------------

    private void executeSave(PreparedStatement preparedStatement, Activity activity) throws SQLException {
        parametrizeSaveUpdate(preparedStatement, activity);
        preparedStatement.executeUpdate();
    }

    private Long executeSaveAndGetId(PreparedStatement preparedStatement, Activity activity) throws SQLException {
        parametrizeSaveUpdate(preparedStatement, activity);
        preparedStatement.executeUpdate();
        return getActivityId(preparedStatement);
    }

    private Activity executeSelect(PreparedStatement preparedStatement, Long id) throws SQLException {
        preparedStatement.setLong(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                return getActivity(resultSet);
            }
            throw new IllegalArgumentException("No activity with specified id in database.");
        }
    }

    private void parametrizeSaveUpdate(PreparedStatement preparedStatement, Activity activity) throws SQLException {
        preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        preparedStatement.setString(2, activity.getDescription());
        preparedStatement.setString(3, activity.getType().name());
    }

    private Long getActivityId(PreparedStatement preparedStatement) throws SQLException {
        try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
            if (resultSet.next()) {
                return resultSet.getLong("insert_id");
            }
            throw new IllegalArgumentException("No id for specified activity in database.");
        }
    }

    private List<Activity> getActivitiesList(Statement statement) throws SQLException {
        List<Activity> activities = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(
            //language=SQL
            "select * from activities"
        )) {
            while (resultSet.next()) {
                activities.add(getActivity(resultSet));
            }
        }
        return activities;
    }

    private Activity getActivity(ResultSet resultSet) throws SQLException {
        Activity activity = new Activity(
            resultSet.getTimestamp("start_time").toLocalDateTime(),
            resultSet.getString("description"),
            Type.valueOf(resultSet.getString("activity_type"))
        );
        activity.setId(resultSet.getLong("id"));
        return activity;
    }

    private String getInsertExceptionMessage() {
        return "Cannot insert into database.";
    }

    private String getQueryExceptionMessage() {
        return "Cannot execute query.";
    }
}