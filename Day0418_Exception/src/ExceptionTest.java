
public class ExceptionTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		
		try{
			//예외 발생 구간
			int result = x/y;
		}catch(ArithmeticException e) {	//예외객체
			//예외가 발생했을 경우 실행할 문장
			System.out.println("0으로는 못나눠요.");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("없는데요?");
		}
		
		
		System.out.println("이 문장이 실행되나요?");
	}

}
