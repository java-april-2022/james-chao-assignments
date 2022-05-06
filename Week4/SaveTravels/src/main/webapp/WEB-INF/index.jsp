<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body style="margin": 10vw;">
<h1>Save Travels</h1>
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th class="text-center">Expense</th>
            <th class="text-center">Vendor</th>
            <th class="text-center">Amount</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="expense" items="${expenses}">
			<tr>
				<td class="text-center"><c:out value="${expense.name}"></c:out></td>
				<td class="text-center"><c:out value="${expense.vendor}"></c:out></td>
				<td class="text-center">$<c:out value="${expense.cost}"></c:out></td>
			</tr>	
		</c:forEach>
    </tbody>
    </table>
<br>
<div>
<h1>Add an expense:</h1>
<form:form action="/expenses" method="post" modelAttribute="expense">
	<div>
		<form:label path="name">Expense Name</form:label><br/>
		<form:errors path="name" class="text-danger"/>
		<form:input style="width:250px;" path="name"/>
	</div>
	<div>
		<form:label path="vendor">Vendor: </form:label><br/>
		<form:errors path="vendor" class="text-danger"/>
		<form:input style="width:250px;" path="vendor"/>
	</div>
	
	<div>
		<form:label path="cost">Cost: </form:label><br/>
		<form:errors path="cost" class="text-danger"/>
		<form:input style="width:250px;" type="Double" path="cost"/>
	</div>
	
	<div>
		<form:label path="description">Description: </form:label><br />
		<form:errors path="description" class="text-danger"/>
		<form:textarea style="width:250px;" rows="3" path="description"/>
	</div>
	
	<div>
		<input type="submit" value="Submit" />
	</div>
</form:form>
</div>
</body>
</html>