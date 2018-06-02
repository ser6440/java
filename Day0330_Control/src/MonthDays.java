import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		//연,월을 입력받아서 달의 일수를 구하는 프로그램을 작성하라.
		//예) 연도를 입력하세요.
		//    2000
		//    월을 입력하세요
		//    2
		//    2000년 2월은 29일 입니다.
		//1,3,5,7,8,10,12 : 31일
		//4,6,9,11 : 30일
		//2 : 28일/29일
		Scanner scan = new Scanner(System.in);
		int month;
		int year;
		int days = 0;
		System.out.println("연도를 입력하세요");
		year = scan.nextInt();
		System.out.println("월을 입력하세요");
		month = scan.nextInt();
		
		switch(month) {
		case 1:	
		case 3:	
		case 5:	
		case 7:	
		case 8:	
		case 10:	
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			//윤년이면 29일, 평년이면 28일
			if( (year%4==0 && year%100!=0) || (year % 400 == 0)) {
				days = 29;
			}else {
				days = 28;
			}
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		//switch문을 통해서 선택한 일 수 출력
		System.out.println(year + "년 " + month + "월은 " + days +"일 입니다.");
	}

}
