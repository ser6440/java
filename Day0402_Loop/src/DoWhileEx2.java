import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String[] args) {
		//사용자가 특정한 수를 맞추는 게임 프로그램 작성
		//사용자에게 숫자를 입력받아서 
		//입력받은 수가 지정한 수보다 큰지 작은지 알려주다가
		//사용자가 정답을 입력하면 정답! 이라고 알려주고 종료
		//do-while로 작성
		
		int answer = 67;	//정답
		int number;			//사용자에게 입력받을 수를 저장하는 변수
		Scanner input = new Scanner(System.in);

		//해야할일
		//사용자에게 숫자를 입력받아
		//숫자가 정답보다 큰지 작은지, 또는 정답인지 출력
		//정답과 입력받은 숫자가 같으면 종료
		
		/*
		 while(answer != number) {
			}
		*/	//초기화가 되어 있지 않기 때문에 number를 사용할 수 없음
		
		do {
			System.out.println("숫자를 입력하세요");
			number = input.nextInt();
			if(number > answer) {
				System.out.println("입력하신 수가 정답보다 큽니다.");
			}else if(number < answer){
				System.out.println("입력하신 수가 정답보다 작습니다.");
			}else {
				System.out.println("축하합니다! 정답입니다!");
			}
		}while(answer != number);
	}

}
