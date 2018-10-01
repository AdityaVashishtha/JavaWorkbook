<%-- 
    Document   : searchProduct
    Created on : 24 Sep, 2018, 2:58:39 PM
    Author     : aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Product Page</title>
    </head>
    <body>
        <h1>Search Product Using Product Code</h1>
        <form action="showProductTag.jsp" method="get">
            <input type="text" name="pcode" placeholder="Search Pcode" />
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
