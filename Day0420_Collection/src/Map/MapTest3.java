package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		//데이터 전달 할 때 많이 사용
		//데이터의 종류가 매우 다양하기 때문에 모든 데이터를 한꺼번에 담아서 처리할 
		//자료구조가 필요 >> Map
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Student> studentList = new ArrayList<Student>();
		
		map.put("student", new Student());
		map.put("phone", "010-1111-1111");
		map.put("member_number", 5);
		map.put("studentList", studentList);
		
		
		/***************보냄******************/
		
		//map에서 데이터를 꺼내서 사용함
		//이미 어떤 값이 어떤 종류의 데이터를 사용하는지 약속이 되어 있는상태로 
		//데이터를 주고 받기 때문에 해당하는 key가 가지는 데이터를 약속된 데이터로
		//사용한다.
		
		//Map에 있는 데이터 꺼내와서 해당하는 데이터 변수에 넣기
		//Map의 Value를 Object로 선언했기 때문에 가져올때는 형변환해서 가져와야한다.
		Student s = (Student)map.get("student");
		String phone = (String)map.get("phone");
		int num = (int)map.get("member_number");
		
		//Map의 요소로 List도 넣을 수 있다. 가져올때는 역시 형변환을 통해서 가져와야한다.
		List<Student> sList = (List<Student>)map.get("studentList");
		
		//리스트를 가져와서 for each로 하나씩 출력해보기
		for(Student s1:sList) {
			System.out.println(s1);
		}
		
		//얘도 List 출력해보는 건데. 꺼내와서 List 변수에 넣는게 아니라 바로 사용하는 예제 
        for(Student s1 :(List<Student>)map.get("studentList")) {
            System.out.println(s1);
        }
        
		// Map과 같은 형태로 List에도 역시 Object나 다른 컬렉션 객체를 요소로 가질 수 있다.
		// 아래 예제는 List가 요소로 List를 가지는 예제 (이차원 배열과 동일하다)
		List<List<String>> strList = new ArrayList<List<String>>();
		/***********************************************/
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		/****************/
		strList.add(list1);
		/*******************/
		String str = strList.get(0).get(1);
		System.out.println(str);
	}

}
