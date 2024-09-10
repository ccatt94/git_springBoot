<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성적표</h1>
	국어 : ${grade.kor}<br>
	영어 : ${grade.eng}<br>
	수학 : ${grade.math}<br>
	<br>
	총점 : ${grade.total} <br>
	평균 : ${grade.avg} <br>
	총점 : ${grade.getTotal()} <br>
	평균 : ${grade.getAvg()} <br>
	
</body>
</html>