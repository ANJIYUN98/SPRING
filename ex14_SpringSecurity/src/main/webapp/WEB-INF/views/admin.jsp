<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
	<title>Home</title>
	
</head>
<body>
	<h1>ADMIN PAGE</h1>
	
	PRINCIPAL : <sec:authentication property="principal"/><br>
	USERDTO : <sec:authentication property="principal.userDto"/><br>
	USERNAME : <sec:authentication property="principal.userDto.username"/><br>
	ROLE : <sec:authentication property="principal.userDto.role"/><br>
	ISAUTHENTICATED : <sec:authorize access="isAuthenticated()">LOGINED...</sec:authorize>
	
	<form action="${pageContext.request.contextPath}/logout" methoo="post">
		<button>logout</button>
	</form>
	
</body>
</html>		
