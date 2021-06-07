/*
��ȸ
SELECT [DISTINCT] �÷���,... 
FROM ���̺�� (DUAL)
WHERE ������
ORDER BY �÷��� [DESC | ASC], �÷���

-- �񱳿�����
=, !=, >=, <=, >, <
IS NULL, IS NOT NULL

-- Ÿ��
1) ���ڿ�
   CHAR(n)
   VARCHAR2(n)
   'ȫ�浿', 'T'
   
2) ����
   NUMBER(n)       12, 56
   NUMBER(5, 3)    45,195
   NUMBER          
   
   
3) ��¥
   DATE            '21/05/18'  -- YYYY/MM/DD
                   SYSDATE
*/
-- 1) �����ȣ(employee_id), �̸�(first_name), ��(last_name), �޿�(salary)
SELECT
    employee_id, first_name, last_name, salary
FROM
    employees;

-- 2) �����ȣ, �̸�, �μ���ȣ, �޿�, ������ ��ȸ
SELECT
    employee_id, first_name, department_id, salary, job_id
FROM
    employees;
    
-- 3) �����ȣ, �̸�, �μ���ȣ, �޿�, ������ �̸� ���� �������� ��ȸ
SELECT
    employee_id, first_name, department_id, salary, job_id
FROM
    employees
ORDER BY
    first_name;
    
-- 4) �޿��� 10000 �̻��� ����� �̸�, �޿�, �μ���ȣ
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    salary >= 10000;
    
-- 5) �޿��� 10000 �̻��� ����� �̸�, �޿�, �μ���ȣ�� �޿��� �������� ��ȸ
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    salary >= 10000
ORDER BY
    salary DESC;
    
-- 6) 100�� �μ��� �Ҽӵ� ������� �̸�, �Ի���, �޿��� �̸������� �������� ��ȸ
SELECT 
    first_name, hire_date, salary
FROM
    employees
WHERE
    department_id = 100
ORDER BY
    first_name;
    
-- 7) �Ի����� '07/01/01' ������ �Ի��� ������� �̸�, �Ի���, �μ���ȣ ��ȸ
SELECT 
    first_name, hire_date, department_id
FROM
    employees
WHERE
    hire_date < '07/01/01';

-- 5�� 18��(ȭ)
-- ��������, ���������, 
/* and �÷��� between a and b
   or  �÷��� in (��)
   not 
   
   + - * /
   
   
*/
-- 8) Ŀ�̼�(commission_pct)�� �޴� ������� �����ȣ, �̸�, �μ���ȣ, �޿�, Ŀ�̼Ǿ׼� ��ȸ
SELECT
    employee_id, first_name, salary, commission_pct, commission_pct*salary AS COMMISSION
FROM
    employees
WHERE
    commission_pct IS NOT NULL;

-- 9) �����ȣ, �̸�, �μ���ȣ, �޿�
--    10000~11000������ �޿��� �޴� ������� ��ȸ
SELECT 
    employee_id, first_name, department_id, salary
FROM
    employees
WHERE 
    salary BETWEEN 10000 AND 11000;
-- salary >= 10000 AND salary <= 11000;

-- 10)�μ���ȣ�� 30�� �̰ų� 50���� ������ �̸�, �޿�, �μ���ȣ 
SELECT
    first_name, salary, department_id
FROM 
    employees
WHERE
    NOT department_id IN (30, 50);

-- 11) �����Ͱ� �������� ��� ������ ��ҹ��ڸ� ����� �Ѵ�!
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    first_name = 'Sarah';
    
/*
-- LIKE : ���ϵ�ī��� �Բ� ���
% : 0~ ���� �� ���ڿ� 
_ : ���� �� ���� �ǹ� __
*/
-- 12) S�� �����ϴ� �̸��� ��ȸ
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    first_name LIKE 'S%'; -- '%' || subject ||'%'

-- 13) S�� �����ϰ� ���ڼ��� 5������ �̸��� ��ȸ
SELECT
    first_name, salary, department_id
FROM
    employees
WHERE
    first_name LIKE 'S____';

-- [ Exercise ] 
-- 14) �μ���ȣ�� 30, 50, 70 �μ��� ����� ��ȸ �̸�, ����, �޿�, �μ���ȣ
SELECT
    first_name, job_id, salary, department_id
FROM
    employees
WHERE
    department_id IN (30, 50, 70);
    
-- 15) �̸��� 't'�� ������ ����� �̸� �μ� ���� ��ȸ
SELECT
    first_name, department_id, job_id
FROM
    employees
WHERE
    first_name LIKE '%t';
    
-- 16) Ŀ�̼��� �׼��� 2000 �̻��� ����� �̸�, �޿�, Ŀ�̼Ǻ���, Ŀ�̼Ǿ׼� ��ȸ
SELECT
    first_name, salary, commission_pct, salary*commission_pct AS COMMISSION
FROM
    employees
WHERE
    salary*commission_pct >= 2000;
    
-- 17) ������ 'ACCOUNT'�̰ų� 'CLERK'�� ������ �̸�, ����, �μ� ��ȸ
SELECT
    first_name, job_id, department_id
FROM
    employees
WHERE
    job_id LIKE '%ACCOUNT%' OR job_id LIKE '%CLERK%';
    
-- 18) �Ի����� 07�⵵�� ������ �̸�, �μ�, �Ի��� ��ȸ, �Ի��� ������ ��������
SELECT
    first_name, department_id, hire_date
FROM
    employees
WHERE
    hire_date LIKE '07%'
ORDER BY
    hire_date;

-- ���տ�����
-- ������(UNION), ������(INTERSECT), ������(MINUS)

-- SQL : DDL(C, A, D)  DML(I, U, D, S) , DCL, TCL
-- Oject : table, view, index, sequence, user, synonym 
-- ���������� �ο��ؼ� ����� (pk, fk, uq, nn, ck, default)

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
    (1, 'ȫ�浿', '010-1111-2222', 34, '91/12/25');

commit;

