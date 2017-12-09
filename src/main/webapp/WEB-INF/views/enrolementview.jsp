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
		<tr>
			<td>년도</td>
			<td>학기</td>
			<td>교과코드</td>
			<td>교과목명</td>
			<td>구분</td>
			<td>학점</td>
		</tr>
		<c:forEach var="offer" items="${offer}">
			<tr>
				<td>${offer.getYear()}</td>
				<td>${offer.getSemester()}</td>
				<td>${offer.getCoursecode()}</td>
				<td>${offer.getCoursename()}</td>
				<td>${offer.getDivision()}</td>
				<td>${offer.getCredit()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>