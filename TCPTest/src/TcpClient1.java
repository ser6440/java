
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.UnknownHostException;

import javax.xml.ws.handler.MessageContext.Scope;

public class TcpClient1 {
	public static void main(String[] args) {

		// 소켓부터 만들어 내야 한다: 요청을 해서
		// sender , recevier 하나씩 실행
		Socket socket = null;

		try {

			// 요청을 받고 나서 소켓을 얻어오기 위해서 변수 선언

			// 요청 수락을 위해서 ServerSocket생성

			socket = new Socket("192.168.0.17", 5050);

			Runnable sender = new Sender(socket);
			Runnable receiver = new Receiver(socket);

			Thread t1 = new Thread(sender);
			Thread t2 = new Thread(receiver);

			t1.start();
			t2.start();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
