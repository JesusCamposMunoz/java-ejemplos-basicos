<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
	<h1>TEST #1</h1>
	<form method="GET" action="TestServletOne">
		<input type="submit" value="Ejecutar GET">
	</form>
	<form method="POST" action="TestServletOne">
		<input type="submit" value="Ejecutar POST">
	</form>
	
	<h1>TEST #2</h1>
	<form method="GET" action="test2/TestServletTwo">
		<input type="submit" value="Ejecutar GET">
	</form>
	<form method="POST" action="test2/TestServletTwo">
		<input type="submit" value="Ejecutar POST">
	</form>
		<ul>
			<!-- /ofertas/action.do es donde est� publicado -->
			<li><a href="test2/TestServletTwo">Test #2</a>
		</ul>
		
	<h1>TEST #3</h1>
	<form method="GET" action="TestServletThree">
		<input type="submit" value="Ejecutar GET">
	</form>
	<form method="POST" action="TestServletThree">
		<input type="submit" value="Ejecutar POST">
	</form>
	</body>
</html>