import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		/* 피보나치 수열 만들기
		 * 사용자로부터 정수 하나(3이상)를 입력받아서 수만큼의 피보나치 수열을 출력
		 * 0 1 1 2 3 5 8 13 21 34 55 ... 
		 * 
		 * n3 = n1 + n2
		 * 
		 * 단, 1항과 2항은 0과 1로 고정
		 * 
		 * 입출력 예)
		 * 출력할 항의 개수를 입력하세요
		 * 5
		 * 0 1 1 2 3
		 * 0 + 1 = 1
		 * 1 + 1 = 2
		 * 1 + 2 = 3
		 */
		int num;

		int n1 = 0;
		int n2 = 1;
		int n3;
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 항의 개수를 입력하세요");
		num = scan.nextInt();
		
		//System.out.print(n1 + " "); //0
		//System.out.print(n2 + " "); //1
		//n3 = n1 + n2;
		//System.out.print(n3 + " ");  //1
		
		
//	-------------------	
//		n1 = n2;  //n1 = 1
//		n2 = n3;  //n2 = 1
//		
//		n3 = n1 + n2;    //n3 =2
//		System.out.println(n3);
		//n2가 가지는 값을 n1에 넣고
		//n3이 가지는 값을 n2에 넣자
//	-------------------------	
//		n1 = n2;  //n1 = 1
//		n2 = n3;  //n2 = 2
//		
//		n3 = n1 + n2;   //n3 = 3
//		System.out.println(n3);
//---------------------------		
//		n1 = n2;  //n1 = 2
//		n2 = n3;  //n2 = 3
//		n3 = n1 + n2;	//n3 = 5
//		System.out.println(n3);
//	------------------	
//		
//		n1 = n2;  
//		n2 = n3;
//		
//		n3 = n1 + n2;
//		System.out.println(n3);
//
//	--------------------	
//		
//		n1 = n2;  
//		n2 = n3;
//		
//		n3 = n1 + n2;
//		System.out.println(n3);
//		
//	---------------------	
		for(int n=1;n<=num;n++) {
			n3 = n1 + n2;  
			System.out.print(n1 + " ");
			n1 = n2; 
			n2 = n3;  
			   
		}
		
	}

}
