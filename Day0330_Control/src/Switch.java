
public class Switch {
	public static void main(String[] args) {
		/*if-else문과 마찬가지로 선택 제어문 중 하나
		 * 하지만, if-else는 조건문을 검사하는데 반하여, switch는
		 * 변수의 상태값에 따른 선택
		 * 
		 * switch(검사할 변수){
		 * case 값:
		 *   문장;
		 *   break;
		 * case 값:
		 *   문장;
		 *   break;
		 * default:
		 *   문장;
		 *   break;
		 *   }
		 *   
		 */
		
		int number = 2;
		
		switch(number) {
		case 0:
			//number가 0일 때 실행할 문장
			System.out.println("number는 0입니다.");
			break;
		case 1:
			//number가 1일 때 실행할 문장
			System.out.println("number는 1입니다.");
			break;
		case 2:
			//number가 2일 때 실행할 문장
			System.out.println("number는 2입니다.");
			break;
		default:
			System.out.println("number는 0,1,2가 아닙니다.");
			break;
				
			
		}
	}

}
