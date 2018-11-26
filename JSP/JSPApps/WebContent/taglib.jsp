<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--declare a variables and initialized here --%>
<core:set var="sal" value="${12000}"/>
<%--print the sal using out --%>
<p>Your Income is: <core:out value= "${sal}"/></p>
<core:choose>
<core:when test="${sal<=2000 }">Your Salary is very Less..</core:when>
<core:when test="${sal>=5000 }">Your Salary is Good..</core:when>
<core:otherwise>
Income is undetermined..
</core:otherwise>
</core:choose>
</body>
</html>