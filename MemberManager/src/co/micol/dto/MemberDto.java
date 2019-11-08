package co.micol.dto;

import java.sql.Date;

public class MemberDto {
	private String id;
	private String name;
	private String pw;
	private char grant;
	private Date edate;
	private String addr;
	private String tel;
	
	public MemberDto() {
		
	}
	
	public MemberDto(String id, String name, String pw, String addr, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.addr = addr;
		this.tel = tel;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public char getGrant() {
		return grant;
	}
	public void setGrant(char grant) {
		this.grant = grant;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
