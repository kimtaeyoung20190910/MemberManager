package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.BoardDto;

public class BoardDao extends DAO {

	private BoardDto dto;
	private ArrayList<BoardDto> list;

	public BoardDao() {
		super();
	}
	

	public ArrayList<BoardDto> select(int id){ //전체리스트 가져오기
		list = new ArrayList<BoardDto>();      //id=0 전체 아니면 그룹 전체
		String sql = "select * from mvc_board";
				if(id != 0) sql = sql + " where bgroup=?";
		try {
			psmt = conn.prepareStatement(sql);
			if(id != 0) psmt.setInt(1, id);
			rs = psmt.executeQuery();
			while(rs.next()) {
				dto = new BoardDto();
				dto.setId(rs.getInt("bid"));
				dto.setWriter(rs.getString("bwirter"));
				dto.setTitle(rs.getString("btitle"));
				dto.setContents(rs.getString("bcontents"));
				dto.setWdate(rs.getDate("bdate"));
				dto.setHit(rs.getInt("bhit"));
				dto.setGroup(rs.getInt("bgroup"));
				dto.setStep(rs.getInt("bstep"));
				dto.setIndent(rs.getInt("bindent"));
				dto.setUserid(rs.getString("userid"));
				list.add(dto);
			}
		}catch(SQLException e)
		{
		e.printStackTrace();
		}return list;
	}

	public int insert(BoardDto dto) {
		int n = 0;
		String sql = "insert into mvc_board(bid,bname,btitle,bcontent,bdate,bgroup,bstep,bindent,userid)"
				+ " values(b_name.nextval,?,?,?,?,b_name.currval,0,0,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getWriter());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContents());
			psmt.setDate(4, dto.getWdate());
			psmt.setInt(5, dto.getGroup());
			psmt.setInt(6, dto.getStep());
			psmt.setInt(7, dto.getIndent());
			psmt.setString(8, dto.getUserid());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return n;
	}

	public int update(BoardDto dto) {
		int n = 0;

		return n;
	}

	public int delete(int id) {
		int n = 0;

		return n;
	}

}
