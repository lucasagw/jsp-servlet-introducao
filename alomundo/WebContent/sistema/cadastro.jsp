<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import= "br.com.lucasagw.servlet.model.Usuario" %>
    <%@ page import= "br.com.lucasagw.servlet.model.PapelEnum"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
</head>
<body>
<%
Usuario usuario = new Usuario();
//Obtendo o usuario da sessão
Object object = session.getAttribute("usuario");
if(object == null){
	response.sendRedirect("login.jsp");
}else{
   usuario = (Usuario) object;
   System.out.println(usuario.getPapel());
   if(!usuario.getPapel().equals(PapelEnum.ADMINISTRADOR)){
	   response.sendRedirect("login.jsp");
   }
}
%>
<h1>Cadastro de Usuario</h1>
<form action="./cadastrar" method="post">
   Login: <input type="text" name="login"> <br>
   Senha: <input type="password" name="senha"> <br>
   Papel: <select name="papel">  
          <option value="">Selecione</option>
          <option value="USUARIO">Usuario</option>
          <option value="ADMINISTRADOR">Admin</option> 
          </select><br>  
   <button type="suhmit">Salvar</button>
   
</form>


</body>
</html>