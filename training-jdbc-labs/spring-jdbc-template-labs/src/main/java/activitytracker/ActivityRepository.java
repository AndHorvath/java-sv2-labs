package activitytracker;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.Objects;

public class ActivityRepository {

    // --- attributes ---------------------------------------------------------

    private JdbcTemplate jdbcTemplate;

    // --- constructors -------------------------------------------------------

    public ActivityRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // --- getters and setters ------------------------------------------------

    public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }

    // --- public methods -----------------------------------------------------

    //language=SQL
    public void saveActivity(Activity activity) {
        jdbcTemplate.update(
            "insert into activities (start_time, description, activity_type) values (?, ?, ?)",
            Timestamp.valueOf(activity.getStartTime()), activity.getDescription(), activity.getType().name()
        );
    }

    public Long saveActivityAndGetId(Activity activity) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> getPreparedStatement(connection, activity), keyHolder);
        return Objects.requireNonNull(keyHolder.getKey()).longValue();
    }

    public Activity saveAndGetActivity(Activity activity) {
        Long id = saveActivityAndGetId(activity);
        activity.setId(id);
        return activity;
    }

    //language=SQL
    public Activity findActivityById(Long id) {
        return jdbcTemplate.queryForObject(
            "select * from activities where id = ?",
            (resultSet, rowNumber) -> getActivity(resultSet), id
        );
    }

    //language=SQL
    public List<Activity> listActivities() {
        return jdbcTemplate.query(
            "select * from activities",
            (resultSet, rowNumber) -> getActivity(resultSet)
        );
    }

    // --- private methods ----------------------------------------------------

    private PreparedStatement getPreparedStatement(Connection connection, Activity activity) throws SQLException {
        PreparedStatement preparedStatement = createPrepareStatementForSave(connection);
        parametrizeSaveUpdate(preparedStatement, activity);
        return preparedStatement;
    }

    //language=SQL
    private PreparedStatement createPrepareStatementForSave(Connection connection) throws SQLException {
        return connection.prepareStatement(
            "insert into activities (start_time, description, activity_type) values (?, ?, ?)",
            Statement.RETURN_GENERATED_KEYS
        );
    }

    private void parametrizeSaveUpdate(PreparedStatement preparedStatement, Activity activity) throws SQLException {
        preparedStatement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        preparedStatement.setString(2, activity.getDescription());
        preparedStatement.setString(3, activity.getType().name());
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
}