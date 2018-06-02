
public class NestedLoop {
	public static void main(String[] args) {
		//System.out.println("**********");
		//System.out.println("**********");
		//System.out.println("**********");
		//System.out.println("**********");
		//System.out.println("**********");
		//System.out.println("**********");
		//System.out.println("**********");
//		for(int i =1;i<=6;i++) {
//			//System.out.print("*");
//			for(int j=1;j<=10;j++) {
//				System.out.print("*");
//			}
//			System.out.println("\n");
//		}
		/* 2 * 1 = 2	3 * 1 = 3
		 * 2 * 2 = 4	3 * 2 = 6
		 * 2 * 3 = 6	3 * 3 = 9
		 * 2 * 4 = 8	3 * 4 = 12
		 * 2 * 5 = 10	3 * 5 = 15
		 * 2 * 6 = 12	3 * 6 = 18
		 * 2 * 7 = 14	3 * 7 = 21
		 * 2 * 8 = 16	3 * 8 = 24
		 * 2 * 9 = 18 	3 * 9 = 27
		 * 
		 * ...9단까지 출력
		 */
		//2단부터 9단까지 반복
		for(int j = 1;j<=9;j++) {
			System.out.print(" 	");
			for(int i = 2;i<=4;i++) {
				System.out.print(i + " * " + j + " = " + i*j+"  " );
			}
			System.out.println(" ");
		}
	}

}
