-- * HR 계정의 샘플 데이터를 이용하여 다음 설명에 맞는 기능을 수행하는 SQL문을 기술하시오.                                

-- 1.	모든 사원의 이름과, 전화번호 첫 3자리를 출력하시오.
SELECT FIRST_NAME, LAST_NAME, (SUBSTR(PHONE_NUMBER, 1, 3)) PHONE_NUMBER FROM EMPLOYEES;

-- 2.	모든 사원의 이름과 성, 그리고 (이름과 성을 합한 글자수)를 출력하시오. (LENGTH 함수이용)
SELECT FIRST_NAME, LAST_NAME, LENGTH(FIRST_NAME || LAST_NAME) 글자수 FROM EMPLOYEES;

-- 3.	모든 사원의 이름과 성의 머리글자만 출력하시오. (예. A.A)
SELECT SUBSTR(FIRST_NAME, 1, 1) || '.' || SUBSTR(LAST_NAME, 1, 1) FROM EMPLOYEES;

-- 4.	JOB_ID의 첫 번째와 두 번째 글자가 "SA"인 사람들의 모든 정보를 출력하시오. (SUBSTR 함수이용)
SELECT * FROM EMPLOYEES WHERE SUBSTR(JOB_ID, 1, 2) = 'SA';

-- 5.	모든 사원의 이름과 성을 대문자로 출력하시오.
SELECT UPPER(FIRST_NAME) FIRST_NAME, UPPER(LAST_NAME) LAST_NAME 
FROM EMPLOYEES;

-- 6.	모든 사원의 전화번호의 '.' 기호를 '-'로 치환하여 이름과 함께 출력하시오.
SELECT FIRST_NAME, LAST_NAME, REPLACE(PHONE_NUMBER, '.', '-') 
FROM EMPLOYEES;

-- 7.	사원 급여를 30으로 나눈 값을 소수점 둘째 자리에서 반올림하여 출력하시오.
SELECT ROUND(SALARY / 30, 2) FROM EMPLOYEES;

-- 8.	모든 사원의 입사일과, 입사일 이후 100일째 되는 날을 다음과 같은 형식으로 출력하시오.
SELECT 
    EMPLOYEE_ID AS 사원번호,
    HIRE_DATE AS 입사일, 
    TO_CHAR(HIRE_DATE+100, 'YYYYMMDD') AS 백일후
FROM EMPLOYEES;

-- 9.	입사일 이후 오늘까지의 날짜수를 다음과 같이 출력하시오. 최근 입사한 사원순으로 정렬.
 SELECT EMPLOYEE_ID 사원번호, HIRE_DATE 입사일, TRUNC(SYSDATE - HIRE_DATE) 근무일수 
 FROM EMPLOYEES 
 ORDER BY HIRE_DATE DESC;

-- 10.	입사일 이후 오늘까지의 개월수를 다음과 같이 출력하시오.
SELECT 
    EMPLOYEE_ID 사원번호, HIRE_DATE 입사일, TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) 근무개월수 
FROM EMPLOYEES;

-- 11.	입사일을 다음과 같은 형식으로 출력하시오.
SELECT TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월" DD"일" DAY') HIRE_DATE FROM EMPLOYEES;

-- 12.	입사일이 3월인 모든 사원의 정보를 출력하시오.
SELECT * FROM EMPLOYEES WHERE TO_CHAR(HIRE_DATE, 'MM') = '03';

-- 13.	현재 시간을 다음과 같은 형식으로 출력하시오.
SELECT 
    TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') 
FROM DUAL;

-- 14.	사원이름과 부서명을 출력하되, 부서코드가 40이면 '인사', 60이면 '전산', 80이면 '영업' 그외는 '기타' 라고 출력한다.
SELECT 
    FIRST_NAME, LAST_NAME, 
    DECODE(DEPARTMENT_ID, 40, '인사', 60, '전산', 80, '영업', '기타') 부서 
FROM EMPLOYEES;
