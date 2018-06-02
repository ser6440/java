package d03;

public class Gundam extends Robot{
	
	public Gundam(Attackable attack, Moveable move) {	//attack과 move는 외부에서 값을 받아와야하기때문에 필요
		this.name = "건담";
		this.attack = attack;
		this.move = move;
	}
	
//	public void fight() {
//		ga.attack();
//	}
	
	public void attack() {
		//System.out.println("총으로 공격!!");
		attack.attack();
	}
	public void move() {
		//System.out.println("날아서 이동!!");
		move.move();
	}
}
