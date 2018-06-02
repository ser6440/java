
public class MethodEx2 {
	public static void main(String[] args) {
		//메서드 만들기
		//수식자는 public static
		//이름은 add
		//매개변수는 정수2개
		//반환형은 정수
		//반환값은 매개변수 2개를 더한 값
		
		//두 정수를 입력받아서 나머지 값을 반환하는 메서드 작성
		//이름은 mod
	
		int num = add(3,5);
		int a = mod(4,3);
		System.out.println(num);
		System.out.println(a);
		
		
	}
	//여기다 작성해주세요
	public static int add(int num1, int num2) {
		//매개변수로 입력받은 두 수를 더해서 결과를 반환하는 메서드
		int result = num1 + num2;
		return result;
	}
	public static int mod(int a,  int b) {
		 
		 return a%b;
	}

}
