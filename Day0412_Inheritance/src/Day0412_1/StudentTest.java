package Day0412_1;

public class StudentTest {
	public static void main(String[] args) {
		MiddleStudent mStudent = new MiddleStudent();
		HighStudent hStudent = new HighStudent();
		
		mStudent.name = "이름";
		mStudent.grade = 3;
		mStudent.kumonDay = 3;
		
		hStudent.name = "이름";
		hStudent.grade = 3;
		hStudent.regNumber = "020605";
		
		Student s = new Student();
		//MiddleStudent is a Student
		Student s1 = new MiddleStudent();
		//사실 s1은 중학생인데 Student 참조변수에 참조 시켜놓음
		//자식클래스의 객체가 부모클래스의 참조 변수에 참조되어 있으면
		//자식클래스만 가지고 있는 기능이나 변수(자식 클래스에 작성된 내용)을 사용할 수 없다.
		
		mStudent.studyKumon(3);
		//s1.studyKumon(4);	<<자식클래스가 부모클래스의 참조변수에 참조되어있음
		
		((MiddleStudent)s1).studyKumon(3);
		//정수는 실수인 부분
		//double d = 2;
        //실수는 정수인가?? 아니다
        //int a = 2.0;

		
	}

}
