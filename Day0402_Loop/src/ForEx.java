import java.util.Scanner;

public class ForEx {
	public static void main(String[] args) {
		//반복분 for를 실습합니다.
		/*
		 * for(초기화;조건식;증감식){
		 * 		문장;
		 * }
		 * 1. 초기화는 최초 한 번만 실행
		 * 2. 조건식이 참이면 문장을 실행
		 * 3. 문장을 실행하고 난뒤 증감식이 실행됨
		 * 4. 증감식 실행뒤, 조건식을 다시 검사
		 * 5. 조건식이 참이면, 2~4를 반복, 거짓이면 for문 종료
		 */
		//1부터 10까지 출력하기
		//while
		int x = 1;	//반복계수 선언 및 초기화
		while(x <= 10) {	//while 조건검사
			System.out.print(x + " ");	//출력
			x++;	//반복계수 증가
		}
		System.out.println();	//한 칸 아래로 내림
		for(int n = 1;n <= 10;n++) {
			System.out.print(n + " ");
		}
	}
}
