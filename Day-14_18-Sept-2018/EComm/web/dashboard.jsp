<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   String username = (String) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buyer Home</title>
    </head>
    <body>
        <%
            if(username.equals("admin")) {
        %>
            <h1>Welcome <%= session.getAttribute("user")%></h1>
            <hr>
            <ul>
                <li><a href="addProduct.jsp"> Add Product </a></li>
                <li><a href="ExploreStore"> Store </a></li>            
                <li><a href="Logout"> Logout </a></li>   
            </ul>
        
        <%
            } else if(username != null) {
        %>
                <h1>Welcome <%= session.getAttribute("user")%></h1>
                <hr>
                <ul>
                    <li><a href="ExploreStore"> Explore Store </a></li>
                    <li><a href="updateProfile.jsp"> Update Profile </a></li>     
                    <li><a href="Logout"> Logout </a></li>     
                </ul>
        <%
            } else {
                response.sendRedirect("login.jsp");
            }
        %>
        
    </body>
</html>
