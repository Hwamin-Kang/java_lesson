package d0722.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import d0722.vo.MoneySum;
import jdbc.util.OracleConnectionUtil;

public class AggrDao {
	private static AggrDao dao = new AggrDao();
	private AggrDao() { }
	public static AggrDao getInstance() {
		return dao;
	}
	
	public List<MoneySum> moneySum() {
		
		//출력 순서를 매출합계 오름차순으로 한다면
		List<MoneySum> list = new ArrayList<>();
		Connection conn = OracleConnectionUtil.connect();
		String sql = "SELECT buy_date2, sum(money) " +
				"FROM (SELECT TO_CHAR(BUY_DATE, 'YYYY-MM-DD') buy_date2, quantity*price money " + 
				"FROM TBL_BUY# tb, TBL_PRODUCT# tp WHERE tb.PCODE = tp.PCODE) " + 
				"GROUP BY BUY_DATE2 " +
				"ORDER BY BUY_DATE2";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new MoneySum(rs.getDate(1), rs.getInt(2)));
			}
			
		} catch (SQLException e) {
			System.out.println("moneySum 오류: " + e.getMessage());
		}
		
		return list;
	}
}
