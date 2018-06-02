
package list;
//Generic 사용방법 및 ArrayList동작 방법 학습
/*   ArrayList의 동작과 매우 비슷한 List 만들기
 * add(E) : 파라미터로 전달받은 데이터를  array에 끝에 추가
 * remove(int) : 인덱스를 전달받아서 array에서 해당 인덱스의 데이터를 삭제
 * [A][B][C][F]
 * get(int) : 인덱스를 전달받아서 해당 인덱스의 데이트를 반환
 * size() : array 길이 반환
 * set(int,E) : 특정 인덱스에 데이터 넣기(덮어쓰기)
 * */
public class MyList<E>{
    //데이터를 저장하기 위해서는 배열이 필요
    private E[] array;
    public MyList() {
        //크기 0인 배열을 생성
        //얘는 객체를 만들어 내는 코드 이기때문에 타입이 정확하게 명시되어야 함
        //array = new E[0]; 얘는 안됨
        array = (E[])new Object[0];
    }
     
    public int size() {
        return array.length;
    }
    public void set(int index,E data) {
        //배열의 인덱스에 데이터 넣기
        array[index] = data;
    }
    public void add(E data) {
        //array의 마지막에 data 추가하기
        //원래 가지고 있던 array보다 크기가 1 큰 배열 만들어서
        //기존 데이터 복사하고, 마지막에 입력받은 data 추가
         
        //기존 배열보다 크기 1큰 배열 생성
        E[] newArr = (E[])new Object[array.length+1];       
        //기존 array에 있던 데이터를 newArr 복사
        for(int i=0;i<array.length;i++) {
            newArr[i] = array[i];
        }
        //newArr의 마지막에 입력받은 데이터 넣기
        newArr[newArr.length-1] = data;
        //newArr의 주소값을 array에 넣기
        array = newArr;
    }
    public void remove(int index) {
        //index위치에 있는 요소 삭제하기 
        //하나를 삭제하면 내가 관리할 배열의 길이가 1줄어든다..
        //현재배열보다 크기 1작은 배열 만든다음
        //삭제할 요소를 제외한 나머지 요소들을 모두 복사하면 된다.
         
        //크기 1 작은 배열 생성
        E[] newArr = (E[])new Object[array.length-1];
         
        //지우려는 인덱스의 요소를 제외한 나머지 요소 복사하기 
        int j=0;
        for(int i=0;i<array.length;i++) {
            //i가 내가 지우려는 인덱스가 아니면 복사
            if(i != index) {
                newArr[j] = array[i];
                j++;
            }
        }
        //array에 새로운 배열의 주소값 넣기
        array = newArr;
    }
    public E get(int index) {
        //index위치에 있는 요소 반환하기 
        return array[index];
    }
}
 
