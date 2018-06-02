
public class Multiplier {
	public Multiplier(int number) {
		System.out.println("Multiplier의 생성자입니다.");
		result = number;
	}
	public Multiplier() {
		System.out.println("Multiplier의 기본생성자입니다.");
		
	}
	
	//결과값을 저장할 수 있는 변수
	int result;
	double resultDouble;
	//두 정수를 입력받아서 곱을 구하는 기능, 결과를 반환
	public int multiply(int a, int b) {	//int 자리가 반환값 void대신 반환될 값인 int를 쓴다.
		System.out.println("정수곱");
		result = a*b;
		return result;
	}
	//두 실수를 입력받아서 곱을 구하는 기능, 결과를 반환
		public double multiply(double a, double b) {	//int 자리가 반환값 void대신 반환될 값인 int를 쓴다.
			System.out.println("실수곱");
			resultDouble = a*b;
			return resultDouble;
		}

}
