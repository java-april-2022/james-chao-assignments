<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="header">
		<h3 style="color: Blue">Expense Details</h3>
		<a href="/expenses">Go Back</a>
	</div>
	<div>
		<div class="row">
			<div class="col col-lg-4">
				Expense Name: ${expense.name}
			</div>
		</div>
		<div class="row">
			<div class="col col-lg-4">
				Expense Description: ${expense.description}
			</div>
		</div>
		<div class="row">
			<div class="col col-lg-4">
				Vendor: ${expense.vendor}
			</div>
		</div>
		<div class="row">
			<div class="col col-lg-4">
				Cost: <fmt:formatNumber value="${expense.cost}" type="currency"/>
			</div>
		</div>
	</div>
</body>
</html>