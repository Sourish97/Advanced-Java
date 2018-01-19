<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chemistry</title>
</head>
<body>
<jsp:useBean id="userinfo" scope="application" class="com.sourish.entity.Marks"></jsp:useBean>
<jsp:setProperty property="p" name="userinfo"/>
<form action="maths.jsp">
<input type="text" name="c" placeholder="Chemistry">
<input type="submit" value="Next">
</form>
</body>
</html>