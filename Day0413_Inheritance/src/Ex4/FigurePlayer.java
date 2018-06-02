package Ex4;

public class FigurePlayer extends SportsPlayer {
	public int score;	//점수
	public int ranking;	//순위
	public int jumpCount;	//점프횟수
	
	public FigurePlayer() {
		
	}
	public FigurePlayer(int score, int ranking, int jumpCount,String name,int age,String sex,String event,String country ) {
		super(name, age, sex, event, country);
		this.score = score;
		this.ranking = ranking;
		this.jumpCount = jumpCount;
	}
	public int getScore() {
		return score;
	}
	public void setScore() {
		this.score = score;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking() {
		this.ranking = ranking;
	}
	public int getJumpCount() {
		return jumpCount;
	}
	public void setJumpCount() {
		this.jumpCount = jumpCount;
	}
	@Override
	public String toString() {
		return "FigurePlayer [score=" + score + ", ranking=" + ranking + ", jumpCount=" + jumpCount + ", name=" + name
				+ ", age=" + age + ", sex=" + sex + ", event=" + event + ", country=" + country + "]";
	}

}
