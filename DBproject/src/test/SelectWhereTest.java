package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

//작성자 강화민
public class SelectWhereTest {

	public static void main(String[] args) {
		//사용자에게 검색 할 CUSTOM_ID를 입력받는다. 입력받은 CUSTOM_ID로 NAME, EMAIL을 출력한다.
		
		Connection conn = OracleConnectionUtil.connect();
		Scanner sc = new Scanner(System.in);
		
		if(conn != null) System.out.println("Connected");
		String sql = "SELECT NAME, EMAIL FROM TBL_CUSTOM WHERE CUSTOM_ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		boolean temp = true;
		
		try {
			pstmt = conn.prepareStatement(sql); // step 1
			
			//where 조건식의 컬럼이 기본키이면 select 결과 1개 있거나 없다.
			while(temp) {
				System.out.print("Enter CUSTOM_ID : ");
				String id = sc.nextLine();
				pstmt.setString(1, id); // step 2 : SQL에 값이 필요하면.
				rs = pstmt.executeQuery(); // step 3 : 실행
			
				if(rs.next()) {
					System.out.printf("\nCUSTOM_ID : %s의 이름과 이메일\n", id);
					System.out.println("NAME : " + rs.getNString("NAME"));
					System.out.println("EMAIL : " + rs.getNString("EMAIL"));
					temp = false;
				} else {
					System.out.println("존재하지 않는 아이디입니다. 다시 입력하세요.");
				}
			}
		} catch (SQLException e) {
			System.out.println("SELECT ERROR : " + e.getMessage());
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}
		System.out.println("----- end -----");
	}
	
}
