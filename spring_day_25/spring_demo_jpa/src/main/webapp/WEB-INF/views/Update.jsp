<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.util.*" %>
    <%@page import="com.example.einfochips.model.*" %>
     <%@page import="com.example.einfochips.controlller.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%



%>
<% 

Movie mo = new Movie();
mo =(Movie) request.getAttribute("movieDetails");
%>

<h1>this is Update page</h1>
<br>
<br><br>
<h1>Movie Details</h1>
<form action="updateData" method="post" >   
<label> Movie ID </label>         
<input type="text" name="mid" value="<% out.print(mo.getMovieid()); %>" /> <br> <br> 
<label> Moview Name: </label>     
<input type="text" name="mname" value="<% out.print(mo.getMoviename()); %>"  /> <br> <br>  
<label> Director: </label>         
<input type="text" name="director"  value="<% out.print(mo.getDirector()); %>" /> <br> <br>  
<label> Language : </label>         
<input type="text" name="language" value="<% out.print(mo.getLanguage()); %>"  /> <br> <br>  
<input type="submit" name="submit" value="submit" /> <br> <br> 
</form> 


</body>
</html>