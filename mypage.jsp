<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String un = request.getParameter("t1");
out.println("Name is : "+un);

 

String em = request.getParameter("t4");
out.println("Email is :"+em);


String num = request.getParameter("t3");
out.println("Phone is :"+num);

%>



</body>
</html>