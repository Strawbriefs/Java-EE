<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<jsp:include page="empinfo.jsp">
<jsp:param name="emp_name" value="Chintan"/>
<jsp:param name="role" value="Developer"/>
<jsp:param name="dept" value="IT"/>
<jsp:param name="email" value="Chintan@gmail.com"/>
</jsp:include>
</body>
</html>