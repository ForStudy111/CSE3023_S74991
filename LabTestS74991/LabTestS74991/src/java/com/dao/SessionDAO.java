/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

/**
 *
 * @author MP2-4
 */
import com.Bean.SessionBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

public class SessionDAO {

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/drivesmart_db", "admin", "root");
    }

    public void bookSession(SessionBean session) {

        String sql = "INSERT INTO Training_Sessions (student_name, branch_location, lesson_type, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setString(1, session.getStudent_name());
            pstmt.setString(2, session.getBranch_location());
            pstmt.setString(3, session.getLesson_type());
            pstmt.setString(4, session.getStatus());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<SessionBean> selectAllSessions() throws Exception {
        List<SessionBean> session = new ArrayList<>();
        String sql = "SELECT * FROM  Training_Sessions ORDER BY branch_location ASC";
        try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int session_id = rs.getInt("session_id");
                String student_name = rs.getString("student_name");
                String branch_location = rs.getString("branch_location");
                String lesson_type = rs.getString("lesson_type");
                String status = rs.getString("status");
                session.add(new SessionBean(session_id, student_name, branch_location, lesson_type, status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return session;
    }
}
