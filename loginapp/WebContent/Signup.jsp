<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register here</h1>
<p>Create a new account</p>
<form method="post" action="register" autocomplete="on">
User name:<input type="text" name="uname" size="20" placeholder="username" ><br><br>
Email ID: <input type="email" name="email" size="30" placeholder="your email id" ><br><br>
Password:<input type="password" name="pass" size="30" placeholder="Password should be at least 6 characters" ><br><br>
Confirm Password:<input type="password" name="conpass" size="30" placeholder="Repeat the password" ><br><br>
<input type="submit" value="Register"><br>
</form>
<p>Already have an account?<a href="LoginForm.html">Sign in</a>
</body>
</html>