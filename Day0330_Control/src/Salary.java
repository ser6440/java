import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		//예제) 사용자에게 일한 시간(정수)을 입력받고, 일한 시간의 수당을 계산해서
		//화면에 보여주는 프로그램을 작성하라.
		/*
		 * 정규 근무 시간은 8시간, 8시간을 초과하여 근무하였을 경우 추가 수당을 지급한다.
		 * 시급은 7530원이다. 8시간을 초과하였을 경우 초과한 시간만큼은 시급의 1.5배를 적용한다.
		 * 예) 10시간을 일했다고 가정할 경우
		 * 	   8*7530 + 2*7530*1.5
		 *     (60240) + (22590) = 82830
		 * if-else를 사용하여 계산
		 * 단, 급여는 소수점 둘째 자리까지 출력
		 * 입출력 예)
		 * 근무시간을 입력하세요
		 * 10
		 * 급여는 82830.00원 입니다.
		 * */
		//입력받을 변수-정수, 결과(일당)를 저장할 변수-실수
		int hours;
		double salary;
		
		final int REG_HOURS = 8; //final 변수 한번 정하면 변하지 않는 변수
		final int TIME_PAY = 7530;
		final double OVER_PAY_RATE = 1.5;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("근무시간을 입력하세요");
		hours = scan.nextInt();
		//근무 시간에 따라서 급여의 계산방법이 달라짐
		//8시간 이하: hours*7530
		//8시간 초과: 8*7530 + (hours-8)*7530*1.5

		if(hours <= REG_HOURS) {
			salary = hours*TIME_PAY;
			
		}else {
			salary = REG_HOURS*TIME_PAY + (hours-REG_HOURS)*TIME_PAY*OVER_PAY_RATE;
		}
		System.out.printf("급여는 %.2f 원입니다.", salary);	//소수점 둘째자리까지만 출력->.2f
	}

}
