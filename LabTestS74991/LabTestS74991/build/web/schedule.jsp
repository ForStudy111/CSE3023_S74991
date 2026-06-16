<%-- 
    Document   : schedule
    Created on : 16 Jun 2026, 3:19:36 PM
    Author     : MP2-4
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Schedule</title>
    </head>
    <body>
        <h2>Schedule</h2>
        <table border="1" cellpadding="8">
            <thead>
                <tr style="background-color: lightgray;">
                    <th>Session ID</th>
                    <th>Student Name</th>
                    <th>Branch Location</th>
                    <th>Lesson Type</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${sessionList}" var="session">
                <tr>
                    <td>${session.session_id}</td>
                    <td>${session.student_name}</td>
                    <td>${session.branch_location}</td>
                    <td>${session.lesson_type}</td>
                    <td>${session.status}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
