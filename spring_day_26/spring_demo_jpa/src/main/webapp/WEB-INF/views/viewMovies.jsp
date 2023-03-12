<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.example.einfochips.model.*" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>this is viewMovies page</h2>

${movies} 

<h5>this is for jstl use</h5>
<c:forEach items="${movies}" var="m">
<h2>${m.language} </h2>
</c:forEach>

<br><br>
<a href="/add"> Goto Insert Page</a><br><br><br>
<% 
List<Movie> li = (ArrayList<Movie>) request.getAttribute("movies");
%>
<table style="border-style:solid; text-align: center;">
    <thead>
        <tr style="border:solid;">
            <th>ID</th>
            <th>Name</th>
            <th>Director</th>
            <th>Language</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
    </thead>
    <tbody style="border:10px;">
       <% for(Movie u : li)
       {
            out.print("<tr>");
            out.print("<td>"+u.getMovieid()+"</td>");
            out.print("<td>"+u.getMoviename()+"</td>");
            out.print("<td>"+u.getDirector()+"</td>");
            out.print("<td>"+u.getLanguage()+"</td>");
            
            out.print("<td>"); 
            %>    
             <form action="deleteById" method="get">
             <input type="text" hidden="true" placeholder="Delete" name="deleteid" value="<% out.print(u.getMovieid()); %>">
             <input type="submit" style="background-color: red;" placeholder="Delete" value="Delete" >
             <br>
             </form>
            <% 
            out.print("</td>");
            out.print("<td>"); 
            
            %>    
            <form action="getMovieById" method="get">
            <input type="text" hidden="true" placeholder="Delete" name="updateid" value="<% out.print(u.getMovieid()); %>">
            <input type="submit" style="background-color: aqua;" placeholder="Delete" value="Update" >
            <br>
            </form>
           <% 
           out.print("</td>");
            out.print("</tr>");
       }
       %>
    </tbody>
</table>
<br>
<h1>thia is for filter</h1>
<a href="viewmoviebylang?lang=English">English</a><br>
<a href="viewmoviebylang?lang=Hindi">Hindi</a><br>
<a href="viewmoviebylang?lang=Tamil">Tamil</a><br>
<br>

<form action="viewmoviebyCV" method="get">
            <input type="text" placeholder="Column Name" name="columnN" >
             <input type="text" placeholder="Column Value" name="columnV" >
            <input type="submit" style="background-color: red;" placeholder="Search" value="Search" >
            <br>
            </form>
 

</body>
</html>