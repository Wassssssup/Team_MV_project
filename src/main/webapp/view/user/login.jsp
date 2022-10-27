<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>로그인</h1>
	<form action="" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="userPassword"></td>
			</tr>
			<tr>
			<td colspan="2" align="center"><input type="button" value="로그인"></td>
			<c:if test="${message == 'error'}">
				<div style="color:red;">아이디 또는 비밀번호가 일치하지 않습니다.</div>
			</c:if>
			<c:if test="${message == 'logout'}">
				<div style="color:red;">로그아웃 되었습니다.</div>
			</c:if>
			</tr>
		</table>
	</form>
</div>
</body>
</html>