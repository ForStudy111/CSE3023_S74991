<%-- 
    Document   : index
    Created on : 16 Jun 2026, 3:22:08 PM
    Author     : MP2-4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body style="text-align: center;">

        <!--Header-->
        <%@include file="header.html" %>

        <div style="padding: 20px; color: red; text-align: left;">
            <nav>
                <a href="book_session.jsp">Booking Form</a><br>
                <a href="ScheduleServlet">Schedule Dashboard</a>
            </nav>
        </div>

        <!--Footer-->
        <%@include file="footer.jsp" %>
</html>
