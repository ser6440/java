
public class LottoMaker {
	//기능은 >> 메서드
	//상태값(데이터) >> 변수
	int[] lotto = new int[6];
	public void makeNumber() {
		//난수를 만들어 내고 출력
        int count=0;
        for(int i=0;i<lotto.length;i++) {
            lotto[i]=((int)(Math.random()*45))+1;
            count++;
            for(int j=0;j<i;j++) {
                if(lotto[i] == lotto[j]) {
                     
                    i--;
                    break;
                }
            }
        }
         
        //출력
        for(int number:lotto) {
            System.out.print(number + " ");
        }
        System.out.println();
        //System.out.println(count);

	}
	
}
