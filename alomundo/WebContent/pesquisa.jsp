<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Google</title>
</head>
<body>
<!-- SE O CONTEXTO FOR A RAIZ "/" IRÁ FUNCIONAR! -->
<!-- action="/alomundo" -> http://localhost:8082/alomundo  (matando o contexto)-404->
<!-- action="./alomundo" -> http://localhost:8082/AloMundo/alomundo  -- OK -->
<!-- action="http://localhost:8082/AloMundo/alomundo" --OK-->
<form action="http://localhost:8082/AloMundo/alomundo" method="post">
Pesquisa google: <input type="text" name="q"><br>
<button type="submit">Pesquisar</button>
</form>
</body>
</html>