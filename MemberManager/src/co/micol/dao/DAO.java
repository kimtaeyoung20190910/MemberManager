/**
 * 
 */
package co.micol.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author 김태영 작성일자 : 2019-11-07 상위 dao 객체
 */
public class DAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	DataSource ds; // 커넥션풀 시동을 위한 데이터연결 생성 객체

//	private String driver="oracle.jdbc.driver.OracleDriver";
//	private String url="jdbc:oracle:thin:@localhost:1521:xe";
//	private String user="tangg";
//	private String password="1234";

	public DAO() {
//		try {
//			Class.forName(driver);
//			conn= DriverManager.getConnection(url, user, password);
//		}catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/tangg");
			conn = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}