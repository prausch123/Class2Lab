<%-- 
    Document   : response
    Created on : Aug 25, 2014, 9:49:42 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Name Response</h1>
        <%
            Object obj = request.getAttribute("name");
            if(obj == null) {
                out.println("Sorry, something went wrong");
            } else {
                out.println(obj.toString());
            }
        %>
    </body>
</html>
