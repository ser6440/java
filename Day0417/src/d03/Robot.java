package d03;

public abstract class Robot {
	String name;
	Attackable attack;
	Moveable move;
	
	public void fight() {
		System.out.println(name+"전투 시작!!");
		attack();
		move() ;
		attack();
		System.out.println(name+"전투를 종료합니다.");
	}
	public abstract void attack();
	public abstract void move();

}
