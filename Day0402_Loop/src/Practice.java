import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		//while - break 연습예제
		//사용자에게 숫자(정수)를 입력받아서 계속해서 더합니다.
		//-1을 입력받으면 그 전까지 더한 숫자의 총합과 평균을 출력하는 프로그램을 작성
		/* 단 평균은 소수점 둘째 자리에서 반올림하여 한 자리만 표시
		 * 입출력 예)
		 * 5
		 * 10
		 * 6
		 * 7
		 * -1	//종료를 위한 입력 총합이나 평균에 더하지 않는다.
		 * 총합은 28 평균은 7.0입니다.
		 * 총합과 평균
		 * 총합: 입력된 숫자의 누적합>>5 4 7 2 1
		 * 평균: 누적합/입력된 수
		 * 필요한 변수: 총합을 저장할 변수, 입력받은 수의 개수를 저장할 변수
		 *          사용자에게 수를 입력받을 변수
		 * 1. 사용자에게 수를 하나 입력받고
		 * 2. 입력받은 수가 -1인지 아닌지 확인
		 * 3. 3-1: -1이라면 반복을 종료하고 (총합과 평균을 계산)->반복문 밖에 있어야함
		 * 3. 3-2: -1이 아니라면 입력받은 수를 총합에 더하고, 개수를 1증가
		 * 4. 1~3을 반복
		 */
//		Scanner scan = new Scanner(System.in);
//		int num;
//		int sum = 0; 
//		double avg = 0;
//		while(true) {	
//			num = scan.nextInt();
//			if(num != -1) {
//				
//			}
//			if(num == -1) {
//				sum = sum + num;
//				System.out.println("총합은" + sum + "평균은" + avg%.1f + "입니다.");
//			}
//		}
		int sum = 0;	//총합을 저장할 변수
		int number;		//사용자에게 입력받을 변수
		int count = 0;	//입력받은 수의 개수를 세기 위한 변수
		double avg;		//평균을 저장할 변수
		//몇번 반복인지 알 수 없음 >> while문 사용
		//while(조건문) 조건문 자리에는 논리값(true/false)이나, 논리식이 올 수 있다.
		Scanner scan = new Scanner(System.in);
		
		while(true) {	
			//1. 사용자에게 숫자를 입력받는 것을 반복
			System.out.println("숫자를 입력하세요");
			number = scan.nextInt();
			//2.입력받은 수가 -1인지 아닌지 확인
			if(number == -1) {
				//반복종료
				break;		
			}	//if end
			sum = sum + number;	//-1이 아니라면 총합에 입력받은 수를 더한다.
			count++;			//입력받은 수가 -1이 아니라면 입력받은숫자의 개수를 올린다.
		}	//while end
		//반복문이 끝나고 나면, 총합과 평균을 계산
		avg = (double)sum/count;
		System.out.println("입력하신 수" + count + "개의 총합은" + sum + ",");
		System.out.printf("평균은 %.1f 입니다.", avg);
	}

}
