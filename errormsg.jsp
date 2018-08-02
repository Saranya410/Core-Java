<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1>
if u r here,u hve error.plz crct the error nd proceed.
</h1>
<%
if(exception instanceof ArthimeticException)
{
	out.println("NUmber cant divide by 0");
}
else
{
	out.println("Sry...cant find reason");
}

%>
</body>
</html>