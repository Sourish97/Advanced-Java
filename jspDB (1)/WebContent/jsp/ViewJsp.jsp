<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
td,th{
	border:1px solid black;
	width:20%;
	text-align:center;
	padding:5px;
}

table{
	border-collapse:collapse;
}
</style>
</head>
<body>
<%@ page import="com.sourish.services.*"%>
<%@ page import="com.sourish.classes.*"%>
<%@ page import="java.util.*"%>
<% String username=request.getParameter("username");%>
<% StudentService s=new StudentService();
ArrayList<Info> details=s.requestUser(username);
int p,c,m;
if(!details.isEmpty()){
%>
<table>
<caption>Student Marks</caption>
<tr>
<th><%=(details.get(0).getName()) %></th>
<td><%=(details.get(0).getValue())%></td>
</tr>

<tr>
<th><%=(details.get(1).getName()) %></th>
<td><%= p=Integer.parseInt(details.get(1).getValue().trim()) %></td>
</tr>

<tr>
<th><%=(details.get(2).getName()) %></th>
<td><%=(c=Integer.parseInt(details.get(2).getValue().trim())) %></td>
</tr>

<tr>
<th><%=(details.get(3).getName()) %></th>
<td><%=(m=Integer.parseInt(details.get(3).getValue().trim()))%></td>
</tr>

<tr>
<th>Total</th>
<td><%=p+c+m%></td>
</tr>
</table>
<%} else{%>
<h1>User not available in DB</h1>
<%} %>
</body>
</html>