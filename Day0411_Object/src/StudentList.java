
public class StudentList {
	//학생저장관련 기능을 가지는 클래스
	//학생을 저장하기 위해서 학생 배열이 필요:Student[]
	private Student[] students;

	public StudentList() {
		students = new Student[0];
		setDefaultData();
	}
	
	//add(): 학생정보 하나를 전달받아서 배열에 추가,
	//현재 배열보다 크기1큰 배열 만들어서 기존배열 복사하고, 학생추가 
	public void add(Student s) {

		Student[] tmpArr = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			tmpArr[i] = students[i];
		}
		tmpArr[students.length] = s;

		// 관리할 배열 바꿔주기
		students = tmpArr;

		System.out.println("추가되었습니다.");
	}
	
	//delete: 삭제할 학생의 이름을 전달받아서 목록에서 삭제
	//      : 학생 배열에서 입력받은 학생을 삭제하기 위해서,
	//        크기 1작은 배열 생성해서, 
	//        해당하는 이름의 학생 첫번째 객체만 제외하고
	//        기존 배열에서 복사 하기
	public void delete(String name) {
		boolean isDeleted = false;
		// 삭제할 학생을 찾아서, 복사를 하지 않았으면 true, 못찾았으면 false
		Student[] tmpArr = new Student[students.length - 1];
		int j = 0;
		for (int i = 0; i < students.length; i++) {
			// 학생 이름이랑, 입력받은 이름이랑 같으면
			if (students[i].getName().equals(name) && !isDeleted) {
				// 삭제 하기 : 입력하기 반대
				// 현재 배열보다 크기 1 작은 배열 생성
				// 이름이 같은 첫번째 요소를 제외한 나머지 요소 모두 복사
				isDeleted = true;
			} else {
				// 이름이 같지 않거나, 같더라도 이름이 같은 첫번째 요소가 아닐때
				// 새로운 배열에 원래 요소를 복사
				/*
				 * [ ][ ][v][ ][ ][ ] [ ][ ][ ][ ][ ] 찾기 전이랑, 찾고 나서 인덱스가 다름
				 */
				tmpArr[j] = students[i];
				j++;
			}
		}
		students = tmpArr;
	}
	
	//size(): 학생 배열의 길이를 반환하는 메서드 
	public int size() {
		return students.length;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	 // 임의의 학생정보를 배열에 넣어주는 임시메서드
    public void setDefaultData() {
        // 학생배열에 3~4명정도 학생정보 넣기
        students = new Student[4];
        students[0] = new Student("홍길동", 3, 100, 0, 50);
        students[1] = new Student("이순신", 2, 50, 100, 50);
        students[2] = new Student("신사임당", 1, 80, 100, 100);
        students[3] = new Student("김장금", 2, 70, 80, 100);
    }
}
