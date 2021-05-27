--'Jones'������ ���޺��� ���� ������ �޴»��

SELECT*FROM EMPLOYEES
WHERE FIRST_NAME LIKE 'S%';

SELECT * FROM EMPLOYEES;
--SUBQUERY�� ������ ���ǹ�
SELECT first_name, salary
FROM employees
WHERE salary > (SELECT SALARY
                FROM EMPLOYEES
                WHERE FIRST_NAME = 'Den');
                
SELECT SALARY
FROM EMPLOYEES
WHERE FIRST_NAME = 'Den';

--Sarah�� �Ի�⵵���� �� ���� �Ի��� �����

SELECT * FROM employees
WHERE hire_date <(SELECT hire_date FROM employees WHERE first_name = 'Sarah');

SELECT first_name, salary, hire_date
FROM EMPLOYEES
WHERE hire_date < ( SELECT hire_date
                    FROM EMPLOYEES
                    WHERE first_name = 'Sarah');

--Last name�� 'Seo'�� ����� �����μ����� ���ϴ� ������� �����ȣ �̸� �μ���ȣ

SELECT employee_id, first_name, last_name, department_id
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE Last_name = 'Seo')
ORDER BY employee_id;


SELECT employee_id, first_name, department_id
FROM employees
WHERE department_id = (SELECT department_id
                        FROM employees
                        WHERE Last_name = 'Seo');

--rownum �������� �ϳ��� row�� ���ǵɶ����� ��ȣ�� �ٿ��ִ� Į��, �׻� 1���� ����
-- psuedo column : �ǻ��÷� - ���̺��� �÷�ó�� ���������� ������ ���̺� ��������� �ʴ� �÷�

-- ���̺��� �μ���ȣ�� 80�� ��� �� �޿��� 8000���� ū ���
SELECT rownum, tbl.*
FROM 
(SELECT employee_id, first_name, salary, department_id
FROM employees
WHERE department_id = 80) tbl
WHERE tbl.salary > 8000;

--�Լ��� �Բ� ����ϱ�\
--��ձ޿����� ���� �޴� ������� �����ȣ �̸� �޿�

SELECT employee_id, first_name, salary
FROM employees

WHERE salary > (SELECT avg(salary) FROM employees);

SELECT employee_id, first_name, salary
FROM employees
WHERE salary > (SELECT avg(salary)
                 FROM employees);


--�μ��� �ְ�޿��� ������ �޿��� �޴� ��� ���� ����ϱ�

SELECT first_name, department_id, salary
FROM employees
WHERE salary in (SELECT max(salary) FROM employees GROUP BY department_id);

SELECT first_name, department_id, salary 
FROM employees
WHERE salary in (SELECT max(salary)
                FROM employees
                GROUP BY department_id);


-- > any, < any, >=any, <=any, =any, !=any (in �����ڿ� ����)

select salary from employees
where job_id = 'IT_PROG'
order by 1 desc; -- 9000, 6000, 4800, 4200

 --  < any�� salary�� 9000�̸��� ����� ��� ����, >any �ϰ�� 4200���� ū ��� ��, =any�� ���ǰ��� ������ ���ǥ��
SELECT first_name, salary, job_id
FROM employees
where salary < any(select salary from employees
                    where job_id = 'IT_PROG');

--  > all�� ���� ū������ ū �� , < all ���� ���������� ���� ��
SELECT first_name, salary, job_id
FROM employees
where salary < all(select salary from employees
                    where job_id = 'IT_PROG');


/* exists */
SELECT * FROM employees
WHERE department_id = 30;

-- �������� ������� �ϳ��� �����ϸ� �������� �� �ڷ�� ��� true�� ��
SELECT first_name, salary, department_id
FROM employees
WHERE exists (SELECT * FROM employees
                WHERE department_id = 30);


--�������� ������� �ϳ��� ������ �����Ƿ� ����Ǵ� ���� ����.
SELECT first_name, salary, department_id
FROM employees
WHERE exists (SELECT * FROM employees
                WHERE department_id = 1230);
                

--10�� �μ��� ���� ��� ����麸�� ���� �Ի��� �������

SELECT first_name, department_id, hire_date
FROM employees
WHERE hire_date < (SELECT hire_date FROM employees WHERE department_id = '10');


select first_name, hire_date, department_id
from employees
where hire_date < all(select hire_date
                      from employees
                      where department_id = 10);


--������ ������ CLERK�� ����� �߿��� 12���̻� �ٹ��� �����鿡�� �󿩱� 10%�� �����ϴ� ���� �ۼ�

SELECT e.first_name, e.hire_date, trunc(((months_between(sysdate, e.hire_date))/12) , 
        d.department_name, j.job_title, e.salary, e.salary * 1.1
FROM employees e, departments d, jobs j
WHERE 
    job_id LIKE '%CLERK'
    and e.department_id = d.department_id
    and e.job_id = j.job_id
    and trunc((months_between(sysdate, hire_date))/12) <= 12;

SELECT  trunc((months_between(sysdate, hire_date)) / 12) �ټӳ�� ,first_name, salary,hire_date 
                                                            FROM employees 
                                                            WHERE job_id LIKE '%CLERK';



--�ټӳ���� 12�� �̻��� ������ �̸�, �Ի���, �ټӳ��, �μ���, ������, �޿�

SELECT e.first_name, e.hire_date, trunc((months_between(sysdate, e.hire_date)) / 12) �ټӳ��, d.department_name, e.job_id, e.salary
FROM employees e, departments d
WHERE trunc(((sysdate-hire_date)+1)/365) >=12;

SELECT e.first_name, to_char(e.hire_date, 'YYYY-MM-DD') as �Ի���, d.department_name 
FROM employees e, departments d
WHERE d.department_id = e.department_id
AND    substr(sysdate,1,2) - substr(e.hire_date,1,2) >= 12;

/*
1) ������ ������ CLERK�� ����� �߿��� �ټӳ���� 12�� �̻��� �����鿡�� �󿩱� 10%�� �����ϴ� ������ �ۼ��Ͻÿ�
   �̸�, �Ի���, �ټӳ��, �μ���, ������, �޿�, Ư����
*/
SELECT e.first_name, e.hire_date, trunc((months_between(sysdate, e.hire_date)+1)/12) �ټӿ���, 
        d.department_name, j.job_title, e.salary, e.salary * 1.1 as Ư����
FROM employees e, departments d, jobs j
WHERE e.job_id LIKE '%CLERK'
      and e.department_id = d.department_id
      and e.job_id = j.job_id
      and trunc((months_between(sysdate, e.hire_date)+1)/12) >= 12;
      
      
 SELECT 
    e.FIRST_NAME, e.HIRE_DATE, SUBSTR(SYSDATE,1, 2)- SUBSTR(e.HIRE_DATE,1, 2) as "�ټӳ��", 
    d.DEPARTMENT_NAME, j.JOB_TITLE, e.SALARY, e.SALARY*1.1
FROM EMPLOYEES e, DEPARTMENTS d, JOBS j
WHERE 
    e.JOB_ID LIKE '%CLERK'
    AND e.DEPARTMENT_ID = d.DEPARTMENT_ID
    AND e.JOB_ID = j.JOB_ID
    AND SUBSTR(SYSDATE,1, 2)- SUBSTR(e.HIRE_DATE,1, 2) >= 12;
     
--3) �����ȣ �ٹ��Ⱓ, �������� ��ȸ �� : Smith�� 5�� �ٹ��� IT_PROG �̴�.
SELECT '�����ȣ'|| employee_id ||'��' || first_name || '��(��)' ||  trunc((months_between(sysdate,hire_date))/12) || '�� �ٹ���'|| job_id ||'�̴�.'
FROM employees;

/* 3) �����ȣ �ٹ��Ⱓ, �������� ��ȸ 
  �� : Smith�� 5�� �ٹ��� IT_PROG �̴�. */

SELECT e.first_name || '�� ' ||  trunc((j.END_DATE - j.START_DATE)/365)|| '�� ' ||
    trunc(((j.END_DATE-j.START_DATE)/365 - trunc((j.END_DATE - j.START_DATE)/365) )*10) ||
    '���� �ٹ��� ' || js.JOB_TITLE || '�̴�'  
FROM employees e, JOB_HISTORY j, JOBS js
WHERE j.JOB_ID = js.JOB_ID ;


select 
    e.first_name || '��(��} ' ||
    trunc((js.end_date-js.start_date)/365) || '�� ' ||
    trunc(((js.end_date-js.start_date)/365 - trunc((js.end_date-js.start_date)/365)) * 10) || '���� �� ' ||
    js.job_id || '������, �ٹ��� �μ��� ' ||
    d.department_name || '�μ��̴�.'
from
    job_history js, employees e, departments d
where
    js.employee_id = e.employee_id
    and
    js.department_id = d.department_id;



--4) 'Adam' ���� ���� �Ի��ѻ���� ���(�̸�, �Ի���)�� ��ȸ�Ͻÿ�
SELECT first_name, hire_date
FROM employees
WHERE hire_date < (SELECT hire_date
                   FROM employees
                   WHERE first_name = 'Adam');

--5) ��ձ޿��� �ʰ��ϴ� �޿��� �޴� ������� �̸�, �޿�, �μ���(�μ����̵� �ƴ�) ��ȸ

SELECT e.first_name, e.salary, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id
and e.salary > (select avg(salary)
                from employees)
order by e.salary;