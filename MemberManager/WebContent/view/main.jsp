<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div>
		<jsp:include page="topmenu.jsp"></jsp:include>
	</div>
	<div>
		<c:if test="${id == null}">
			<br/>
			<h2>여기는 처음으로 들어오는 페이지입니다.</h2>
		</c:if>
		<c:if test="${id != null}">
			<br/>
			<h2>${id }님 환영합니다!!</h2>
		</c:if>
	</div>
</div>
</body>
</html>