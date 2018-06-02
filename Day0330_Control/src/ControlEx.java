import java.util.Scanner;

public class ControlEx {
	public static void main(String[] args) {
		//제어문에 대해서 공부합니다.
		//제어문의 종류 - 조건문, 반복문
		//조건문 if-else
		
		/*
		 * if(조건식)
		 * 	    조건이 참일 때 실행할 문장;
		 * else
		 *    조건이 거짓일 때 실행할 문장;
		 *    
		 */
		
		int x = 3;
		
		if(x<5) {
			System.out.println("x는 5보다 작습니다.");
			System.out.println("x는 5보다 작습니다.");			
		}
		else
			System.out.println("x는 5보다 크거나 같습니다.");
		//else는 if와 짝이되어야한다. else는 생략되도 되지만, if가 생략되면 안된다.
		
		
	}

}
