<%-- 
    Document   : updateProduct
    Created on : 22 Sep, 2018, 1:08:40 PM
    Author     : aditya
--%>

<%@page import="com.ecom.ProductService"%>
<%@page import="com.ecom.Product"%>
<%@page import="com.ecom.Category"%>
<%@page import="com.ecom.CategoryService"%>
<%@page import="java.util.HashSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HashSet<Category> categories = new HashSet<Category>();
    categories = new CategoryService().getCategories();    
    int pcode = Integer.parseInt(request.getParameter("pcode"));
    Product product = new ProductService().searchProduct(pcode);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product Page</title>
    </head>
    <body>
        <center>
            <div style="width: 500px">
                <h3>
                    Add Product
                </h3>
                <hr>
                <div>
                    <form action="UpdateProduct" method="POST">
                        Product Code
                        <input  value="<%=pcode%>" name="pcode" type="number" />
                        <br><br>
                        Product Name
                        <input value="<%=product.getPname()%>" name="pname" type="text" />
                        <br><br>
                        Price
                        <input value="<%=product.getPrice()%>" name="price" type="number" />
                        <br><br>              
                        <select name="category">
                            <%
                                for (Category cat : categories) {                                    
                            %>
                            <option value="<%=cat.getCategoryCode()%>"><%=cat.getCategoryName()%></option>
                            <%
                                    }
                            %>                            
                        </select>
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
