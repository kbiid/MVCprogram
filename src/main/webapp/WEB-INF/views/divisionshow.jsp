<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr><td>교필</td><td>핵교</td><td>자율</td><td>전지</td><td>전기</td><td>전선</td><td>총학점</td></tr>
		<tr><td>${sum.must}</td><td>${sum.core}</td><td>${sum.free}</td><td>${sum.desig}</td><td>${sum.found}</td><td>${sum.choice}</td><td>${sum.total}</td></tr>
	</table>

</body>
</html>