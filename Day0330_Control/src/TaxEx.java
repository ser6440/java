import java.util.Scanner;

public class TaxEx {
	public static void main(String[] args) {
		//사용자로 부터 연봉(정수, 만원)을 입력받아 소득세를 구하는 프로그램 작성
		/*연봉 세율 기준 : 2000만원 이하, 9%
		 * 			  2000만원 초과 4000만원 이하, 18%
		 * 			  4000만원 초과 8000만원 이하. 27%
		 * 			  8000만원 초과 36%
		 * if-else if를 사용하시오.
		 * *생각해야 할 것
		 * 1. 어떤 순서로 문제를 해결할 것인가?
		 * 2. 문제를 해결하기 위한 데이터는 어떤 것이 필요한가?
		 * 3. 문제 해결을 위해 어떤 방법을 사용할 것인가?
		 * 
		 * 입출력 예)
		 * 연봉을 입력하세요
		 * 2000
		 * 소득세는 180.00(만원)입니다.
		 */
		Scanner scan = new Scanner(System.in);
		int salary;	//연봉을 저장할 변수
		double tax;	//세금을 저장할 변수
		System.out.println("연봉을 입력하세요");
		salary = scan.nextInt();
		
		//연봉을 입력 받았으니 세금을 계산
		//세금은 연봉의 범위에 따라 계산 방식이 다르다.
		
		if(salary<=2000) {
			//9%
			tax = salary*0.09;
		}
		else if(salary<=4000){
			//2000만원 초과 4000만원 미만 18%
			tax = salary*0.18;
		}
		else if(salary<=8000) {
			//4000만원 초과 8000만원 이하 27%
			tax = salary*0.27;
		}else {
			//8000만원 초과 36%
			tax = salary*0.36;
		}
		System.out.println("연봉" + salary + "만원에 대한 소득세는" + tax + "입니다.");
		System.out.printf("연봉 %d 만원에 대한 소득세는 %.2f 입니다.",salary, tax);
	}

}
