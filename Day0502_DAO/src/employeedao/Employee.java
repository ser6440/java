package employeedao;

public class Employee {
	private int empNum;
	private String ename;
	private int deptno;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int i, String string, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNum=" + empNum + ", ename=" + ename + ", deptno=" + deptno + ", salary=" + salary + "]";
	}
	
	
}
