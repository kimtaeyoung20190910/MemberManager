package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.NoticeDto;

public class NoticeDao extends DAO {
	ArrayList<NoticeDto> list;
	NoticeDto dto;

	public NoticeDao() {
		super();
	}

	public ArrayList<NoticeDto> select() {
		list = new ArrayList<NoticeDto>();
		String sql = "select * from notice order by nid";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				dto = new NoticeDto();
				dto.setId(rs.getInt("nid"));
				dto.setTitle(rs.getString("ntitle"));
				dto.setContents(rs.getString("ncontent"));
				dto.setDate(rs.getDate("ndate"));
				dto.setHit(rs.getInt("nhit"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public NoticeDto select(int id) {
		return dto;
	}

	public int insert(NoticeDto dto) {
		int n = 0;

		return n;
	}

	public int update(NoticeDto dto) {
		int n = 0;

		return n;
	}

	public int delete(int id) {
		int n = 0;

		return n;
	}

}
