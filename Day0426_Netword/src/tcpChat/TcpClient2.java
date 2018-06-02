package tcpChat;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import tcp2.Receiver;
import tcp2.Sender;

public class TcpClient2 {
	public static void main(String[] args) {
		// 소켓부터 만들어야 한다: 요청을 위해서
		// Sender, receiver 하나씩 수행

		try {
			Socket socket = new Socket("192.168.0.28", 1000);

			Thread sender = new Thread(new Sender(socket, "1"));
			Thread receiver = new Thread(new Receiver(socket, "1"));

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
