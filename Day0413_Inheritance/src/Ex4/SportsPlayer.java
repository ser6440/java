package Ex4;

public class SportsPlayer {
	String name;
	int age;
	String sex;
	String event;	//종목
	String country;
	
	public SportsPlayer() {
		
	}
	public SportsPlayer(String name,int age,String sex,String event,String country) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.event = event;
		this.country = country;
	}
	public void play() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex() {
		this.sex = sex;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent() {
		this.event = event;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry() {
		this.country = country;
	}
	public String toString() {
		return "SportsPlayer= " + "이름: " + name + "," + "나이: " + age + "," 
	+ "성별: " + sex + "," + "신장: " + "," + event + "," + "국가: " + country;
	}
}
