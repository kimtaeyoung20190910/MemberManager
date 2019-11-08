function LoginFormCheck() {
	if(frm.id.value=="") {
		alert("아이디를 입력하세요.");
		frm.id.focus();
		return false;
	}
	if(frm.pw.value=="") {
		alert("비밀번호를 입력하세요.");
		frm.pw.focus();
		return false;
	}
	return true;
}

function memberformCheck(){
	if(frm.id.value==""){
		alert("사용할 아이디를 입력하세요.");
		frm.id.focus();
		return false;
	}
	if(frm.idChk.value=="unCheck"){
		alert("아이디 중복을 확인해주세요.");
		return false;
	}
	if(frm.pw.value==""){
		alert("사용할 패스워드를 입력하세요.");
		frm.pw.focus();
		return false;
	}
	if(frm.pwChk.value==""){
		alert("패스워드를 다시 한번 입력하세요.");
		frm.pwChk.focus();
		return false;
	}
	if(frm.pw.value != frm.pwChk.value){
		alert("패스워드 값이 일치하지 않습니다.");
		frm.pwChk.focus();
		return false;
	}
	return true;
}

function idCheck(){
	var id=frm.id;
	if(id.value==""){
		alert("중복할 아이디를 입력해주세요.");
		id.focus();
		return false;
	}
	window.open("idCheck.do?id="+id.value,"","width=500, height=400, top=50 left=50");
}


