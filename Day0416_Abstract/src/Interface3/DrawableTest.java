package Interface3;

public class DrawableTest {
	public static void main(String[] args) {
		//각종 도형들을 Drawable(interface)참조변수에
		//참조시켜서 사용해보자
		//인터페이스를 구현하게 되면, 구현클래스 객체는 해당 인터페이스의 참조 변수에 참조 가능하다.
		
		Drawable[] d = new Drawable[3];
		d[0] = new Rectangle();
		d[1] = new Circle();
		d[2] = new Triangle();
		for(int i=0;i<d.length;i++) {
			d[i].draw();
		}
//		for(Drawable d1:d) {
//			d1.draw();
//		}
	}

}
