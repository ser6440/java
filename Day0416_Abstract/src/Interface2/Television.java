package Interface2;

public class Television extends Electronic {
	//interface를 상속받았기 때문에
	//abctract 메서드를 포함하고 있는것과 같다.
	//미완성인 메서드를 포함하고 있으면 클래스를 완성할 수 없다.
	//abstract를 구현하거나, 자기 자신도 abstract가 되거나...
	
	public void turnOn() {
		System.out.println("텔리비전을 켭니다.");
	}

	public void turnOff() {
		System.out.println("텔리비전을 끕니다.");
		
	}
	public void work() {
		System.out.println("화면을 보여줍니다.");
	}

}
