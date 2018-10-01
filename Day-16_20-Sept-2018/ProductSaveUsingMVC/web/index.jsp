<%-- 
    Document   : index
    Created on : 24 Sep, 2018, 3:12:42 PM
    Author     : aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Save Product Page</title>
    </head>
    <body>
        <h1>Save Product MVC example</h1>
        <pre>
            <form action="SaveProductController" method="POST">
                Product Name :      <input type="text" placeholder="Product Name" name="pname" />
                <br>
                Product Price :     <input type="number" placeholder="Price" name="price" />
                <br>
                Product Code :      <input type="text" placeholder="Code" name="pcode" />
                <br>
                Product Category :  <select name="ccode">
                    <option value="1">Electronics</option>
                    <option value="2">Vehicle</option>
                </select>
                <br>
                                    <input type="submit" value="Save"/>                        
            </form>
        </pre>
    </body>
</html>
