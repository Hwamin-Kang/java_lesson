package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.OracleConnectionUtil;

public class DBConnectionTest {

	public static void main(String[] args) {
		// DB연결 시도하기. 성공하면 Connection 객체가 만들어진다.
		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);
		if(conn != null)
			System.out.println("데이터베이스 연결 성공!");
		else
			System.out.println("데이터베이스 연결 실패!");
		
		//Connection 객체를 이용해서 SQL을 실행할 수 있다. SQL을 DB로 전송
		//PreparedStatement 객체는 SQL을 컴파일해서 저장한다.
		
		String sql = "INSERT INTO TBL_CUSTOM (CUSTOM_ID, NAME, EMAIL, AGE) "
				+ "VALUES('sana97', '최사나', 'sana@naver.com', 26)"; // 주의 : SQL 마지막에 ;(세미콜론) 쓰지 않기.
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.execute(); //INSERT, UPDATE, DELETE SQL을 실행한다.
			pstmt.close(); //자원 사용 종료(해제)
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
			//e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn, null);
		}

	}

}
