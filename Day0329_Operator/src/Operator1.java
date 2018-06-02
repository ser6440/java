
public class Operator1 {
	public static void main(String[] args) {
		//연산자에 대해서 공부합니다.
		//증감연산자 ++, -- 에 대해서 실습합니다.
		
		int x = 5;
		int y,z;
		
		//x++;	//다른 연산을 모두 끝낸 후 x의 값을 1증가 시킨다.
		//++x;	//다른 연산 하기 전 x의 값을 1증가 시킨다.
		
		//System.out.println(x);
		
		y = x++;	//x의 값을 y에 넣는다.x++는 연산이 끝난 후 값이 1 증가 되므로 y는 5가됨 그리고 연산이 완료됐으므로 하나 증가해서 x는 6이 됨
		z = ++x;	//위에서 x는 6이 되었으니까 ++x는 연산하기전 값을 1증가 시키니까 z는 7이된다.
					//x는 7의 값으로 연산이 모두 끝나서 x값은 7이된다.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//출력결과 예상은? 5,7,7
	}

}
