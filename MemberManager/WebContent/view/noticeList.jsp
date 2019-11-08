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
	<div>
	<br/>
		<c:choose>
		<c:when test="${empty list }"> <!-- 비었을때 -->
			<h2>공지사항이 없습니다.</h2></c:when>
		<c:otherwise>
		<div>
			<h2>공지사항</h2></div>
		<br/>
		<div>
			<table border="1">
			<tr>
				<th width="50">번호</th>
				<th width="100">제목</th>
				<th width="180">내용</th>
				<th width="150">게시날짜</th>
				<th width="50">조회수</th>
			</tr>
			<c:forEach var="list" items="${list }">
			<tr onmouseover="this.style.backgroundColor='AliceBlue'"
					onmouseout="this.style.backgroundColor=''">
				<td align="center">${list.id }</td>
				<td align="center">${list.title }</td>
				<td align="center">${list.contents }</td>
				<td align="center">${list.date }</td>
				<td align="center">${list.hit }</td>
			</tr>
			</c:forEach>
			</table>
		</div>
		</c:otherwise>
		</c:choose>
		</div>
	</div>
</body>
</html>
