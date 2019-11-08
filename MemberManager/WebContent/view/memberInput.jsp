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
	<div><jsp:include page="topmenu.jsp"></jsp:include></div>	
		<div>
		<br />
		<c:choose>
		<c:when test="${id != null }">
		<h2>${id }님은 이미 등록된 회원입니다.</h2></c:when>
		<c:otherwise>
		<h2>회원 등록 화면</h2>
			<div>
			<form id="frm" name="frm" action="memberInsertOk.do" method="post" onsubmit="return memberformCheck()">
			<div>
			<table border="1">
				<tr>
				<th width="100">아이디</th>
				<td><input type="text" id="id" name="id" size="30">&nbsp;&nbsp;
					<button type="button" id="idChk" name="idChk" onclick="idCheck()" value="unCheck">중복 체크</button></td>
				</tr>
				<tr>
					<th width="100">이름</th>
					<td><input type="text" id="name" name="name" size="30"></td>
				</tr>
				<tr>
					<th width="100">패스워드</th>
					<td><input type="password" id="pw" name="pw" size="30"></td>
				</tr>
				<tr>
					<th width="110">패스워드 확인</th>
					<td><input type="password" id="pwChk" name="pwChk"size="30"></td>
				</tr>
				<tr>
					<th width="100">주소</th>
					<td><input type="text" id="addr" name="addr" size="45"></td>
				</tr>
				<tr>
					<th width="70">전화번호</th>
					<td><input type="tel" id="tel" name="tel" size="45"></td>			
				</tr>
			</table>
			</div>
			<div>
			<br />
				<input type="submit" value="가입">&nbsp;&nbsp;
				<input type="reset" value="취소">
			</div>
			</form>
			</div>
		</c:otherwise>
		</c:choose>
		</div>
	</div>
</body>
</html>