
public class Circle {
	//반지름, 중심점
	private int radius;	//반지름
	private Point center;	//point의 x,y를 가진다.
	
	public Circle() {
		//개발자가 초기화를 하지 않으면, 참조 자료형의 경우 null로 초기화된다.
		center = new Point();
	}
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	public Circle(int radius, int x, int y) {
		this.radius = radius;
		center = new Point();
		center.setX(x);
		center.setY(y);
	}
	
	public int getRadius() {
		return this.radius;
	}
	public Point getCenter() {
		return this.center;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public double area() {
		return 3.14*radius*radius;
	}
	public double circumference() {
		return 2*3.14*radius;
	}

	public void printCenter() {
		System.out.println("x: " + center.getX()+"y: " + center.getY());
	}

}


