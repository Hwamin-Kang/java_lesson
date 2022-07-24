package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

public class InsertTest {

	public static void main(String[] args) {
		// DB연결 시도하기. 성공하면 Connection 객체가 만들어진다.
		Connection conn = OracleConnectionUtil.connect();
		System.out.println(conn);
		//Connection 객체를 이용해서 SQL을 실행할 수 있다. SQL을 DB로 전송
		//PreparedStatement 객체는 SQL을 컴파일해서 저장한다.
		
		String sql = "INSERT INTO TBL_CUSTOM (CUSTOM_ID, NAME, EMAIL, AGE) "
				+ "VALUES(?,?,?,?)"; // ?는 실행전에 전달될 값.(바인딩)
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID(PK) : ");
		String id = sc.nextLine();
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("Email : ");
		String email = sc.nextLine();
		System.out.print("Age : ");
		int age = Integer.parseInt(sc.nextLine());
		
		try {
			pstmt = conn.prepareStatement(sql); //(1)
			
			// (1)SQL에 바인딩 될 값 설정 : 데이터타입에 따라 setXXXXX() 메소드 선택.
			pstmt.setString(1, id);
			pstmt.setNString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);
			
			// (3)
			pstmt.execute(); //INSERT, UPDATE, DELETE SQL을 실행한다.
			System.out.println("고객이 등록되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
			//e.printStackTrace();
		} finally {
			OracleConnectionUtil.close(conn, pstmt);
		}

	}

}
