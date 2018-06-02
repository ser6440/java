
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketException;

public class ServerThread implements Runnable {

	private Socket socket1;
	private Socket socket2;

	public ServerThread(Socket socket1, Socket socket2) {
		this.socket1 = socket1;
		this.socket2 = socket2;

	}

	public void run() {

		try {

			OutputStream out = socket1.getOutputStream();
			InputStream in = socket2.getInputStream();

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));

			while (true) {

				String msg = reader.readLine();

				if (msg.equals("quit")) {
					break;

				}

				writer.write(msg);
				writer.newLine();
				writer.flush();

			}

			System.out.println("서버 종료 ");

		} catch (SocketException e) {
			e.printStackTrace();
			System.out.println("클라이언트와 연결이 끊겼습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				socket1.close();
				socket2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
