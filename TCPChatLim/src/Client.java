import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		//연결요청하고 소켓 만들어서 보내기 받기
		
		//보내기 역할 하는 sender 와  받는 역할 하는 receiver 가 병렬 작업 >> thread
		
		try {
			Socket socket = new Socket("192.168.0.28", 5000);
			
			//소켓을 통해서 받고, 보내고 하는 작업을 병렬 처리
			
			Runnable sender = new Sender(socket);
			Runnable receiver = new Receiver(socket);
			
			Thread t1 = new Thread(sender);
			Thread t2 = new Thread(receiver);
			t1.start();
			t2.start();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
