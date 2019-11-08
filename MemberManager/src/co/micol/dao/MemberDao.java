/**
 * 
 */
package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.MemberDto;

/**
 * @author User 상위 DAO 클래스를 상속받아서 MemberDao를 생성.
 */
public class MemberDao extends DAO {
	private MemberDto dto;
	private ArrayList<MemberDto> list;

	public MemberDao() {
		super();
	}

	public ArrayList<MemberDto> select() { // 전체회원 목록 가져오기
		list = new ArrayList<MemberDto>();
		MemberDto dto = new MemberDto();
		String sql = "select memberid,membername,memberenterdate,memberaddr,membertel from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				dto = new MemberDto();
				dto.setId(rs.getString("memberid"));
				dto.setName(rs.getString("membername"));
				dto.setEdate(rs.getDate("memberenterdate"));
				dto.setAddr(rs.getString("memberaddr"));
				dto.setTel(rs.getString("membertel"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return list;

	}

	public MemberDto select(String id) { // 1명의 회원정보 가져오기
		dto = new MemberDto();
		// code추가
		close();
		return dto;
	}

	public int insert(MemberDto dto) { // 추가
		int n = 0;
		String sql = "insert into member(memberid,membername,memberpw,memberenterdate,memberaddr,membertel) values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getPw());
			psmt.setString(4, dto.getAddr());
			psmt.setString(5, dto.getTel());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return n;
	}

	public int update(MemberDto dto) { // 수정
		int n = 0;
		// code추가
		close();
		return n;
	}

	public int delete(MemberDto id) { // 삭제
		int n = 0;
		// code추가
		close();
		return n;
	}

	public boolean isIdCheck(String id) { // 아이디 중복체크 위함
		boolean b = true;
		String sql = "select memberid from member where memberid=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next())
				b = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return b;
	}

	public String loiginCheck(String id, String pw) {// 로그인 하는 메소드
		String grant = null;
		String sql = "select membergrant from member where memberid=? and memberpw=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next())
				grant = rs.getString("membergrant");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return grant; // 로그인 성공시 권한 넘겨줌
	}

}
