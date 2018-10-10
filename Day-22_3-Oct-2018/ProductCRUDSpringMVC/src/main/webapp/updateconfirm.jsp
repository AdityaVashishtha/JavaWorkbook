<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Done</title>
</head>
<body>
	<h1>Updated Product Successfully!!</h1>
	<table>
		<thead>
			<h2>Product Details</h2>
		</thead>
		<tbody>
			<tr>
				<th>NAME</th>
				<td>${product.pname}</td>
			</tr>
			<tr>
				<th>Code</th>
				<td>${product.pcode}</td>
			</tr>
			<tr>
				<th>Price</th>
				<td>${product.price}</td>
			</tr>
			<tr>
				<th>Brand</th>
				<td>${product.brand}</td>
			</tr>
			<tr>
				<th>Category</th>
				<td>${product.category}</td>
			</tr>
		</tbody>
	</table>
	<br>
	<a href="index.jsp">HOME</a>
</body>
</html>