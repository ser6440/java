
package linkedList;
 
public class NodeG<T>{//문자열 하나를 저장할 수 있는 노드   
    private T data; //데이터를 저장할 변수
    private NodeG<T> next; //다음 노드를 가리키는 주소
     
    public NodeG() {}
    public NodeG(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public NodeG<T> next() {
        return next;
    }
    public void setNext(NodeG<T> next) {
        this.next = next;
    }
     
    @Override
    public String toString() {
        return data+" ";
    }
}
 
