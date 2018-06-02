package linkedList;

public class MyListTest2 {
	public static void main(String[] args) {
		MyLinkedListG<Object> list = new MyLinkedListG<Object>();
		
		list.add("A");
		list.add(1);
		list.add('a');
		list.add(100);
		
		System.out.println(list);
	}

}
