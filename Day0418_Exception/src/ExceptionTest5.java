import java.io.IOException;
 
public class ExceptionTest5 {
	public static void main(String[] args) {
		//finally
		
		Student s = new Student(300,3);
		
		try {
			s.showAverage();
			System.out.println("Try 정상종료");
		} catch (IOException e) {
			System.out.println("IOException 발생");
		}catch(Exception e) {
			System.out.println("Exception 발생");
		}finally {
			System.out.println("얘는 항상 실행합니다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
