/**
 * 
 */
package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.MemberDto;

/**
 * @author User
 * 상위 DAO 클래스를 상속받아서 MemberDao를 생성.
 */
public class MemberDao extends DAO {
	private MemberDto dto;
	private ArrayList<MemberDto> list;
	
	public MemberDao() {
		super();
	}
	
	public ArrayList<MemberDto> select(){ //전체회원 목록 가져오기
		list = new ArrayList<MemberDto>();
		//code추가
		close();
		return list;
		
	}
	
	public MemberDto select(String id) { //1명의 회원정보 가져오기
		dto = new MemberDto();
		//code추가
		close();
		return dto;
	}
	
	public int insert(MemberDto dto) { //추가
		int n=0;
		//code추가
		close();
		return n;
	}
	
	public int update(MemberDto dto) { //수정
		int n=0;
		//code추가
		close();
		return n;
	}
	
	public int delete(MemberDto id) { //삭제
		int n=0;
		//code추가
		close();
		return n;
	}
	
	public boolean isIdCheck(String id) { //아이디 중복체크 위함
		
		return false;
	}
	
	public String loiginCheck(String id, String pw) {//로그인 하는 메소드
		String grant = null;
		String sql = "select membergrant from member where memberid=? and memberpw=?";
			try {
				psmt=conn.prepareStatement(sql);
				psmt.setString(1, id);
				psmt.setString(2, pw);
				rs = psmt.executeQuery();
				if(rs.next()) grant = rs.getString("membergrant");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return grant; //로그인 성공시 권한 넘겨줌
	} 
	
}
