<%@page import="java.util.HashSet"%>
<%@page import="com.ecom.ProductService"%>
<%@page import="com.ecom.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%                                  
            HashSet<Product> products = (HashSet<Product>)session.getAttribute("carts");                        
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Cart</title>
    </head>
    <body>
        <h1>Your Cart</h1>
        <form action="RemoveMultipleFromCart" method="post">
        <%
            if(products != null) {
                for (Product product : products) {
                    out.println("<a href='productDetails.jsp?pcode="+product.getPcode()+"'>"+product.getPname()+"</a>"
                            + " <a href='RemoveFromCart?pcode="+product.getPcode()+"'>x</a>"
                            + "<input type='checkbox' name='pcode' value='"+product.getPcode()+"' />"
                            + "<br>");
                }
            } else {
                out.println("<h3>Nothing to view</h3>");
            }
        %>
        
        <input type="submit" name="submit" value="Delete Checked" />
        </form>
    </body>
</html>
