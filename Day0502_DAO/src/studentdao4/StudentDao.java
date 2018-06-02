package studentdao4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	//기능을 하기 위해서 연결이 필요
	Connection connection;
	
	public void insertStudent(Student student) {
		PreparedStatement pstmt = null;
		
		try {
			connection = ConnectionProvider.getConnection();
			String sql = "insert into studene_ex2 values(?,?,?,?,?)";
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getKor());
			pstmt.setInt(3, student.getEng());
			pstmt.setInt(4, student.getMath());
			pstmt.setInt(4, student.getTotal());
			pstmt.setInt(5, student.getAverage());
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(connection != null)connection.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	public void updateStudent(Student student) {
		PreparedStatement pstmt = null;
		 try {
			connection = ConnectionProvider.getConnection();
			String sql = "update student_ex2 "
					+ "   set name = ?,"
					+ "   kor = ?,"
					+ "   eng = ?,"
					+ "   total = ?,"
					+ "   average = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setInt(2, student.getKor());
			pstmt.setInt(3, student.getEng());
			pstmt.setInt(4, student.getMath());
			pstmt.setInt(4, student.getTotal());
			pstmt.setInt(5, student.getAverage());
			pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteStudent(String name) {
		PreparedStatement pstmt = null;
		try {
			connection = ConnectionProvider.getConnection();
			String sql = "delete from student_ex2 where name = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
                if (connection != null) connection.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
       
		}
		
	}
	public List<Student> selectAll(){
		PreparedStatement pstmt = null;
		
		List<Student> studentList = new ArrayList<Student>();
		ResultSet rs = null;

		try {
			connection = ConnectionProvider.getConnection();
			String sql = "select * from student_ex2";
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Student student = new Student();
				student.setName(rs.getString("name"));
				student.setKor(rs.getInt("kor"));
				student.setEng(rs.getInt("eng"));
				student.setMath(rs.getInt("math"));
				studentList.add(student);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(connection != null)connection.close();
					if (pstmt != null) pstmt.close();
					if(rs != null) rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return studentList;
	}

}
