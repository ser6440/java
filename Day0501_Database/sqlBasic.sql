학습내용: SQL기본 문법에 대해서 학습합니다.
: 기본문법 + Oracle함수 사용법 익히기

연습해보기 위해서 계정하나 추가해서 사용
scott 계정 사용하기
emp, dept, grade
C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin

scott/tiger

create user scott identified by tiger;
alter user scott identified by tiger account unlock;

GRANT CONNECT,RESOURCE,UNLIMITED TABLESPACE TO SCOTT IDENTIFIED BY TIGER;
 
CREATE TABLE DEPT
       (DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
    DNAME VARCHAR2(14) ,
    LOC VARCHAR2(13) ) ;
DROP TABLE EMP;
CREATE TABLE EMP
       (EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4),
    HIREDATE DATE,
    SAL NUMBER(7,2),
    COMM NUMBER(7,2),
    DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT);
INSERT INTO DEPT VALUES
    (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES
    (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES
    (40,'OPERATIONS','BOSTON');
INSERT INTO EMP VALUES
(7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);
INSERT INTO EMP VALUES
(7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);
INSERT INTO EMP VALUES
(7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);
INSERT INTO EMP VALUES
(7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);
INSERT INTO EMP VALUES
(7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);
INSERT INTO EMP VALUES
(7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);
INSERT INTO EMP VALUES
(7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);
INSERT INTO EMP VALUES
(7788,'SCOTT','ANALYST',7566,to_date('13-JUL-87')-85,3000,NULL,20);
INSERT INTO EMP VALUES
(7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);
INSERT INTO EMP VALUES
(7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);
INSERT INTO EMP VALUES
(7876,'ADAMS','CLERK',7788,to_date('13-JUL-87')-51,1100,NULL,20);
INSERT INTO EMP VALUES
(7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);
INSERT INTO EMP VALUES
(7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);
INSERT INTO EMP VALUES
(7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);
DROP TABLE BONUS;
CREATE TABLE BONUS
    (
    ENAME VARCHAR2(10)  ,
    JOB VARCHAR2(9)  ,
    SAL NUMBER,
    COMM NUMBER
    ) ;
DROP TABLE SALGRADE;
CREATE TABLE SALGRADE
      ( GRADE NUMBER,
    LOSAL NUMBER,
    HISAL NUMBER );
INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);
COMMIT;
 
--------------------------------------------------------
select * from emp;
1. select 할 때는 표현식으로도 조회가 가능하다.
ex)표현식은 특정 테이블에 데이터가 있는것이 아니기 때문에 임의의 데이터에서 가져올 수 있음 dual
ex)select empno,ename,'입니다.',from emp;

2. 칼럼을 바꿔서 조회할 수 있다.(Alias)
	select [칼럼명] as [별명],
	       [칼럼명] as [별명]
	   from [테이블명]
	ex) select empno as "사원";
	           ename as "이름";
	       from emp;
	oracle은 as 생략해도 가능하다.
	
	
	distinct : 중복되는 결과를 출력하지 않음
	ex)select deptno from emp;
	   select distinct deptno from emp;
--------------------------------------------------------------------
key: 하나의 로우(레코드)를 구분할 수 있는 데이터
     기본키 : 테이블에서 대표가 되는 키(primary key)
     후보키 : 기본키가 될 수 있는 모든 키, 키중에 최소단위 그룹
     복합키 : 여러개의 칼럼을 한꺼번에 비교했을 때 특정 레코드를 조회할 수 있으면 복합키
     외래키 : 다른 테이블에서 기본키로 사용하고 있는 데이터(foreign key)
----------------------------------------------------------------------
where 를 이용해서 원하는 데이터만 선택할 수 있다.
조건을 주고, 그 조건에 맞는 데이터를 선택할 때 사용

where [조건식]
=, !=(<>), >, <, >=, <= ->조건식에 들어갈수있는 조건식
문자비교, 숫자비교, 날짜비교 모두가능

ex)부서번호가 20인 직원의 이름, 부서번호를 조회
	select ename, deptno
	from emp
	where deptno = 20;
	
                     ename,job,sal	
**급여가 4000이상인 직원의 이름과 업무와 급여를 조회
select ename,job,sal 
from emp 
where sal >= 4000;

조건식 여러개 쓰고 싶을때는 AND,OR 를 이용
**부서번호가 30인 직원 중, 급여가 1500 이상인 직원의 이름, 업무, 급여를 조회
<AND>
select ename,job,sal,deptno
from emp
where deptno = 30
and sal >= 1500;

<OR>
select ename,job,sal,deptno
from emp
where deptno = 30
or sal >= 1500;

like : 문자열 비교, 문자열 포함 여부를 검살할 때 사용
job이  'SALESMAN'인 직원은 모든 정보를 조회
select * 
from emp
where job = SALESMAN;

문자열 포함여부 검사 '%'
**이름이 'C'로 시작하는 모든 직원의 모든정보 조회
select *
from emp
where ename like 'C%';

**이름에 'E'를 포함하는 모든 직원의 모든정보 조회
select *
from emp
where ename like '%E%';

in : 여러 조건을 비교할 때 사용
**업무가 SALESMAN 또는 MANAGER인 직원의 이름과 업무 조회
select ename,job
from emp
where job = 'SALESMAN'
or job = 'MANAGER';

select ename,job
from emp
where job in ('SALESMAN', 'MANAGER');

null 비교 : is null, is not null
**MGR(매니저)이 null인 직원의 모든정보 조회
select *
from emp
where mgr is null;

**comm이 null이 아닌 직원의 이름, 직책, 급여를 조회
select ename,job,sal
from emp
where comm is not null

between A and B: 특정 범위를 조건으로 줄때 사용
**급여가 1500이상 3000이하인 직원의 이름, 부서번호, 업무, 급여 조회
select ename,deptno,job,sal
from emp
where sal between 1500 and 3000;

select ename,deptno,job,sal
from emp
where sal >= 1500
and sal <= 3000;

------------------------------------------------------------
select *
form emp
where ename >= 'C';
이름이 M으로 시작하는 모든직원
select *
from emp
where ename >= 'M'
and ename <'N';

order by : 조회 정렬 기준설정
모든 직원의 모든 정보를 조회, 급여 기준 오름차순 정렬
(내림차순 정렬은 desc)

<오름차순>
select *
from emp
order by sal;

<내림차순>
select *
from emp
order by sal desc;
--------------------------------------------------------------
1. 부서번호가 10이고 업무가 CLERK인 직원의 이름, 업무, 부서번호 조회
2. 입사일이 81년인 모든 직원의 모든정보 조회
3. 매니저의 직원번호가 7698인 직원의 이름, 부서, 업무 조회
4. 업무가 SALESMAN인 직원 중, 급여가 1500 이상인 직원의 모든정보 조회
5. (부서번호가 10인 직원 중, 업무가 CLERK인 직원) + 
   (업무가 SALESMAN인 직원의 이름, 급여, 커미션을 조회)
6. 부서번호가 10인 직원의 이름, 업무, 급여, 커미션을 조회
   단, 입사일 순으로 빠른 순으로 정렬
7. 업무가 SALESMAN인 직원의 이름, 급여, 커미션을 출력
   단, 커미션이 500이상인 경우만 출력, 커미션 기준 내림차순으로 정렬
   

1. 부서번호가 10이고 업무가 CLERK인 직원의 이름, 업무, 부서번호 조회
select ename,job,deptno
from emp
where deptno = 10
and job = 'CLERK';
2. 입사일이 81년인 모든 직원의 모든정보 조회
select *
from emp
where hiredate = 81;
3. 매니저의 직원번호가 7698인 직원의 이름, 부서, 업무 조회
select ename, deptno, job
from emp
where job = 'MANAGER'
and empno = 7698;
4. 업무가 SALESMAN인 직원 중, 급여가 1500 이상인 직원의 모든정보 조회
select *
from emp
where job = 'SALESMAN'
and sal >= 1500;
5. (부서번호가 10인 직원 중, 업무가 CLERK인 직원) + 
   (업무가 SALESMAN인 직원의 이름, 급여, 커미션을 조회)
   select job,deptno,ename,sal,comm
   from emp
   where (deptno = 10
   and job = 'CLERK')
   or
   (job = 'SALESMAN');
   
6. 부서번호가 10인 직원의 이름, 업무, 급여, 커미션을 조회
   단, 입사일 순으로 빠른 순으로 정렬
   select ename, job, sal, comm, hiredate
   from emp
   where deptno  = 10
   order by hiredate;
7. 업무가 SALESMAN인 직원의 이름, 급여, 커미션을 출력
   단, 커미션이 500이상인 경우만 출력, 커미션 기준 내림차순으로 정렬
   select job,ename, sal, comm
   from emp
   where comm >=500
   and job = 'SALESMAN'
   order by comm desc;   