<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> User Form</h1>
	
	<form action="UserForm" method="POST">
		<div>
			First Name : <input type="text" name="firstName" id = "firstName">
		</div> <br />
		<div>
			Last Name : <input type="text" name="lastName" id = "lastName">
		</div> <br />
		<div>
			Email ID : <input type="email" name="emailId" id = "emailId">
		</div><br />
		
		<div>
			Phone No : <input type="number" name="phoneNo" id = "phoneNo">
		</div><br />
		<div>
			City : <input type="text" name="city" id = "city">
		</div><br />
		
		<div>
			<button type="submit" style="background-color: green;color: white;">Submit</button>
		</div>
		
	</form>
</body>
</html>