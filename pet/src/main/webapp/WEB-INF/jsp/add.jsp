<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>등록 폼</title>
</head>
<body>
	<form action="/pet/add" method="post">
	이름 : <input type="text" name="name" value="멍구" /><br>
	종류 : <input type="text" name="division" value="강아지" /><br>
	품종: <input type="text" name="kind" value="믹스" /><br>
	기타 : <input type="text" name="desc" value="겁이 많음" /><br>
	<input type="submit" value="등록" />
	</form>
</body>
</html>