 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="errormsg.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
                                                                                                                                                                     <body>

<h1>Hello JSP</h1><br>
<%
for(int i=1;i<=10;i++)
{
out.println(i+"<br>");
}
%>
<%=new java.util.Date() %>
<%
out.println(5/0);
%>
</body>
</html>





