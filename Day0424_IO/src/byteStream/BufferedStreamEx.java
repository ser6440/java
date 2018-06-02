package byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamEx {
	public static void main(String[] args) {
		//데이터 처리 스트림 예제 1
		//데이터 처리 스트림-(BufferedInput/Output Stream):
		//데이터 처리 스트림: 데이터 소스에서 값을 가져오거나 쓰는게 아니라 
		//데이터를 받아서 쓰기 편하게 만들어주는 역할
		//파일에 숫자 1~300까지 작성>> 반복문을 통해서 작성
		//파일에 작성된 내용을 읽어와 보기
		//파일에 내용을 작성할 것이기 때문에 FileInput/OutputStream필요
		
		//파일 input/output 스트림은 데이터 싱크 스트림
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//BufferedInput/OutputStream 은 데이터 처리 스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		//반복문 돌면서 파일에 숫자쓰기
		try {
			fos = new FileOutputStream("number.txt");
			//조금 더 효율적으로 사용하기 위해서 Buffered스트림을 이용해서 데이터 보내기
			bos = new BufferedOutputStream(fos);
			//버퍼의 크기 4096byte
			for (int i = 0; i <= 300; i++) {
				// 파일에 숫자를 씀
				//BufferedOutputStream를 이용해서 데이터 쓰기
				//버퍼에 데이터를 담아뒀다가 꽉차면 스트림으로 부터 데이터를 내보낸다.
				bos.write(i);
			}
			//다 작성하고 나서는 버퍼를 비워주는 작업을 해야 한다.
			bos.flush();
			
			//파일에 써져있는 데이터를 다시 읽어오기
			fis = new FileInputStream("number.txt");
			//데이터 싱크 스트림으로 부터 데이터 읽어오기
			bis = new BufferedInputStream(fis);
			
			int data;
			while((data = bis.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

