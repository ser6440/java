package tcp1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TcpReceiver implements Runnable {
	public void run() {

		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			Socket socket1;
			System.out.println("연결 대기중...");
			
			socket1 = serverSocket.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
