단일행 함수, 복수행 함수
조회한 데이터에 대해서 값을 변경하거나, 
원하는 값을 얻어내기 위해서 사용하는 함수 - 오라클 내장함수

문자관련 함수
INITCAP : 문자열 첫글자를 대문자로 변경
	select INITCAP('abcd') from dual;

LOWER : 문자열 소문자로 변경
	select LOWER('ABCD') from dual;
	select lower(ename) from emp;

UPPER : 문자열 대문자로 변경
	select UPPER('abcd') from dual;

LENGTH : 문자열 길이 반환
	select length(ename) from emp;
	emp테이블에서 이름이 5이상인 모든 직원의 이름을 조회
	select ename from emp where length(ename) >= 5;

CONCAT : 문자열 결합, ||와 같은기능
	select ename||' '||'입니다.' from emp;
	select ename||' 입니다.' from emp;
	select concat(ename, '입니다') from emp; 

SUBSTR : 문자열 일부문자열 추출
	SUBSTR(문자열,인덱스,개수), 인덱스는 1부터 시작
	emp테이블에서 모든 직원의 이름의 첫글자를 조회
	select substr(ename,1,1) from emp;
	emp 테이블에서 모든 직원의 이름의 앞 두 글자를 조회, 단 소문자로 
	select lower(substr(ename,1,2)) as aa from emp;

INSTR : 문자열 특정 문자열 위치반환
	INSTR(문자열, 찾을문자열)
	select instr('abcdefg', 'cd') from dual;

LPAD : 문자열 왼쪽에 특정문자 채움
	LPAD(문자열, 길이, 채울문자)
	select lpad('abcdef', 10, '*') from dual;

RPAD : 문자열 오른쪽에 특정문자 채움
	RPAD(문자열, 길이, 채울문자)
	select rpad('abcdef', 10, '*') from dual;

LTRIM : 문자열 왼쪽에 특정문자 지움
	LTRIM(문자열, 지울문자)
	LTRIM(문자열) : 공백삭제
	select LTRIM('******/******abc******/*****','*') from dual;
	RTRIM : 문자열 오른쪽에 특정문자 지움
	RTRIM(문자열, 지울문자)
	select RTRIM('******/******abc******/*****','**') from dual;

TRIM : 문자열 양쪽에 공백 삭제
	select trim('  abc  ') from dual;
	
REPLACE : 문자열 특정 문자열 교체
    REPLACE(문자열,교체대상문자열,교체문자열)
    select replace('abcdefg','cd','*') from dual;
-------------------------------------------------------------------------------
숫자관련함수   
대문자변경 ctrl+shift+X
ROUND : 반올림
	ROUND(숫자, 표시자리수)
	select round(12.36, 1) from dual;
	
TRUNC : 버림
	TRUNC(숫자, 표시자리수)
	select trunc(12.36, 1) from dual;
	
MOD : 나머지
	MOD(A,B) : A를 B로 나눈 나머지
	select mod(5,3) from dual;
	
FLOOR : 가장 가까운 작은 정수 출력
	select floor(12.34) from dual;
	
CEIL : 가장 가까운 큰 정수 출력
	select ceil(12.34) from dual;
POWER : 제곱수
	select power(4,3) from dual;
------------------------------------------------------------------------------------
날짜관련함수
날짜 출력 포맷, 날짜계산, 일수확인 등등등....

SYSDATE : 시스템 현재 날짜 반환
	select sysdate from dual;
	
TO_DATE : 특정 포맷의 문자열을 날짜 데이터로 변환
	RRRR 00도 구분가능
	select to_date('2018-05-09', 'YYYY-MM-dd') form dual;
	
TO_CHAR : 날짜를 특정 포맷의 문자열로 변환
	select to_char(sysdate, 'RRRR:MM:dd') from dual;
	
MONTHS_BETWEEN : 두 날짜간 개월 수 반환
	MONTHS_BETWEEN(날짜1,날짜2)
	select months_between(sysdate, to_date('2017-05-09', 'RRRR-MM-dd')) from dual;
	
ADD_MONTHS : 특정 날짜에 개월 수 더하기
	select add_months(sysdate,3) from dual;
	
NEXT_DAY : 날짜 기준으로 지정한 요일의 돌아오는 날짜 반환
	select next_day(sysdate,'수') from dual;
	
LAST_DAY : 날짜가 속한 달의 마지막 날짜 반환
	select last_day(sysdate) from dual;
	
ROUND : 낮 12시(정오)를 기준으로 시간이 지났으면 다음날, 안지났으면 오늘 반환
	select to_date('2018-05-09 13:00', 'RRRR-MM-dd hh24:mi') from dual;
	select round (to_date('2018-05-09 13:00', 'RRRR-MM-dd hh24:mi')) from dual;
	
TRUNC : 해당날짜 반환(00시 기준)
	select to_char(sysdate, 'RRRR-MM-dd hh:mi:ss') from dual;
	select trunc(to_char(sysdate, 'RRRR-MM-dd hh:mi:ss')) from dual;
----------------------------------------------------------------------------------------------
NVL(칼럼,값) : 조회한 칼럼이 null 이면 지정한 값을 넣어줌
	emp테이블에서 모든 직원의 이름과, sal + comm 을 더한 급여를 조회
	select ename,job,sal,nvl(comm,0),sal + nvl(comm,0) from emp;
	select ename,nvl(mgr,'매니저없음') from emp;

DECODE : 
	DECODE(A,B,값)
	프로그래밍 언어에서 if(A==B) 값 출력 아니면 null
	
	10 ACCOUNTING
	20 RESEARCH
	30 SALES
	40 OPERATIONS
	emp 테이블에서 부서번호 조회
	select deptno, deptno from emp;
	decode(deptno,10'ACCOUNTING') from emp;
	deptno가 10이면 'ACCOUNTING', 아니면 null
	decode(deptno,10,'ACCOUNTING',20,'RESEARCH','기타부서') from emp;
-------------------------------------------------------------------------------------------------
그룹함수(복수행함수)
각 행마다 함수를 처리하는 것이 아니라,
조회 결과중 여러 행을 묶어서 통계를 내는 함수
count : 조회된 행의 개수 
	count(칼럼)
	부서번호가 10인 직원 수
	select count(*) as "직원수"
	from emp
	where deptno = 10;	
	
	각 부서별 직원의 수를 알고싶을때 
	select count(*) as "직원수",deptno as "부서" 
	from emp
	group by deptno;
	
sum : 조회된 행들의 값의 총합

	전체 직원의 급여의 총합
	select sum(sal) from emp;
	
	부서별 직원의 급여의 총합
	select sum(sal),deptno
	from emp
	group by deptno;
	
	업무별 직원의 급여의 총합
	select sum(sal),job
	from emp
	group by job;
	
	부서,업무별 급여 총합
	select sum(sal),deptno,job
	from emp
	group by deptno,job
	order by deptno, job;
	
avg : 조회된 행들의 값의 평균
	
	전체 직원의 평균연봉
	select avg(sal) from emp;
	
max : 조회된 행들의 값중에 가장 큰 값
	
	직원 중 가장 급여가 높은사람
	select max(sal) from emp;
	
	부서별 가장 높은 급여조회
	select max(sal)
	from emp
	group by deptno;
	
	
min : 조회된 행들의 값중에 가장 작은 값
	
	업무별 가장 적은 급여조회
	select min(sal)
	from emp
	group by job;
	
통계함수에서 조건 : where 이 아니라 having
	부서번호가 10인 부서의 업무별 급여의 총합 중 2000이상인 값을조회
	select sum(sal),job
	from emp
	where deptno = 10
	group by job
	having sum(sal) >=2000;
---------------------------------------------------------------
1. 모든 사원의 급여에 300을 더한 후 ,이름, 급여, 인상된 급여 조회
	select ename,sal,sal+300 from emp; 
2. 사원 번호가 7782인 사원의 이름과 부서번호 조회
	select ename,deptno,empno from emp where empno = '7782' ;
3. 부서 번호가 20이거나 30인 사원의 이름과 부서번호 조회
	select ename,deptno from emp where deptno = 20 or deptno = 30 order by deptno;
  = select ename,deptno from emp where deptno between 20 and 30;
4. 급여가 2000이상 3000이하 이고, 부서가 20 또는 30인
   사원의 이름, 급여, 부서번호
   select ename,sal,deptno from emp where sal between 2000 and 3000 and (deptno = 20 or deptno = 30);
 = select ename,sal,deptno from emp where sal between 2000 and 3000 and deptno in(20,30);
5. 커미션이 null 이 아닌 사원의 이름, 급여, 업무, 커미션 조회
	select ename,sal,job,comm from emp where comm is not null;
6. 업무가 CLERK 또는 SALESMAN 이면서 급여가 1600,950,1300 이
   아닌 사원의 이름,업무, 급여 조회
   select ename,job,sal from emp where job in('CLERK','SALESMAN') and (sal !=1600)and(sal != 950)and(sal != 1300);
  =select ename,job,sal from emp where job in('CLERK','SALESMAN') and not sal in(1600,950,1300);
7. 커미션이 500 이상인 사원의 이름과 급여, 커미션 출력
	select ename,sal,comm from emp where comm >=500;
8. 모든 사원의 이름, 업무, 급여(급여+커미션) 을 조회
	select ename,job,sal+nvl(comm,0) from emp;
9. 9-1 전체 사원 급여의 최대값, 최소값, 평균값 조회(단, 평균은 첫째자리까지 표시)
	select max(sal),min(sal),round(avg(sal),1) from emp;
   9-2 부서별 급여의 최대값, 최소값, 평균값 조회 (단, 평균은 첫째자리까지 표시)
   select max(sal),min(sal),round(avg(sal),1) from emp group by deptno;
10. 전체 사원의 수, 커미션의 총합, 커미션의 평균값 조회
    단, 커미션이 없을경우 0으로 계산, 소수점은 첫째자리까지 표시
    select count(*) sum(comm),round(avg(nvl(comm,0)),1)
    from emp;


	
