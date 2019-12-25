<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{background-color:powderblue;}
h1   {color: blue;}

</style>
<meta charset="ISO-8859-1">
<title>Classifiers</title>
</head>
<body>
<%
String username=(String) session.getAttribute("username_");
response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
%>
<h1 style="color:blue"> Hello <%= username %> </h1>
<pre><h2 style="background-color:powderblue;"><a href="#Profile">Profile</a> <a href=classifiers.jsp">Classifiers</a> <a href="#account">Account</a></h2></pre>
<h3>Your classfiers</h3>
<form action="create" method="post">
<input type="text" name="classifier" placeholder="Classifier name">
<input type="submit" value="Create">
</form>
<br>
<a href=#voc>VOC</a><br>

<form action="logout" method="post">
<input type="submit" value="Logout">
</form>
</body>
</html>