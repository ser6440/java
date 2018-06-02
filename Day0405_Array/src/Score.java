
public class Score {
	public static void main(String[] args) {
		//학생들의 점수가 저장되는 2차원 배열을 생성
		//2차원 배열은 각 반 별로 저장이 된다.
		// 1반은 {100,90,88,90} 네명
		// 2반은 {90,77,60} 세명
		// 3반은 {100,100,50,50,40} 다섯명
		// 4반은 {100,99,80,90,100,0} 여섯명
		// 각 반의 총점과 평균을 구하라
		// 단, 평균은 소수점 첫째자리 까지만 표시
		/*출력 예) 1반: 총점 366점, 평균 91.5점
		 *      2반: 총점 xxx점, 평균 xxx점 
		 *      3반: 총점 xxx점, 평균 xxx점 
		 *      4반: 총점 xxx점, 평균 xxx점 
		 */
		
//		int[][] score = new int[4][];
//		int[] c1 = {100,90,88,90};
//		c1 = score[0];
//		int[] c2 = {90,77,60};
//		c2 = score[1];
//		int[] c3 = {100,100,50,50,40};
//		c3 = score[2];
//		int[] c4 = {100,99,80,90,100,0};
//		c4 = score[3];
//		
//		int[][] score2 = {{100,90,88,90},{90,77,60},{100,100,50,50,40},{100,99,80,90,100,0}};
//	
//		for(int j=0;j<score.length;j++) {
//		int sum1=0;
//		double avg1=0;
//	
//		for(int i=0;i<c1.length;i++) {
//			sum1 = c1[i]+sum1;
//			avg1 = sum1/c1.length;
//		}
//		System.out.print("1반: 총점 " + sum1);
//		System.out.print(", 평균 " + avg1);
//		
//		System.out.println("\n");
//		
//		int sum2=0;
//		double avg2=0;
//		for(int i=0;i<c2.length;i++) {
//			sum2 = c2[i]+sum2;
//			avg2 = sum2/c2.length;
//		}
//		System.out.print("2반: 총점 " + sum2);
//		System.out.print(", 평균 " + avg2);
//		
//		System.out.println("\n");
//		
//		int sum3=0;
//		double avg3=0;
//		for(int i=0;i<c3.length;i++) {
//			sum3 = c3[i]+sum3;
//			avg3 = sum3/c3.length;
//		}
//		System.out.print("3반: 총점 " + sum3);
//		System.out.print(", 평균 " + avg3);
//		
//		System.out.println("\n");
//		
//		int sum4=0;
//		double avg4=0;
//		for(int i=0;i<c4.length;i++) {
//			sum4 = c4[i]+sum4;
//			avg4 = sum4/c4.length;
//		}
//		System.out.print("4반: 총점 " + sum4);
//		System.out.print(", 평균 " + avg4);
		
		int[][] scores = new int[4][];
		int[] ban1 = {100,90,88,90};
		int[] ban2 = {90,77,60};
		int[] ban3 = {100,100,50,50,40};
		int[] ban4 = {100,99,80,90,100,0};
		
		scores[0] = ban1;
		scores[1] = ban2;
		scores[2] = ban3;
		scores[3] = ban4;
		
		for(int i=0;i<scores.length;i++) {
			int sum = 0;
			//각 반별로 총합을 구하는 코드
			for(int j=0;j<scores[i].length;j++) {
				sum = sum+scores[i][j];
			}
			System.out.println((i + 1) + "반: " + sum + "총점, 평균"+((double)sum/scores[i].length)+"점");
		}
		
//		//scores 이차원배열에 점수를 저장하고 있음
//		//scores[0] -> 1반점수
//		int sum = 0;
//		sum = sum + scores[0][0];
//		sum = sum + scores[0][1];
//		sum = sum + scores[0][2];
//		sum = sum + scores[0][3];
//		//sum의 결과는 1반scores[0]의 총합
//		System.out.printf("%d 반 총합: %d점, 평균%.1f점\n,sum,(double)sum/scores[i].length");
//		
//		int sum = 0;
//		sum = sum + scores[1][0];
//		sum = sum + scores[1][1];
//		sum = sum + scores[1][2];
//		sum = sum + scores[1][3];
//		//sum의 결과는 1반scores[0]의 총합
//		System.out.printf("%d 반 총합: %d점, 평균%.1f점\n,sum,(double)sum/scores[i].length");
		
		for(int i=0;i<4;i++) {
			int sum = 0;
			for(int j=0;j<scores[i].length;j++){
				sum = sum + scores[i][j];
			}
//			sum = sum + scores[i][1];
//			sum = sum + scores[i][2];
//			sum = sum + scores[i][3];
			//sum의 결과는 1반scores[0]의 총합
			System.out.printf((i+1)+"반 총합: %d점, 평균%.1f점\n",sum,(double)sum/scores[i].length);
		}
		
	}

}
