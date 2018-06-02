import java.util.Scanner;

public class ControlEx4 {
	public static void main(String[] args) {
		//if-else를 이용한 학점 계산하기
		//점수(정수)를 입력받아서
		//점수가 90이상일 경우 'A'
		//	   80이상일 경우'B'
		//     70이상일 경우'C'
		//     60이상일 경우'D'
		//     60미만일 경우'E'
		//를 출력하는 프로그램 작성
		/*
		 * 입출력 예)
		 * 점수를 입력하세요.
		 * 88
		 * 당신의 등급은 B입니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		//점수를 입력받을 변수
		int score;
		//등급을 입력받을 변수
		char grade;
		
		System.out.println("점수를 입력하세요");
		score = scan.nextInt();
	
		/*if(score>=60) {
			//A,B,C,D
			if(score>=70) {
				//A, B, C
				if(score>=80) {
					if(score>=80) {
						//A,B
						if(score>=90) {
							//A
							grade = 'A';
						}else {
							//B
							grade = 'B';
						}
						
					}else {
						//C
						grade = 'C';
					}
				}else {
					//D
					grade = 'D';
				}
			}else {
				//E
				grade = 'E';
			}
			System.out.println("당신의 점수는" + score + "등급은" + grade + "입니다.");
		}
			*/
		if(score>=90) {
			//A
			grade = 'A';
		}else if(score>=80) {
			//B
			grade = 'B';
		}else if(score>=70) {
			//C 
			grade = 'C';
		}else if(score>=60) {
			//D
			grade = 'D';
		}else {
			//E
			grade = 'E';
					}
		System.out.println("당신의 점수는 " + score + " 등급은 " + grade + "입니다.");
		
	}

}
