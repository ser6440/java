package Interface2;

public class HomeNetwork {
	public static void main(String[] args) {
		//무선으로 조종할 수 있는 기능을 가진 가전 제품을 조종
		//무선으로 켜고, 끄기: 무선으로 조작 가능한 객체여야 한다.
		//turnOn(), turnOff()
		
//		RemoteController r = null;
//		
//		r.turnOn();
//		r.turnOff();
//		
		//하나의 통로로 한꺼번에 관리 하려고 한다.
	//	RemoteController t = new Television();
//		Aircondition a = new Aircondition();
//		
//		t.turnOff();
//		t.turnOn();
		
		//Airconditioner도 Remotecontroller interface를 구현해서
		//Remotecontroller 배열에 Tv, aircon 객체 만들어서
		//배열 통해서 접근해보기
		Electronic[] rc = new Electronic[2];
		rc[0] = new Television();
		rc[1] = new Aircondition();
		for(Electronic remote:rc) {
			remote.turnOn();
			remote.work();
			
//			if(remote instanceof Television) {
//				((Television)remote).showScreen();
//			}else if(remote instanceof Aircondition) {
//				((Aircondition)remote).wind();
//			}
		}

		
	}
	

}
