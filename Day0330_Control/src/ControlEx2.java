import java.util.Scanner;

public class ControlEx2 {
	public static void main(String[] args) {
		//예제: 사용자에게 (정수)하나를 입력받아서 짝수인지 홀수인지 출력하는 프로그램작성
				/* 입출력 예)
				 * 숫자를 입력하세요
				 * 4
				 * 4는 짝수 입니다.
				 */
		//사용자에게 입력받아서, (스캐너 사용)
		//변수에 저장했다가, (정수형 변수 선언)
		//변수의 값이 짝수인지 확인, (%를 사용해서 2로 나눈 나머지가 0인지 아닌지 확인)
		//짝수이면 짝수라고 출력, 홀수면 홀수라고 출력 (if-else 문장을 이용해서 선택적으로 출력)
		
				int num;	//숫자를 입력받을 변수 선언
		
				Scanner input = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
				num = input.nextInt();	//정수 하나를 사용자로부터 입력받음
				
				boolean result = num%2 == 0;
				
				if(result) {	//!-> 조건식을 바꾸지 않고 결과를 반대로 바꾸고 싶을 때 쓰면된다.
					System.out.println(num + "(은)는 짝수입니다.");
				}else {
					System.out.println(num + "(은)는 홀수입니다.");
				}
				
	}

}
