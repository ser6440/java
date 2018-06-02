package memberdao2;

import java.util.List;

public class MemberDaoTest {
	public static void main(String[] args) {
		//MemberDao가 제대로 작성되었는지 테스트
		MemberDao dao = new MemberDao();
		
		Member member = new Member();
//      member.setNum(1);
        member.setId("honggildong");
        member.setPw("123123");
        member.setName("홍길동");
        member.setEmail("h@email.com");
         
        dao.insertMember(member);
         
         
//      
//      dao.insertMember(member);
         
//      member = dao.selectOne(1);
//      
//      System.out.println(member);
//      
//      member.setId("hong-gil-dong");
//      member.setEmail("hong@email.com");
//      dao.updateMember(member);
         
//      dao.deleteMember(1);
         
         
        List<Member> memberList = dao.selectAll();
         
        for(Member m:memberList) {
            System.out.println(m);
        }
         
        System.out.println("완료");

		                              
	}

}
