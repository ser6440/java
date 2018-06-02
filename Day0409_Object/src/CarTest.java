
public class CarTest {
	public static void main(String[] args) {
//		색깔(문자열), 현재속도(정수), 주행거리(정수)의 상태값을 가지고
//		출발, 정지, 상태출력의 기능을 할 수 있는 객체 만들어보기
		//car객체를 만들어서 객체가 가지고 있는 출발, 정지, 상태출력 기능을 호출
		
		//객체를 만들기 위해서는 Class가 필요하다.
		//만들어 놓은 class를 활용하기 위해서는 
		//객체를 만들어야 한다.
		//객체를 만들기 위해서는 new키워드를 사용함
		//new 클래스이름();
		//자바에서 프로그래밍 할때 값을 꺼내서 쓰려면 변수가 있어야 함
		
		Car myCar;	//객체를 참조할 참조변수 선언
		myCar = new Car();	//객체 생성 및 참조변수에 객체 참조
		//myCar.start();	//객체 기능 실행(메서드 호출)
		//myCar.stop();
		
		Car yourCar = new Car();
		
		myCar.color = "빨강";
		myCar.speed = 180;
		myCar.mileage = 2000;
		
		yourCar.color ="검정";
		yourCar.speed = 150;
		yourCar.mileage = 250000;
		
		myCar.printCar();
		yourCar.printCar();
	}
}	//CarTest end

class Car{
	String color;	//색깔을 저장 할 변수
	int speed;		//속도를 저장 할 변수
	int mileage;	//주행거리를 저장 할 변수
	
	//동작을 표현할 메서드 작성
	public void start() {
		System.out.println("시동을 걸고 출발합니다.");
	}
	public void stop() {
		System.out.println("멈추고 시동을 끕니다.");
		
	}
	public void printCar() {
		System.out.println("색깔은 " + color);
		System.out.println("최고속도는 " + speed);
		System.out.println("주행거리는 " + mileage);
	}
}