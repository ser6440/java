
public class Point {
	//2차원 좌표값을 저장하는 클래스
	//x(정수), y(정수)
	//getter/setter 만들기
	//toString 만들기
	
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return this.x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getY() {
		return this.y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
