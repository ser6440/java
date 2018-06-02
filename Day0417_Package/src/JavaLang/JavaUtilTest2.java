package JavaLang;

import java.util.StringTokenizer;
public class JavaUtilTest2 {
	public static void main(String[] args) {
		//StringTokenizer
		//문자열을 특정한 문자 기준으로 잘라주는 역할을 하는 클래스
		String member = "홍길동/123@/hong123/hong@email.com";
		
		//member 문자열을 '/'를 기준으로 잘라주는 tokenizer 생성
		StringTokenizer tokenizer = new StringTokenizer(member, "/");
		
		String name = tokenizer.nextToken();
		String password = tokenizer.nextToken();
		String userid = tokenizer.nextToken();
		String email = tokenizer.nextToken();
		
		System.out.println("이름: " + name);
		System.out.println("비밀번호: " + password);
		System.out.println("아이디: " + userid);
		System.out.println("이메일: " + email);
		
		String data = "data1/data2/data3/data4/data5";
		
		StringTokenizer st = new StringTokenizer(data, "/");
		//다음 토큰이 있으면 계속 반복, 없으면 종료
		while(st.hasMoreTokens()) {
			//있으니까 반복시작, 다음토큰 가져오기
			String str = st.nextToken();
			System.out.println(str);
		}
	}

}
