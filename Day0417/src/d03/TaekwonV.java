package d03;

public class TaekwonV extends Robot{

	String name;
	public TaekwonV(Attackable attack, Moveable move) {
		this.name = "태권브이";
		this.attack = attack;
		this.move = move;
		
	}
	
	public void attack() {
		//System.out.println("주먹으로 공격!!");
		attack.attack();
	}
	
	public void move() {
		//System.out.println("날아서 이동!!");
		move.move();
	}

}
