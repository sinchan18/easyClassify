<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body style="background-color:LightGray;">
<%
response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
%>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","admin");
String username=(String) session.getAttribute("username_");
%>
<h1 style="color:blue"> Hello <%= username %> </h1>
<pre><h2 style="background-color:powderblue;"><a href="#Profile">Profile</a> <a href="classifiers.jsp">Classifiers</a> <a href="#account">Account</a></h2></pre>
<form action="logout" method="post">
<input type="submit" value="Logout">
</form>
</body>
</html>