import java.util.Scanner;

public class FindValue {
	public static void main(String[] args) {
		//예제1: 사용자에게 숫자 2개를 입력받아서 어떤 숫자가 더 큰지 알려주는 프로그램을 작성하시오.
				/*
				 실행 예) 숫자 1을 입력하세요.
				 	   3
				               숫자 2를 입력하세요.
				       5
				               더 큰 숫자는 5입니다.	       
				 */
		
		int number1, number2, bigNumber;
		//입력받을 준비
		Scanner input = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		number1 = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요");
		number2 = input.nextInt();
		
		//조건 삼항 연산자 조건식? 값1 : 값2;
		//조건식이 참일때 값1을 선택, 조건식이 거짓이면 값2를 선택
		//	> , <
		
		//참이라면 큰수는 number1, 거짓이라면, 큰수는 number2
		bigNumber = number1 > number2 ? number1 : number2;
		System.out.println("더 큰 숫자는" + bigNumber + "입니다.");
		
	}

}
