package generic2;

public class Shape {
	//name,numOfLines,area
	protected double area;
	protected int numOfLines;
	protected String name;
	
	public Shape() {
		
	}
	public Shape(String name,int area, int numOfLines) {
		this.name = name;
		this.area = area;
		this.numOfLines = numOfLines;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");	
	}
	public void calArea() {
		area=0;
		//return calArea();
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getNumOfLines() {
		return numOfLines;
	}
	public void setNumOfLines(int numOfLines) {
		this.numOfLines = numOfLines;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Shape [area=" + area + ", numOfLines=" + numOfLines + ", name=" + name + "]";
	}
	

}
