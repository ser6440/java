package byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamEx {
	public static void main(String[] args) {
		//문장을 파일에 작성하기
		String msg = "Hello!! FileOutputStream!!!";
		
		FileOutputStream fos = null;
		
		//사용할 메서드는 write()
		//FileOutStream은 byteStream이기 때문에
		//데이터 처리 단위가 byte...데이터 넘겨줄때도 byte로 넘겨줘야함
		//문자열>>>byte[] 형태로 바꿔서 전달해야 한다.
		//String 클래스의 getByte() 메서드 사용해서 byte[] 얻어옴
		try {
			fos = new FileOutputStream("src/data.txt");
			byte[] bytes = msg.getBytes();
			fos.write(bytes);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
