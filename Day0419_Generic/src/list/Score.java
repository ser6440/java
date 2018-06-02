package list;

public class Score {
	//private
	//국어(정수), 영어(정수), 수학(정수) 점수를 저장할 수 있는 클래스
	//kor,eng,math
	//getter/setter만들고, toString
	//생성자: 기본생성자/국,영,수를 매개변수로 받는 생성자
	private int kor;
	private int eng;
	private int math;
	
	public void setKor(int kor) {
		this.kor=kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public String toString() {
		return kor+","+eng+","+math;
	}
	public Score() {
		kor=0;
		eng=0;
		math=0;
	}
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}
