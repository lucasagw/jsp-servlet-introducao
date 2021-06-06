<%@page import="java.util.List"%>
<%@page import= "br.com.lucasagw.servlet.model.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import= "br.com.lucasagw.servlet.model.PapelEnum"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="usuario" class="br.com.lucasagw.servlet.model.Usuario" scope="session"></jsp:useBean>
</head>
<body>		
<%
//Usuario usuario = new Usuario();
//Obtendo o usuario da sessão
//Object object = session.getAttribute("USER");
//if(object == null){
//	response.sendRedirect("login.jsp");
//}else{
 //  usuario = (Usuario) object;
//}
//%>	
	
	
	
	
	<h1>Lista Usuario</h1>
	<table border="1">
		<tr>
			<th>Login</th>
			<th>Excluir</th>
		</tr>
         <%
         List<Usuario> usuarios = (List<Usuario>) request.getAttribute("lista");
         for(Usuario item : usuarios ){     	
        	
          %>
		<tr>
			<td><%=item.getLogin()%></td>
			<td>
			  <%System.out.println(usuario.getPapel());%>
			   <%if(usuario.getPapel().equals(PapelEnum.ADMINISTRADOR)){%>
        	  <a href="./remove?id=<%=item.getLogin()%>">X</a></td>
        	  <%} %>
		</tr>
		  <%}%>
	</table>
</body>
</html>