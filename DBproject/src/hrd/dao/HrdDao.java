package hrd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hrd.vo.MemberVO;
import hrd.vo.SaleVO;
import jdbc.util.OracleConnectionUtil;
import vo.CustomVo;

public class HrdDao {
	private static HrdDao dao = new HrdDao();
	private HrdDao() {}
	public static HrdDao getInstance() {
		return dao;
	}
	
public List<MemberVO> getMembers(){
	Connection conn = OracleConnectionUtil.connect();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "SELECT CUSTNO,"
			+ "CUSTNAME, PHONE, ADDRESS, JOINDATE,"
			+ "DECODE(GRADE, 'A', '우수', 'B', '일반', 'C', '직원') AS agrade,"
			+ "city FROM MEMBER_TBL_02";
	MemberVO vo;
	List<MemberVO> list = new ArrayList<MemberVO>();
	try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) { //조회결과와 자바객체와 매핑 -> mybatis 라이브러리 사용해서 처리예정.
			vo = new MemberVO(rs.getInt(1), rs.getNString(2), rs.getNString(3),
					rs.getNString(4), rs.getDate(5), rs.getNString(6), rs.getNString(7));
			list.add(vo);
		}
		return list;
	} catch (SQLException e) {
		System.out.println("Member List 조회에 문제가 있습니다. : " + e.getMessage());
	} finally {
		try {
			rs.close();
		} catch (SQLException e) {
			System.out.println("close 오류 : " + e.getMessage());
		}
	}
		return null;
	}
	
public List<SaleVO> getSales() {

		Connection conn = OracleConnectionUtil.connect();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select mt.custno, custname,\r\n" + 
				"decode(GRADE, 'A', '우수', 'B', '일반', 'C', '직원') as grade,\r\n" + 
				"sale.asum\r\n" + 
				"from member_tbl_02 mt,\r\n" + 
				"(select custno, sum(price) asum from money_tbl_02 mt \r\n" + 
				"group by custno\r\n" + 
				"order by asum desc) sale\r\n" + 
				"where mt.custno = sale.custno";
				
		
		SaleVO vo;
		List<SaleVO> slist = new ArrayList<SaleVO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				vo = new SaleVO(rs.getInt(1), rs.getNString(2),
						rs.getNString(3), rs.getInt(4));
				slist.add(vo);
			}
			return slist;
		} catch (SQLException e) {
			System.out.println("Sale List 조회에 문제가 있습니다. : " + e.getMessage());
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("close 오류 : " + e.getMessage());
			}
		}
		return null;
	}
}
