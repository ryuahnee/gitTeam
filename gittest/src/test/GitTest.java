package test;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.JdbcUtil;

public class GitTest {

	public static void main(String[] args) {
		System.out.println("테스트 파일");
		
		try {
			JdbcUtil jdbcUtil = JdbcUtil.getInstance();
			System.out.println("인스턴스ok");
			Connection conn = jdbcUtil.getConnection();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
