import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//구구단 2단 출력하기 (for문 사용)
				//출력 예)
				/*
				 * 2 X 1 = 2
				 * 2 X 2 = 4
				 * 2 X 3 = 6
				 * 2 X 4 = 8
				 * 2 X 5 = 10
				 * 2 X 6 = 12
				 * 2 X 7 = 14
				 * 2 X 8 = 16
				 * 2 X 9 = 18
				 * 
				 * for(int n = 1;n <=9;n++) {
					//int number;	//연산의 결과를 저장할 변수
					//number = n*2
					System.out.println("2" + "X" + n + " = " + (n*2));

					}
				 * 이거 되신 분들은 사용자에게 숫자 하나 입력받아서 해당하는 숫자의 구구단 출력하기
				 */
		//사용자에게 숫자 하나를 입력받아서 해당하는 숫자의 구구단 출력하기
		int inNum;	//사용자에게 입력받을 변수
		System.out.println("출력할 구구단을 입력하세요");
		Scanner scan = new Scanner(System.in);
		inNum = scan.nextInt();
		
		
		for(int n = 1;n <=9;n++) {
			//int number;	//연산의 결과를 저장할 변수
			//number = n*2
			System.out.println(inNum+ "X" + n + " = " + (n*inNum));
		}
		/*
		 * 해당 구구단 거꾸로 출력해 보세요
		 * ex)3단
		 * 3 X 9 = 27
		 * 3 X 8 = 24
		 * 3 X 7 = 21
		 * ...
		 * 3 X 1 = 3
		 * 
		 */
		for(int a = 9;a>=1;a--) {
			System.out.println("3 X " + a + " = " + (a*3));
		}
	}

}
