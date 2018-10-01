<%-- 
    Document   : updateProfile
    Created on : 20 Sep, 2018, 4:49:46 PM
    Author     : aditya
--%>

<%@page import="com.ecom.User"%>
<%@page import="com.ecom.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    String username = (String) session.getAttribute("user");
    User user = new UserService().fetchUser(username);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile Page</title>
    </head>
    <body>
        <center>
            <div style="width: 500px">
                <h3>
                    Update Profile 
                </h3>
                <hr>
                <div>
                    <form action="UpdateUser" method="POST">
                        Username
                        <input value="<%=user.getUsername()%>" name="username" type="text" />
                        <br><br>
                        Name
                        <input value="<%=user.getName()%>" name="name" type="text" />
                        <br><br>
                        City
                        <input value="<%=user.getCity()%>" name="city" type="text" />
                        <br><br>
                        Gender                        
                        <input checked="true" name="gender" type="radio" value="M" /> M
                        <input name="gender" type="radio" value="F" /> F
                        <br><br>
                        Password
                        <input value="<%=user.getPassword()%>" name="password" type="password" />
                        <br><br>                        
                        <input type="submit" value="Update Details" />
                    </form>
                </div>
            </div>    
            <div>
                <a href="login.jsp">Login here</a>
            </div>
        </center> 
    </body>
</html>
