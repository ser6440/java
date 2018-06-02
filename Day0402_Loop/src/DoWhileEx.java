
public class DoWhileEx {
	public static void main(String[] args) {
		//do-while 반복문을 공부합니다.
		//while 과 do-while이 다른 점은, do-while은 최소 1회 실행
		
		int i = 1;
		/*
		while(i > 10) {
			System.out.println("이 아이가 실행될까요?");
		}
		System.out.println("이 두번째 문장은 실행될까요?");
		*/
		
		do {
			System.out.println("이 아이가 실행될까요?");
		}while(i>10);
		System.out.println("이 두번째 문장은 실행될까요?");
	}

}
