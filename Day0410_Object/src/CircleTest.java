
public class CircleTest {
	public static void main(String[] args) {
		//Circle 클래스 객체 만들어서 중심점 반지름 설정하고
		//메서드 호출해보기
		Circle circle1 = new Circle();
		//1. Circle 기본생성자 호출하면 center Point도 기본생성자 호출
		
		Point center = circle1.getCenter();
		center.setX(3);
		center.setY(5);
		circle1.printCenter();
		
		//2. 외부에서 center를 만들어서 Circle의 center로 지정
		Point p = new Point();
		p.setX(5);
		p.setY(10);
		Circle c1 = new Circle(5,p);
		c1.printCenter(); //->50
		
		p.setX(3);
		p.setY(3);
		c1.printCenter(); //->3,3
		System.out.println(c1.area());
		System.out.println(c1.circumference());
		
		//3. 
		double area = c1.area();
		double circumference = c1.circumference();
		
		Circle c2 = new Circle(5,3,4);
		c2.printCenter();
		
		//System.out.println();
		//printf 사용하지 않고 문자열 포맷 사용하기
		//문자열 만들때 포맷을 지정하고 문자열을 만들면 된다.>> String.format();
		
		String str = String.format("둘레: %.2f, 넓이: %.2f", circumference, area);
		
	
	}

}
