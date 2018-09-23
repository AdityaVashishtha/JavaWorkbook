<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <center>
            <div style="width: 500px">
                <h3>
                    Register 
                </h3>
                <hr>
                <div>
                    <form action="SaveUser" method="POST">
                        Username
                        <input name="username" type="text" />
                        <br><br>
                        Name
                        <input name="name" type="text" />
                        <br><br>
                        City
                        <input name="city" type="text" />
                        <br><br>
                        Gender
                        <input name="gender" type="radio" value="M" /> M
                        <input name="gender" type="radio" value="F" /> F
                        <br><br>
                        Password
                        <input name="password" type="password" />
                        <br><br>                        
                        <input type="submit" value="Register" />
                    </form>
                </div>
            </div>    
            <div>
                <a href="login.jsp">Login here</a>
            </div>
        </center> 
    </body>
</html>
