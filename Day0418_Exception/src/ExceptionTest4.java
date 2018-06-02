
public class ExceptionTest4 {
	public static void main(String[] args) {
		//예외처리 책임 전가 시키기: thorows 예외
		
		
		Student s = new Student(300,0);
		
		//예외발생함
		try{
			s.showAverage();
		}catch(Exception e) {
			System.out.println("예외 처리완료");
		}
		System.out.println("프로그램종료");

	}

}
