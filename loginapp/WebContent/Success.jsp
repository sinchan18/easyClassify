<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("username_")==null){
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("LoginForm.html");
	requestDispatcher.forward(request, response); 
}
else {
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("Welcome.jsp");
	requestDispatcher.forward(request, response); 	
}
%>

</body>
</html>