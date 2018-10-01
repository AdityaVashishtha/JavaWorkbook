<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="savedProduct" scope="request" class="com.productMVC.ProductBean" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Save Result</title>
    </head>
    <body>
        <h1>Hurray Product Saved!!</h1>
        <h2>
            Product Name: <jsp:getProperty name="savedProduct" property="pname"/>
        </h2>
        <h2>
            Product Code: <jsp:getProperty name="savedProduct" property="pcode"/>
        </h2>
        <h2>
            Product Price: <jsp:getProperty name="savedProduct" property="price"/>
        </h2>
        <h2>
            Product Category: <jsp:getProperty name="savedProduct" property="ccode"/>
        </h2>
    </body>
</html>
