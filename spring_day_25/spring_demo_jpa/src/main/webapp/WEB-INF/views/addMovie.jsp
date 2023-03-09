<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<a href="/all"> Goto Insert Page</a><br><br>
<h4>this is add movie page</h4><br><br><br>
<h1>Movie Details</h1>
<form action="insertMovie" method="post" >   
<label> Movie ID </label>         
<input type="text" name="mid" /> <br> <br> 
<label> Moview Name: </label>     
<input type="text" name="mname" /> <br> <br>  
<label> Director: </label>         
<input type="text" name="director" /> <br> <br>  
<label> Language : </label>         
<input type="text" name="language" /> <br> <br>  
<input type="submit" name="submit" value="submit" /> <br> <br> 
</form> 

</body>
</html>