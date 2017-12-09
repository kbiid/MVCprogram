<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>수강신청</title>
</head>
<body>
	<sf:form method="post" action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">

	<table class="formtable">
		<tr> <td class="label"> 과목명: </td> <td> <sf:input class="control" type="text" path="coursename"/> <br/> 
			<sf:errors path="coursename" class="error"/> </td> </tr>
		<tr> <td class="label"> 과목코드: </td> <td> <sf:input class="control" type="text" path="coursecode"/> <br/>
			<sf:errors path="coursecode" class="error"/> </td> </tr>
		<tr> <td class="label"> 구분: </td> <td> <sf:input class="control" type="text" path="division"/> <br/>
			<sf:errors path="division" class="error"/> </td> </tr>
		<tr> <td class="label"> 학점: </td> <td> <sf:input class="control" type="text" path="credit"/> <br/>
			<sf:errors path="credit" class="error"/> </td> </tr>
		<tr> <td class="label"> </td> <td> <input class="control" type="submit" value="수강 신청"/> </td> </tr>
	</table>

</sf:form>
</body>
</html>