import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		/*
		 * 예제 사용자에게 숫자를 하나 입력받아서 1부터 입력받은 수 사이의 
		 * 짝수(2로 나누어 떨어지는 수, n%2 == 0)를 출력하기
		 * 입출력 예)
		 * 숫자를 입력하세요.
		 * 11
		 * 2 4 6 8 10
		 * while, if
		 * 
		 *1부터 사용자에게 입력받은 수 만큼 출력하기
		 */
		
		int number;	//사용자에게 입력받은 정수를 저장할 변수선언
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		number = scan.nextInt();	//숫자 입력받기
		
		//입력받은 수 만큼 반복하기 위해서, 반복횟수를 확인할 수 있는 변수(반복계수)가 필요
		//반복계수: 반복문 시작전에 초기화되며, 반복문안에서 변하면서, 반복문의 조건문을 변화시키는 변수
		int n = 1;
		while(n <= number) {
			//출력되는 부분을 n이 짝수 일때만 출력하고 싶다.
			if(n%2==0) {
				//짝수
				System.out.print(n+" ");
			}//홀수 일때는 아무작업안하면 되니까 작성 X
			n++;	//반복문안에서 반복계수는 1씩 증가
			}
				
			
		}
		
	}

