
public class DoubleArray {
	public static void main(String[] args) {
		//이차원배열: 배열을 저장할 수 있는 배열
		//정수형 데이터를 저장할 수 있는 배열 선언
		int[] intArr = new int[3];
		
		//크기 5인 정수형 배열을 저장하는 크기3인 배열
		//arr 정수형배열의 주소값을 저장하는 배열의 주소값을 저장하는 참조변수
		int[][] arr = new int[3][5];
		
		System.out.println(arr.length);	     //2차원 배열의 길이: 3
		System.out.println(arr[0].length);	//정수형 배열의 길이: 5
		//arr[0], arr[1], arr[2]는 정수형 배열의 주소값을 저장하는 참조변수
		//arr[0][0]...등등등
		//정수형 변수
		
		for(int i=0;i<arr.length;i++) {
			//얘가 총 세번반복
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		//정수 5개를 저장할 수 있는 배열 a 선언 및 생성
		int[] a = new int[5];
		//정수형 배열 3개를 저장할 수 있는 배열 b 선언 및 생성
		int[][] b = new int[3][];
		//크기 4인 정수형 배열 6개를 저장하는 배열 c선언 및 생성
		int[][] c = new int[6][4];
		
		double[] d = new double[3];
		b[0] = a;
		b[0][1] = 20;
		//b[1] = d;	//d는 정수형 배열의 주소값만 저장할 수 있다.
		System.out.println("b[0][0]:" + b[0][0]);
		System.out.println("b[0][1]:" + b[0][0]);
		a[0] = 10;
		System.out.println("b[0][0]:" + b[0][0]);
		System.out.println(a[1]);
		
		//크기 3인 정수형 배열
		int[] a2 = {5,10,20};
		b[1] = a2;
		//크기 3인 정수형 배열
		int[] a3 = {10,15,20,43,21,67};
		b[2] = a3;
		//2차원 배열을 반복문에서 사용할 때
		//각 원소들의 길이를 사용하면, 각 원소 배열의 길이가 다르더라도 모두 접근 가능
		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b[i].length;j++) {	//b의[i]번째 길이만큼 반복
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		//배열에서 값을 초기화 하면서 배열 생성하기
		int[] arr1 = {10,20,30,1,2};
		//2차원 배열에서 값을 초기화 하면서 배열 생성하기
		int[][] arr2 = {{2,3,4},{1,5,4},{7,3,6,5,7,1},{1,3}};
		System.out.println("\narr1 : ");
		for(int num:arr1) {
			System.out.println(num + " ");
		}
		
		System.out.println("arr2: ");
		for(int i = 0;i<arr2.length;i++) {
			for(int j = 0;j<arr2[i].length;j++) {	//b의[i]번째 길이만큼 반복
				
				System.out.print( arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
