package studentdao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import studentdao.Student;

public class StudentDao {
	//속성값: 연결해야 되니까...url,user,password
		private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		private static final String USER = "dlduswn";
		private static final String PASSWORD = "90996442";
		
		private Connection conn;
		
		
		//생성자에서 드라이버 로딩하고 연결까지 하기, 연결객체는 멤버변수로 유지
		public StudentDao() {
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		public void insertStudent(Student student) {
			String sql = "insert into student_ex"
					+ " values (?,?,?)";
			PreparedStatement pstmt = null;
			
			try {
				//preparedStatement 객체 만들 때 템플릿을 넘겨준다.
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, student.getSnum());
				pstmt.setString(2, student.getSname());
				pstmt.setInt(3, student.getSgrade());
				
				pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void updateStudent(Student student) {
			String sql = "update student_ex" + " set(?,?)" + " where(?)";
			PreparedStatement pstmt = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSgrade());
				pstmt.setInt(3, student.getSnum());
				
				pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void selectOne(Student student) {
			Student result = null;
			String sql = "select from * student_ex" + " where(?)";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, student.getSnum());
				rs = pstmt.executeQuery(sql);
				
				pstmt.executeQuery();
				if(rs.next()) {
					result = new Student();
					int number;
					String sname;
					int sgrade;
					
					number = rs.getInt("snum");
					sname = rs.getString("sname");
					sgrade = rs.getInt("sgrade");
					
					result.setSgrade(sgrade);
					result.setSname(sname);
					result.setSnum(number);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public List<Student> selectAll(){
			List<Student> result = new ArrayList<Student>();
			String sql = "select * from student_ex";
			
			ResultSet rs = null;
			Statement stmt = null;
			
			try {
				stmt = conn.createStatement();
				//결과받아오기
				rs = stmt.executeQuery(sql);
				Student student;
				
				while(rs.next()) {
					student = new Student();
					//칼럼이름으로 ResultSet에서 가져올수도있다.
					//이름으로 ResultSet에서 가져와서, 학생객체에 넣기
					student.setSnum(rs.getInt("snum"));
					student.setSname(rs.getString("sname"));
					student.setSgrade(rs.getInt("sgrade"));
					
					result.add(student);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(stmt != null) stmt.close();
					if(rs != null) rs.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}			
			return result;
		}
}
