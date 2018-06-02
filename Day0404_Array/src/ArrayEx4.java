import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String[] args) {
		//사용자에게 10개 정수를 입력받아서
		//배열에다가 저장해서
		//짝수 번째 입력받은 수의 합과
		//홀수 번째 입력받은 수의 합을 각각 출력하시오
		//10칸짜리 정수형 배열 만들어서 입력받으세요
		
		//첫 번째 입력받은 수는 배열의 첫번째 칸에 저장
		//두 번째 입력받은 수는 배열의 첫번째 칸에 저장
		//세 번째 입력받은 수는 배열의 첫번째 칸에 저장
		//...열번째 까지 반복
		//10개의 정수를 저장할 수 있는 배열 선언
		//[0][0][0][0][0][0][0][0][0][0]	<< 생성됨
		int[] arr = new int[10];
		Scanner input = new Scanner(System.in);
		
		int oddSum = 0;
		int evenSum = 0;

		//arr[0] = input.nextInt();
		//arr[1] = input.nextInt();
		//arr[2] = input.nextInt();
		//...arr[9] = input.nextInt();
		//모양이 비슷하니 반복문으로 처리합시다.
		
		for(int i=0;i<arr.length;i++) {		
			arr[i] = input.nextInt();
			}
		//입력을 다 받았으니까 한칸씩 검사하면서 짝수 인덱스, 홀수 인덱스에 있는 값을 따로 합계로 구하자
		for(int i = 0;i<arr.length;i++) {
			if(i%2 == 0) {
				//짝수 인덱스, 홀수 번째 입력받은 수
				oddSum = oddSum + arr[i];
			}else {
				//홀수 인덱스, 짝수번째 입력받은 수
				evenSum = evenSum + arr[i];
			}
		}
		System.out.println("짝수번째 합:" + evenSum);
		System.out.println("홀수번째 합:" + oddSum);
	}

}
