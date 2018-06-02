
public class Car {
	/*상태값
	 *	색깔(문자열): color, 현재속도(정수): speed, 주행거리(정수): mileage
	 *동작
	 *	void speedup(): 현재속도를 5증가 시킨다.
	 *	void speedDown(): 현재속도를 5감소 시킨다.
	 *	void printCar(): 현재 상태값 출력
	 *생성자
	 *	기본생성자
	 *	:색깔:"빨강", 현재속도: 0, 주행거리:0으로 초기화
	 *색깔, 현재속도, 주행거리를 매개변수로 전달받아서 멤버변수로 초기화하는 생성자 
	 */
	private String color;
	private int speed;
	private int mileage;
	
	//color getter: color반환
	public String getColor() {
		return color;
	}
	//color setter: color의 값을 저장
	//매개변수로 색깔을 받아와서 color에 저장
	public void setColor(String c) {
		color = c;
	}
	public int setSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		//속도가 150을 넘어가면 150으로 고정하겠다.
		if(s>150) {
			s=150;
		}
		speed = s;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int m) {
		mileage = m;
	}
	
	//생성자의 모양은 수식자 클래스이름(){}
	public Car() {
		//매개변수가 없으면 기본 생성자(default constructor)
		color = "빨강";
		speed = 0;
		mileage = 0;
	}
	public Car(String c, int s, int m) {
		color = c;
		speed = s;
		mileage = m;
	}
	void speedup() {
		//speed를 5증가
		speed = speed+5;
	}
	void speedDown() {
		//speed를 5감소
		speed = speed-5;
	}
	void printCar() {
		//상태값 출력
		System.out.println("색깔: " + color);
		System.out.println("현재속도: " + speed);
		System.out.println("주행거리: " + mileage);
	}
	
	public String toString() {
		return "Color: " + color + " Speed: " + speed + " Mileage: " + mileage; 
	}

}
