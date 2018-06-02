import java.util.Random;

public class Dice {
	public static void main(String[] args) {
	
		//Math 이용하기: 수학과 관련된 기능들과, 값들을 저장하고 있는 클래스
		//random() : 0~0.999999999.....의 사이의 숫자를 생성
		//생성된 숫자*6: 0~5.999999
		//생성된 실수를 정수로 형변환
		int dice2 = (int)(Math.random()*6)+1;
		
		//주사위 프로그램 만들기(1~6까지 랜덤하게 숫자 생성해서 보여주기)
		//랜덤 숫자 생성방법 - Math클래스 이용하기, Random클래스 이용
		//1.Random클래스 이용하기 //임의의 숫자를 만들어주는 클래스 import java.util.Random;필요
		//Scanner scan = new Scanner(System.in); 와 모양 같음
				
		Random ran = new Random();
		int dice1 = ran.nextInt(6)+1;	//0~5까지의 정수를 생성 숫자가 0부터 시작이니까 주사위를 던지는 것을 만드려면 1부터 필요하니까
		                                //(6)+1을 해주면 시작이 1이 +된 상태부터 시작되므로 1부터 6까지 나온다.
		//switch 문으로 dice가 어떤 숫자인지 출력하는 문장 작성
		switch(dice1) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		case 5:
			System.out.println("5가 나왔습니다.");
			break;
		case 6:
			System.out.println("1이 나왔습니다.");
			break;
		default:
			break;
		}

	}

}
