import java.util.Scanner;

public class LoopEx {
	public static void main(String[] args) {
		/*
		 * 반복문에 대해서 공부합니다.
		 * 반복문은 특정한 문장(들)을 여러번 반복해서 실행하고자 할때 사용
		 * 반복문의 종류: while, for, do while
		 * 
		 * 1. while: 조건식이 만족할 때, 계속해서 문장을  반복해서 실행할 때 사용
		 * 			 while(조건식){
		 *  	 		     문장;
		 * 			 }
		 *  
		 * 2. for: 보통, 반복하고자 하는 횟수가 정해져 있을 때
		 * 3. do while: while과 동일하나, 최소 한 번은 실행할 때 사용
		 *  
		 */
		
		//System.out.println("Hello world!!");
		/*
		while(조건식) {
			//조건식이 참이면 반복할 문장
		}
		if(조건식) {
			//조건식이 참이면 실행할 문장
		}
		*/
		
		int x = 1;
		while(x <= 10) {
			System.out.println("Hello world!!" + x*2);
			x = x+1;
		}
		
		//예제 1부터 10까지의 합을 출력하는 프로그램을 작성하라
		//단, while문장을 사용하시오.
		
		//반복문을 이용해서 더하기를 하자.
		/*	1+2		2까지의 합 = 1+2
		 * 	1+2+3	3까지의 합 = 2까지의 합 + 3
		 * 	1+2+3+4	4까지의 합 = 3까지의 합 +4
		 * 	....
		 * 	1+2+3+4+5+6+7+8+9+10	10까지의 합 = 9까지의 합 + 10
		 * 
		 * 	특정한 수 n까지의 합은 ...n-1까지의 합 + n
		 * 
		 */
		int sum = 0;	//합을 저장할 수 있는 변수
		int n = 1;
		//sum = n-1+n;
		//sum = n-1까지의 합 + n;
		while(n<=10) {
			sum = sum + n;
			n++;	//n = n+1;
			System.out.println( sum );
		}
		
		//사용자에게 입력받은 수 만큼 반복해서 더하기 
		//실행 예) 숫자를 입력하세요
		//		 3
		//		 1부터 3까지의 합은 6입니다.
		
		int num = 1;
		int sum1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();
		
		sum1 = sum1 + num;
		
		System.out.println("1부터" + num + "까지의" +"합은" + sum1 + "입니다.");
	}

}
