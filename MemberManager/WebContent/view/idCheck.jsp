<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function formClose(n) {
		if (n == 1) {
			opener.document.frm.idChk.value = "Checked";
		}else{
			opener.document.frm.id.value ="";
		}
		window.close();
	}
</script>
</head>
<body>
	<div align="center">
		<c:choose>
			<c:when test="${idcheck == true }">
				<h2>${id }님은 사용할 수 있는 아이디 입니다.</h2>
				<div>
					<br />
					<button type="button" onclick="formClose(1)">확인</button>
				</div>
			</c:when>
			<c:otherwise>
				<h2>${id }님은 이미 등록된 아이디 입니다.</h2>
				<div>
					<br />
					<button type="button" onclick="formClose(2)">확인</button>
				</div>
			</c:otherwise>
		</c:choose>
	</div>


</body>
</html>