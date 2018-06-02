package studentdao;

import java.util.List;

public class StudentDaoTest {
	public static void main(String[] args) {
		//StudentDao클래스 테스트(메서드 동작확인)
		
		StudentDao dao = new StudentDao();
		Student s = new Student();
		
		s.setSnum(8);
		s.setSgrade(1);
		s.setSname("임꺽정");
		
		//dao.insertStudent(s);
		//dao.updateStudent(s);
		//dao.selectOne(8);
		//Student s1 = dao.selectOne(8);
		 //System.out.println(s1);
        //dao.deleteStudent(8);
         
        List<Student> sList = dao.selectAll();
        for(Student ss: sList) {
            System.out.println(ss);
        }

		System.out.println("완료");
		
	}

}
