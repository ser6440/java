package linkedList;

public class MyListTest {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list);
		
		//MyLinkedList에 아래 기능 모두 구현하기
		//remove(int index)
		//get(int index): 특정 인덱스에 있는 요소(node) 가져오기
		//size()
		//add(String data)
		//set(int index, String data)
		
		//System.out.println(list.get(2));
		
		list.set(2, "Z");
		list.remove(0);
		list.remove(0);
		
		System.out.println(list);
	}

}
