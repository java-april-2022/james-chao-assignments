<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>"${dojo.name}"</title>
</head>
<body>

	<h1><c:out value="${dojo.name}"/></h1>
	
	<table class="table table-light table-striped">
		<thead>
			<tr>
				<th>First Name |</th>
				<th>Last Name |</th>
				<th>Age |</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojo.ninjas}" var="ninja">
			<tr>
				<td>${ ninja.first_name }</td>
				<td>${ ninja.last_name }</td>
				<td>${ ninja.age }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>