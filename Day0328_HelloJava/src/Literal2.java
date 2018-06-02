
public class Literal2 {
	public static void main(String[] args) {
		//이번 예제에서는 실수형 상수를 표현 하는 방법에 대해서 실습합니다.
		//자바에서의 실수 기본자료형은 double!!
		//데이터의 축소변환이 일어나는 경우 자동적으로 바뀌지 않는다.->int = 1.2 는 형변환이 일어나지 않는다.
		//묵시적 형변환
		//int = 1.2는 들어가지 않지만 int = (int)1.2로 해주면 들어간다.
		double r1 = 123.5;
		float r2 = 123.5f;
		//자바에서는 지수표기법을 이용한 실수를 표현할 수 있다.
		
		float r3 = 1.235e2f;
		//2e는 양수 소수점 방향으로 두번움직임
		double r4 = 1.235e-2;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		char c = 'd';
		//문자 하나 한글도 됨
		boolean isTrue;	//항상 true/false
		isTrue = false;	//if 조건식 또는 논리연산에 사용됨
	}

}
