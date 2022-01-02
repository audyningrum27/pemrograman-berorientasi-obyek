package gui;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
 *
 * @author audy
 */
public class ConnectionDB {
    private final MysqlDataSource dataSource = new MysqlDataSource();
    private final String DB_URL = "jdbc:mysql://localhost:3306/pbo-tugas14";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "";

    public Connection getConnection() throws SQLException {
        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        Connection conn = dataSource.getConnection();
        
        return conn;
    }
}
