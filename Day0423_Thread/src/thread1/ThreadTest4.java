package thread1;

public class ThreadTest4 {
	public static void main(String[] args) {
		//Runnable 익명클래스로 구현해서 스레드 실행시키기
//		Runnable r1 = new Runnable() {
//			public void run() {
//				for(int i=10;i>0;i--) {
//					System.out.println(i);
//				}
//			}
//		};
		
		//인터페이스나, 추상클래스의 추상메서드가 하나 뿐일 때 람다식을 이용할 수 있음

		Runnable r1 = () -> {

			for (int i = 10; i > 0; i--) {
				System.out.println(i);
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		
	}

}
