package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBUse {
	public static void main(String[] args) {
		MyQuery query = new MyQuery();
		query.connect();
		query.selectAll();
		query.insert();
		query.update();
		query.selectAll();
		query.unConnect();
		
		query.connect();
		query.delete();
		query.selectAll();
		query.unConnect();
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
			System.out.println("DB연결 성공");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
	}
	
	public void unConnect() {
		try {
			conn.close();
			System.out.println("연결해제");
		} catch (SQLException e) {
			System.out.println("연결해제 실패");
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update() {
		PreparedStatement pstmt = null;
		String sql_query = "UPDATE company.employee SET gender=? WHERE name=?";
		
		//pstmt에 sql_query넣기
		try {
			pstmt = conn.prepareStatement(sql_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//?채우기
		try {
			pstmt.setString(1, "여자");
			pstmt.setString(2, "아무개");
			
			int result = 0;
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("DB수정 성공");
			}else {
				System.out.println("DB수정 실패");
			}
		} catch (SQLException e) {
			System.out.println("DB수정 실패(바깥)");
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete() {
		PreparedStatement pstmt = null;
		String sql_query = "DELETE FROM company.employee WHERE name=?";
		
		//pstmt에 sql_query넣기
		try {
			pstmt = conn.prepareStatement(sql_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//?채우기
		try {
			pstmt.setString(1, "아무개");
			
			int result = 0;
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("DB삭제 성공");
			}else {
				System.out.println("DB삭제 실패");
			}
		} catch (SQLException e) {
			System.out.println("DB삭제 실패(바깥)");
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void custom(String sql_query, ArrayList<Object> data) {
		PreparedStatement pstmt = null;
		
		//pstmt에 sql_query넣기
		try {
			pstmt = conn.prepareStatement(sql_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//?채우기
		try {
			for(int i = 0; i < data.size(); i++) {
				pstmt.setObject(i+1, data.get(i));
			}
			
			int result = 0;
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			System.out.println("실패(바깥)");
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void selectAll() {
		PreparedStatement pstmt = null;
		String sql_query = "SELECT * FROM company.employee";
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ArrayList<Integer> no = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> gender = new ArrayList<>();
		try {
			while(rs.next()) {
				no.add(rs.getInt(1));
				name.add(rs.getString("name"));
				gender.add(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < no.size(); i++) {
			System.out.println(no.get(i)+name.get(i)+gender.get(i));
		}
		
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}