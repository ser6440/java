package tcp2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient2 {
	public static void main(String[] args) {
		//소켓부터 만들어 내야 한다: 요청을 받고 수락해서
		//Sender, receiver 하나씩 수행
		
		try {
			//요청을 받고 나서 소켓을 얻어오기 위해서 변수 선언
			Socket socket = null;
			
			//요청 수락을 위해서  ServerSocket 생성
			ServerSocket serverSocket = new ServerSocket(5000);
			socket = serverSocket.accept();	//요청수락
			
			Thread sender = new Thread(new Sender(socket, "2"));
			Thread receiver = new Thread(new Receiver(socket, "2"));
			
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
