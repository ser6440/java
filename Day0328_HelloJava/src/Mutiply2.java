import java.util.Scanner;

public class Mutiply2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//키보드 입력 준비
		//정수 2개를 입력받아서 곱을 구하는 프로그램 작성
		int a,b,result;	//입력받은 숫자를 저장하기 위한 a,b 결과를 저장하기 위한 result변수 선언
		
		System.out.println("첫 번째 숫자 a를 입력하세요");
		a = scan.nextInt();	//첫 번째 숫자 입력받기
		System.out.println("두 번째 숫자 b를 입력하세요");
		b = scan.nextInt();	//두 번째 숫자 입력받기
		
		result = a*b;	//a*b의 결과를 result에 대입
		System.out.println("a*b의 결과는" + result + "입니다." );
		
		
	}

}
