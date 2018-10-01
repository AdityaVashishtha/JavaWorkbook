<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username = null;
    String password = null;
    Cookie cookies [] = request.getCookies();
    for (Cookie cookie : cookies) {
        if(cookie.getName().equals("username")) {
            username = cookie.getValue();
        } else if(cookie.getName().equals("password")) {
            password = cookie.getValue();
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <center>
            <div style="width: 500px">
                <h3>
                    Login 
                </h3>
                <hr>
                <div>
                    <form action="VerifyUser" method="POST">
                        Username
                        <input value="<%= username != null ? username : "" %>" name="username" type="text" />
                        <br><br>
                        Password
                        <input value="<%= password != null ? password : "" %>" name="password" type="password" />
                        <br><br>
                        User Type
                        <select name="usertype">
                            <option value="admin">
                                Admin
                            </option>
                            <option value="buyer">
                                Buyer
                            </option>
                        </select>
                        <br><br>
                        Save Password
                        <input type="checkbox" name="savePassword" value="yes" />
                        <input type="submit" value="Login" />
                    </form>
                </div>
            </div>
            <div>
                <a href="register.jsp">Register here</a>
            </div>
        </center>  
    </body>
</html>
