package generic2;

public class Store<T> {
	//T가 클래스 내부에서 하나의 타입처럼 사용하시면 됩니다.
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	public String toString() {
		return "data:"+data;
	}
}
