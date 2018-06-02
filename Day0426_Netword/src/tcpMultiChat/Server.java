package tcpMultiChat;
 
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server {
    //얘가 할일은 소켓 연결 받기 : 계속..반복하면서
    public static void main(String[] args) {
        ServerSocket serverSocket;
        ServerManager manager = new ServerManager();
        try {
             
            serverSocket = new ServerSocket(5000);
            while(true) {
                System.out.println("요청 대기중...");
                Socket socket = serverSocket.accept();
                //서버 매니져에게 소켓 넘겨주기
                manager.add(socket);
                 
            }
             
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

