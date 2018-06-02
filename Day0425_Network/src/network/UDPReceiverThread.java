package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverThread implements Runnable {
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(5000);
			byte[] buf = null;
			DatagramPacket packet = null;

			// 얘가 할일은 5000번 포트로 들어오는 데이터를 계속 받으면 됨
			while (true) {
				// 패킷 준비하고, socket으로 부터 데이터 받아오기
				System.out.println("데이터 수신 대기중...");
				buf = new byte[512];
				packet = new DatagramPacket(buf, buf.length);

				socket.receive(packet);
				System.out.println(packet.getAddress() + " : " + new String(buf).trim());

			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
