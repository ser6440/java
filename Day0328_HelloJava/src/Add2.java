import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		//숫자를 키보드로 입력받아서 더하기
		//입력받을 준비: Scanner를 사용해야 한다.
		/*
		 * 1. Scanner를 사용하기 위해서 import
		 * 2. Scanner 사용 방법
		 * 
		 */
		//scan or input 는 이름입니다. 바뀔 수 있음
		
		//키보드로 부터 입력받을 준비
		Scanner scan = new Scanner(System.in);
		
		int a,b,sum;	//정수를 저장할 변수 a,b,sum 선언
		
		//a = 10; //오른쪽에 있는것을 왼쪽에 집어넣는 것
		
		System.out.println("첫 번째 숫자 a를 입력하세요");
		a = scan.nextInt();	//키보드로 부터 숫자를 읽어와서 a에 대입
		System.out.println("두 번째 숫자 b를 입력하세요");
		b = scan.nextInt();
		
		sum = a+b;
		
		System.out.println("a+b의 결과는 " + sum + "입니다.");
		
		
		
		
	}

}
