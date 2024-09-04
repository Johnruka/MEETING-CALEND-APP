package se.lexicon.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CalendarDBConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/g51_meeting_calendar_db";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PWD = "788083";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    }

