<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학기별 이수 학점</title>
</head>
<body>
		
	<table>
		<tr><td>년도</td><td>학기</td><td>이수 학점</td><td>상세보기</td></tr>
		<tr><td>2012</td><td>1</td><td>13</td><td><a href="${pageContext.request.contextPath}/showcourse">링크</a></td></tr>
		<tr><td>2012</td><td>2</td><td>17</td><td><a href="${pageContext.request.contextPath}/showcourse2">링크</a></td></tr>
		<tr><td>2016</td><td>1</td><td>20</td><td><a href="${pageContext.request.contextPath}/showcourse3">링크</a></td></tr>
		<tr><td>2016</td><td>2</td><td>20</td><td><a href="${pageContext.request.contextPath}/showcourse4">링크</a></td></tr>
		<tr><td>2017</td><td>1</td><td>20</td><td><a href="${pageContext.request.contextPath}/showcourse5">링크</a></td></tr>
		<tr><td>2017</td><td>1</td><td>21</td><td><a href="${pageContext.request.contextPath}/showcourse6">링크</a></td></tr>
	</table>
</body>
</html>