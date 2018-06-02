package Ex4;

public class BasketballPlayer extends SportsPlayer{
	int threePointer;	//3점슛 개수
	int foul;	//반칙횟수
	String position;	//포지션
	
	public BasketballPlayer() {
		
	}
	
	public BasketballPlayer(int threepointer, int foul, String position,String name,int age,String sex,String event,String country) {
		super(name,age,sex,event,country);
		this.threePointer = threepointer;
		this.foul = foul;
		this.position = position;
	}
	public int getThreePointer() {
		return threePointer;
	}
	public void setThreePointer() {
		this.threePointer = threePointer;
	}
	public int getRanking() {
		return foul;
	}
	public void setRanking() {
		this.foul = foul;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition() {
		this.position = position;
	}
	@Override
	public String toString() {
		return "BasketballPlayer [threePointer=" + threePointer + ", foul=" + foul + ", position=" + position
				+ ", name=" + name + ", age=" + age + ", sex=" + sex + ", event=" + event + ", country=" + country
				+ "]";
	}
	
}
