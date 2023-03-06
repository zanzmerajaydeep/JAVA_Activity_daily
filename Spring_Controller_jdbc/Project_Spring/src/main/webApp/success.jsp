<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.einfochips.controllers.*" import="java.util.List" %>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is success Page</h1>
<h1>${nm}</h1>


<h2>Data of Register User</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Email</th>
    </tr>
    <% jspController jc = new jspController();
       List<User> l2 = jc.showData();
    %> 
    <c:forEach items="${l2}" var="theme" varStatus="status">
        <tr>
            <td>${theme.id}</td>
            <td>${theme.name}</td>
            <td>${theme.surname}</td>
            <td>${theme.email}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>