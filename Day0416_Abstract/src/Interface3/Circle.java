package Interface3;

public class Circle implements Drawable {
	//인터페이스를 구현한다:
	//인터페이스가 가지고 있는 메서드 몸체를 모두 정의(오버라이딩)
	public void draw() {
		System.out.println("원을 그립니다.");
	}

}
