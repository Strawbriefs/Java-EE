<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><center>Registration Page</center></h4>
<form method="post" action="Process.jsp">
Enter First Name<input type="text" name="fname"><br>
Enter Last Name<input type="text" name="lname"><br>
Enter User ID<input type="text" name="uid"><br>
Enter Password<input type="password" name="pwd"><br>
Select Gender<input type="radio" name="gender" value="Male">Male<input type="radio" name="gender" value="Female">Female<br>
<input type="submit" value="Register"><input type="reset" value="Clear">

</form>
<div><center><input type="submit" name="login" value="Click here to Login"></center></div>
</body>
</html>