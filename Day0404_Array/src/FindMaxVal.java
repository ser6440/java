
public class FindMaxVal {
	public static void main(String[] args) {
		//1. {77,50,64,100,25} 형태의 임의의 숫자 5개로 초기화된 배열을 생성
		//2. 해당 배열에서 가장 큰 숫자를 찾아서 화면에 출력
		//출력 예)
		//가장 큰 숫자는 100입니다.
		
		//가장 큰 값을 저장할maxVal 변수선언
		int maxVal = 0;
		//값이 초기화된 배열 생성
		int[] arr  = {77,50,64,100,25};
		
		//arr.length ==>> 5
		for(int i = 0;i<arr.length;i++) {
			//배열의 원소를 하나씩 maxVal과 비교하면서,
			//원소가 maxVal보다 크면, 해당 원소값을 maxVal에 저장
			if(arr[i]>maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println("가장 큰 숫자는 "+maxVal+"입니다.");
		
		//음수일때
		//int[] arr2  = {-10, -5, -3, -100, -25};
		//결과가 0이 나온다 왜?->int maxVal=0;으로 초기화 되었기 때문에 배열중에서 가장 큰 값을 찾아야 하는데...외부 값이 비교 대상에 포함됨
		//int maxVal = arr[0];으로 초기화 시킨다.

		//위에 for문을 for-each로
//		for(int number:arr) {
//			if(number > maxVal) {
//				maxVal = number;
//			}
//		}
	}

}
