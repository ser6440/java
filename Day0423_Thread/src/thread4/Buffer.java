package thread4;

public class Buffer {
	/*생산자-소비자 문제 해결을 위해 Buffer에서 해야할 일
	 *소비자(get()호출)
	 * : 1. 자원이 없으면 가져가지 않음
	 *   2. 생산자가 자원을 만들었음을 알려줄 때까지 기다림
	 *   3. 생산자가 자원을 생성하고 알려주면, 자원을 가져감
	 *   4. 자원을 가져갔다고 알려줌
	 *생산자(put()호출)
	 * : 1. 자원이 충분하면 자원을 생성하지 않음
	 *   2. 소비자가 자원을 사용할때까지 기다림
	 *   3. 소비자가 자원을 사용했다라고 알려주면, 자원을 생성
	 *   4. 자원을 생성했다고 알려줌
	 * */
	private boolean isEmpty;	//자원이 비었음을 의미
	private int data;
	
	public Buffer() {
		isEmpty = true;
	}
	public synchronized int get() {
		//자원을 반환
//		 *소비자(get()호출)
//		 * : 1. 자원이 없으면 가져가지 않음
//		 *   2. 생산자가 자원을 만들었음을 알려줄 때까지 기다림
//		 *   3. 생산자가 자원을 생성하고 알려주면, 자원을 가져감
//		 *   4. 자원을 가져갔다고 알려줌
		
		while(isEmpty == true) {
			//자원이 없음
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//자원이 있다라는 이야기: 소비 할 수 있다.
		isEmpty = true;	//자원이 비었음을 표시
		notifyAll();	//자원을 사용했음을 알림
		return data;	//자원 사용
		
	}
	
	public synchronized void put(int data) {
//		 *생산자(put()호출)
//		 * : 1. 자원이 충분하면 자원을 생성하지 않음
//		 *   2. 소비자가 자원을 사용할때까지 기다림
//		 *   3. 소비자가 자원을 사용했다라고 알려주면, 자원을 생성
//		 *   4. 자원을 생성했다고 알려줌
		while(isEmpty == false) {
			//자원이 있으면 기다림
			try {
				
				wait();	//자원 생성하는 스레드를 멈춤
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//여기 진입하는 의미는 isEmpty == true라는 의미
		this.data = data;	//자원 생산
		isEmpty = false;	//자원이 비어있지 않음을 표시
		notifyAll();	//자원이 만들었음을 알림
	}
}
