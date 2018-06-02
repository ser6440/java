시퀀스 (순차적으로 증가하는 값을 가지는 데이터베이스 오브젝트)
사용 예)회원가입
회원을 구분하기 위해서 구분 키, 게시글 번호: 자동적으로 증가 해야하는 수 

시퀀스 만들기
create sequence [시퀀스이름] start with [시작값] increment by [증가값] maxvalue [최대값] cycle;

create sequence test_seq start with 1 increment by 1 maxvalue 9999999 cycle;

시퀀스의 다음값 가져오기
select test_seq.nextval from dual;

시퀀스의 현재값 가져오기
select test_seq.currval from dual; 현재 value확인

사용자가 생성한 시퀀스 확인하기(user_sequences: 시퀀스의 정보를 저장)
select * from user_sequences

ex)학생정보(번호,이름,학년)를 저장하는 테이블student_ex 
   에 자동으로 번호를 증가시키면서 입력하기
   insert into student_ex
   values (student_seq.nextval,'홍길동',3);
   
시퀀스 초기화
	현재 시퀀스값 만큼 빼고 다시 1부터 시작

시퀀스 변경
	//증가값을 현재 값으로 변경
	alter sequence student_seq increment by -6;
	//초기화
	select student_seq.nextval from dual;
	//다시 증가값 1로변경
	alter sequence student_seq increment by 1;
	//시퀀스 다시 증가 시키기
	select student_seq.nextval from dual;
	
MySql 에는 auto_increment 를 이용해서 key값을 1씩 증가 시킬수 있음	
	
----------------------------------------------------------------
<제약사항>
테이블에 데이터를 입력할 때 특정한 값만 들어갈 수 있도록 설정
ex)중복되지 않는 값만 넣을 수 있게 한다. null은 넣지 못하도록 한다.
   범위지정 등등...
   primary key : 기본키 지정(중복안됨,not null),테이블당 하나
   not null : null을 허용하지 않는다.
   unique : 중복허용 X
   check : 특정범위 지정
   foreign key : 다른 테이블의 기본키(primary key)인 값만 쓸수 있게 지정   

제약사항 지정방법

테이블에 적용된 제약사항 확인하기
user_constraints <<적용된 제약사항이 저장된 테이블
테이블에서 테이블 이름,제약사항 이름,제약사항 타입 조회하기
select table_name,constraint_name,constraint_type
from user_costraints 
where table_name = 'STUDENT'

1. 테이블 생성할 때
   student테이블 작성
   번호: 기본키,
   이름: not null,
   학년: not null,
   점수: 100이하
   
   create table student(
   num number(3) primary key,
   name varchar2(20) not null,
   grade number(2) not null,
   email varchar2(50) unique,
   score number(5) check (score<=100))
   
   <제약사항을 밑에 따로 줘도 됨>
   constraint [제약사항이름][제약사항]
   
   create table student(
   num number(3) constraint student_pk primary key,
   name varchar2(20) not null,
   grade number(2) not null,
   email varchar2(50)not null,
   score number(5),
   constraint student_email_uq unique(email)
   constraint student_score_ck check(score<=100)
   constraint student_email_fk reference 테이블명(칼럼명)
   
   );
   
   insert into student
   values(1,'홍길동',3,50)
   
   <not null확인>
   insert into student(num,name,score)
   values (3,'이',100) grade가 not null이여서 오류
   
   insert into student(num,name,grade,score)
   values (4,'이',1,100) 오류를 안나게 하려면 grade값을 준다
   
2. 테이블 생성하고 난 뒤(테이블 수정)

alter table student add primary key(name);
alter table student add constraint email_nn not null(email);
alter table student add constraint student_fk foreign key(제약사항 대상 칼럼) reference 외래키가 있는 테이블명(key)

실습

 create table student(
   num number(3),
   name varchar2(20),
   grade number(2),
   email varchar2(50),
   score number(5));
   
alter table student add primary key(name);
alter table student modify name varchar2(20) not null;

drop table student;

create table student(
num number(5),
name varchar2(20),
email varchar2(50)
);

alter table student add constraint email_fk foreign key(email)
references email_info(email);

create table email_info(
email varchar2(50) primary key,
info varchar2(100)
);

insert into email_info values('email1','info1');
insert into email_info values('email2','info2');

email_info가 들어있지 않은 key를 넣으려고 하면 foreign key 정책위반
insert into student values (1,'hong','email');	//안됨
insert into student values (1,'hong','email1');	//됨

-----------------------------------------------------------------------
테이블 생성시 칼럼 기본값 설정하기
create table student(
	num number(5) primary key,
	name varchar2(40) not null,
	birthday date default sysdate
)
--------------------------------------------------------------------------
Member table 작성하기
num : number(10) 기본키, 회원번호
id : varchar2(30) null 허용X, unique, 아이디
pw : varchar2(50) null 허용X, 비밀번호
name : varchar(20) null 허용X, 이름
email : varchar2(30) null 허용X, 중복허용 X, 이메일
regDate : date 기본값 sysdate 회원가입일

테이블 작성하고, insert,update,delete,select 연습해보고
dao 작성까지 
(insertMember 모든 멤버 데이터 삽입,
 updateMember 멤버 데이터 모두 수정, 기준은 번호,
 deleteMember 멤버 데이터 하나 삭제, 기준은 번호,
 selectOne, 멤버데이터 하나 조회 기준은 번호
 selectAll) 
 
create table member(
num number(10) primary key,
id varchar2(30) unique not null,
pw varchar2(50) not null,
name varchar2(20) not null,
email varchar2(30) unique not null,
regDate date default sysdate
)

시퀀스 하나 만들기
create sequence member_seq
start with 1 increment by 1 maxvalue 999999 cycle;


