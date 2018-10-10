<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Product</title>
</head>
<body>
	<center>
		<h1>Search Product</h1>
		<form action="searchproduct" method="POST">
			By Product Code: 
			<select name="code">
				<jstl:forEach var="pcode" items="${pcodes}">
					<option>${pcode}</option>
				</jstl:forEach>
			</select>
			<input type="submit" value="Search" />
		</form>
	</center>
</body>
</html>