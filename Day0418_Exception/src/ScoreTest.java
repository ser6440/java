
public class ScoreTest {
	public static void main(String[] args) {
		Score score = new Score();
		
		try{
			score.setTotal(2);
			System.out.println("짝수");
		}catch(OddNumberException e) {
			e.printStackTrace();
			System.out.println("홀수입니다.");
		}
		
		score.showTotal();
	}

}
