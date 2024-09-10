<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>삼각형의 넓이</h1>
	가로 : ${triAreaVO.width} <br>
	세로 : ${triAreaVO.height} <br>
	넓이 : ${triAreaVO.getArea()} <br>
</body>
</html>