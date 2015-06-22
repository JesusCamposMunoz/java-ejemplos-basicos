<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	VARIABLE #1: ${variable1}<br>
	VARIABLE #1: ${requestScope.variable1}<br>
	*********************************************<br><br><br>
	LISTA #1: ${lista1}<br>
	<c:set var="iteracion">
		1
	</c:set>
	ITERACION: ${iteracion}<br>
	<c:forEach var="elemento" items="${lista1}" varStatus="i">
		Elemento #${i.index}: ${elemento}<br>
	</c:forEach>
	<br>
	*********************************************
	<br>
	
	<% request.setAttribute("jesusNombre","jesus campos muñoz"); %> 
	
	<% request.getSession().setAttribute("jesus","jesuscamposmunoz"); %>
	
	<form method="POST" action="TestServletTwo">
		<input type="hidden" id="campoOculto" name="campoOcultoNombre" value="333">
		<input type="submit" value="Ejecutar POST">
	</form>
	<a href="TestServletTwo">Test #2</a> 
</body>
</html>