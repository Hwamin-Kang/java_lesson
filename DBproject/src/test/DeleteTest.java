package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class DeleteTest {

	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM TBL_BUY WHERE CUSTOM_ID = ?"; 
		
		System.out.println("회원 구매 내역 삭제 ---------------------------");
		try {
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			System.out.print("CUSTOM_ID : ");
			pstmt.setString(1, sc.nextLine());
			pstmt.execute();
			int result = pstmt.executeUpdate(); // 실행된 행의 개수 리턴
			
			System.out.println("삭제된 데이터 행 개수 : " + result);
			System.out.print("진짜 삭제해?(y/n) : ");
			if(sc.nextLine().equals("y")) {
				conn.commit();
				System.out.println("삭제 했다");
			}
			else {
				conn.rollback();
				System.out.println("rolling back");
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}

	}

}
