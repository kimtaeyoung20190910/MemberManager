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
				//
				list.add(dto);
			}
		}catch(SQLException e)
		{
		e.printStackTrace();
		}return list;
	}

	public int insert(BoardDto dto) {
		int n = 0;

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
