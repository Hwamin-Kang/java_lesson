package proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import jdbc.util.OracleConnectionUtil;

// 1. CHECK_MEMBER 프로시저 실행
// 2. CHECK_BOOK 프로시저 실행
// 3. 2번에서 없는 책 오류 확인하고 해결하기
// 4. 회원IDX와 도서명을 입력받아서 실행
public class ProcedureTest {
	
	public static void main(String[] args) {
		Connection conn = OracleConnectionUtil.connect();
		Scanner sc = new Scanner(System.in);
		
		String sql1 = "{call CHECK_MEMBER(?, ?)}"; //저장 프로시저 CHECK_MEMBER 호출 SQL
		String sql2 = "{call CHECK_BOOK(?, ?)}"; //저장 프로시저 CHECK_BOOK 호출 SQL
		int memIdx;
		String Book; 
		
		CallableStatement cstmt = null;
		
			try {
				cstmt = conn.prepareCall(sql1); //prepareCall는 저장프로시저 실행하기 위한 객체 생성 메소드
				
				System.out.print("회원님의 대출가능 여부를 판단하기 위해 MEM_IDX를 입력하세요 : ");
				memIdx = Integer.parseInt(sc.nextLine());
				cstmt.setInt(1, memIdx); //첫번쨰 입력 매개변수 IN의 값 설정하기
				//출력 매개변수 out의 *오라클 데이터 타입 설정하기
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.executeUpdate();
				
				System.out.print("대출 가능여부 : ");
				System.out.println(cstmt.getString(2)); //실행결과 out 매개변수값 가져오기
				
				cstmt = conn.prepareCall(sql2);
				
				System.out.print("도서의 대출가능 여부를 판단하기 위해 책 제목을 입력하세요 : ");
				Book = sc.nextLine(); //프로시저에서 Exception 처리 안하면 없는 책은 오류.
				cstmt.setString(1, Book);
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.executeUpdate();
				
				System.out.print("대출 가능여부 : ");
				System.out.println(cstmt.getString(2));
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				OracleConnectionUtil.close(conn, null);
			}
	}
	
}
