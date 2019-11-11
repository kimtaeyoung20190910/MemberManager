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
			<h2>자유게시판 세부글 읽기</h2>
		</div>
		<div>
			<table border="1">
				<tr>
					<th align="center" width="70">작성자</th>
					<td align="center" width="100">${list[0].writer }</td>
					<th align="center" width="70">작성일자</th>
					<td align="center" width="100">${list[0].wdate }</td>
					<th align="center" width="70">조회수</th>
					<td align="center" width="70">${list[0].hit }</td>
				</tr>
				<tr>
					<th align="center" width="70">제목</th>
					<td colspan="5">${list[0].title }</td>
				</tr>
				<tr>
					<th align="center" width="70">내용</th>
					<td colspan="5" height="100">${list[0].contents }</td>
				</tr>
			</table>
		</div>
		<div>
			<c:if test="${id == 'dto.userid' }">
				<br />
				<button type="button" onclick="location.href='boardEdit.do'">글
					수정</button>
				<button type="button" onclick="location.href='boardDelete.do'">글
					삭제</button>
			</c:if>
			<button type="button" onclick="location.href='boardlist.do'">글
				목록</button>
		</div>
	</div>
</body>
</html>