package linkedList;

public class Node {	//문자열 하나를 저장할 수 있는 노드
	private String data;	//데이터를 저장할 변수
	private Node next;	//다음 노드를 가리키는 주소
	
	
	public Node() {
		
	}
	public Node(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node Next() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return data + " ";
	}
	
	
}
