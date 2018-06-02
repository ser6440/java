
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3,5,4,1,2};
		//중첩 반복을 이용해야한다.
		
		//각 인덱스에 들어갈 값을 찾는다.0부터
		//변수간 값을 바꾸는 방법
//		int a,b;
//		a = 3;
//		b = 10;
//		//b의 값을 임시로 저장할 변수를 하나 선언
//		int tmp;
//		tmp = b;
//		b = a;
//		a = tmp;
//		System.out.println(a);
//		System.out.println(b);
//		//a=10, b=3이된다.
		
		//1. 첫번째 칸부터 가장 작은 값을 찾아서 넣는다.
		//0번에 들어갈 가장 작은 수를 찾는다. 0번부터 4번까지 반복
		//1번에 들어갈 가장 작은 수를 찾는다. 1번부터 4번까지 반복
		//2번에 들어갈 가장 작은 수를 찾는다. 2번부터 4번까지 반복
		//3번에 들어갈 가장 작은 수를 찾는다. 3번부터 4번까지 반복
		//4번에 들어갈 가장 작은 수를 찾는다. 4번부터 4번까지 반복 
		
		//1. 현재 인덱스의 값을 최소값변수의 값으로 지정
		//2. 배열의 0번부터 4번까지 최소값과 비교한다.
		//   비교하다가 최소값이 더 크다면 , 최소값을 비교 대상으로 바꿔준다.
		//3. 4번 인덱스까지 최소값 비교를 반복한다. 
		
		//최소값을 저장할 변수 
		//최소값을 3으로 잡고 비교시작			int minVal, arr[i]
		//int[] arr = {3,5,4,1,2};
		
		//풀이1
//		int tmp;
//		for(int i=0;i<arr.length;i++) {
//			int minVal = i;
//			for(int j=i;j<arr.length;j++) {
//			if(arr[j]>arr[i]) {
//				minVal = arr[i];
//			}
//		}
//			tmp  = arr[i];
//			arr[i] = minVal;
//			minVal = tmp;
//		}
//		System.out.println(arr);
		/*************************************/
		
		//풀이2
//		int minVal;
//		int temp;
//		
//		for(int i=0;i<arr.length;i++) {
//		    minVal = arr[i];	
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]<minVal) {
//					temp = minVal;
//					minVal = arr[j];
//					arr[j] = temp;
//					arr[i] = minVal;
//				}
//			}
//			System.out.println(arr[i]);
//		}
		/**********************************************/
		
//		//쌤
//		//각 자리에 들어갈 숫자를 넣어주는 반복문
//		for(int i=0;i<arr.length;i++) {
//			//배열 안에서 최소값을 찾기위해서는 내부비교를 해야한다.
//			//배열에서 가장 앞에 있는 수를 최소값이라고 가정하겠다.
//		    int minVal = arr[i];	//이미 자리를 찾은 숫자는 비교대상에서 제외
//			for(int j=i+1;j<arr.length;j++) {
//				//minVal가 비교대상보다 크다면, 비교대상을 최소값으로 만들어줌
//				//값 바꿔주기 minVal과 비교대상 자기 바꿔주기
//				if(arr[j]<minVal) {
//					int temp = minVal;
//					minVal = arr[j];	//비교대상을 최소값으로 만들어주기
//					arr[j] = temp;	
//				}
//			}	//반복문이 끝이 나면 최소값이 minVal에 저장되어 있음
//				//최소값이 들어갈 자리에 최소값을 넣어줌
//			arr[i] = minVal;
//		}//최소값을 자리에 넣어주는 반복문 끝
//		//반복문이 끝이나면 정렬된 배열을 얻을 수 있음
//		for(int num:arr) {
//			System.out.println(num + " ");
//		}
		/**********************************************************/
		
		
		//이번에는 최소값을 찾아서 바로 바꾸지 않고, 자리 위치만 가지고 있기
		for(int i=0;i<arr.length;i++) {
			//알고있어야 하는 값: 최소값, 최소값의 자리번호
			int minVal;	//최소값
			int minPos;	//최소값 자리번호
			minVal = arr[i];
			minPos = i;
			arr[i] = 1;
			for(int j=0;j<arr.length;j++) {
				if(minVal>arr[j]) {
					minVal = arr[j];
					minPos = j;	//최소값 위치 저장
				}
			}
			arr[minPos] = arr[i];
			//최소값을 찾아서 최소값과 현재 자리에 있는 값을 위치 바꿔주기
		}
		
	}
}
