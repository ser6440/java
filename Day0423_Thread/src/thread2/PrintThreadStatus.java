package thread2;


public class PrintThreadStatus {
	public static void main(String[] args) {
		//스레드 진행에 따른 상태값 출력해보기
		//스레드 상태값 확인하는 방법 및 스레드 동작 익히기
		
		//파생스레드 2개 생성
		//출력스레드, 타겟스레드
		//출력스레드(PrintThread): 타겟스레드의 상태값을 출력하는 스레드
		//타겟스레드(TargetThread): 상태를 확인하고자 하는 스레드
		
		//main이 할일: thread 2개 생성해서 실행시키기
		//targetThread는  PrintThread의 매개변수로 넘기기
		//PrintThread는  객체 만들어서 스레드 실행
		TargetThread target = new TargetThread();
		PrintThread thread1 = new PrintThread(target);
		
		thread1.start();
	}

}
