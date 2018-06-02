package byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {
	public static void main(String[] args) {
		//데이터 처리 스트림 예제 2
		//DataInputStream,DataOutputStream
		//byte 단위로 데이터를 쓰던 것을,
		//자바 기초 자료형 단위로 데이터를 쓸 수 있게 구현해 놓은 스트림
		
		DataInputStream in = null;                  
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("data.dat")));
			in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream("data.dat")));

			out.writeInt(100);
			out.writeDouble(3.14);
			out.writeBoolean(false);
			out.writeUTF("Hello!!");
			
			//버퍼가 꽉차지 않으면 내보내지 않음. 버퍼가 꽉차지 않아도
			//현재 버퍼에 있는 내용을 내보내기 위해서, flush()호출
			//쓴 순서대로 저장이 되기 때문에 읽어올때도
			//저장할 때 순서대로 읽어와야 한다. 정수-실수-ㄴ논리
			int intNum = in.readInt();
			double boubleNum = in.readDouble();
			boolean bool = in.readBoolean();
			String str = in.readUTF();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
