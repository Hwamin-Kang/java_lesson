package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertBuyTest {
	//TBL_BUY 테이블에 insert 테스트 : sana97 회원이 GALAXYS22를 1개 구매
	// VALUES (?,?,...) 동적 바인딩으로 SQL을 먼저 컴파일하고 실행값은 그 후 실행전에 전달.
	public static void main(String[] args) {
		// DB연결 시도하기. 성공하면 Connection 객체가 만들어진다.
		Connection conn = OracleConnectionUtil.connect();
		if(conn != null) System.out.println("데이터베이스 연결 완료!");
		
		String sql = "INSERT INTO TBL_BUY (CUSTOM_ID, PCODE, QUANTITY, BUYNO) "
				+ "VALUES(?,?,?,TBLBUY_SEQ2.NEXTVAL)"; // ?는 실행전에 전달될 값.(바인딩)
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql); //(1)
			
			// (1)SQL에 바인딩 될 값 설정 : 데이터타입에 따라 setXXXXX() 메소드 선택.
			System.out.print("CUSTOM_ID : ");
			pstmt.setString(1, sc.nextLine());
			System.out.print("PCODE : ");
			pstmt.setString(2, sc.nextLine());
			System.out.print("QUANTITY : ");
			pstmt.setInt(3, Integer.parseInt(sc.nextLine()));
			
			// (3)
			pstmt.execute(); //INSERT, UPDATE, DELETE SQL을 실행한다.
			System.out.println("등록했다.");
			sc.nextLine();
//			conn.rollback(); // Transaction roll back
			conn.commit(); // Transaction commit
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			OracleConnectionUtil.close(conn, pstmt); //conn.close 할 때 commit 실행.
		}
	}
	
}
