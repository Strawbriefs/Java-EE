<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">
<h3><center>Employee Information</center></h3>
<%
out.println("Name is: "+request.getParameter("emp_name")+" Working with TCS"+"<br>");
out.println("Emp Role is: "+request.getParameter("role")+" Working since 4 Years"+"<br>");
out.println("Emp Dept is: "+request.getParameter("dept")+ " Location in Canada"+"<br>");
out.println("Emp Email is is: "+request.getParameter("email"));
%>
</body>
</html>