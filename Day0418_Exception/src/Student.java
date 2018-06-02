
public class Student {
	int numOfSubject;	//과목 수
	int totalScore;		//총점
	
	public Student() {
		
	}
	
	public Student(int numOfSubject, int totalScore) {
		this.totalScore = totalScore;
		this.numOfSubject = numOfSubject;
	}
	
	public void showAverage()throws Exception {
		
		int result = totalScore/numOfSubject;
		
//		try{
//			throw new Exception();
//		}catch(Exception e) {
//			System.out.println("예외발생");
//		}
		
//		try {
//		System.out.println(result);
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누면 안돼요");
//			System.out.println("1");
//		}
		System.out.println(result);
	}
}
