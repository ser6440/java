import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// 연결 요청이 들어오면 수락
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(5000);
			System.out.println("연결 요청 대기중....");

			Socket socket1 = serverSocket.accept();
			Socket socket2 = serverSocket.accept();

			System.out.println("클라이 언트 연결됨");

			// 클라이언트로 부터 들어오는 메시지 받아서
			// 다시 그대로 전달
			// socket
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket2.getOutputStream()));
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
			
			while(true) {
				String msg = reader.readLine();
				writer.write(msg);
				writer.newLine();
				writer.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
