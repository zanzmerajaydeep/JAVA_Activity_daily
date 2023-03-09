<%@ page language ="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*"  %>
 <%@ page import="com.example.einfochips.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is Success</h1>
<%


List<User> li = (ArrayList<User>) request.getAttribute("data");
for(User u : li)
{out.print(u);}

%>
<table style="border-style:solid;border-color: #96D4D4">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
    </thead>
    <tbody>
       <% for(User u : li)
       {
            out.print("<tr>");
            out.print("<td>"+u.getUsername()+"</td>");
            out.print("<td>"+u.getSurname()+"</td>");
            out.print("<td>"+u.getNumber()+"</td>");
            out.print("</tr>");
       }
       %>
    </tbody>
</table>


</body>
</html>