package d03;

public class Transformer extends Robot{

	String name;
	public Transformer(Attackable attack, Moveable move) {
		this.name = "트랜스포머";
		this.attack = attack;
		this.move = move;
	}
	
	public void attack() {
		//System.out.println("총으로 공격!!");
		attack.attack();
	}
	
	public void move() {
		//System.out.println("뛰어서 이동");
		move.move();
	}

}
