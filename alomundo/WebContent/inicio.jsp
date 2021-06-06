<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="site.css" rel="stylesheet"></link>
</head>
<body>

<%
out.println("alguma coisa");
out.println(2 + 2);
%>
<!-- Como comentar em HTML -->
<br>

<%
//Como comentar em JAVA
String p = request.getParameter("parametro");
out.println("Parametro = " + p);
%>


<form action="#" method="get">
Usuario:<input type="text" name="usuario"><br> 
Senha:<input type="password" name="senha"><br>
	<button type="submit">Entrar</button>
</form> 
</body>
</html>