
import java.util.Scanner;

public class Operator5 {
	public static void main(String[] args) {
		//조건 삼항 연산자
		//조건식 ? 값1 : 값2
		//조건식이 참이면 값1을 선택, 거짓이면 값2를 선택
		
		//grade : 학년, 4학년 이상(4, 5, 6)이면 용돈 500원
		//3학년 이하면 100
		
		int grade = 3;
		int pocketMoney;
		String level;
		
		/*
		 level = grade <= 3? "LOW" : (grade >= 7? "VERY HIGH" : "HIGH");
		 System.out.println(level);
		*/
		pocketMoney = grade <= 3? 100 : 500;
		System.out.println(pocketMoney);
		
		//예제1: 사용자에게 숫자 2개를 입력받아서 어떤 숫자가 더 큰지 알려주는 프로그램을 작성하시오.
		/*
		 실행 예) 숫자 1을 입력하세요.
		 	   3
		               숫자 2를 입력하세요.
		       5
		               더 큰 숫자는 5입니다.	       
		 */
		Scanner scan = new Scanner(System.in);
		int a,b;
		String abc;
		
		System.out.println("숫자 1을 입력하세요");
		a = scan.nextInt();	
		System.out.println("숫자 2를 입력하세요");
		b = scan.nextInt();
		abc = a > b? "더 큰 숫자는" + a + "입니다." :(b<a? "더 큰 숫자는" + b + "입니다.":"더 큰 숫자는" + b + "입니다.");
		System.out.println(abc);
		
		
		/*예제2: 사용자에게 숫자 3개를 입력 받아서 중간 숫자 찾기
				(단, 세 숫자는 다르다), 연산자 여러개 쓰셔도 됩니다.
				
			실행 예)숫자 1을 입력하세요.
				 2
				 숫자 2를 입력하세요.
				 1
				 숫자 3을 입력하세요.
				 3
		 */
		Scanner scan2 = new Scanner(System.in);
		int c,d,e;
		int result1, result2, result3, result4;
		
		System.out.println("숫자 1을 입력하세요");
		c = scan2.nextInt();
		System.out.println("숫자 2를 입력하세요");
		d = scan2.nextInt();
		System.out.println("숫자 3을 입력하세요");
		e = scan2.nextInt();
		
		result1 = c<d? d:c;
		result2 = c<e? e:c;
		result3 = d<e? e:d;
		
		int result;
		result=c<d? d:c;
		result=result<e? result:e;
		
		System.out.println("중간숫자는"+result);
		
		
	}

}
