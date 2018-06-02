package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		//파일 읽어와서 그대로 다른 파일에 쓰면됨
		//buffer를 이용해 봅시다(데이터 바구니):
		//한꺼번에 많은 데이터를 읽어오기 위해서 사용
		//FileInputStream에서 많은 데이터를 한꺼번에 읽어오기 위해서
		//byte[]을 이용해서 읽어오면 된다.
		byte[] buffer = new byte[512];
		//마지막 짜투리를 위해서 읽어온 데이터의 길이가 필요
		int readLength;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("nn.jpg");
			fos = new FileOutputStream("nn_copy.jpg");
			
			while((readLength = fis.read(buffer)) != -1) {
				//읽어왔으면 데이터는 buffer에 들어있고
				//읽은 길이는 readLength에 들어있음
				//buffer에 있는 내용을 모두 파일에 작성
				//필요없는 내용이 같이 써 질 수 있기 때문에 읽어온 만큼만 쓰기
				fos.write(buffer, 0, readLength);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
