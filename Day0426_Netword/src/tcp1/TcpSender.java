package tcp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpSender implements Runnable{
	public void run() {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.28", 5000);
			
			InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			
			//스트림을 통해서 들어오는 문자열 읽기
			String msg = reader.readLine();
			System.out.println("서버메시지: " + msg);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
