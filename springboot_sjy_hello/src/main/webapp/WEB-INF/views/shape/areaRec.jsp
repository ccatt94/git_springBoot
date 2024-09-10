<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사각형의 넓이</h1>
	가로 : ${recAreaVO.width} <br>
	세로 : ${recAreaVO.height} <br>
	넓이 : ${recAreaVO.getArea()} <br>
</body>
</html>