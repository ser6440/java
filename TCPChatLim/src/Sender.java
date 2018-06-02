import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Sender implements Runnable {
	Socket socket;
	
	public Sender(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		//얘가 해야 되는 작업
		//키보드로 부터 입력받아서, 소켓으로 내보내기
		Scanner scan = new Scanner(System.in);
		
		//데이터를 내보내려면 outputStream 
		
		try {
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String msg = scan.nextLine();
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
