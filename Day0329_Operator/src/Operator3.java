
public class Operator3 {
	public static void main(String[] args) {
		//대입연산자
		//왼쪽의 피연산자는 변수이어야 한다.
		// =, +=, -=, *=, /=, %=
		
		int x = 5;
		int y = 10;
		
		x += 5;	//x = x+5
		System.out.println("x : " + x);
		
		x += y;	//x = x+y
		System.out.println("x : " + x);
		
		x *= 2;	//x = x*2, x: 40
		System.out.println("x : " + x);
		
		x /= 3;	//x = x/3, x: 13
		System.out.println("x : " + x);
		
		x %= 4;	//x = x%4, x: 1
		System.out.println("x : " + x);
	}

}
