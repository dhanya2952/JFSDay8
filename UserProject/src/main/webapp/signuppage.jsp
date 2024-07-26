<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>SignUp page</h1>
<form action="UserServlet">
<div>
	<label for="email">E-mail </label>
	<input type="text" name="email" id="email">
</div>	

<div>
	<label for="uid">User-id </label>
	<input type="text" name="uid" id="uid">
</div>	
	<label for="mobile">Mobile Number </label>
	<input type="text" name="mobile" id="mobile">
	
	<label for="uname">User name</label>
	<input type="text" name="uname" id="uname">
	
	<label for ="pwd"> Password</label>
	<input type="password" name="pwd" id="pwd">
	<input type="submit" value="submit">
</form>

</body>
</html>