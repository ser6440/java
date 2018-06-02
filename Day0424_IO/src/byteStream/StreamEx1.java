package byteStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamEx1 {
	public static void main(String[] args) throws IOException{
		//키보드로 부터 입력받을 때도 사용하고, 모니터에 출력할때도 사용하고...
		//System.in standard inputStream(키보드로부터의 입력을 받음)
		//Scanner scan = new Scanner(System.in);
		//스캐너 없이 inputStream으로 부터 데이터 읽어오기
		//프로그램이 할일: 키보드로부터 들어오는 입력을 처리
		//스트림에서 데이터를 읽어와서 화면에 아스키 코드로 출력
		//만약 읽어온 데이터가 'q','Q'라면 출력하지 않고 종료
		//System.in.read(): 표준 입력스트림으로 부터 1byte를 읽어옴
		//반환은 int를 반환: 제대로 읽어오면 읽은 값을 반환, 읽어오지 못하면 -1을 반환
		
		System.out.println("문자를 입력하세요...");
		int read;
		//읽어온 값이 있으면 계속해서 반복하다가 없으면 반복종료
		//읽어온 값이 없다: read() >> 반환값이 -1
		while((read = System.in.read()) != -1) {
			//데이터가 있음
			
			if(read == '\n' || read == '\r') {
				continue;	//개행문자 입력되면 아무것도 안하고 다음으로 진행
			}
			if(read == 'q' || read == 'Q') {
				//반복종료
				break;
			}
			char c = (char)read;
			System.out.println("[" + c + "] = " + read);
			
		}
	}

}
