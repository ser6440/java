
public class AdderTest {
	public static void main(String[] args) {
		//정수 더하기 기능을 하는 클래스(Adder) 작성해서, 
		//정수 더하기 기능 실행해보기
		//상태값: 결과를 저장하는 result(정수)
		//기능add(): 숫자 2개(정수)를 전달 받아서 더한다음 결과를 상태값 result에 저장하고 출력하는 기능
		//Adder클래스의 기능 add를 사용하기 위해서는 객체를 생성해야 함 
		//더하기 기능을 사용하기 위해서 객체 생성후, 참조변수 a에 참조 시킴
		 Adder adder = new Adder();
		 //a가 가지고 있는 add()메서드 호출
		 //add()메서드는 매개변수로 2개의 정수를 가짐
		 //호출시 정수 2개를 인자로 주어야 한다.
		 int num1 = 3;
		 int num2 = 5;
		 
		 adder.add(num1, num2);
		 
		 System.out.println(adder.result);
	}

}
