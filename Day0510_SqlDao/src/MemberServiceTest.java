import memberdao2.Member;
import memberdao2.MemberDao;

public class MemberServiceTest {
	public static void main(String[] args) {
		//MemberService클래스 테스트
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
//		
//		boolean result = service.login("Hong", "2222");
//		if(result) {
//			System.out.println("로그인 성공!!");
//		}else {
//			System.out.println("로그인 실패!!");
//		}
		
		Member member= new Member();
		member.setId("leesoonshin");
		member.setEmail("lee@email.com");
		member.setPw("123");
		member.setName("이순신");
		
		boolean result = service.join(member);
        if(result == true) {
            System.out.println("회원가입성공");
        }else {
            System.out.println("회원가입 실패");
        }

	}

}
