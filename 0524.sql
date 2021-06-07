/*

1) 단일함수
숫자함수   : round(), ceil(), floor(),...
문자열함수 : lower(), upper(), length(), substr()
날짜함수   : +, add_month(), months_between()
변환함수   : to_char(), to_date(), nvl(컬럼, 값)
           decode(컬럼, 값, 작업, 값, 작업, 값, 작업, 작업)
           
2) 그룹함수 : 특정 row을 기준으로 그룹화 시켜서 적용하는 함수 (~별)
   - select 절, group by
   - 주의! : where ==> 단일의 row에 조건을 줄때 사용하는 문장
                  ==> 그룹화된 데이터에 조건을 줄 때는 where절 사용 못함. 대신 having이라는 명령문 사용
   - count(컬럼명), sum(), avg(), max(), min(), stdenv(), variance()
*/

SELECT FIRST_NAME, SALARY, COMMISSION_PCT, nvl(COMMISSION_PCT, 0) 커미션액수
FROM EMPLOYEES; -- nvl을 사용하면 null값을 안나오게 해줌(숫자면 숫자입력, 문자면 문자열입력)

-- 전체 조직의 인원수
SELECT COUNT(*) FROM EMPLOYEES;

-- 특정 컬럼값을 지정하면 NULL을 제외한 데이터의 숫자만 센다.
SELECT COUNT(COMMISSION_PCT) FROM EMPLOYEES;

-- 'Steven King' 은 MANAGER가 없으므로 
SELECT COUNT(MANAGER_ID) FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, MANAGER_ID FROM EMPLOYEES;

SELECT ROUND(AVG(SALARY),2) AS 평균연봉, SUM(SALARY) AS 연봉합계 
FROM EMPLOYEES;

SELECT ROUND(AVG(COMMISSION_PCT),3) 커미션평균 FROM EMPLOYEES;

SELECT MIN(SALARY), MAX(SALARY) FROM EMPLOYEES;

SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES ORDER BY 1;

-- 부서별 급여 평균
SELECT
    FIRST_NAME, ROUND(AVG(SALARY),2)
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
ORDER BY 1;

-- 직급별 급여 총액
SELECT JOB_ID, SUM(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID
ORDER BY SUM(SALARY) DESC;

-- 부서별 급여 평균 (급여 평균이 8000을 초과하는 부서만)
-- WHERE 절은 단일 ROW 에 조건을 걸고자 할 때 사용
-- HAVING이라는 절을 사용

SELECT
    DEPARTMENT_ID, ROUND(AVG(SALARY),2) AS 급여평균
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING
    AVG(SALARY) >8000
ORDER BY
    1;

-- 1. 80번 부서의 급여평균, 최고, 최저, 인원수 조회
SELECT
    DEPARTMENT_ID, ROUND(AVG(SALARY),1)AS 급여평균, MAX(SALARY), MIN(SALARY), COUNT(*)
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING
    DEPARTMENT_ID = 80;
    
-- 2. 각 부서별 급여의 평균, 최고, 최저, 인원수를 조회
SELECT 
    DEPARTMENT_ID, ROUND(AVG(SALARY), 2) 급여평균, MAX(SALARY) 급여최고액, MIN(SALARY) 급여최소액, COUNT(*)
FROM 
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
ORDER BY 1;    

-- 3. 각 부서별 급여의 평균, 최고, 최저, 인원수를 조회하되 부서번호가 NULL인 데이터는 출력되지 않도록 조건을 부여
SELECT 
    DEPARTMENT_ID, ROUND(AVG(SALARY), 2) 급여평균, MAX(SALARY) 급여최고액, MIN(SALARY) 급여최소액, COUNT(*)
FROM 
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING DEPARTMENT_ID IS NOT NULL
ORDER BY 1;  

-- 4. 각 부서별 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무명, 인원수 조회   
SELECT
    DEPARTMENT_ID, JOB_ID, COUNT(*)
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID, JOB_ID
ORDER BY 1;


-- 5. 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수 조회
SELECT JOB_ID, COUNT(JOB_ID)
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING COUNT(JOB_ID) >= 4
ORDER BY 1;

-- 6. 사원들의 입사연도를 기준으로 부서별 몇명이 입사했는지 출력
SELECT
    DEPARTMENT_ID, SUBSTR(TO_CHAR(HIRE_DATE),1,2),COUNT(*)
FROM
    EMPLOYEES
GROUP BY
    SUBSTR(TO_CHAR(HIRE_DATE),1,2), DEPARTMENT_ID
ORDER BY 2;

-- 7. 커미션을 받는 사람과 받지 않는 사람의 인원수를 출력
SELECT
    SUM(COUNT(COMMISSION_PCT)) 커미션받는사람수
FROM
    EMPLOYEES
GROUP BY
    COMMISSION_PCT
HAVING
    COMMISSION_PCT IS NOT NULL;    


SELECT 
    'o' 수령여부, SUM(COUNT(COMMISSION_PCT)) 커미션수령자수
FROM EMPLOYEES
GROUP BY COMMISSION_PCT
HAVING COMMISSION_PCT IS NOT NULL;

-- 8. 각 부서의 입사 연도별 사원수, 최고급여, 급여합, 평균급여

SELECT
    SUBSTR(TO_CHAR(HIRE_DATE),1,2)AS 입사연도, COUNT(*) AS 연도별사원수, MAX(SALARY), SUM(SALARY), ROUND(AVG(SALARY),1) 급여평균
FROM
    EMPLOYEES
GROUP BY
    SUBSTR(TO_CHAR(HIRE_DATE),1,2)
ORDER BY 1;