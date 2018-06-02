package Ex1;

public class ObjectEx1 {
	public static void main(String[] args) {
		//자식클래스의 객체를 부모클래스의 참조변수에 참조 시키기/ 형변환
		
		Car c1 = new SportsCar();
		Car c2 = new Bus();
		
		//Student s = new Student();
		
		//인스턴스 참조변수에 참조된 객체
		if(c2 instanceof Bus) {
			Bus bus = (Bus)c1;
			bus.switchGate();
		
			//System.out.println("맞아요!");
		}else if(c1 instanceof SportsCar){
			SportsCar sc = (SportsCar)c1;
			sc.turboOff();
			sc.turboOn();
			
			//System.out.println("아니에요!");
		}
		
		SportsCar sc = (SportsCar)c2;
		sc.turboOff();
		sc.turboOn();
		
		System.out.println(sc);
	}

}
