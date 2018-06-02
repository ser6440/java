
public class ArrayEx3 {
	public static void main(String[] args) {
		//배열 사용 실습
		int x;
		double y;
		
		int[] a = new int[3];
		double[] b;
		b = new double[10];
		
		//배열의 객체를 생성하면 각 원소들은 숫자데이터라면 0의 값을 가진다.
		//참조형 변수의 배열을 생성하면 초기 값은  null 로 초기화
		
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//지금 하려고 하는 것은 0으로 초기화 된 배열을 만드는것이 아니라
		//초기값을 가지는 배열을 생성하는 방법을 알아봅시다.
		int[] arr = {1,3,5};
		//1,3,5로 초기화된 크기 3인 정수형 배열생성
		//단, 변수 선언시에만 사용할 수 있음	int[] arr;
		//							arr = {1,3,5}; ->안됨
		
		
		System.out.println(arr.length);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = {};	//크기 0인 배열을 만들어서 참조변수에 참조	
		//많이 쓰이지는 않지만 nullpointer 예외는 발생하지 않는다.
		
		//for-each 반복문: 배열의 데이터의 모든 원소를 한번씩 검사하고자 할때 사용
		/*
		 * for(원소데이터 타입:배열){
		 * 
		 * }
		 * */
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//배열의 모든 원소에 대해서 반복을 실행할 때 사용
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
