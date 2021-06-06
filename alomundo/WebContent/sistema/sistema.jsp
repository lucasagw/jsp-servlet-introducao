<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "br.com.lucasagw.servlet.model.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema</title>


</head>
<body>
<%
Usuario usuario = new Usuario();
//Obtendo o usuario da sessão
//Object object = request.getSession().getAttribute("usuario");
Object object = session.getAttribute("usuario");
if(object == null){
	response.sendRedirect("login.jsp");
}else{
   usuario = (Usuario) object;
}
%>

<a href="./sistema.jsp">HOME</a>

<h1>Bem vindo, - <%=usuario.getLogin()%></h1>
<br>


<!-- servlet (logica negocio) -> jsp -->
<a href="./listar">Lista Usuario</a> <br> 
<!-- jsp -> post servlet -->
<a href="./cadastro.jsp">Cadastro Usuario</a>
</body>
</html>

