package readerwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
	public static void main(String[] args) {
		//문자 스트림 예제- 파일 복사
		//파일로 부터 데이터를 읽어와서 처리
		//FileReader, FileWriter 사용
		
		FileReader reader = null;
		FileWriter writer = null;
		
		//파일로부터 데이터를  읽어서 복사할 파일에 쓰기
		int readChar;
		try {
			reader = new FileReader("test.txt");
			writer = new FileWriter("test_copy.txt");
			
			while((readChar = reader.read()) != -1) {
				//문자열 하나씩 읽어옴, 읽어올 문자열이 없으면 -1을 반환
				//일겅온 문자열을 복사할 파일에 쓰기
				writer.write((char)readChar);
				writer.flush();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
