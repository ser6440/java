package Ex1;

//import Day0412.Car;

public class SportsCar extends Car {
	boolean isTurbo;
	
	public SportsCar() {
		super(1);
		//부모클래스의 기본생성자 호출부분이 생략되어있다.super(); 
		//super(8);//-> 부모 클래스생성자호출
		System.out.println("자식 클래스 생성자 호출");
	}
	
	public void turboOn() {
		
		if(!isTurbo) {
			System.out.println("터보 온!");
			isTurbo = true;
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			speedUp();
			speed = 100;
		}else {
			System.out.println("터보 상태입니다!");
		}
		
	}
	public void turboOff() {
		if(isTurbo) {
			System.out.println("터보를  끕니다.");
			isTurbo = false;
			setSpeed(getSpeed()-50);
		}else {
			System.out.println("이미 꺼져 있습니다.");
		}
	}
	

}
