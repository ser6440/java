package guiChat;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
 
public class ServerManager {
    //소켓리스트 저장
    //소켓이 들어오면 thread 생성
    //Thread 가 어떤일을 하나???
    //전달 받은 소켓으로 부터 메시지를 받아서 , 리스트에 있는 모든 소켓에 뿌리기 
     
     
    private List<Socket> socketList;
     
    public ServerManager() {
        socketList = new ArrayList<Socket>();
    }
     
    public void add(Socket socket) {
        socketList.add(socket);
        //thread 생성 및 실행
//      Thread t1 = new ServerThread(socket);
//      t1.start();
        new ServerThread(socket).start();
         
    }
    //스레드가 list를 계속 사용해야 되기 때문에 멤버클래스로 선언
    class ServerThread extends Thread{
        //특정 소켓으로 부터 메시지를 받아서 리스트의 모든 소켓에 전달
        private String name;
        private Socket socket;
        public ServerThread(Socket socket) {
            this.socket = socket;
        }
         
        public void run() {
            BufferedReader reader = null;
             
            try {
                reader = new BufferedReader(
                                new InputStreamReader(
                                        socket.getInputStream()));
                //추가기능 : 이름입력받기
                BufferedWriter writer1 =
                        new BufferedWriter(new OutputStreamWriter(
                                socket.getOutputStream()));
                writer1.write("이름을 입력하세요");
                writer1.newLine();
                writer1.flush();
                 
                name = reader.readLine();
                 
                while(true) {
                    String msg = null;
                     
                    //문자열을 읽어왔으니.... 리스트가 가지고 있는 소켓에다가 전달
                    msg = reader.readLine();
                    for(Socket s:socketList) {
                        if(s == socket) {
                            continue;
                        }
                        BufferedWriter writer =
                                new BufferedWriter(new OutputStreamWriter(
                                        s.getOutputStream()));
                        writer.write(name + " : " + msg);
                        writer.newLine();
                        writer.flush();
                    }
                }
                 
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             
        }
    }
     
}
