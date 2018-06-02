import java.util.Scanner;

public class CircleArea {
	//원의 넓이를 구하는 프로그램 작성
	//반지름(정수)을 입력받아서 원의 넓이를 구하는 프로그램
	//3.14*r*r		(r=반지름)radius
	
	/*실행 예) 넓이를 구하고자 하는 원의 반지름을 입력하세요
	 		5
	 		반지름 5인 원의 넓이는 xxx.xxxx입니다.	 
	 */
	//1. 사용자로부터 반지름을 입력받고
	//2. 원의 넓이를 계산해서
	//3. 화면에 출력
	public static void main(String[] args) {
		//내가 프로그램 작성에 필요한 변수부터 생각
		
		int r;	//반지름을 저장할 변수
		double circleArea;	//결과를 저장할 변수
		
		//입력받을 준비
		Scanner scan = new Scanner(System.in);
		//sysout ctrl+space = system.out.println 자동완성
		
		//사용자에게 정보 출력
		System.out.println("넓이를 구하고자 하는 원의 반지름을 입력하세요.");
		//키보드로 부터 정수를 입력받음
		
		r = scan.nextInt();
		circleArea = 3.14*r*r;
		
		//System.out.println("반지름이" + r + "인 원의 넓이는 " + circleArea + "입니다.");
		//printf >> 출력시 포맷을 결정해놓고 출력하는 메서드
		System.out.printf("반지름은 %d 입니다.넓이는 %.2f 입니다.", r , circleArea );
		//%d는 정수가 표시되어야할자리입니다.
		//%f는 실수가 표시되어야 할 자리, 소수점 둘째자리까지 나타내고 싶으면 .2를 붙여서 %.2f로 쓴다.
		
	
	}

}
