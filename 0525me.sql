

SELECT *
FROM EMPLOYEES, DEPARTMENTS
WHERE EMPLOYEES.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID;  --EQUI JOIN (등가조인)

--사원번호 이름 급여 부서명
SELECT
    e.EMPLOYEE_ID, e.FIRST_NAME, e.SALARY, d.DEPARTMENT_NAME    
FROM
    EMPLOYEES e , DEPARTMENTS d
WHERE
    e.DEPARTMENT_ID = d.DEPARTMENT_ID;
--서로 다른테이블에서 데이터를 가져올 경우는 값을 지정한 후 값을 써줌
    
--부서번호, 부서명, 지역
SELECT
    d.DEPARTMENT_ID, d.DEPARTMENT_NAME, l.CITY
FROM
    DEPARTMENTS d, LOCATIONS l
WHERE
    d.LOCATION_ID = l.LOCATION_ID
ORDER BY 1;


--도시명, 나라명
SELECT
    C.COUNTRY_NAME, L.CITY
FROM
    COUNTRIES C, LOCATIONS L
WHERE
    C.COUNTRY_ID = L.COUNTRY_ID;


-- 사원번호, 이름, 급여, 부서명  (급여가 10000이상인 사람)
SELECT
    E.EMPLOYEE_ID, E.FIRST_NAME, E.SALARY, D.DEPARTMENT_NAME
FROM
    EMPLOYEES E, DEPARTMENTS D
WHERE
    E.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND E.SALARY >=10000
ORDER BY E.SALARY;

-- 사원번호, 이름, 급여, 부서명  (급여가 10000이상~13000이하인 사람)
SELECT
    E.EMPLOYEE_ID, E.FIRST_NAME, E.SALARY, D.DEPARTMENT_NAME
FROM
    EMPLOYEES E, DEPARTMENTS D
WHERE
    E.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND E.SALARY BETWEEN 10000 AND 13000
ORDER BY SALARY;

-- 부서번호 부서명 도시 나라
SELECT
    D.DEPARTMENT_ID, D.DEPARTMENT_NAME, L.CITY, C.COUNTRY_NAME
    FROM
    DEPARTMENTS D, COUNTRIES C, LOCATIONS L
WHERE
    D.location_id = L.LOCATION_ID
    AND
    C.COUNTRY_ID = L.COUNTRY_ID;

--부서번호 부서명 도시 나라 대륙    
SELECT
    D.DEPARTMENT_ID, D.DEPARTMENT_NAME, L.CITY, C.COUNTRY_NAME, r.region_name
    FROM
    DEPARTMENTS D, COUNTRIES C, LOCATIONS L, REGIONS R
WHERE
    D.location_id = L.LOCATION_ID
    AND
    C.COUNTRY_ID = L.COUNTRY_ID
    AND
    r.region_id = c.region_id;

--사원이름, 직책명, 급여
SELECT
    E.FIRST_NAME, J.JOB_TITLE, E.SALARY
FROM
    EMPLOYEES E, JOBS J
WHERE
    E.JOB_ID = J.JOB_ID;
    
--커미션을 받는 모든 사원의 이름, 부서명
SELECT
    E.COMMISSION_PCT, E.FIRST_NAME, D.DEPARTMENT_NAME
FROM
    EMPLOYEES E, DEPARTMENTS D
WHERE
    E.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND
    e.commission_pct IS NOT NULL
ORDER BY 1;

--시애틀에 근무하는 모든사원의 이름 업무명 부서명
SELECT
    E.FIRST_NAME, L.CITY, J.JOB_TITLE, D.DEPARTMENT_NAME
FROM
    EMPLOYEES E, LOCATIONS L,JOBS J, DEPARTMENTS D
WHERE
    E.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND
    D.LOCATION_ID = L.LOCATION_ID
    AND
    E.JOB_ID = J.JOB_ID
    AND
    L.CITY = 'Seattle';
    
--사원번호, 이름, 성, 부서명 (equi join)
select
    e.employee_id, e.first_name, e.last_name, d.department_name
from
    employees e, departments d
where
    e.department_id = d.department_id(+)
order by e.employee_id; --  outer조인 : PK값을 가진 쪽에 (+)를 붙여준다!
   

--사원번호, 이름, 매니저이름
select e1.employee_id 사원번호 , e1.first_name 직원명 , e2.first_name 매니저명
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+)
order by e1.employee_id;

--steven king의 매니저는 xxx입니다.
select e1.first_name ||' '||e1.last_name|| '의 매니저는' || e2.first_name || '입니다.' AS 상관명
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+)
order by e1.employee_id;

SElECT *
FROM job_history;

select
    j1.employee_id, e.first_name, j1.start_date, j1.end_date, j.job_title, d.department_name
from
    employees e, job_history j1, jobs j, departments d
where
    j1.employee_id = e.employee_id
    and
    j.job_id = j1.job_id
    and
    j1.department_id = d.department_id;