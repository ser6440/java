package generic1;

public class StoreTest {
	public static void main(String[] args) {
		//Store 클래스 객체 만들어서 다양한 종류의 데이터 넣어보기
		Store s1 = new Store();
		s1.setData(10);	//Object를 인자로 받기 때문에 모든 데이터
		System.out.println("s1: " + s1.getData());
		
		Store s2 = new Store();
		s2.setData("Hello");
		System.out.println("s2: " + s2.getData());
		
		//Store.getData()는 Object를 반환한다.
		//자식클래스의 변수에 참조 될 수 없다.(자동 캐스팅이 안된다.)
		//int a = s1.getData();
		String str = (String)s2.getData();
		
		//자식클래스로 형변환 해주면 사용가능
		System.out.println("str: " + str);
		
		//부모클래스의 참조변수에 참조된 객체가 정확히 어떤 객체인지 모르기때문에
		//예외 발생가능성이 높다. 형변환 하는것도 불편하고...
		if(s1.getData() instanceof String) {
			String str2 = (String)s1.getData();
		}else {
			System.out.println("문자열이 아니에요 바꿀 수 없어요");
		}
		//이런 불편함을 해결하는 것이 제네릭
	}

}
