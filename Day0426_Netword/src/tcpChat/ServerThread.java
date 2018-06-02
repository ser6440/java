
package tcpChat;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
 
public class ServerThread implements Runnable {
    private Socket socket1;
    private Socket socket2;
 
    public ServerThread(Socket socket1, Socket socket2) {
        this.socket1 = socket1;
        this.socket2 = socket2;
    }
 
    public void run() {
        // 얘가 해야할일이..두 개의 클라이언트로 부터 각각 메시지를 받으면 다른 클라이언트로 전달
        // 메시지를 주고 받기 위해서 2개의 소켓이 필요
        // 클라이언트 하나로 부터 들어오는 메시지를 다른 메시지로 전달 하는 작업
        // 각각의 소켓으로 부터 데이터를 받아와야 함
        BufferedReader reader;
        BufferedWriter writer;
        try {
            reader = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket2.getOutputStream()));
 
            // 소켓1로 부터 들어오는 메시지를 읽음
            while(true) {               
                String msg = reader.readLine();
                // 소켓 2로 메시지를 내보냄
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
 