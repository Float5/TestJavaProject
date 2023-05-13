package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1 {
	public static void main(String[] args) {
		SQLConnector c = new SQLConnector();
	}
}

class SQLConnector{
	private Connection conn;
	private static String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company";
	
	public SQLConnector() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("마리아DB 드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("마리아DB 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
}