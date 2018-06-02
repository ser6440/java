package tcp1;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
 
public class TcpServer2 {
    public static void main(String[] args) {
        //연결요청을 받는 쪽
        //Server가 할 일
        //1. 요청기다리다가 요청이 들어오면 수락(Socket 생성) :ServerSocket
        //2. 소켓이 생성되면 메시지 보내기 
        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
            //요청을 받을 serverSocket 생성
            serverSocket = new ServerSocket(5000);
            //요청을 받고 나서 연결이 되면 생성될 소켓을 저장할 변수
             
             
            //요청 기다리기 및 요청 수락
            System.out.println("연결 대기중...");
            socket = serverSocket.accept();
             
            //연결이 된 상태이므로 Client에 인삿말 보내기
             
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
             
            BufferedWriter writer 
             = new BufferedWriter(
                new OutputStreamWriter(out));
             
            BufferedReader reader
             = new BufferedReader(
                new InputStreamReader(in));
            //클라이언트로 부터 메시지 받고 나서 전송
            //클라이언트로 부터 메시지 받고
            while(true) {
//              System.out.println("서버: 수신대기중");
                 
                String msg = reader.readLine();
                //재전송
                if(msg.equals("quit")) {
                    break;
                }
                writer.write(msg);
                writer.newLine();
                writer.flush();
            }
            System.out.println("서버 종료");
             
             
        }catch(SocketException e) {
            System.out.println("클라이언트와 연결이 끊겼습니다.");
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
         
    }
}
