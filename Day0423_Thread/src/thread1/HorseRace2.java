package thread1;

public class HorseRace2 {
	public static void main(String[] args) {
		//스레드 5개 생성, 각 스레드 실행
		Horse2 h1 = new Horse2("번개");
		Horse2 h2 = new Horse2("적토마");
		Horse2 h3 = new Horse2("슈팅스타");
		Horse2 h4 = new Horse2("다크호스");
		Horse2 h5 = new Horse2("유니콘");
		
		//Horse2클래스는 
		//Animal클래스를 상속 받으면서, Runnable을 구현하기 때문에
		//두 클래스 참조변수에 모두 참조될 수 있다.
		
		Animal a = h1;
		Runnable r1 = h1;
		Runnable r2 = h2;
		Runnable r3 = h3;
		Runnable r4 = h4;
		Runnable r5 = h5;
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		Thread t3= new Thread(r3);
		Thread t4= new Thread(r4);
		Thread t5= new Thread(r5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
