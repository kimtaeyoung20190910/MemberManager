<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<div><jsp:include page="topmenu.jsp"></jsp:include>
	<div><h2>글 작성</h2></div><br/>
		<div>
		<form id="frm" name="frm" action="" method="post">
			<table border="1">
			<tr>
				<th align="center" width="70"> 작성자</th>
				<td><input type="text" id="name" name="name"></td>
				<th align="center" width="70">작성일자</th>
				<td><input type="date" id="date" name="date"></td>
			</tr>
			<tr>
				<th align="center" width="70"> 제목</th>
				<td colspan="3"><input type="text" id="title" name="title" size="70"></td>
			</tr>
			<tr>
				<th align="center" width="70"> 내용</th>
				<td colspan="3"><textarea rows="15" cols="70" id="contents" name="contents"></textarea></td>
			</tr>
			</table>
			<div>
				<br/>
				<input type="submit" value="저장">&nbsp;&nbsp;
				<input type="reset" value="취소">&nbsp;&nbsp;
				<button type="button" onclick="location.href='boardRead.do'">세부목록 보기</button>
			</div>
			</form>
			</div>
		</div>
	</div>
</body>
</html>