
public class Lotto {
//	  1. 1~45사이의 중복되지 않는 6개의 수를 생성하는 Lotto 클래스 생성
//	  2. 상태값은 생성된 로또 번호를 저장할 수 있는 크기 6인 정수형 배열 
//			lotto
//	  3. 기능은
//	   	3-1 랜덤한 숫자를 만들어 내고 lotto에 저장하는 makeNumber()
//	   	3-2 만들어진 배열을 정렬하는 sort() void
//	   	3-3 만들어진 배열을 출력하는 printLotto() void

	//멤버변수 정수형 배열
	int[] lotto ;
	
	public Lotto(){
		//매개변수가 없는 생성자 기본생성자
		lotto = new int[6];
	}
	
	//lotto를 배열로 입력받은 배열로 초기화 하는 생성자
	public Lotto(int[] arr) {
		lotto = arr;
	}
	
	//기능 숫자 만들기
	public void makeNumber() {
		//중복되지 않게 임의의 숫자 6개 만들어서 makeNumber에 저장
        int count=0;
        for(int i=0;i<lotto.length;i++) {
            lotto[i]=((int)(Math.random()*45))+1;
            for(int j=0;j<i;j++) {
                if(lotto[i] == lotto[j]) {
                     
                    i--;
                    break;
                }
            }
        }
	}
	
	//배열 정렬하기
	public void sort() {
		for(int i=0;i<lotto.length;i++) {
			//배열 안에서 최소값을 찾기위해서는 내부비교를 해야한다.
			//배열에서 가장 앞에 있는 수를 최소값이라고 가정하겠다.
		    int minVal = lotto[i];	//이미 자리를 찾은 숫자는 비교대상에서 제외
			for(int j=i+1;j<lotto.length;j++) {
				//minVal가 비교대상보다 크다면, 비교대상을 최소값으로 만들어줌
				//값 바꿔주기 minVal과 비교대상 자기 바꿔주기
				if(lotto[j]<minVal) {
					int temp = minVal;
					minVal = lotto[j];	//비교대상을 최소값으로 만들어주기
					lotto[j] = temp;	
				}
			}	//반복문이 끝이 나면 최소값이 minVal에 저장되어 있음
				//최소값이 들어갈 자리에 최소값을 넣어줌
			lotto[i] = minVal;
		}//최소값을 자리에 넣어주는 반복문 끝
	}
	
	//배열 출력하기
	public void printLotto() {
		//멤버변수 lotto를 출력하면된다.
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");	
		}
		System.out.print("\n");
	}
}
