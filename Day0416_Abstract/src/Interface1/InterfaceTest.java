package Interface1;

public class InterfaceTest {
	public static void main(String[] args) {
		//참조변수 선언 가능, 객체 생성이 안됨: 상속용으로만 사용
		//
		Moveable m;
		
//		Animal[] animals = new Animal[2];
//		
//		animals[0] = new Dog();
//		animals[1] = new Cat();
//		
		//moveable m1;
		Moveable[] m2 = new Moveable[2];
		m2[0] = new Dog();
		m2[1] = new Cat();
		
		for(Moveable m3:m2) {
			m3.move();
		}
	}

}
