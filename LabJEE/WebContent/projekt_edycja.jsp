<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ProjektEdycja" method="POST">
	<input name="btn_zapisz" value="Zapisz" type="submit">
</form>

ID zapisanego projektu: ${projekt.projektId} ($requestScope.projekt.nazwa})



</body>
</html>