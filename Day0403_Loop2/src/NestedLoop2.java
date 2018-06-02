
public class NestedLoop2 {
	public static void main(String[] args) {
		/*
		 
		 * 
		 ** 
		 ***
		 ****
		 *****
		 		*
		  	   **
		  	  ***
		  	 ****
		  	*****
		 */
		//별을 다섯줄 출력해야 되니까 다섯번 반복하는 반복문 작성
		for(int i = 1;i<=5;i++) {
			//별출력: 별 하나 출력하는 반복문 작성
			//첫 번째 반복에서 별하나 출력 >> 한번 반복
			//두 번째 반복에서 별 둘 출력 >> 두번반복
			//i번째 반복에서 별 i개 출력 >> i번반복
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");	//한 줄을 다 출력하고 나서 개행문자
		}
		//두 번째 예제는 별 출력전에 빈 공간을 출력하는 예제이다.
		//빈 공간을 출력하는 개수가 첫 번째 줄에서는 4개
		//                 두 번째 줄에서는 3개...
		//                 i 번째 줄에서는 5-i개
		for(int i = 1;i<=5;i++) {
			//빈공간 먼저 출력
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			//별출력
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
