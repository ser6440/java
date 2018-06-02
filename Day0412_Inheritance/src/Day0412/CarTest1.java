package Day0412;

public class CarTest1 {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.setColor("빨강");
		//yourCar.setColor("파랑");
		
		//static변수는 객체당 만들어지는 변수가 아님
		//객체 이름으로 접근하는 방식을 권장하지 않는다.
//		System.out.println(myCar.MODEL);
//		System.out.println(yourCar.MODEL);
		
		System.out.println(Car.MODEL);
		System.out.println(Car.numOfCars);
		
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		yourCar.speedUp();
		
		Car.printNumOfcars();	//static method
		
		//double d = Math.random();
		
	}

}
