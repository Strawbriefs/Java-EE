<%@ page import="com.dao.*,java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String uid=request.getParameter("uid");
String pwd=request.getParameter("pwd");
String gender=request.getParameter("gender");
Connection con=DBConnection.getConnection();
PreparedStatement ps=con.prepareStatement("insert into user_register values(?,?,?,?,?)");
ps.setString(1,fname);
ps.setString(2,lname);
ps.setString(3,uid);
ps.setString(4,pwd);
ps.setString(5,gender);
int count=ps.executeUpdate();
if(count>0){
	RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp");
	rd.include(request,response);
	out.println("<h4><center><font color='green'>Registration Sucess...!!</font></center></h4>");
}
%>
</body>
</html>