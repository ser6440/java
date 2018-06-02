package Ex2;

public class Dog extends Animal{
	//자식클래스의 생성자에서 가장 윗줄은 부모클래스의 생성자를 호출
	
//	public Dog() {
//		//super();
//	}
	public Dog() {
		name = "멍멍이";
		numOfLegs =4;
	}
	public Dog(String name, int numOfLegs) {
		this.name=name;
		this.numOfLegs=numOfLegs;
	}
	
	public void bark() {
		System.out.println("멍멍");
	}
	public void sound() {
		System.out.println("멍멍");
	}
	
	
	

}
