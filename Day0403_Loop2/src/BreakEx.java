
public class BreakEx {
	public static void main(String[] args) {
		//break - continue
		//break: 반복문을 반복문의 조건문과 상관없이 빠져 나올때 사용
		//continue: 해당 반복 순서의 문장을 더이상 실행하지 않고, 다음 반복으로 넘어감
		//          특정 조건일때 반복문을 실행하지 않고, 다음 반복으로 진행하고 싶을 때 사용
		for(int i=1;i<=10;i++) {
			//만약 i가 5의 배수이면 반복문을 종료
			if(i%5 == 0) {
				//i는 5의배수
				//만약 i가 5의 배수이면 반복문을 종료
				//break;
				//만약 i가 5의 배수이면 출력하지 마라
				continue;
			}
			System.out.print(i+" ");
		}
		//중첩 반복문에서의 break
		/*
		 * 중첩 반복문에서 내가 원하는 반복문을 종료하고 싶을 때 반복문에 태그를 달아주면된다
		 * 태그1:
		 * 반복문1
		 * 	  태그2:
		 *   반복문2
		 *   
		 *   break 태그1; <<종료하고자 하는 반복문을 선택할 수 있다.
		 *   
		 *   
		 *   반복문의 이름을 설정하지 않고, 바깥쪽 반복문을 종료하기 위해서는 바깥쪽 반복문의 상태를 결정할 수 있는 변수의 값을 바꿔주면된다. >> isEnd
		 *   
		 */
		int count=0;
		boolean isEnd = false;
		outFor: //반복문 태그 작성
		for(int i = 1;i<=7;i++) {
			inFor:	//안쪽 반복문 태그 작성
			for(int j=1;j<=5;j++) {
				//여기는 몇번 들어오나요? 35번동작
//				if(i == 3) {
//					break;	//가장 가까이에 있는 반복문을 빠져나온다
//				}
				if(i == 0 && j ==3) {
				count++;
				System.out.println(count);
				//isEnd = true;
				 break outFor;	//바깥쪽반복문을 break
			}
			if(isEnd) {
				break;
			}
//			if(i == 3) {	//15번반복
//			break;	//가장 가까이에 있는 반복문을 빠져나온다
//		}
		}
		System.out.print(count);
	}
	}
}
