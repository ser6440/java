package thread1;

public class MyThread extends Thread{
	//Thread클래스를 상속받아서 run()을 재정의
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("MyThread: " + i);
		}
	}

}
