package Ex4;

public class BowlingPlayer extends SportsPlayer{
	int gamecount;	//게임 횟수
	int strike;	//스트라이크 수
	int spare;	//스페어 처리 횟수
	
	public BowlingPlayer() {
		
	}
	public BowlingPlayer(int gamecount, int strike, int spare,String name,int age,String sex,String event,String country) {
		super(name,age,sex,event,country);
		this.gamecount = gamecount;
		this.strike = strike;
		this.spare = spare;
	}
	public int getScore() {
		return gamecount;
	}
	public void setScore() {
		this.gamecount = gamecount;
	}
	public int getStrike() {
		return strike;
	}
	
	public void setStrike() {
		this.strike = strike;
	}
	public int getSpare() {
		return spare;
	}
	public void setSpare() {
		this.spare = spare;
	}
	@Override
	public String toString() {
		return "BowlingPlayer [gamecount=" + gamecount + ", strike=" + strike + ", spare=" + spare + ", name=" + name
				+ ", age=" + age + ", sex=" + sex + ", event=" + event + ", country=" + country + "]";
	}
}
