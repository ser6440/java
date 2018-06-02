import java.util.Scanner;

public class CircleTest2_1 {
	public static void main(String[] args) {
		//사용자로 부터 다수의 원의 반지름과 중심점의 좌표를 입력받아서
				//출력하는 프로그램을 작성하라
				//배열에다가 Circle을 저장해서 출력하기
				/*입 출력예) 저장할 원의 개수를 입력하세요
				 *        3  (3이라면 세번반복)
				 *        원의 반지름을 입력하세요
				 *        10
				 *        원의 x좌표를 입력하세요
				 *        3
				 *        원의 y좌표를 입력하세요
				 *        5
				 *       --------------------입력받고나서
				 *       원1의 반지름은 3, 넓이는xx.xx 중심좌표는3,5
				 *       원2의 반지름은 3, 넓이는xx.xx 중심좌표는3,5
				 *       원3의 반지름은 3, 넓이는xx.xx 중심좌표는3,5
				 */
		//여러개의 원을 한꺼번에 반복문을 통해서 처리
		//c1: 원 하나의 정보를 처리할 수 있는 참조변수
		//Circle c1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("저장할 원의 개수를 입력하세요");
		int numOfCircle = input.nextInt();
		
		//우리가 필요한건 하나가 아니라 여러개의 원의 정보를 처리할 수 있는 변수
		Circle[] circleArr = new Circle[numOfCircle];
		
		//배열을 만들고 나면, 해당하는 배열의 한칸 한칸은 각각 Circle 객체의 주소값을 저장할 수 있다.
		//배열을 만들면 객체의 주소값을 저장할 수 있는 변수가 여러개 생성되는것이다.
		//객체가 여러개가 생성되는 것이 아님!!
		
		for(int i=0;i<numOfCircle;i++) {
			int x,y,r;
			System.out.println("원의 반지름을 입력하세요");
			r = input.nextInt();
			System.out.println("원의 x좌표를 입력하세요");
			x = input.nextInt();
			System.out.println("원의 y좌표를 입력하세요");
			y = input.nextInt();
			
			circleArr[i] = new Circle(r,x,y);
		}
		//center변수 가져오기
		
		//Point 클래스의 객체
//		Point p = circleArr[0].getCenter();
//		p.getX();
//		p.getY();	얘들을 반복문을 통해서 접근하기
		
		for(int i=0;i<circleArr.length;i++) {
			System.out.printf("원 %d의 반지름은 %d 넓이는 %.2f " + "중심좌표는 %d,%d", i+i, circleArr[i].getRadius(), 
								circleArr[i].area(),circleArr[i].getCenter().getX(), circleArr[i].getCenter().getY());
			System.out.println();
			
		}
		
	}

}
