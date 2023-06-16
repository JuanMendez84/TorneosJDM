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
	<form:form action="procesarFormTipo" modelAttribute="tipoNuevo" >

		Nombre: <form:input path="nombre" /><br>
		Descripcion: <form:input path="desc" /><br>
		<input type="submit" value="Enviar" />
	
	</form:form>
</body>
</html>
