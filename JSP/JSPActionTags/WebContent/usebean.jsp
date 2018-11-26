<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="product" class="com.dao.Product"></jsp:useBean>
<jsp:setProperty name="product" property="id" value="1001"></jsp:setProperty>
<jsp:setProperty name="product" property="name" value="Laptop"></jsp:setProperty>
<jsp:setProperty name="product" property="price" value="34000"></jsp:setProperty>
<jsp:setProperty name="product" property="stock" value="14"></jsp:setProperty>
<h3><center>All the Information of Product</center></h3>
<h5>Product Id is: <jsp:getProperty name="product" property="id"></jsp:getProperty></h5>
<h5>Product name is: <jsp:getProperty name="product" property="name"></jsp:getProperty></h5>
<h5>Product Price is: <jsp:getProperty name="product" property="price"></jsp:getProperty></h5>
<h5>Product Stock is: <jsp:getProperty name="product" property="stock"></jsp:getProperty></h5>
</body>
</html>