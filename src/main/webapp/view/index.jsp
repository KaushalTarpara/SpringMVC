<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Jasper </h1>
	<form action="addAlien" method="post">
		Enter your id : <input type="text" name="aid"><br>
		Enter your name : <input type="text" name="aname"><br>
		<input type="submit">
	</form>
	<br>
	<h1>Search Aline</h1>
	<form action="getAlien" method="GET">
		Enter your id : <input type="text" name="aid"><br>		
		<input type="submit">
	</form>
</body>
</html>