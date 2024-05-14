<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
</head>

<body>

	<h1>USER PAGE</h1>
	<hr>s
	${authentication}
	<hr>
	${name}
	<hr>
	${principal}
	<hr>
	${isAuthenticated}
	<hr>
	
	<form action="${pageContext.request.contextPath}/logout" methoo="post">
		<button>logout</button>
	</form>
	
</body>
</html>	