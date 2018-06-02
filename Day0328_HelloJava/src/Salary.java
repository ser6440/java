import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int deposit;
		int totalBalance;
		
		//입력받기전에... 사용자에게 알려줍시다.
		System.out.println("월 저축액을 입력하세요");
		deposit = scan.nextInt();
		
		//월 저축액
		totalBalance = deposit*12*10;
		//이름 작성중 ctrl+space >> 자동완성 목록
		System.out.println("10년 동안의 저축액:"+totalBalance+"원");
		
	}
	//저축액을 계산하는 프로그램 작성
	/*메인메서드 작성
	월 저축액(정수)를 입력받아서 10년 동안 저축액(원금)을 구하는 프로그램 작성
	단,10년동안 같은 금액을 저축한다고 가정.
	
	프로그램 실행 예)
	월급을 입력하세요.
	1000000
	10년동안의 저축액: ~~~~원.
	*/
	
	//입력받을 준비
	//입력받기
	//저축액 계산
	//출력
	//키보드 입력을 받을 준비

}
