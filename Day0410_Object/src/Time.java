
public class Time {
	//시, 분, 초를 저장할 수 있는 변수
	//변수들은 외부에서 직접 수정하지 못하도록 private으로 설정
	//생성자: 기본생성자/시,분,초를 매개변수로 받는 생성자
	//메서드: setTime() 시,분,초를 매개변수로 받아서 멤버변수에 설정
	//      showTime() : 시간은 x시 x분 x초 입니다. 라고 출력하는 메서드
	//      시는 0~23까지만 입력가능
	//      분은 0~59까지만 입력가능
	//      초는 0~59까지만 입력가능
	//      범위가 벗어났을 시에는 0으로 입력한다.
	//TimeTest 만들어서  main에서 Time객체 만들고 시간 설정후 출력하기
	
	//시, 분, 초를 저장할 수 있는 변수
	//변수들은 외부에서 직접 수정하지 못하도록 private으로 설정
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		//아무것도 작성하지 않으면 각각 0으로 초기화
	}
	public Time(int hour, int minute, int second) {
//		hour = hour;
//		minute = minute;
//		second = second;
		
		//setTime이라는 메서드에서 초건 검사를 했기 때문에 
		//setTime을 호출해서 조건검사를 실행
		setTime(hour,minute,second);
	}
	
	//메서드: setTime() 시,분,초를 매개변수로 받아서 멤버변수에 설정
	//      showTime() : 시간은 x시 x분 x초 입니다. 라고 출력하는 메서드
	//      시는 0~23까지만 입력가능
	//      분은 0~59까지만 입력가능
	//      초는 0~59까지만 입력가능
	//      범위가 벗어났을 시에는 0으로 입력한다.
	public void setTime(int hour, int minute, int second) {
		//변수에다가 값을 넣기전에 조건검사가 필요하다.
		
		if(hour>23||hour<0) {
			hour=0;
		}
		if(minute>59||minute<0) {
			minute=0;
		}
		if(second>59||second<0) {
			second=0;
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	public void showTime() {
		
		System.out.printf("%02d 시 %02d 분 %02d 초 입니다.",hour,minute,second);
	}
	
	//getter,setter
	public void setHour(int hour) {
		//멤버변수에 hour 
		//매개변수(지역변수)에 hour 같은 이름이다.
		//메서드 안에서 'hour'이라는 이름을 사용하면 지역변수 먼저 사용
		//그런데 멤버변수에다가 값을 넣어야 한다.
		//이때 사용하는 키워드가 this: 클래스 내부에서 객체를 지칭
		
		this.hour = hour; //->this.hour=멤버변수, hour=지역변수
	}
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	//gettter,setter자동생성
	//source >> generate getter/setter
	
	//showTime에서 출력했던 문자열을 반환하는 메서드
	public String timeString() {
		//%02d 시 %02d 분 %02d 초 입니다.
		String str = hour+"시"+minute+"분"+second+"초 입니다.";
		return str;
	}
	//객체의 멤버변수(상태값) 내용을 쉽게 확인하기 위해서
	//toString()이란게 원래 있는 메서드>>> 우리가 원하는 모양으로 바꿔준다.
	public String toString() {
		String str = hour+"시"+minute+"분"+second+"초 입니다.";
		return str;
	}

}
