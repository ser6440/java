import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		//사용자에게 입력받은 수 만큼 반복해서 더하기 
				//실행 예) 숫자를 입력하세요
				//		 3
				//		 1부터 3까지의 합은 6입니다.
		
				int sum = 0;	//합을 저장할 변수, 0으로 초기화(합의 초기값은 0이다. 아무숫자도 더하지 않으면 0)
				int n = 1;
				int number;	//사용자가 입력할 수를 저장할 변수
				Scanner scan = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
				number = scan.nextInt();
				
				while(n<=number) {
				//1부터 사용자가 입력한 수 까지 출력하기
				//System.out.println("1부터" + n + "까지의" +"합은" + sum + "입니다.");
				sum = sum + n;
				n++;
				}
				System.out.println("1부터" + number + "까지의" +"합은" + sum + "입니다.");
	}

}
