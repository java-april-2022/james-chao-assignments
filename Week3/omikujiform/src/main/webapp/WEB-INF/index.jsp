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
	
	<h1>Send an Omikuji!</h1>
	
	<div>	
	<form action="/info" method="post">
		
		<div>
		<label for="" class="form-label">Pick any number starting from 5 to 25</label>
		<input type="number" class="form-control" name="number" min="5" max="25"/>
		</div>
		
		<div>
		<label for="" class="form-label">Enter the name of any place</label>
		<input type="text" class="form-control" name="location"/>
		</div>
		
		<div>
		<label for="" class="form-label">Enter the name of a real person</label>
		<input type="text" class="form-control" name="person"/>
		</div>
		
		<div>
		<label for="" class="form-label">Enter a profession or hobby</label>
		<input type="text" class="form-control" name="hobby"/>
		</div>
		
		<div>
		<label for="" class="form-label">Enter name of a living thing</label>
		<input type="text" class="form-control" name="livingthing"/>
		</div>
		
		<div>
		<label for="" class="form-label">Share something kind</label>
		<textarea name="kindmessage" class="form-control" id="" cols="30" rows="4"></textarea>
		</div>
		
		<p>Send and show a friend.</p>
		<hr><input type="submit" value="Submit">
		
	</form>
	</div>
</body>
</html>