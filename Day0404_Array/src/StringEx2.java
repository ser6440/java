
public class StringEx2 {
	public static void main(String[] args) {
		//"no news is good news"
		//에서 반복문을 사용하여 문자열'n'의 개수를 출력하는 프로그램을 작성하시오.
		
		String str = "no news is good news";

		//출력 예)
		//'n'의 개수는 3개 입니다.
		//문자열에서'n'의 개수를 찾는 일
		//>>>> 숫자배열에서 특정 숫자의 개수를 세는 것과 동일하다.
		//배열이 문자열로 바뀐것 뿐이다.
		//n의 개수를 저장할 변수가 필요
		int count = 0;	//초기값 0, n이 없으면 0개 이므로
		
		//문자열의 인덱스를 처음부터 하나씩 검사
		for(int i=0;i<str.length();i++) {
			//i는 0부터 str.length()-1까지 1씩 증가하며 반복
			//String 문자열에서 특정 인덱스의 문자 가져오기
			//인덱스가 1씩 증가하며 모든 인덱스의 문자를 한번씩 검사
			char c = str.charAt(i);	//만약 배열이었다면 str[i]의 형태이었을 것이지만...
			if(c=='n') {
				count++;	//n의 개수를 저장할 변수의 값을 1증가 시켜줌
			}
			
		}
		//반복문이 종료하면 문자열 n의 개수를 출력
		System.out.println("'n'의 개수는 " + count + " 입니다.");
		
	}

}
