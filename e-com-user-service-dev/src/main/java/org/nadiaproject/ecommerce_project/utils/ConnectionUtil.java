package org.nadiaproject.ecommerce_project.utils;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

    private static Connection conn;

    public static Connection getConnection() throws SQLException, IOException {
        if (conn != null && !conn.isClosed()) {
            return conn;
        } else {
            try (InputStream input = ConnectionUtil.class.getClassLoader().getResourceAsStream("jdbc.properties")) {
                Properties properties = new Properties();
                properties.load(input);

                String url = properties.getProperty("jdbc.url");
                String username = properties.getProperty("jdbc.username");
                String password = properties.getProperty("jdbc.password");
                String driver = properties.getProperty("jdbc.driver");

                Class.forName(driver);

                conn = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}

