<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>수정 폼</title>
</head>
<body>
	<form action="/pet/edit" method="post">
	<input type="text" name="name" value="${pet.name}"/><br>
	<input type="text" name="division" value="${pet.division}" /><br>
	<input type="text" name="kind" value="${pet.kind}" /><br>
	<input type="text" name="desc" value="${pet.desc}"/><br>
	<input type="submit" value="수정" /><br>
	</form>
</body>
</html>