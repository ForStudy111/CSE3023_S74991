<%-- 
    Document   : book_session.jsp
    Created on : 16 Jun 2026, 3:19:16 PM
    Author     : MP2-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Form</title>
    </head>
    <body>
        <h2>Book Session</h2>
        <form action="BookSessionServlet" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="action">
            Student Name: <input type="text" name="student_name" required><br><br>
            Branch Location: <input type="text" name="branch_location" required><br><br>
            Lesson Type: <input type="text" name="lesson_type" required><br><br>
            <br>
            <br>
            <input type="submit">
        </form>
    </body>
</html>
