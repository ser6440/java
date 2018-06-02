package thread4;

public class Customer implements Runnable{
	private Buffer buffer;
	private int data;
	
	public Customer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			data = buffer.get();
			System.out.println("소비가자 데이터" + data + "를 소비하였습니다.");
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
