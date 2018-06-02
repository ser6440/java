package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentSelect {
	public static void main(String[] args) {
		//1. 드라이버 로딩
		//2. 연결
		//3. 구문객체 생성
		//4. sql실행
		//5. 결과처리
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url ="jdbc:oracle:thin:@localhost:1521:XE";
		String user = "dlduswn";
		String password = "90996442";
		
		//드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//연결 - url,user,password
			conn = DriverManager.getConnection(url, user, password);
			
			//구문객체 생성
			stmt = conn.createStatement();
			//sql작성: 학생번호가 6인 학생의 정보를 얻어오기
			//String sql = "select * from student_ex where snum = 6";
			String sql = "select * from student_ex";
			
			//select 문장은 결과값이 있는 sql: executeQuery()
			//executeQuery의 결과는 ResultSet: 결과 데이터를 담고 있는 객체
			rs = stmt.executeQuery(sql);
			
			//if(rs.next()){}	String sql = "select * from student_ex where snum = 6"; 특정조건 데이터 조회
			
			while(rs.next()) {	//String sql = "select * from student_ex";로 모든 데이터 조회
				//데이터가 있으면 진입
				int number = rs.getInt(1);
				String name = rs.getString(2);
				int grade = rs.getInt(3);
				System.out.println("-------------");
				System.out.println("번호: " + number);
				System.out.println("이름: " + name);
				System.out.println("학년: " + grade);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
