package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUse {
	public static void main(String[] args) {
		MyQuery query = new MyQuery();
		query.connect();
		query.insert();
	}
}

class MyQuery{
	//데이터베이스는 기본적으로 읽기 쓰기 수정 삭제 CRUD
	//프로그래밍 언어에서 데이터베이스를 사용하기 위해서는 두가지 방법이 있다
	//Statement : 쉬움(대신 취약점이 있음)
	//PreparedStatement : 어려움(얘는 취약점에 대해 강화한 거)
	
	private Connection conn;
	private static String DBID = "root";
	private static final String DBPW = "root";
	//jdbc:mysql://IP:Port/Schema
	private static final String DBURL = "jdbc:mariadb://127.0.0.1:3307/company";
	
	//생성자
	public MyQuery() {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); //mysql : com.mysql.cj.jdbc.Driver
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void connect() {
		try {
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
	}
	
	public void insert() {
		PreparedStatement pstmt = null;
		String sql_query = "INSERT INTO company.employee VALUES (?, ?, ?)";
		
		//pstmt에 sql_query넣기
		try {
			pstmt = conn.prepareStatement(sql_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//?채우기
		try {
			pstmt.setInt(1, 4);
			pstmt.setString(2, "아무개");
			pstmt.setString(3, "남자");
			
			int result = 0;
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("DB입력 성공");
			}else {
				System.out.println("DB입력 실패");
			}
		} catch (SQLException e) {
			System.out.println("DB입력 실패(바깥)");
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}