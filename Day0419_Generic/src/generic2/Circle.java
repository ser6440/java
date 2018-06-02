package generic2;

public class Circle extends Shape {
	//원은 다른도형에 없는 반지름 요소를 가짐
	private int radius;
	public static final double PI = 3.14;
	
	public Circle() {
		super("원",1,0);
	}
	public Circle(int radius) {
		super("원",1,0);
		this.radius=radius;
	}
	
	//draw(), calArea(): 부모클래스가 가지고 있는 메서드 재정의
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	public void calArea() {
		area = PI*radius*radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", numOfLines=" + numOfLines + ", name=" + name + "]";
	}
	

}
