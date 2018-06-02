
public class Student {
	//학생 객체가 가질 기능
	//평균 구하는 기능
	//출력기능
	//가지는 데이터
	//이름,수학,영어,국어,평균
	
	String name;
	int math;
	int eng;
	int kor;
	double avg;
	
	//평균계산기능>> 메서드
	//수식자 반환값 이름(){
	//
	//}
	public void calAvg() {
		avg = (math + eng + kor)/3;		
	}
	//출력기능
	public void printStudent() {
		System.out.println("이름: " + name);
		System.out.println("평균: " + avg);
	}
}
	


