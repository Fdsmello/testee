<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>



<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado</title>
</head>
<body>
<form action="Calculadora" method="get">
<label> Valor A:</label>
<input type="text" name="valorA" value="${valorA}"></br>
<label> Valor B:</label>
<input type="text" name="valorB" value="${valorB}"></br>

<input type="submit" value="Somar" name="somar">
<input type="submit" value="Subtrair" name="subtrair"></br>
</form>
 Resultado é ${result}
</body>
</html>