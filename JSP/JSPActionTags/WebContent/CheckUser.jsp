<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uid=request.getParameter("uid");
if(uid.equals("admin"))
{
	%>
	<jsp:forward page="admin.jsp"></jsp:forward>
	<%
}
	else if(uid.equals("user"))
	{
		%>
		<jsp:forward page="user.jsp"></jsp:forward>
		<%
	}
		else
		{
		%>
		<jsp:forward page="User.html"></jsp:forward>
	<% 
}
%>
</body>
</html>