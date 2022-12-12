<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.shamily.User"%>
    <%@ page import="com.shamily.Database"%>
	<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<table border="1">
<caption style="background-color:blue;color:white;size:12"><b>Table of Customer Information</b></caption>
<tr style="background-color:#A6E0F9;color:black;size:11">
<th rowspan="2">S.No</th>
<th colspan="2">Name</th>
<th rowspan="2">Email Id</th>
<th rowspan="2">Phone Number</th>
<th rowspan="2">City</th>
</tr>
<tr style="background-color:#A6E0F9;color:black;size:11">
<th>First Name</th>
<th>Last Name</th>
</tr>
<%
List<User> userList1 = (List<User>)request.getAttribute("users");
Integer i=0;
for(User userObj : userList1)
{
i+=1;
%>
<tr>
<td><%= i %></td>
<td><%= userObj.getFirstName() %></td>
<td><%= userObj.getLastName() %></td>
<td><%= userObj.getEmailId() %></td>
<td><%= userObj.getPhoneNo() %></td>
<td><%= userObj.getCity() %></td>
</tr>
<%
}
%>
</table>


</div>


</body>
</html>