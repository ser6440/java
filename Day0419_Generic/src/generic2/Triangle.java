package generic2;

public class Triangle extends Shape{
	int width;
	int height;
	public Triangle() {
		super("삼각형",3,0);
	}
	public Triangle(int width, int height) {
		super("삼각형",3,0);
		this.width = width;
		this.height = height;
	}
	public void draw(){
		System.out.println("삼각형을 그립니다.");
	}
	public void calArea() {
		area = width*height*0.5;
	}	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", area=" + area + ", numOfLines=" + numOfLines
				+ ", name=" + name + "]";
	}

	

}
