<%-- 
    Document   : menu
    Created on : Jun 16, 2025, 3:29:41 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <h1>Menu</h1>
        <%
            String compName = application.getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=name%></b>, my name is <b><%=compName%></b>.
            Please select one of the following options:
        </p>
        <ul>
            <li><a href="addition.jsp">Practice addition.</a></li>
            <li><a href="multiplication.jsp">Practice multiplication.</a></li>
            <li><a href="division.jsp">Practice division.</a></li>
            <li><a href="subtraction.jsp">Practice subtraction.</a></li>
            <li><a href="summary.jsp">Show summary.</a></li>
        </ul>
    </body>
</html>
