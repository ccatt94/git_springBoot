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
	국어점수 : ${gradeVO.kor} <br>
	영어점수 : ${gradeVO.eng} <br>
	수학점수 : ${gradeVO.math} <br>
	총점 : ${gradeVO.total} <br>
	평균 : ${gradeVO.avg} <br>
	성적 : ${gradeVO.grade} <br>
	
	
</body>
</html>