<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/showProduct_tag_library.tld" prefix="tag" %>
<%
    int pcode = Integer.parseInt(request.getParameter("pcode"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <tag:ShowProductsTagHandler pcode="<%=pcode%>"/>
    </body>
</html>
