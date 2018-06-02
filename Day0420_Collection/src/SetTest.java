
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetTest {
	public static void main(String[] args) {
		//Set Collection 인터페이스
		//구현해놓은 구현 클래스중 하나가 HashSet
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("A");
		set1.add("D");
		set1.add("C");
		set1.add("B");
		
		set2.add("D");
		set2.add("F");
		set2.add("A");
		set2.add("G");
		
        //이미 들어가 있으면 false, 없으면 넣고 나서 true 반환
		System.out.println(set1.add("B"));
		
		//순서가 없기 때문에 요소에 접근이 안됨!
		//가지고 있는지 없는지만 확인
		System.out.println(set1.contains("V"));
		
		//내용을 확인해야 할 일이 있다! >> Iterator를 이용
		//Iterator: 하나씩 요소에 대해서 반복하면서 요소를 가져다 주는 역할
		//set이 가지고 있는 요소에 접근할 거기때문에 set이 가지고 있는 iterator를 이용
		Iterator<String> it = set1.iterator();
		//hasNext():
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str + " ");
		}
		
		//집합 합집합,차집합,교집합 >> 구하기 해보겠습니다.
		//차집합A-B: {c,B}
		//합집합A+B: {A,B,C,D,F,G}
		//교집합       : {A,D}
		
		HashSet<String> union;	//합집합 저장할 변수
		HashSet<String> diffence;	//차집합 저장할 변수
		HashSet<String> intersection;	//교집합 저장할 변수

		union = new HashSet<String>(set1);	//set1 과 같은 원소를 가지는 set만들기
		diffence = new HashSet<String>(set1);	//set1 과 같은 원소를 가지는 set만들기
		intersection = new HashSet<String>(set1);	//set1 과 같은 원소를 가지는 set만들기
		
		//합집합 만들기 위해서는 set2를 더하면 됨
		union.addAll(set2);
		System.out.println(union);
		
		//차집합 만들기 위해서는 set2를 빼면됨
		diffence.removeAll(set2);
		System.out.println(diffence);
		
		//교집합을 만들기 위해서는 set2와 겹치는것만 남기면 됨
		intersection.retainAll(set2);
		System.out.println(intersection);
	}

}
