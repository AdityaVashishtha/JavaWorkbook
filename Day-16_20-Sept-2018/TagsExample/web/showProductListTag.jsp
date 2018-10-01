<%-- 
    Document   : showProductListTag
    Created on : 24 Sep, 2018, 2:51:06 PM
    Author     : aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/showProduct_tag_library.tld" prefix="tag" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Product List</title>
    </head>
    <body>
        <h3>Product List Using Tags</h3>
        <ul>
        <tag:ShowProductListTag />  
        </ul>
    </body>
</html>
