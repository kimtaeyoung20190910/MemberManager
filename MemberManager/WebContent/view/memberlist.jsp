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
	<div>
		<jsp:include page="topmenu.jsp"></jsp:include>
	</div>
	<div>
		<h2>회원 리스트</h2><br/>
	</div>
	<div>
		<table border="1">
			<tr>
				<th width="80">id</th>
				<th width="80">이름</th>
				<th width="120">가입일자</th>
				<th width="150">주소</th>
				<th width="150">전화번호</th>
			</tr>
			<c:forEach var="list" items="${list }">
			<tr>
				<td align="center">${list.id }</td>
				<td align="center">${list.name }</td>
				<td align="center">${list.edate }</td>
				<td align="center">${list.addr }</td>
				<td align="center">${list.tel }</td>
			</tr>
			</c:forEach>
		</table>
	</div>
		<br/><br/>
			<button type="button" onclick="location.href='index.do'">홈으로</button>
</div>
</body>
</html>