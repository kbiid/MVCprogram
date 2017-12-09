<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>

	<p>
		<a href="${pageContext.request.contextPath}/totalshow"> 학기별 이수 학점
			조회</a>
	</p>
	<p>
		<a href="${pageContext.request.contextPath}/divisionshow"> 이수 구분별
			학점 조회</a>
	</p>
	<p>
		<a href="${pageContext.request.contextPath}/choice"> 수강 신청하기</a>
	</p>
	<p>
		<a href="${pageContext.request.contextPath}/enrolementview"> 수강 신청
			조회</a>
	</p>
</body>
</html>
