/*
조회
SELECT [DISTINCT] 컬럼명,... 
FROM 테이블명 (DUAL)
WHERE 조건절
ORDER BY 컬럼명 [DESC | ASC], 컬럼명

-- 비교연산자
=, !=, >=, <=, >, <
IS NULL, IS NOT NULL

-- 타입
1) 문자열
   CHAR(n)
   VARCHAR2(n)
   '홍길동', 'T'
   
2) 숫자
   NUMBER(n)       12, 56
   NUMBER(5, 3)    45,195
   NUMBER          
   
   
3) 날짜
   DATE            '21/05/18'  -- YYYY/MM/DD
                   SYSDATE
*/
-- 1) 사원번호(employee_id), 이름(first_name), 성(last_name), 급여(salary)
SELECT
    employee_id, first_name, last_name, salary
FROM
    employees;

-- 2) 사원번호, 이름, 부서번호, 급여, 직급을 조회
SELECT
    employee_id, first_name, department_id, salary, job_id
FROM
    employees;
    
-- 3) 사원번호, 이름, 부서번호, 급여, 직급을 이름 별로 오름차순 조회
SELECT
    employee_id, first_name, department_id, salary, job_id
FROM
    employees
ORDER BY
    first_name;
    
-- 4) 급여가 10000 이상인 사람의 이름, 급여, 부서번호
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    salary >= 10000;
    
-- 5) 급여가 10000 이상인 사람의 이름, 급여, 부서번호를 급여별 내림차순 조회
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    salary >= 10000
ORDER BY
    salary DESC;
    
-- 6) 100번 부서에 소속된 사람들의 이름, 입사일, 급여를 이름순으로 오름차순 조회
SELECT 
    first_name, hire_date, salary
FROM
    employees
WHERE
    department_id = 100
ORDER BY
    first_name;
    
-- 7) 입사일이 '07/01/01' 이전에 입사한 사람들의 이름, 입사일, 부서번호 조회
SELECT 
    first_name, hire_date, department_id
FROM
    employees
WHERE
    hire_date < '07/01/01';

-- 5월 18일(화)
-- 논리연산자, 산술연산자, 
/* and 컬럼명 between a and b
   or  컬럼명 in (값)
   not 
   
   + - * /
   
   
*/
-- 8) 커미션(commission_pct)을 받는 사람들의 사원번호, 이름, 부서번호, 급여, 커미션액수 조회
SELECT
    employee_id, first_name, salary, commission_pct, commission_pct*salary AS COMMISSION
FROM
    employees
WHERE
    commission_pct IS NOT NULL;

-- 9) 사원번호, 이름, 부서번호, 급여
--    10000~11000사이의 급여를 받는 사람들을 조회
SELECT 
    employee_id, first_name, department_id, salary
FROM
    employees
WHERE 
    salary BETWEEN 10000 AND 11000;
-- salary >= 10000 AND salary <= 11000;

-- 10)부서번호가 30번 이거나 50번인 직원의 이름, 급여, 부서번호 
SELECT
    first_name, salary, department_id
FROM 
    employees
WHERE
    NOT department_id IN (30, 50);

-- 11) 데이터가 영문자일 경우 조건은 대소문자를 맞춰야 한다!
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    first_name = 'Sarah';
    
/*
-- LIKE : 와일드카드와 함께 사용
% : 0~ 여러 개 문자열 
_ : 글자 한 개를 의미 __
*/
-- 12) S로 시작하는 이름을 조회
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    first_name LIKE 'S%'; -- '%' || subject ||'%'

-- 13) S로 시작하고 글자수는 5글자인 이름을 조회
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    first_name LIKE 'S____';

-- [ Exercise ] 
-- 14) 부서번호가 30, 50, 70 부서인 사람들 조회 이름, 직급, 급여, 부서번호
SELECT
    first_name, job_id, salary, department_id
FROM
    employees
WHERE
    department_id IN (30, 50, 70);
    
-- 15) 이름이 't'로 끝나는 사람의 이름 부서 직급 조회
SELECT
    first_name, department_id, job_id
FROM
    employees
WHERE
    first_name LIKE '%t';
    
-- 16) 커미션의 액수가 2000 이상인 사람의 이름, 급여, 커미션비율, 커미션액수 조회
SELECT
    first_name, salary, commission_pct, salary*commission_pct AS COMMISSION
FROM
    employees
WHERE
    salary*commission_pct >= 2000;
    
-- 17) 직급이 'ACCOUNT'이거나 'CLERK'인 직원의 이름, 직급, 부서 조회
SELECT
    first_name, job_id, department_id
FROM
    employees
WHERE
    job_id LIKE '%ACCOUNT%' OR job_id LIKE '%CLERK%';
    
-- 18) 입사일이 07년도인 직원이 이름, 부서, 입사일 조회, 입사일 순으로 오름차순
SELECT
    first_name, department_id, hire_date
FROM
    employees
WHERE
    hire_date LIKE '07%'
ORDER BY
    hire_date;

-- 집합연산자
-- 합집합(UNION), 교집합(INTERSECT), 차집합(MINUS)

-- SQL : DDL(C, A, D)  DML(I, U, D, S) , DCL, TCL
-- Oject : table, view, index, sequence, user, synonym 
-- 제약조건을 부여해서 만들기 (pk, fk, uq, nn, ck, default)

SELECT * FROM user_constraints
WHERE TABLE_NAME = 'MYTABLE';

CREATE table mytable
(
    userid number constraints mytable_id_pk  primary key,
    username varchar2(10) constraints mytable_name_nn not null,
    phone varchar2(15) constraint mytable_phone_uq not null unique,
    age number(3) default 20,
    birth date default sysdate
);

drop table mytable;

INSERT INTO mytable 
    (userid, username, phone, age, birth) 
VALUES 
    (1, '홍길동', '010-1111-2222', 34, '91/12/25');

commit;

