import java.util.Scanner;

public class Practice_이연주 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//입력받기위해 스캐너 생성
		int s,e;								//입력받은 수를 저장할 변수 선언
		s = scan.nextInt();						//첫번째 수를 입력
		e = scan.nextInt();						//두번째 수를 입력
		if((s>9 || s<2)||(e>9 || e<2)) {		//2와 9사이의 정수를 벗어나면 
			System.out.println("INPUT ERROR");	//오류메시지
			//System.out.println("다시 입력하세요");
			s = scan.nextInt();					//숫자를 다시입력
			e = scan.nextInt();
		}
		if((s<=9 && s>=2)&&(e<=9 && e>=2)&&(s<e)) {		//2와 9사이 정수중에 입력된 첫번째 수가 두번째 수보다 작을때
		for(int j = 1;j<=9;j++) {						
			System.out.print("   ");
			for(int i = s;i<=e;i++) {					//첫번째 입력된 수(s)부터 두번째 입력된 수(e)까지 하나씩 증가
				System.out.print(i + " * " + j + " = " + i*j+"  " );
			}
			System.out.println(" ");
		}
		}if((s<=9 && s>=2)&&(e<=9 && e>=2)&&(s>e)) {	//2와 9사이 정수중에 입력된 첫번째 수가 두번째 수보다 클때
			for(int j = 1;j<=9;j++) {					
				System.out.print("   ");
				for(int i = s;i>=e;i--) {				//첫번째 입력된 수(s)부터 두번째 입력된 수(e)까지 하나씩 감소
					System.out.print(i + " * " + j + " = " + i*j+"  " );
				}
				System.out.println(" ");
			}
			
		}
		
	}

}
