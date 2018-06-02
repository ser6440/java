enum:직원번호 ->enum은 키워드 empNum으로
ename: 직원이름
deptno: 부서번호
salary: 월급

create table employee(
empNum number,
ename varchar2(30),
deptno number,
salary number
);

테이블만들고 테이블에 데이터를 삽입,삭제,수정,조회 할 수 있는
EmployeeDao 클래스: 
selectOne : 직원번호를 조건으로 직원의 모든 정보를 조회하는 기능
selectAll: 모든 직원의 모든 정보를 조회하여 직원 리스트 반환
deleteEmployee: 직원번호를 조건으로 직원 삭제
updateEmployee: 직원 번호를 조건으로 직원의 이름,부서번호,월급을 수정
insertEmployee: 직원이 가져야할 모든 정보를 포함하여 직원정보 추가
Employee 클래스
직원번호(정수), 직원이름(문자열), 부서번호(정수), 월급(정수)
EmployeeDaoTest 클래스
main메서드에서 EmployeeDao의 모든 기능 실행해보기(한번씩)