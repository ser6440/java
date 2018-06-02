package generic2;

public class StroeTest {
	public static void main(String[] args) {
		//Generic객체는 다양한 종류의 데이터를 저장할 수 있지만,
		//객체를 만들때 어떤 종류의 데이터를 저장할 지 결정해 주어야 함
		Store<String> s1 = new Store<String>();
		//s1은 문자열을 저장할 수 있는 Store객체
		s1.setData("Hello");
		String str = s1.getData();
		System.out.println(str);
		
		//제네릭에서는 기초 자료형을 사용할 수 없음, Wrapper 클래스 사용
		//Store<int> s2 = new Store<int>(); ->사용할 수 없음
		Store<Integer> s2 = new Store<Integer>();
		s2.setData(10);
		
		int a = s2.getData();
//		Integer a = new Integer(100);
//		int b = a;
//		System.out.println(b);
		//두가지 방법 다 가능
		System.out.println(a);
		
		//참조변수는 하나인데 여러 종류의 객체를 참조 시켜서 사용
		Object o = new String("Hello");
		o = new Integer(100);
		o = new Shape();
		
		//제네릭 참조변수에 어떤 데이터 타입의 제네릭 객체가 참조 될지 모를때
		//와일드카드를 사용할 수 있다. ?
		//와일드카드의 종류
		//?	: 모든 데이터 타입의 제네릭 객체가 참조가능
		//? super 클래스: 클래스 자기자신 또는 슈퍼크래스의 제네릭 객체가 참조가능
		//? extends 클래스: 클래스 자기자신 또는 서브클래스의 제네릭 객체가 참조가능 
		
		Store<?> g = new Store<String>();
		g = new Store<Integer>();
		
		//Shape shpae = new Rectangle();	얘는 되지만 제네릭객체 참조는 안된다.
		//Store<Shape> s = new Store<Rectangle>();
		Store<? extends Shape> s = new Store<Shape>();	
		Store<? super Rectangle> rect = new Store<Shape>();
		
		//s.setData(new Shape());
	}

}
