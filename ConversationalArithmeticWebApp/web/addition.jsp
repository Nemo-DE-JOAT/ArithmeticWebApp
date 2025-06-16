<%-- 
    Document   : addition
    Created on : Jun 16, 2025, 3:43:40 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addition Page</title>
    </head>
    <body>
        <h1>Addition</h1>
       <%
            String compName = application.getInitParameter("comp_name");
            String name = (String)session.getAttribute("name");
        %>
        <p>
            Hi <b><%=name%></b>, it's <b><%=compName%></b> again.
            In this section we are going to practice addition. ENJOY!!.
        </p>    
        <ul>
             <li><a href="GetAdditionQuestionServlet.do">get a question.</a></li>
            <li><a href="summary.jsp">Show summary.</a></li>
        </ul>
    </body>
</html>
