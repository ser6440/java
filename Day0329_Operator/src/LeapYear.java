import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	//예제3: LeafYear (윤년)검사하기:
			//사용자에게 연도를 입력받아서 해당 년도가 윤년인지 아닌지 검사하는 프로그램 작성
			/*윤년의조건
			 * 1. 4로 나누어 떨어지면서(AND) 100으로 나누어 떨어지지 않음
			 * 	  (a % 4 == 0)        (a % 100 != 0)
			 * 2. 400으로 나누어 떨어짐
			 *    (a % 400 == 0)
			 * 3. 1,2 중 하나라도 만족하면 윤년
			 * 
			 * 실행 예)
			 * 연도를 입력하세요
			 * 2000
			 * 2000년은 윤년입니다!
			 */
		int year;
		String yearType;
		Scanner input = new Scanner(System.in);
		
		System.out.println("확인하실 연도를 입력하세요");
		year = input.nextInt();
		
		//1번(year%4 == 0 && year%100 != 0)
		//2번 (year % 400 == 0)
		yearType = (year%4==0 && year%100!=0) || (year % 400 == 0)?
				   "윤년" : "평년";
		System.out.println(year + "년은" + yearType +"입니다.");
		
		
	}

}
