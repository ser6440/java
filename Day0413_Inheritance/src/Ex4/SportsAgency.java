package Ex4;

import java.util.Scanner;

public class SportsAgency {
	private SportsPlayer[] sportsplayer;
	private boolean isRun;
	private Scanner scan;
	private int number;
	private int number1;
	
	public SportsAgency() {
		sportsplayer = new SportsPlayer[50];
		isRun = true;
		scan = new Scanner(System.in);
	}
	public void start() {
		while(isRun) {
			showMenu();
			inputMenu();
		}
	}
	public void showMenu() {
		System.out.println("***************************");
		System.out.println("********메뉴를 선택하세요********");
		System.out.println("*                         *");
		System.out.println("* 1.운동선수등록     2.운동선수조회   *");
		System.out.println("* 3.운동선수 검색    4.종료               *");
		System.out.println("***************************");
		System.out.println("***************************");
	}
	public void inputMenu() {
		scan = new Scanner(System.in);
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			choicePlayer();
			inputSportsPlayer();
			break;
		case 2:
			showSportsPlayer();
			break;
		case 3:
			searchSportsPlayer();
			break;
		case 4:
			System.out.println("종료");
			isRun = false;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}
	public void inputSportsPlayer() {
		//System.out.println("운동선수 정보 입력하기");
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.println("성별을 입력하세요");
		String sex = scan.next();
		
		System.out.println("종목을 입력하세요");
		String event = scan.next();
		
		System.out.println("국가를 입력하세요");
		String country = scan.next();
		
		
		
		
		sportsplayer[number] = new SportsPlayer(name,age,sex,event,country);
		number++;
		System.out.println("등록되었습니다.");
	}
	public void choicePlayer() {
		System.out.println("운동선수 정보등록");
		System.out.println("1.피겨선수 2.볼링선수 3.농구선수");
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			inputFigure();
			break;
		case 2:
			inputBowling();
			break;
		case 3:
			inputBasketball();
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}
	public void inputFigure() {
		System.out.println("피겨선수 정보등록");
		System.out.println("점수를 입력하세요");
		int Score = scan.nextInt();
		System.out.println("순위를 입력하세요");
		int ranking = scan.nextInt();
		System.out.println("점프횟수를 입력하세요");
		int jumpCount = scan.nextInt();
		
//		sportsplayer[number] = new FigurePlayer(name,age,sex,event,country,Score,ranking,jumpCount);
//		number++;
	}
	public void inputBowling() {
		System.out.println("볼링선수 정보등록");
		System.out.println("게임횟수를 입력하세요");
		int gamecount = scan.nextInt();
		System.out.println("스트라이크 수를 입력하세요");
		int strike = scan.nextInt();
		System.out.println("스페어 수를 입력하세요");
		int spare = scan.nextInt();
	}
	public void inputBasketball() {
		System.out.println("농구선수 정보등록");
		System.out.println("3점슛 개수를 입력하세요");
		int threePointer = scan.nextInt();
		System.out.println("반칙횟수를 입력하세요");
		int foul = scan.nextInt();
		System.out.println("포지션을 입력하세요");
		String position = scan.next();
	}
	public void showSportsPlayer() {
		System.out.println("운동선수 정보보기");
		//현재 내가 가지고 있는 운동선수 정보를 모두 출력
		//배열에 운동선수정보를 가지고 있다.
		//배열의 요소를 하나씩 출력
		for(int i=0;i<number;i++) {
			//배열요소에 접근하기 배열이름[index]
			//number[i] >> sportsplayer 객체 하나를 참조할 수 있음
			System.out.println("------------------------------------");
			printSportsPlayer(i);
	}
		
}
	public void printSportsPlayer(int index) {
		System.out.println("이름 : " + sportsplayer[index].getName());
		System.out.println("나이 : " + sportsplayer[index].getAge());
		System.out.println("성별 : " + sportsplayer[index].getSex());
		System.out.println("종목 : " + sportsplayer[index].getEvent());
		System.out.println("국가: " + sportsplayer[index].getCountry());
		System.out.println("--------------------------------");
	}
	public void searchSportsPlayer() {
		System.out.println("운동선수 검색하기");
		//이름검색
		//사용자에게 문자열을 입력받아서 해당 문자열을 포함하는 이름을 가진 
		//학생을 모두 출력
		//문자열을 하나 입력받고
		//내가 학생배열을 하나씩 검색하면서,
		//입력받은 문자열과 이름을 비교해서 같거나, 문자열을 포함하고 있으면 
		//학생정보를 출력
		System.out.println("이름을 입력하세요");
		String keyword = scan.next();
		
		for(int i=0;i<number;i++) {
			//students[i].getName();과 keyword비교
			String name = sportsplayer[i].getName();
			//문자열 비교: equals()->같은걸 찾을때, contains()->포함하고있는걸 찾을 때
			//contains()->name 문자열이 keyword를 포함하고 있으면 true, 아니면 false
			
			if(name.contains(keyword)) {
				//이름이 검색어를 포함하고있다.
				printSportsPlayer(i);
			}
		}

	}

}
