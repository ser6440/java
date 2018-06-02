package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {
		//이번에는 Map에다가 문자열 -Student 쌍으로 넣어볼겁니다.
		Map<String, Student> map = new HashMap<String, Student>();
		Student s1 = new Student("홍길동", 3,100,100,100);
		Student s2 = new Student("신사임당", 2,100,100,100);
		Student s3 = new Student("이순신", 2,100,100,100);
		Student s4 = new Student("김장금", 3,100,100,100);
		
		map.put("hong", s1);
		map.put("shin", s2);
		map.put("lee", s3);
		map.put("kim", s4);
		
		Student s = map.get("hong");
		System.out.println("찾은학생 이름: " + s.getName());
		System.out.println("찾은학생 학년: " + s.getGrade());
		System.out.println("찾은학생 평균: " + s.getAverage());
		
		System.out.println("찾은학생 이름: " + map.get("lee").getName());
		System.out.println("찾은학생 학년: " + map.get("lee").getGrade());
		System.out.println("찾은학생 평균: " + map.get("lee").getAverage());
		
		//KeySet 가져오기
		//Key의 데이터 타입: String
		Set<String> KeySet = map.keySet();
		
		for(String key:KeySet) {
			Student student = map.get(key);
			System.out.println("이름: " + student.getName());
			System.out.println("학년: " + student.getGrade());
			System.out.println("평균: " + student.getAverage());
		}
	}

}
