<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Here's Your Omikuji</h1>
	<div>
		<p>
			In <c:out value="${number}"/> years you will live in <c:out value = "${location}"/> 
			with <c:out value = "${person}"/> as your roommate, selling <c:out value = "${hobby}"/> 
			for a living. The next time you see a <c:out value = "${livingthing}"/>, you will have good luck. 
			Also, <c:out value = "${kindmessage}"/>.
		</p>
	</div>
	
	<a class="m-3 d-flex justify-content-center" href="/">New Omikuji</a>

</body>
</html>