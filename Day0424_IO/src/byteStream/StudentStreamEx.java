package byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class StudentStreamEx {
	public static void main(String[] args) {
		//student.txt 파일에 저장되어있는 문자열 읽어와서
		//구분자로 구분하고, 데이터를 학생객체에 넣기
		//FileInput/OutputStream
		//Student 객체, StringBuilder, StringTokenizer
		FileInputStream in = null;
		FileOutputStream out = null;
		StringBuilder sb = new StringBuilder();
		
		
		try {
			in = new FileInputStream("src/student.txt");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			 in = new FileInputStream("src/student.txt");
			 int data;
			 
			 while((data = in.read()) != -1) {
				 //읽어온 문자를 문자열로 만들어 내야함
				 sb.append((char)data);
			 }
			 //while문이 끝나면 파일에 있는 문자열이 그대로 sb에 저장
			 String str = sb.toString();
//			 //제대로 읽어왔는지 확인
//			 System.out.println(str);
			 
			 //읽어온 문자열을'/'기준으로 잘라내기
			 StringTokenizer st = new StringTokenizer(str, "/");
			 
			 //첫번 째 토큰은 이름, 두번째는 학년, 세번째는 점수
			 Student student = new Student();
			 student.setName(st.nextToken());
			 //st.nextToken() 문자열>>>숫자
			 //Integer.parseInt(문자열)
			 //학년
			 int grade = Integer.parseInt(st.nextToken());
			 student.setGrade(grade);
			 //점수
			 int score = Integer.parseInt(st.nextToken());
			 student.setScore(score);
			 
			 //파일로 부터 읽어온 정보를 넣은 학생 객체 정보 출력
			 System.out.println(student);
			 
			 //학생정보 변경
			 student.setName("lee");
			 student.setGrade(2);
			 student.setScore(100);
			 
			 //학생정보를 가져와서 문자열로 만들기
			 String outStr = student.getName()+"/"+student.getGrade()+"/"+student.getScore();
			 //제대로 만들어졌는지 확인
			 //System.out.println(outStr);
			 
			 //학생정보를 file에 쓰기
			 out = new FileOutputStream("src/studentOut.txt");
			 out.write(outStr.getBytes());
			 
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어요");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
