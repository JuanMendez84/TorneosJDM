<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/chatgpt.css">
<title>Insert title here</title>
</head>
<body>
	<form:form action="procesarFormularioJugador" modelAttribute="jugadorAlta">

		Nombre: <form:input path="nombre" /><br>
		Apellidos: <form:input path="apellidos" /><br>
		DNI: <form:input path="DNI" />
		<form:errors class="errores" path="DNI" /><br>
		Nick: <form:input path="nick" />
		<form:errors class="errores" path="nick" /><br>
		Email: <form:input path="email" />
		<form:errors class="errores" path="email" /><br><br>
		<input type="submit" value="Enviar" />
	
	</form:form>
</body>
</html>
