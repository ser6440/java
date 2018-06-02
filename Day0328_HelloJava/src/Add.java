
public class Add {	//클래스

	public static void main(String[] args) {	//메인메서드
		//아래는 a와 b의 합의 결과를 화면에 출력하는 프로그램입니다.
		//주석처리된 문장은 컴파일시 컴파일러에 영향을 받지 않음
		//코드 내에 참고할 내용을 작성할 때 사용(comment)
		/*
		  여러줄 주석처리 시 사용 
		 */
		//	ctrl+shift+c	개별 라인 주석/취소
		/*
		 * ctrl+shift+/			여러줄 주석
		 * ctrl+shift+역슬래시		여러줄 주석 취소
		 */
		
		//명령문: 문장은 메서드 내에서 사용해야 하고, ';' 으로 끝난다.
		//변수: 프로그램 실행 중 데이터를 저장하는 공간
		int a;	//변수의 선언, 'a'라는 이름의 정수형 변수 선언
		int b;	//변수의 선언, 'b'라는 이름의 정수형 변수 선언
		int sum;	//변수의 선언, 'sum'이라는 이름의 정수형 변수 선언
		
		a = 50;		//a라는 변수에 50을 넣어줌
		b = 100;	//b라는 변수에 100을 넣어줌
		sum = a + b;	//a+b의 값을 sum에 넣어줌
		
		//println은 한줄 뛰어쓰기
		//print는 붙여쓰기
		System.out.println("a와 b의 합은");		//""안의 내용을 콘솔에 출력
		System.out.println(sum);	//sum이라는 변수가 가지는 값을 콘솔에 출력
		System.out.println("입니다.");	//""안의 내용을 콘솔에 출력

	}

}
