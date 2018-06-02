
public class ExceptionTest2 {
	public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int[] numbers = new int[3];
         
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
         
        int result = 0;
        //반복문 밖에서 예외를 처리하면, 반복문 전체가 종료되고,
        //반복이 더이상 실행되지 않음
//      try {           
//          for(int i=0;i<4;i++) {
//              result = numbers[i]/b;
//          }
//      }catch(ArithmeticException e) {
//          e.printStackTrace();
//      }
         
        //반복문안에서 예외를 처리하면 각 반복마다 예외를 처리하는 것이므로
        //반복은 계속적으로 실행된다.
//      for(int i=0;i<4;i++) {
//          try{
//              result = numbers[i]/b;
//          }catch(ArithmeticException e) {
//              e.printStackTrace();
//          }catch(Exception e) {
//              e.printStackTrace();
//              System.out.println("예외가 발생했습니다.");
//          }
//      }
         
        //0으로 나누었을때는 result에 1을 넣고 싶음
                //나머지는 그냥 나눈값 출력
         
         
        //여러 예외를 하나의 catch문으로 처리하고 싶을때는  '|' 로 구분해서 여러개 적어주면된다. 
        for(int i=0;i<4;i++) {
            try{
                result = numbers[i]/b;
            }catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
                result = 1;
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
         
        System.out.println(result);

        System.out.println("프로그램을 종료합니다. ");

	}

}
