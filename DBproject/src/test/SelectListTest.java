package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

public class SelectListTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		String sql = "SELECT * FROM TBL_CUSTOM"; // 조회결과 N개
		ResultSet rs = null;
		List<CustomVo> list = new ArrayList<>(); //조회결과 N개를 저장하는 컬렉션
		Connection conn = OracleConnectionUtil.connect();
		System.out.println("고객 리스트");
		try(
				PreparedStatement pstmt = conn.prepareStatement(sql))
		{
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //조회결과 최대 n개, while
				CustomVo vo = new CustomVo(rs.getNString(1),
						rs.getNString(2),
						rs.getNString(3),
						rs.getInt(4),
						rs.getDate(5));
				list.add(vo);
			}
			System.out.println(list);
			
		} catch (SQLException e) {
			System.out.println("SQL 실행오류 : " + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end - start) + "ms");

	}

}
