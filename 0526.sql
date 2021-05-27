--'Jones'직원의 월급보다 많은 월급을 받는사람

SELECT*FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'S%';

SELECT * FROM EMPLOYEES;
--SUBQUERY로 생성된 질의문
SELECT first_name, salary
FROM employees
WHERE salary > (SELECT SALARY
                FROM EMPLOYEES
                WHERE FIRST_NAME = 'Den');
                
SELECT SALARY
FROM EMPLOYEES
WHERE FIRST_NAME = 'Den';

--Sarah의 입사년도보다 더 먼저 입사한 사람들

SELECT * FROM employees
WHERE hire_date <(SELECT hire_date FROM employees WHERE first_name = 'Sarah');

SELECT first_name, salary, hire_date
FROM EMPLOYEES
WHERE hire_date < ( SELECT hire_date
                    FROM EMPLOYEES
                    WHERE first_name = 'Sarah');

--Last name이 'Seo'인 사람과 같은부서에서 일하는 사람들의 사원번호 이름 부서번호

SELECT employee_id, first_name, last_name, department_id
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE Last_name = 'Seo')
ORDER BY employee_id;


SELECT employee_id, first_name, department_id
FROM employees
WHERE department_id = (SELECT department_id
                        FROM employees
                        WHERE Last_name = 'Seo');

--rownum 동적으로 하나의 row가 질의될때마다 번호를 붙여주는 칼럼, 항상 1부터 시작
-- psuedo column : 의사컬럼 - 테이블의 컬럼처럼 동작하지만 실제로 테이블에 저장되지는 않는 컬럼

-- 테이블에서 부서번호가 80인 사원 중 급여가 8000보다 큰 사원
SELECT rownum, tbl.*
FROM 
(SELECT employee_id, first_name, salary, department_id
FROM employees
WHERE department_id = 80) tbl
WHERE tbl.salary > 8000;

--함수와 함께 사용하기\
--평균급여보다 많이 받는 사람들의 사원번호 이름 급여

SELECT employee_id, first_name, salary
FROM employees

WHERE salary > (SELECT avg(salary) FROM employees);

SELECT employee_id, first_name, salary
FROM employees
WHERE salary > (SELECT avg(salary)
                 FROM employees);


--부서별 최고급여와 동일한 급여를 받는 사원 정보 출력하기

SELECT first_name, department_id, salary
FROM employees
WHERE salary in (SELECT max(salary) FROM employees GROUP BY department_id);

SELECT first_name, department_id, salary 
FROM employees
WHERE salary in (SELECT max(salary)
                FROM employees
                GROUP BY department_id);


-- > any, < any, >=any, <=any, =any, !=any (in 연산자와 같다)

select salary from employees
where job_id = 'IT_PROG'
order by 1 desc; -- 9000, 6000, 4800, 4200

 --  < any는 salary가 9000미만인 사람은 모두 나옴, >any 일경우 4200보다 큰 모든 값, =any는 조건값과 같은값 모두표시
SELECT first_name, salary, job_id
FROM employees
where salary < any(select salary from employees
                    where job_id = 'IT_PROG');

--  > all은 가장 큰값보다 큰 것 , < all 가장 작은값보다 작은 값
SELECT first_name, salary, job_id
FROM employees
where salary < all(select salary from employees
                    where job_id = 'IT_PROG');


/* exists */
SELECT * FROM employees
WHERE department_id = 30;

-- 서브쿼리 결과값이 하나라도 존재하면 서브쿼리 안 자료는 모두 true가 됨
SELECT first_name, salary, department_id
FROM employees
WHERE exists (SELECT * FROM employees
                WHERE department_id = 30);


--서브쿼리 결과값이 하나도 같은게 없으므로 인출되는 행이 없다.
SELECT first_name, salary, department_id
FROM employees
WHERE exists (SELECT * FROM employees
                WHERE department_id = 1230);
                

--10번 부서에 속한 모든 사원들보다 일찍 입사한 사원정보

SELECT first_name, department_id, hire_date
FROM employees
WHERE hire_date < (SELECT hire_date FROM employees WHERE department_id = '10');


select first_name, hire_date, department_id
from employees
where hire_date < all(select hire_date
                      from employees
                      where department_id = 10);


--업무의 종류가 CLERK인 사람들 중에서 12년이상 근무한 직원들에게 상여금 10%를 지급하는 쿼리 작성

SELECT e.first_name, e.hire_date, trunc(((months_between(sysdate, e.hire_date))/12) , 
        d.department_name, j.job_title, e.salary, e.salary * 1.1
FROM employees e, departments d, jobs j
WHERE 
    job_id LIKE '%CLERK'
    and e.department_id = d.department_id
    and e.job_id = j.job_id
    and trunc((months_between(sysdate, hire_date))/12) <= 12;

SELECT  trunc((months_between(sysdate, hire_date)) / 12) 근속년수 ,first_name, salary,hire_date 
                                                            FROM employees 
                                                            WHERE job_id LIKE '%CLERK';



--근속년수가 12년 이상인 직원의 이름, 입사일, 근속년수, 부서명, 업무명, 급여

SELECT e.first_name, e.hire_date, trunc((months_between(sysdate, e.hire_date)) / 12) 근속년수, d.department_name, e.job_id, e.salary
FROM employees e, departments d
WHERE trunc(((sysdate-hire_date)+1)/365) >=12;

SELECT e.first_name, to_char(e.hire_date, 'YYYY-MM-DD') as 입사일, d.department_name 
FROM employees e, departments d
WHERE d.department_id = e.department_id
AND    substr(sysdate,1,2) - substr(e.hire_date,1,2) >= 12;

/*
1) 업무의 종류가 CLERK인 사람들 중에서 근속년수가 12년 이상인 직원들에게 상여금 10%를 지급하는 쿼리를 작성하시오
   이름, 입사일, 근속년수, 부서명, 업무명, 급여, 특별상여
*/
SELECT e.first_name, e.hire_date, trunc((months_between(sysdate, e.hire_date)+1)/12) 근속연수, 
        d.department_name, j.job_title, e.salary, e.salary * 1.1 as 특별상여
FROM employees e, departments d, jobs j
WHERE e.job_id LIKE '%CLERK'
      and e.department_id = d.department_id
      and e.job_id = j.job_id
      and trunc((months_between(sysdate, e.hire_date)+1)/12) >= 12;
      
      
 SELECT 
    e.FIRST_NAME, e.HIRE_DATE, SUBSTR(SYSDATE,1, 2)- SUBSTR(e.HIRE_DATE,1, 2) as "근속년수", 
    d.DEPARTMENT_NAME, j.JOB_TITLE, e.SALARY, e.SALARY*1.1
FROM EMPLOYEES e, DEPARTMENTS d, JOBS j
WHERE 
    e.JOB_ID LIKE '%CLERK'
    AND e.DEPARTMENT_ID = d.DEPARTMENT_ID
    AND e.JOB_ID = j.JOB_ID
    AND SUBSTR(SYSDATE,1, 2)- SUBSTR(e.HIRE_DATE,1, 2) >= 12;
     
--3) 사원번호 근무기간, 업무명을 조회 예 : Smith는 5년 근무한 IT_PROG 이다.
SELECT '사원번호'|| employee_id ||'의' || first_name || '은(는)' ||  trunc((months_between(sysdate,hire_date))/12) || '년 근무한'|| job_id ||'이다.'
FROM employees;

/* 3) 사원번호 근무기간, 업무명을 조회 
  예 : Smith는 5년 근무한 IT_PROG 이다. */

SELECT e.first_name || '은 ' ||  trunc((j.END_DATE - j.START_DATE)/365)|| '년 ' ||
    trunc(((j.END_DATE-j.START_DATE)/365 - trunc((j.END_DATE - j.START_DATE)/365) )*10) ||
    '개월 근무한 ' || js.JOB_TITLE || '이다'  
FROM employees e, JOB_HISTORY j, JOBS js
WHERE j.JOB_ID = js.JOB_ID ;


select 
    e.first_name || '은(는} ' ||
    trunc((js.end_date-js.start_date)/365) || '년 ' ||
    trunc(((js.end_date-js.start_date)/365 - trunc((js.end_date-js.start_date)/365)) * 10) || '개월 간 ' ||
    js.job_id || '업무로, 근무한 부서는 ' ||
    d.department_name || '부서이다.'
from
    job_history js, employees e, departments d
where
    js.employee_id = e.employee_id
    and
    js.department_id = d.department_id;



--4) 'Adam' 보다 일찍 입사한사람의 명단(이름, 입사일)을 조회하시오
SELECT first_name, hire_date
FROM employees
WHERE hire_date < (SELECT hire_date
                   FROM employees
                   WHERE first_name = 'Adam');

--5) 평균급여를 초과하는 급여를 받는 사람들의 이름, 급여, 부서명(부서아이디가 아님) 조회

SELECT e.first_name, e.salary, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id
and e.salary > (select avg(salary)
                from employees)
order by e.salary;