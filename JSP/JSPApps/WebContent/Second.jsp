<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>My First JSP</title>
</head>
<body bgcolor="lightgrey">
<%--declare variables and methods inside declaration tags--%>
<%!
String name;
char grade;
public int totalMarks(int sub1, int sub2, int sub3)
{
	return sub1+sub2+sub3;
}
%>
<%--Written java code and logic stuff inside scriptlet --%>
<%
name=request.getParameter("name");
int first_sub=Integer.parseInt(request.getParameter("sub1"));
int second_sub=Integer.parseInt(request.getParameter("sub2"));
int third_sub=Integer.parseInt(request.getParameter("sub3"));
int total_marks=totalMarks(first_sub,second_sub,third_sub);
if(total_marks>=300)
{
	grade='A';
}
else if(total_marks>=250)
{
grade='B';	
}
else
{
	grade='C';
}
%>
<%--expression tags used to express the name , marks and grade --%>
<h3>Student Name is: <%=name %></h3>
<h3>Total Marks is: <%=total_marks%></h3>
<h3><font color='green'>The Result of the Student is: <%=grade%> Grade</font></h3>
</body>
</html>