package thread1;


public class Animal {
	protected String name;
	protected int numOfLegs;
	public Animal() {
		
	}
	public Animal(String name, int numOfLegs) {
		this.name=name;
		this.numOfLegs=numOfLegs;
	}
	
	public void sound() {
		System.out.println("동물이 웁니다.");
	}

}
