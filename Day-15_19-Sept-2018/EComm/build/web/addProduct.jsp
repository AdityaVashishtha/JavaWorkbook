<%@page import="com.ecom.CategoryService"%>
<%@page import="com.ecom.Category"%>
<%@page import="java.util.HashSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HashSet<Category> categories = new HashSet<Category>();
    categories = new CategoryService().getCategories();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product Page</title>
    </head>
    <body>
        <center>
            <div style="width: 500px">
                <h3>
                    Add Product
                </h3>
                <hr>
                <div>
                    <form action="SaveProduct" method="POST">
                        Product Code
                        <input name="pcode" type="number" />
                        <br><br>
                        Product Name
                        <input name="pname" type="text" />
                        <br><br>
                        Price
                        <input name="price" type="number" />
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
                        <input type="submit" value="Save" />
                    </form>
                </div>
            </div>    
            <div>
                <a href="login.jsp">Login here</a>
            </div>
        </center> 
    </body>
</html>
