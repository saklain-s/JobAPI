package com.saklain.firstjobapp;

import java.sql.*;

public class PgTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/YOUR_DB_NAME";
        String user = "postgres";
        String password = "saklain#4S";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Connection successful");
        } catch (SQLException e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
        }
    }
}
