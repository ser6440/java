package thread2;

public class TargetThread extends Thread{
	//이 스레드의 상태값을 PrintThread가 출력
	public void run() {
		for (long i = 0; i < 2000000000; i++) {
			//스레드의 진행을 잠시 멈춤:상태값에 변화를 줘서 모니터링을 하기 위해서
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		for (long i = 0; i < 2000000000; i++) {
			
		}
	}
}
