<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.onkar.services.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.onkar.services.*" %>
<%@ page import="com.onkar.classes.*" %>

<%
String username=request.getParameter("username");
StudentServices ss=new StudentServices();
ArrayList<info> a=ss.requestInfo(username);
%>

<%=(a.get(0)).toString() %>
<%=(a.get(1)) %>
<%=(a.get(2)) %>
<%=(a.get(3)) %>
</body>
</html>