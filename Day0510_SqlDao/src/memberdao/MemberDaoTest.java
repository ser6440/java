package memberdao;

import java.sql.Date;
import java.util.List;

public class MemberDaoTest {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member m = new Member();
		
		m.setNum(5);
		m.setId("lee");
		m.setPw("5656");
		m.setName("이연주");
		m.setEmail("lee@naver.com");
		m.setRegDate(Date.valueOf("2018-05-10"));
		
		dao.insertMember(m);
		//dao.deleteMember(5);
		
		
		//System.out.println(dao.updateMember(m));
		//System.out.println(dao.selectOne(7).getName());
//		List<Member> mList = dao.selectAll();
//		for(Member mm: mList) {
//			System.out.println(mm);
//		}
	}

}
