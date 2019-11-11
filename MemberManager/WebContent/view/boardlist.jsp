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
	<div><jsp:include page="topmenu.jsp"></jsp:include></div>
	<div><h2>자유게시판 목록</h2></div>
	<div>
	<table border="1">
	<tr>
		<th align="center" width="40">번호</th>
		<th align="center" width="70">작성자</th>
		<th align="center" width="200">제목</th>
		<th align="center" width="100">작성일자</th>
		<th align="center" width="50">조회수</th>
	</tr>
		<c:forEach var="list" items="${list }">
	<tr>
		<td align="center"> ${list.id }</td>
		<td align="center"> ${list.writer }</td>
		<td align="center"> ${list.title }</td>
		<td align="center"> ${list.wdate }</td>
		<td align="center"> ${list.hit }</td>
	</tr>
	</c:forEach>
	</table>
	</div>
<c:if test="${id != null}">
	<div>
		<br/>
		<button type="button" onclick="location.href='boardWrite.do'">글쓰기</button>
	</div>
	</c:if>
</div>
</body>
</html>