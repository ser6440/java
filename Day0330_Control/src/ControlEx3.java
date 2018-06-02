import java.util.Scanner;

public class ControlEx3 {
	public static void main(String[] args) {
		/*예제 2: 윤년 확인 프로그램 삼항조건 연산자>>>if-else로 바꾸기
		     * 1.4로 나누어 떨어지면서(AND) 100으로 나누어 떨어지지 않음
			 * 	  (a % 4 == 0)        (a % 100 != 0)
			 * 2. 400으로 나누어 떨어짐
			 *    (a % 400 == 0)
			 * 3. 1,2 중 하나라도 만족하면 윤년
			 * 
		입출력 예)
		연도를 입력하세요.
		2000
		2000년은 윤년입니다.
		*/
		//연도를 사용자에게 입력받고 -scanner, year
		//입력받은 연도가 윤년인지 계산 -조건식
		//계산 결과에 따라 출력 -if-else
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("확인하실 연도를 입력하세요");
		year = scan.nextInt();	//입력받음
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			System.out.println(year + "은 윤년입니다.");
		}else {
			System.out.println(year + "은 윤년이 아닙니다.");
		}
	}
	

}
