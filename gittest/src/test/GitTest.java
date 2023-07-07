package test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

public class GitTest {

	public static void main(String[] args) throws SQLException {
			System.out.println("테스트 파일");
		
			  Connection conn =null;
			  
			try {
				Context init = new InitialContext();
				System.out.println("init ok");
				DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/TestDB");
				System.out.println("ds ok");
				conn = ds.getConnection();
				System.out.println("getConnection ok");
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				conn.close();
			}
			  
			 
		
			
			
			
			
			
			
		
			/*
			 * try { JdbcUtil jdbcUtil = JdbcUtil.getInstance();
			 * System.out.println("인스턴스ok"); Connection conn = jdbcUtil.getConnection();
			 * conn.close(); } catch (SQLException e) { e.printStackTrace(); }
			 */
		
	}
	

}
