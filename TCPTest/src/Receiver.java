
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Receiver implements Runnable {
	private Socket socket;

	String name;

	public Receiver(Socket socket) {
		this.socket = socket;

	}

	public void run() {
		// 소켓으로 부터 메시지를 받아서 출력

		BufferedReader reader = null;

		String msg = null;

		// 데이터를 소켓으로부터 읽어오기 위해서 스트림을 얻어옴

		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (true) {
				msg = reader.readLine();
				System.out.println("상대방 :" + msg);

				if (msg.equals("quit")) {
					break;

				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("상대방이 연결을 종료했습니다.");
		}

	}
}
