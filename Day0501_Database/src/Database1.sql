SQL(Structed Query Language)
:DBMS를 통해서 데이터베이스에 데이터를 조회하거나, 수정, 삭제, 변경을 하기위한 언어

sqlplus / as sysdba :관리자 권한 접속

유저생성
CREATE USER dlduswn IDENTIFIED BY "90996442";

유저권한주기
모든권한주기
GRANT connect,dba,resource to dlduswn;

ALTER user dlduswn identified "90996442";

접속하기
conn 아이디/비번;

테이블: 실제 데이터가 저장되는 공간
테이블 생성하기
CREATE TABLE [테이블명](
	[컬럼명] [자료형] [옵션...],
	[컬럼명] [자료형] [옵션...],
	[컬럼명] [자료형] [옵션...],
	[컬럼명] [자료형] [옵션...],
	[컬럼명] [자료형] [옵션...]

);


자료형: 문자, 숫자, 날짜, 이진데이터
varchar2,number,date,blob

학생정보를 저장하는 테이블을 만들어 봅시다.
(학생번호-숫자,이름-문자열,학년-숫자)

CREATE TABLE student_ex(
	snum number(7),
	sname varchar2(20),
	sgrade number()
);

만들어진 테이블 정보확인
desc student_ex;

테이블 삭제
DROP TABLE [테이블명];
drop table

테이블에 데이터를 활용해서 할 수 있는 일 : 조회,삭제,수정,삽입
CRUD
Create,Read,Update,Delete

학생
[번호] [이름] [학년]
snum  sname sgrade

삽입(insert)
테이블에 데이터 넣어주기
insert into [테이블명]
             ([칼럼명1],[칼럼명2],...)
      values([value],[value],...);
      
insert into student_ex
             (snum,sname,sgrade)
             values(1, '홍길동', 3);
             
모든 칼럼에 데이터를 집어넣고자 할때는 칼럼명을 생략해도 된다.
단, 데이터의 순서는 칼럼명 순서와 같아야 한다.
ex) insert into student_ex values(1, '홍길동', 3);

조회(select)
테이블에 저장되어 있는 데이터를 조회

select [칼럼명],[칼럼명],[칼럼명]
	from [테이블명]
------------------
where [조건] 특정 Row를 조회하고자 할 때 사용
ex) select snum,sname,sgrade
    from student_ex;
    
모든 칼럼을 조회할 때는 칼럼명을 쓰지 않고, *을 대신 사용해도된다.

(데이터베이스 오브젝트(테이블,유저,뷰,프로시져 등등) 삭제는 drop, 데이터 삭제는 delete)
삭제(delete) 
삭제는 로우 전체를 삭제해야한다. >> 특정 칼럼을 지정할 필요X
where절이 없으면, 모든 row삭제
특정한 row만 지우기 위해서

delete 
	from [테이블명]
where [조건]
	
ex) delete
		from student_ex
	where snum = 1;

	
수정(update)
존재하는 row의 데이터를 변경하기 위해서 사용

update [테이블명]
	set[칼럼명] = [값],
	   [칼럼명] = [값],
	   [칼럼명] = [값],
	   [칼럼명] = [값];
-----------------------
where [조건]

ex)update student_ex
	set sgrade=3;