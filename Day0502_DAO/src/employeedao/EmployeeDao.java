package employeedao;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	//연결
	private static final String URL = "jdbc:oracle:thin:@localhost:1251:XE";
	private static final String USER = "dlduswn";
	private static final String PASSWORD = "90996442";
	
	private Connection conn;
	
	public EmployeeDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Employee selectOne(int empNum) {
		Employee result = null;
		String sql = "select * from employee " + "where empNum =" + empNum;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				result = new Employee();
				int empNum1;
				String ename;
				int deptno;
				int salary;
				
				empNum1 = rs.getInt("empNum");
				ename = rs.getString("ename");
				deptno = rs.getInt("deptno");
				salary = rs.getInt("salary");
				
				result.setSalary(salary);
				result.setDeptno(deptno);
				result.setEname(ename);
				result.setEmpNum(empNum1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//자원 사용 다했으니 닫아주기
			try {
			if(stmt != null) stmt.close();
			if(rs != null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;

	}
	public List<Employee> selectAll(){
		List<Employee> result = new ArrayList<Employee>();
		String sql = "select * from employee";
		
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Employee employee;
			
			while(rs.next()) {
				employee = new Employee();
				
				employee.setEmpNum(rs.getInt("empNum"));
				employee.setEname(rs.getString("ename"));
				employee.setDeptno(rs.getInt("deptno"));
				employee.setSalary(rs.getInt("salary"));
				
				result.add(employee);
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
		
		return null;
	}
	public int deleteEmployee(int empNum) {
		String sql = "delete from employee where empNum = " + empNum;
		Statement stmt = null;
		int result = 0;
		try {
			stmt = conn.createStatement();
			stmt.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null) stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
		
	}
	public int updateEmployee(Employee employee) {
		String sql = "update employee" + " set empNum = " + employee.getEmpNum() +
					"," + "ename = " + employee.getEname() + "," + "deptno = " +
				    employee.getDeptno() + "," + "salary = " + "," +employee.getSalary();
		Statement stmt = null;
		int result = 0;
		
		try {
			//구문객체얻어오기
			stmt = conn.createStatement();
			//실행
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public int insertEmployee(Employee employee) {
		String sql = "insert int employee" + " values (" + employee.getEmpNum()
					+ "," + employee.getEname() + "," +employee.getDeptno() +
					"," + employee.getSalary() + ")";
		Statement stmt = null;
		int result = 0;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
