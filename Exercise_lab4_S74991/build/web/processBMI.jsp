<%-- 
    Document   : processBMI
    Created on : Apr 22, 2026, 11:04:53 PM
    Author     : wpy92
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process BMI</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <% 
            // Retrieve and Convert values
            String weightString = request.getParameter("weight");
            String heightString = request.getParameter("height");
            
            double weight = Double.parseDouble(weightString);
            double height = Double.parseDouble(heightString);
            
            // Calculate BMI
            double bmi = weight / (height * height);
            
            // Determine Category
            String category= "";
            if (bmi < 18.5) {
                category = "Underweight";
            }
            
            else if (bmi >= 18.5 && bmi <= 25) {
                category = "Normal";
            }
            
            else {
                category = "Overweight";
            }  
        %>
        
        <jsp:forward page="resultBMI.jsp">
            <jsp:param name="bmiValue" value="<%= String.valueOf(bmi) %>" />
            <jsp:param name="bmiCategory" value="<%= category %>" />
        </jsp:forward>
    </body>
</html>
