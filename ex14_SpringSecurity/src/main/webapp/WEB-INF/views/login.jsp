<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
</head>
<body>
	<h1>LOGIN PAGE</h1>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<input name="username"> <br>
		<input name="password"> <br>
		<input type="checkbox" name="remember-me" /> REMEMBER_ME<br>
		<button>로그인</button>
		
		<!-- CSRF TOKEN 전달 -->
		<%-- <input type="hidden" name="_csrf" value="${_csrf.token}" /> --%>
	</form>
	
	MSG : ${msg} <br>
	
</body>
</html>
		