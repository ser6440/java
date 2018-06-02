
public class MethodEx {
	public static void main(String[] args) {
		
		//A가 학교에 가는 프로그램을 작성
//		System.out.println("A가 일어난다.");
//		System.out.println("A가 씻는다.");
//		System.out.println("A가 밥을 먹는다.");
//		System.out.println("A가 버스를 탄다.");
//		System.out.println("A가 공부를 한다.");
//		System.out.println("A가 귀가를 한다.");
//		System.out.println("A가 씻고 잠을잔다.");
		
//		goSchoolA();	//메서드 호출
//		goSchoolB();
		System.out.println("Do Something");
		
//		goSchoolA();
		int a = 3+5;
		int b = goSchool("A");	//파라미터를 정의하면, 인자(argument)를 넘겨줘야 한다.
		goSchool("B");
		System.out.println(b);
//		System.out.println("A가 일어난다.");
//		System.out.println("A가 씻는다.");
//		System.out.println("A가 밥을 먹는다.");
//		System.out.println("A가 버스를 탄다.");
//		System.out.println("A가 공부를 한다.");
//		System.out.println("A가 귀가를 한다.");
//		System.out.println("A가 씻고 잠을잔다.");
	}
	/*
	 * 메서드 모양
	 * (대괄호친것은 없어도 상관없는것)
	 * [수식자] 반환형 식별자([매개변수]){
	 * 		반환값;
	 * }
	 */
	public static void goSchoolA() {
		System.out.println("A가 일어난다.");
		System.out.println("A가 씻는다.");
		System.out.println("A가 밥을 먹는다.");
		System.out.println("A가 버스를 탄다.");
		System.out.println("A가 공부를 한다.");
		System.out.println("A가 귀가를 한다.");
		System.out.println("A가 씻고 잠을잔다.");
	}
	public static void goSchoolB() {
		System.out.println("B가 일어난다.");
		System.out.println("B가 씻는다.");
		System.out.println("B가 밥을 먹는다.");
		System.out.println("B가 버스를 탄다.");
		System.out.println("B가 공부를 한다.");
		System.out.println("B가 귀가를 한다.");
		System.out.println("B가 씻고 잠을잔다.");
	}
	public static int goSchool(String str) {
		//메서드의 외부로부터 값을 받아오는 방법
		//>>> 매개변수, 파라미터(parameter)
		String name = str;	//외부로부터 받아온 값을 사용
		System.out.println(name + "가 일어난다.");
		System.out.println(name + "가 씻는다.");
		System.out.println(name + "가 밥을 먹는다.");
		System.out.println(name + "가 버스를 탄다.");
		System.out.println(name + "가 공부를 한다.");
		System.out.println(name + "가 귀가를 한다.");
		System.out.println(name + "가 씻고 잠을잔다.");
		return 0;	
	}

}
