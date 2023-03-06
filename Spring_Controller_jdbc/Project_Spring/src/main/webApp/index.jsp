<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red">this is Index Page</h1>

<%String name = "this is jsp";  %>
<%=name %>
<% out.print(2*5); %> 

<a href="register">GOTO Register</a><br>
<a href="success">GOTO success</a>

</body>
</html>