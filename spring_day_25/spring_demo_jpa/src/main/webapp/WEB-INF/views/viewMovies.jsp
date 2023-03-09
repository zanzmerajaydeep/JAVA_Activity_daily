<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.example.einfochips.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>this is viewMovies page</h2>

${movies} 
<br><br><br>
<a href="/add"> Goto Insert Page</a><br><br><br>
<% 
List<Movie> li = (ArrayList<Movie>) request.getAttribute("movies");
%>
<table style="border-style:solid; border: 1px solid black;">
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
            <input type="submit" style="background-color: red;" placeholder="Delete" value="Update" >
            <br>
            </form>
           <% 
           out.print("</td>");
            out.print("</tr>");
       }
       %>
    </tbody>
</table>

 

</body>
</html>