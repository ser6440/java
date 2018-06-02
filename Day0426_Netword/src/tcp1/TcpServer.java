package tcp1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {
		//연결요청을 받는 쪽
		//Server가 할 일
		//1. 요청기다리다가 요청이 들어오면 수락(Socket 생성): ServerSocket
		//2. 소켓이 생성되면 메시지 보내기
		
		try {
			//요청을 받을 serverSocket생성
			ServerSocket serverSocket = new ServerSocket(5000);
			//요청을 받고 나서 연결이 되면 생성될 소켓을 저장할 변수
			Socket socket;
			
			//요청 기다리기 및 요청 수락
			System.out.println("연결 대기중...");
			socket = serverSocket.accept();
			
			//연결이 된 상태이므로 Client에 인삿말 보내기
			OutputStream out = socket.getOutputStream();
			
			BufferedWriter writer = new BufferedWriter(
					new OutputStreamWriter(out));
			writer.write("안녕하세요!! 반갑습니다!!\n");
			writer.newLine();
			writer.flush();
			
			while(true) {
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
