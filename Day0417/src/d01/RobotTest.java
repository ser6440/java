package d01;

public class RobotTest {
	public static void main(String[] args) {
		 //로봇을 만들고, 로봇을 싸우게 하는 프로그램을 작성
		
		Transformer t = new Transformer();
		t.fight();
		System.out.println("----------------------");
		TaekwonV tv = new TaekwonV();
		tv.fight();
	}

}
