package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcUtil {
	//싱글톤 패턴
	private static JdbcUtil instance = new JdbcUtil();
	
	private static DataSource ds;
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버로딩성공");
			
			InitialContext ctx = new InitialContext(); 		//import javax.naming.InitialContext;
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mySql");
			System.out.println("Connetion pool생성! ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	private JdbcUtil() {};
	
	public static JdbcUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return ds.getConnection();	//풀에서 커넥션 반환
	}

}
