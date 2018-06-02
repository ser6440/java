import java.util.Scanner;

public class BreakEx {
	public static void main(String[] args) {
		//break 연습
		//반복문을 빠져 나올때 사용
		//반복문의 조건식과 상관없이 반복문을 종료하고 싶을 때 사용
		//break을 만나면, 더 이상 반복문을 실행하지 않고, 즉시종료
		int i = 1;
		while(true) {
			System.out.println("i:" + i);
			//10바퀴만 반복하고 싶을 때 >> i가 10이되면 종료
			if(i == 10) {
				break;
			}
			i++;
		}
		
		//예제) 사용자에게 숫자를 입력받고, *2 한 수를 출력하다가
		// -1을 입력받으면 출력하지않고 종료
		//입출력 예)
		/*숫자를 입력하세요
		 * 2
		 * 2 X 2는 4입니다.
		 * 숫자를 입력하세요
		 * 5
		 * 5 X 2는 10입니다.
		 * 숫자를 입력하세요
		 * -1
		 * 종료합니다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		//숫자를 입력받을 변수 선언
		int number;
		while(true) {
			System.out.println("숫자를 입력하세요");
			number = scan.nextInt();
			
//			if(number != -1) {
//				//number가 -1이 아니면
//				System.out.println(number + " X 2는 " + number*2 + "입니다." );
//			}else {
//				//number가 -1이면
//				System.out.println("종료합니다.");
//				break;
//			}
			if(number == -1) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println(number + "X 2는" + number*2 + "입니다.");
		}//while end

	}

}
