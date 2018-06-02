package linkedList;

public class NodeTest {
	public static void main(String[] args) {
		
		Node n1 = new Node("A");
		Node n2 = new Node("B");
		
		n1.setNext(n2);	//n1의 next에 n2의 주소값을넣음
		
		System.out.println(n1.Next());
		
		Node n3 = new Node("C");
		n1.Next().setNext(n3);
		System.out.println(n1.Next().Next());
		
		//반복문으로 접근하기
		Node current = n1;
		for(int i=0;i<3;i++) {	
			System.out.print(current);
			current = current.Next();
		}
	}

}
