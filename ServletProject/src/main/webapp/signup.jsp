<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-up page</title>
</head>
<body>
<h1>SignUp page</h1>
<form action="LoginServlet">
	<label for="uname">Username</label>
	<input type="text" name="uname" id="uname">
	
	<label for="email">E-mail </label>
	<input type="text" name="email" id="email">
	
	<label for ="pwd"> Password</label>
	<input type="password" name="pwd" id="pwd">
	<input type="submit" value="submit">
</form>
</body>
</html>