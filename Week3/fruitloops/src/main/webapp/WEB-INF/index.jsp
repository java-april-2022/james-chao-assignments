<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

	<!--<c:out value="someVariable"/> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/home.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>



<title>Fruit Store</title>
</head>
<body>
	<h1>Fruit Store</h1>
		<div class="container">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			
			<c:forEach var="fruit" items="${fruits}">
				<tr>
					<td>${fruit.name}</td>
					<td>${fruit.price}</td>
				</tr>
			</c:forEach>
			

		</table>
	
	</div>
</body>
</html>