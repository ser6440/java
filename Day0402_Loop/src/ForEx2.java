import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		//누적 합 구하기 for문으로 작성
		//사용자에게 양의 정수를 하나 입력받아서 1부터 입력받은 정수 까지의 누적합을 구하는 프로그램을 작성한다. >> for문으로
		
		//사용자에게 정수를 하나 입력받고
		//반복문을 이용하여, 누적합 계산
		Scanner input = new Scanner(System.in);
		int number;	//숫자를 입력받기 위한 정수형 변수 선언
		int sum = 0;	//누적합을 저장할 변수
		System.out.println("숫자를 입력하세요");	//사용자에게 안내
		number = input.nextInt();	//정수하나 입력받기
		
		//1부터 number까지 누적합 계산
		//보통 for문 안에서 사용하는 반복계수의 변수이름을 i, j, k...
		//sum = sum + i; ->누적합
		for(int i = 1;i <= number;i++) {
			sum = sum + i;
		}
		System.out.println(number + "까지의 누적합은" + sum + "입니다.");
	}

}
