import java.util.Scanner;
public class FindValue2 {
	public static void main(String[] args){
		/*예제2: 사용자에게 숫자 3개를 입력 받아서 중간 숫자 찾기
		(단, 세 숫자는 다르다), 연산자 여러개 쓰셔도 됩니다.
		
	실행 예)숫자 1을 입력하세요.
		 2
		 숫자 2를 입력하세요.
		 1
		 숫자 3을 입력하세요.
		 3
		 a,b,c
		 1. 2개씩 비교해서 각각 큰수를 저장
		 2. 2개씩 비교하여 뽑아낸 가장 큰 수 2개 중간 수 하나가 저장됨
		 3. 셋중에서 작은 것 찾으면 중간수
		 
	*/
		int x,y,z;	//처음 숫자를 입력받을 변수
		int a,b,c;	//2개씩 비교해 큰수를 저장할변수
		int result;	//최종 중간숫자를 저장할변수
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		x = scan.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요");
		y = scan.nextInt();
		
		System.out.println("세 번째 숫자를 입력하세요");
		z = scan.nextInt();
		
		//x,y비교 후 큰 수 저장
		//y,z비교 후 큰 수 저장
		//큰 수만 저장하면 제일 작은 수는 탈락하고 
		//제일 큰 수 두 개, 중간 수 하나가 저장된다.
		//이 중에 작은 수를 선택하면 됨.
		a = x > y? x:y;
		b = y > z? y:z;
		c = x > z? x:z;
		
		//a < b가 참이면 a가 작은것이다.
		//거짓이라면 a와b가 같거나, b가 작은것이다. b와c를 비교해서 작은 것을 찾으면 된다.
		
		result = a < b? a:(b<c? b:c);
		System.out.println("중간숫자는" +result+ "입니다.");
		
		
	}
	

}
