
package network;
 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
 
public class UDPSender {
    public static void main(String[] args) {
        // UDP 방식으로 데이터를 보내는 프로그램
        // 1. 목적지의 IP주소와 port 번호가 필요
        // 2. 데이터를 DatagramPacket 준비
        // 3. IP와 port 정보를 저장하고
        // 4. 데이터를 전송(데이터가 나가는 통로: DatagramSocket)
        // 5. 전송할 데이터는 byte[]로 준비 
         
        //내 컴퓨터에서 주소를 지칭 'localhost', '127.0.0.1'
                //프롬프트 창에서 ipconfig -all 하시면 ip 주소 확인가능
                 
                try {
                    //패킷을 내 보내야 하기 때문에 데이터를 내보낼 소켓을 준비
                    //UDP 방식에서 소켓은 DatagramSocket
                    DatagramSocket socket = new DatagramSocket();
                    //데이터를 보낼 목적지의 ip주소를 저장할 객체
                    InetAddress ia = InetAddress.getByName("192.168.0.34");
                    //데이터를 내 보내기 위해서 데이터를 패킷 참조 변수 선언
                    DatagramPacket packet = null;
                    //데이터를 담을 byte[] 준비
                    byte[] buf;
                     
                    //계속해서 반복하면서 키보드로 부터 입력을 받음
                    Scanner scan = new Scanner(System.in);
                    while(true) {
                        String msg = scan.nextLine();
                        if(msg.equals("quit")) {
                            break;
                        }
                        buf = msg.getBytes();
                        packet = new DatagramPacket(buf, buf.length,ia,5500);
                        //패킷 만들고 통로(soket)을 이용해서 전송
                        socket.send(packet);
                         
                    }
                     
                } catch (SocketException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (UnknownHostException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                 
    }
}
 