<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>
</head>
<body>
	<table>
		<thead>
			<h2>Product List</h2>
		</thead>
		<tbody>
			<tr>
				<th>NAME</th>
				<th>CODE</th>
				<th>BRAND</th>
				<th>CATEGORY</th>
				<th>PRICE</th>
			</tr>
			<jstl:forEach items="${products}" var="prd">
				<tr>
					<td>${prd.pname}</td>
					<td>${prd.pcode}</td>
					<td>${prd.brand}</td>
					<td>${prd.category}</td>
					<td align="right">${prd.price}</td>
					<td><a href="deleteproduct?code=${prd.pcode}">Delete Product</a></td>
					<td><a href="updateproduct?code=${prd.pcode}">Update Product</a></td>
				</tr>
			</jstl:forEach>
		</tbody>
	</table>
	<br>
	<a href="index.jsp">HOME</a>
</body>
</html>