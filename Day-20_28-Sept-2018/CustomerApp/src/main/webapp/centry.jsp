<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>
</head>
<body>
	<h1>
		Add Customer
	</h1>
	<form action="saveCustomer">
		<label for="customerCode">Customer Code:</label>
		<input id="customerCode" name="ccode" placeholder="Code" type="text"/>
		<br>
		<label for="customerName">Customer Name:</label>
		<input id="customerName" name="cname" placeholder="Name" type="text"/>
		<br>
		<label for="customerAddr">Customer Address:</label>
		<input id="customerAddr" name="address" placeholder="Address" type="text"/>
		<br>
		<input type="submit" value="Save" />
	</form>
</body>
</html>