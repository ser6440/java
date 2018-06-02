package memberdao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER = "dlduswn";
	private static final String PASSWORD = "90996442";

	private Connection conn;

	public MemberDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insertMember(Member member) {
		String sql = "insert into member" + " values(" + member.getNum() + ",'" + member.getId() + "','"
				+ member.getPw() + "','" + member.getName() + "','" + member.getEmail() + "','" + member.getRegDate()
				+ "')";
		System.out.println(sql);
		Statement stmt = null;
		int result = 0;
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;

	}

	public int updateMember(Member member) {
		String sql = "update member" + " set id = '" + member.getId() + "'," + " pw = '" + member.getPw() + "',"
				+ " name = '" + member.getName() + "'," + " email = '" + member.getEmail() + "'," + " regdate = '"
				+ member.getRegDate() + "'" + " where num = " + member.getNum();
		System.out.println(sql);
		Statement stmt = null;
		int result = 0;
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql); // update는 객체반환
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int deleteMember(int num) {
		String sql = "delete from member where num = " + num;
		Statement stmt = null;
		int result = 0;
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	public Member selectOne(int n) {
		Member result = null;
		String sql = "select * from member" + " where num =" + n;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // query

			if (rs.next()) {
				result = new Member();

				result.setNum(rs.getInt("num"));
				result.setId(rs.getString("id"));
				result.setPw(rs.getString("pw"));
				result.setName(rs.getString("name"));
				result.setEmail(rs.getString("email"));
				result.setRegDate(rs.getDate("regDate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 자원 사용 다했으니 닫아주기
			try {
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public List<Member> selectAll() {
		List<Member> result = new ArrayList<Member>();
		String sql = "select * from member";
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Member member;
			while (rs.next()) {
				member = new Member();
				member.setNum(rs.getInt("num"));
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				member.setRegDate(rs.getDate("regDate"));

				result.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;

	}

}
