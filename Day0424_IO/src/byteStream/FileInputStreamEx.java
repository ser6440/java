package byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		//표준입력스트림(System.in): 키보드로 부터 데이터를 읽어옴
		//FileInputStream: 파일로 부터 데이터를 읽어온다.
		
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("data.txt");
			 int data;
			 
			 while((data = fis.read()) != -1) {
				 System.out.print((char)data);
			 }
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요");
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			//우리가 사용한 자원닫아주기
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
