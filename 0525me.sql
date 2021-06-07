

SELECT *
FROM EMPLOYEES, DEPARTMENTS
WHERE EMPLOYEES.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID;  --EQUI JOIN (�����)

--�����ȣ �̸� �޿� �μ���
SELECT
    e.EMPLOYEE_ID, e.FIRST_NAME, e.SALARY, d.DEPARTMENT_NAME    
FROM
    EMPLOYEES e , DEPARTMENTS d
WHERE
    e.DEPARTMENT_ID = d.DEPARTMENT_ID;
--���� �ٸ����̺��� �����͸� ������ ���� ���� ������ �� ���� ����
    
--�μ���ȣ, �μ���, ����
SELECT
    d.DEPARTMENT_ID, d.DEPARTMENT_NAME, l.CITY
FROM
    DEPARTMENTS d, LOCATIONS l
WHERE
    d.LOCATION_ID = l.LOCATION_ID
ORDER BY 1;


--���ø�, �����
SELECT
    C.COUNTRY_NAME, L.CITY
FROM
    COUNTRIES C, LOCATIONS L
WHERE
    C.COUNTRY_ID = L.COUNTRY_ID;


-- �����ȣ, �̸�, �޿�, �μ���  (�޿��� 10000�̻��� ���)
SELECT
    E.EMPLOYEE_ID, E.FIRST_NAME, E.SALARY, D.DEPARTMENT_NAME
FROM
    EMPLOYEES E, DEPARTMENTS D
WHERE
    E.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND E.SALARY >=10000
ORDER BY E.SALARY;

-- �����ȣ, �̸�, �޿�, �μ���  (�޿��� 10000�̻�~13000������ ���)
SELECT
    E.EMPLOYEE_ID, E.FIRST_NAME, E.SALARY, D.DEPARTMENT_NAME
FROM
    EMPLOYEES E, DEPARTMENTS D
WHERE
    E.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND E.SALARY BETWEEN 10000 AND 13000
ORDER BY SALARY;

-- �μ���ȣ �μ��� ���� ����
SELECT
    D.DEPARTMENT_ID, D.DEPARTMENT_NAME, L.CITY, C.COUNTRY_NAME
    FROM
    DEPARTMENTS D, COUNTRIES C, LOCATIONS L
WHERE
    D.location_id = L.LOCATION_ID
    AND
    C.COUNTRY_ID = L.COUNTRY_ID;

--�μ���ȣ �μ��� ���� ���� ���    
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

--����̸�, ��å��, �޿�
SELECT
    E.FIRST_NAME, J.JOB_TITLE, E.SALARY
FROM
    EMPLOYEES E, JOBS J
WHERE
    E.JOB_ID = J.JOB_ID;
    
--Ŀ�̼��� �޴� ��� ����� �̸�, �μ���
SELECT
    E.COMMISSION_PCT, E.FIRST_NAME, D.DEPARTMENT_NAME
FROM
    EMPLOYEES E, DEPARTMENTS D
WHERE
    E.DEPARTMENT_ID = D.DEPARTMENT_ID
    AND
    e.commission_pct IS NOT NULL
ORDER BY 1;

--�þ�Ʋ�� �ٹ��ϴ� ������� �̸� ������ �μ���
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
    
--�����ȣ, �̸�, ��, �μ��� (equi join)
select
    e.employee_id, e.first_name, e.last_name, d.department_name
from
    employees e, departments d
where
    e.department_id = d.department_id(+)
order by e.employee_id; --  outer���� : PK���� ���� �ʿ� (+)�� �ٿ��ش�!
   

--�����ȣ, �̸�, �Ŵ����̸�
select e1.employee_id �����ȣ , e1.first_name ������ , e2.first_name �Ŵ�����
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+)
order by e1.employee_id;

--steven king�� �Ŵ����� xxx�Դϴ�.
select e1.first_name ||' '||e1.last_name|| '�� �Ŵ�����' || e2.first_name || '�Դϴ�.' AS �����
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