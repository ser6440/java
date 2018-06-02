package thread1;

public class Horse extends Thread{
	private String name;
	public Horse(String name) {
		this.name = name;
	}
	public void run() {
		int sum = 0;
		
		while(sum < 50) {
			int tmp = ((int)(Math.random()*5))+1;
			sum += tmp;
			//스레드의 진행을 잠시 멈춤sleep();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			
			System.out.println(name + " : " + sum);
		}
	}
}
