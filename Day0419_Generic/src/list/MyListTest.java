package list;

public class MyListTest {
	public static void main(String[] args) {
		//MyList는 데이터를 여러개 넣고 인덱스를 줘서 지울수도 있고
		//인덱스에 있는 요소를 가져올 수 있는 기능이 있는 클래스
		//제네릭으로 만들었기 때문에 다양한 데이터를 넣을 수가 있다.
		
		//문자열을 저장하는 MyList를 만들어 봅시다.
		MyList<String> strList = new MyList<String>();
		
		//임의로 5개의 문자열 넣기: add();사용
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		strList.add("E");
		
		strList.remove(2);
		strList.set(2, "z");
		
		
		for(int i=0;i<strList.size();i++) {
			System.out.print(strList.get(i));
		}
		//for-each구문은 데이터가 여러개면 다 되는게 아니라
		//Iterable을 구현한 클래스나, 배열만 사용가능
//		for(Str s:strList) {
//			
//		}
		
		
		//MyList<Student>
		//학생객체를 여러개 저장하는 리스트를 이용해서 management수정
	}

}
