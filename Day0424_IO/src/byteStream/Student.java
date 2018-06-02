package byteStream;

import java.io.Serializable;

public class Student implements Serializable{
		//클래스의 버전 정보를 확인하는 데이터
		//클래스의 정보가 변경되었을 때, 직렬화해서 객체를 만들어내면 문제가 발생할 수 있다
		//클래스의 버전 정보를 저장하는 변수를 둬서 객체가 업데이트 되었는지 확인
		private static final long serialVersionUID = 4294376767037245148L;
	
		private String name;
		private int grade;
		private int score;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", grade=" + grade + ", score=" + score + "]";
		}
		
		
	

}
