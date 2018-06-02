package tcpMultiChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.Socket;


public class Receiver implements Runnable{
	private Socket socket;
	
	//socket의 경우는 외부에서 받아서 사용
	public Receiver(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		//소켓으로 부터 메시지 받아서 출력
		BufferedReader reader = null;
		String msg = null;
		
		//데이터를 소켓으로부터 읽어오기 위해서 스트림을 얻어옴
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			while(true) {
				msg = reader.readLine();
				System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
