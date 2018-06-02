import java.util.Scanner;

public class CircleTest2 {
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
		Scanner scan = new Scanner(System.in);
		int n;
		int r=0;
		int x=0;
		int y=0;
	
		System.out.println("저장할 원의 개수를 입력하세요");
		n = scan.nextInt();
		
		Circle[] c = new Circle[n];
		
		for(n=0;n<c.length;n++) {
			System.out.println("원의 반지름을 입력하세요");
			r = scan.nextInt();
			System.out.println("원의 x좌표를 입력하세요");
			x = scan.nextInt();
			System.out.println("원의 y좌표를 입력하세요");
			y = scan.nextInt();
			Circle c1 = new Circle();
			Point p = new Point(); 
			p.setX(x);
			p.setY(y);
			c1.setRadius(r);
			c1.setCenter(p);
			c1.area();
			c[n]=c1;
		}

		for(n=0;n<c.length;n++) {
			
			System.out.println("원"+(n+1)+"의 반지름은 "+c[n].getRadius()+", 넓이는 "+c[n].area()+"중심좌표는 "+c[n].getCenter());
		}
	
		
	}

}
