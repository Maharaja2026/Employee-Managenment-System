<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
background-color: #4070F4;
}
table{
height:350px;
width: 350px;
border-radius:15px;
text-align: center;
position: relative;
left:50px;
}
#signup_module{
border: 3px solid black;
background-color: white;
border-radius: 30px;
height: 510px;
width: 450px;
margin-left: 440px;
margin-top: 100px;
text-align: center;
font-weight: bold;
}
h1{
color: black;
font-weight: bold;
}
input[type="submit"]{
background-color: green;
text-align: center;
border-radius: 10px;
color:white;
height:35px;
width: 100px;
position: relative;
top: 10px;
font-size: 15px;
}
input[type="submit"]:hover{
font-size: 17px;
}
p {
	font-weight: lighter;
	position: relative;
	top: 5px;
}
p>a{
text-decoration: none;
}
</style>
</head>
<body>
<div id="signup_module">
<h1>Signup</h1>

<table>
<form:form action="save" modelAttribute="employee">
<td>Name</td>
<td> <form:input path="empName"/> </td>
</tr>
<tr>
<td>Salary</td>
<td> <form:input path="empSalary"/> </td>
</tr>
<tr>
<td>Contact</td>
<td><form:input path="empContact"/></td>
</tr>
<tr>
<td>Email</td>
<td> <form:input path="empEmail"/> </td>
</tr>
<tr>
<td>Password</td>
<td> <form:input path="empPassword"/> </td>
</tr>
</table>
<input type="submit">
</form:form>
<p>Already have an account? <a href="login.jsp">Login</a></p>
</div>
</body>
</html>