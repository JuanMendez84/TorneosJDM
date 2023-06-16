<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
    hr {
      border: none;
      border-top: 1px solid #000;
      margin: 20px 0;
    }

    .apartado {
      font-size: 20px;
      font-weight: bold;
      margin-bottom: 10px;
    }
</style>
<title>Insert title here</title>
</head>
<body>

<h1>Veremos si esto funciona</h1>

<img alt="un monton de juegos" src="${pageContext.request.contextPath}/recursos/img/games.jpg"></img>

<a href="muestraFormularioJugador">Formulario de alta de jugador.</a><br>
<a href="juego/formJuego">Formulario de alta de juego.</a>
<hr>
<div class="apartado">Administración</div>
<a href="admin/formTipo">Dar de alta un nuevo tipo de juego.</a>

</body>
</html>