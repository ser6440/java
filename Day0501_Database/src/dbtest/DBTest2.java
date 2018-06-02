package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest2 {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "dlduswn";
		String password = "90996442";
		
		Connection connection = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!!");
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!!");
			
			stmt = connection.createStatement();
			
			String sql = "insert into student_ex "+"values (3,'이순신',5),(2,'임다술',6),(1,'정해인',3)";
			String sql1 = "delete from student_ex " + "where snum=1";
			
			int rowCount1 = stmt.executeUpdate(sql);
			System.out.println(rowCount1+"행이 영향을 받았습니다");

			int rowCount2 = stmt.executeUpdate(sql1);
			System.out.println(rowCount2+"행이 영향을 받았습니다");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
			
		}
		
	}

}
