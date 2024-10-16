package jbdc;

import java.sql.Connection;

public class MainJDBCTest {
    public static void main(String[] args) {
        Connection con = JDBCconnector.getConnection();
    }
}
