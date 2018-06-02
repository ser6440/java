import java.util.Scanner;

public class Jungol167 {
	public static void main(String[] args) {
		//4x2 이차원 배열 생성하고, 순서대로 사용자에게 입력받기
		//(크기 2인 정수형 배열 4개를 저장할 수 있는 배열 생성)
		int[][] arr = new int[4][2];
		Scanner input =  new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			//arr[0],arr[1],arr[2],arr[3]으로 반복
			//arr[i][0] = input.nextInt();
			//arr[i][1] = input.nextInt();	0,1자리의 숫자가 하나씩 증가하는 반복문
		
		    for(int j=0;j<arr[i].length;j++) {
	              arr[i][j] = input.nextInt();
	          }
	      }
		//가로 평균
		int sumTotal = 0;	//전체합
		int count = 0;		//전체 개수		//0 1
		int[] sumCol = new int[2];		//[0][0]
		
			for(int i=0;i<arr.length;i++) {
				int sumRow = 0;	//가로평균
				for(int j=0;j<arr[i].length;j++) {
				//안쪽 for문이 끝날때 마다 총합과 평균을 구하면 된다.
				sumRow += arr[i][j];
				sumTotal += arr[i][j];
				sumCol[j] += arr[i][j];
				count++;
			}
			//sumRow는 총합
			System.out.print(sumRow/arr[i].length + " ");
		}
		System.out.println("");
		
		for(int i=0;i<sumCol.length;i++) {
			System.out.println(sumCol[i]/4 + " ");
		}
		System.out.println("");
		System.out.println(sumTotal/count);
		
//		//세로평균
//		for(int i=0;arr[i].length;i++) {
//			int sumCol = 0;	//세로총합
//			for(int j=0;j<arr.length;j++) {
//				sumCol += arr[j][i];			
//			}
//			System.out.print(sumCol/arr.length + " ");
//		}
//		System.out.println();
//		System.out.println(sumTotal/count);
	}

}
