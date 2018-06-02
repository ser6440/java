package Ex2;

public class AnimalTest {
	public static void main(String[] args) {
		//랜덤으로 개와 고양이 5마리 생성
		Animal[] animals = new Animal[5];
		
		for(int i=0;i<animals.length;i++) {
			if((int)(Math.random()*2)==0) {
				//개를 만들고
				animals[i]=new Dog();
			}else {
				//고양이 만들기
				animals[i]=new Cat();
			}
		}
		//반복문 사용해서 동물울게하기
		for(Animal a:animals) {
			//동물들이 우는건 개 bark(), 고양이 meow()
			if(a instanceof Dog) {
				((Dog)a).bark();
			}else {
				((Cat)a).meow();
			}
			a.sound();
		}
	}

}
