package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UDPServer {
	// 스레드로 만들필요는 없음
	// 얘가 하는 역할은 동시에 작업해야할 일이 없다.
	// 받고 나서 보내기: 작업의 순서가 정해져 있기 때문에 thread가 필요 없음

	// 클라이언트 부분에서 Sender와 Receiver를 thread로 구현한 것은
	// 클라이언트가 메시지 보내기와 받기를 동시에 진행해야 하기 때문이다.

	public static void main(String[] args) {
		// 메시지를 주고 받기 위한 소켓
		// 메시지를 전달하기 위한 IP주소의 모음
		
		Set<InetAddress> ipSet = new HashSet<>();
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(5500);
			byte[] buf = null;	//데이터를받기위한 버퍼
			DatagramPacket packet = null;	//데이터를 받기위한 패킷

			// 얘가 할일은 5000번 포트로 들어오는 데이터를 계속 받으면 됨
			while (true) {
				// 패킷 준비하고, socket으로 부터 데이터 받아오기
				//System.out.println("데이터 수신 대기중...");
				buf = new byte[512];
				packet = new DatagramPacket(buf, buf.length);

				socket.receive(packet);
				//데이터를 받고나면, 데이터를 다른 클라이언트들에게 전송
				//클라이언트들에게 전송 하기위해서는 IP주소를 알아야 한다.
				//메시지를 받으면 해당 IP를 저장:
				//그냥 저장하면 같은 클라이언트에서 여러번 메시지를 보내면 중복으로 저장됨 >> 중복이 되지 않게 저장(Set: 중복되지 않는 저장)
				
				ipSet.add(packet.getAddress());
				//ipSet에 들어있는 ip목록에다가 받은 메시지를 하나씩 전달하면 됨
				//Set안에 요소를 모두 조회하기 위해서 Iterator가 필요
				Iterator<InetAddress> it = ipSet.iterator();
				
				while(it.hasNext()) {
					//Set요소를 하나씩 가져오기
					InetAddress ip = it.next();
					//IP를 가져왔으니 데이터를 보내면 됨, DatagramPacket이 필요
					DatagramPacket sendPacket = new DatagramPacket(buf, buf.length, ip, 5500);
					
					socket.send(sendPacket);
					
				}
				
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} if(socket !=null) {
            socket.close();
        }

	}
}
