<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Practice</title>
</head>
<body>
<form action="CServlet" method="post">
username:<input type="text" name="username">
password:<input type="password" name="password">
<input type="submit" value="Create">
</form>
<form action="FServlet" method="post">
<input type="submit" value="Fetch">
</form>
<form action="UServlet" method="post">
IdModify:<input type="number" name="idmodify">
UserNameModify:<input type="text" name="namemodify">
UserPasswordModify:<input type="text" name="passwordmodify">
<input type="submit" value="Modify">
</form>
<form action="DServlet" method="post">
IdTODelete:<input type="number" name="iddelete"> 
<input type="submit" value="Destroy">
</form>
</body>
</html>