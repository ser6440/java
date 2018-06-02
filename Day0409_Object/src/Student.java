
public class Student {
	//이름(문자열), 학년(정수), 번호(정수)
	//Student 객체가 할 수 있는 동작
	//상태값 출력: printStudent
	String name;
	int grade;
	int num;
	
	public void printStudent() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("번호 : " + num);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", num=" + num + "]";
	}

}
