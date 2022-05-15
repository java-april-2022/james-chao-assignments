<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<h1>Ninjas</h1>
<form:form action="/ninjas" method="post" modelAttribute="ninja">

    <p>
    	<form:errors path="first_name" />
        <form:label path="first_name">First Name:</form:label>
        <form:input path="first_name"/>
    </p>
    
    <p>
    	<form:errors path="last_name" />
        <form:label path="last_name">Last Name:</form:label>
        <form:input path="last_name"/>
    </p>
    <p>
    	<form:errors path="dojo" />
        <form:label path="age">Age:</form:label>
        <form:input path="age"/>
    </p>
    
    <p>
        <form:label path="dojo">Dojo:</form:label>
        
        <form:select path="dojo">
        
        	<c:forEach var="eachDojo" items="${dojos}">
	        
	        	<option value="${eachDojo.id}"><c:out value="${eachDojo.name}"/></option>
	        
        	</c:forEach>
        	
        </form:select>
    </p>
    
    
    <input type="submit" value="Submit"/>
    
</form:form> 
</body>
</html>