<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Product</h1>
	<form:form action="saveproduct" method="post" modelAttribute="product">			
			Product Name:		<form:input type="text" path="pname" placeholder="Name" />
		<br>
		<br>
			Product Code:		<form:input type="text" path="pcode" placeholder="Code" />
		<br>
		<br>
			Product Brand:		<form:radiobuttons path="brand" items="${brands}" />
		<br>
		<br>
			Product Category:	<form:checkboxes path="category" items="${categories}" />
		<br>
		<br>
			Product Price:		<form:input type="text" path="price" placeholder="Price" />
		<br>
		<input type="submit" value="Save" />
	</form:form>
	<hr>
	<form:errors path="product.*" />

</body>
</html>