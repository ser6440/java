package thread1;

public class ThreadTest {
	public static void main(String[] args) {
		//반복문 2개 실행할거에요, 단일 스레드(메인스레드)
		
		for(int i=0;i<100;i++) {
			System.out.println("반복문1: " + i);
		}
		
		for(int i=0;i<100;i++) {
			System.out.println("반복문2: " + i);
		}
		System.out.println("메인스레드 종료");
	}

}
