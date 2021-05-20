-- ������ �־ ��ȸ�ϰ� ���� �� (WHERE ���ǽ�)
-- �񱳿����� : =, !=, >, <, >=, <=
/*
SELECT �÷��� FROM ���̺��
WHERE ���ǽ�
ORDER BY �÷��� DESC;
*/

-- ���ǽ� : �޿��� 10000 �̻��� ����� �̸�, �޿�, �μ���ȣ
SELECT FIRST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY >= 10000;

-- �޿��� 10000 �̻��� ����� �̸�, �޿�, �μ���ȣ �޿����� �������� �����Ͻÿ�
SELECT FIRST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE SALARY >= 10000
ORDER BY SALARY DESC;

-- 100�� �μ��� �Ҽӵ� ������� �̸�, �μ���ȣ, �޿��� �̸������� �������� �����Ͽ� ��ȸ
SELECT FIRST_NAME, DEPARTMENT_ID, SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 100
ORDER BY FIRST_NAME;

-- 100�� �μ��� �Ҽӵ� ������� �̸�, �Ի���, �޿��� �̸������� �������� �����Ͽ� ��ȸ
SELECT FIRST_NAME, HIRE_DATE, SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 100
ORDER BY FIRST_NAME;

-- ��ü �������� ������� �̸�, �Ի���, �޿�
SELECT FIRST_NAME, HIRE_DATE, SALARY
FROM EMPLOYEES;

-- �Ի����� '07/02/07' ���Ŀ� �Ի��� ���
SELECT FIRST_NAME, HIRE_DATE, SALARY
FROM EMPLOYEES
WHERE HIRE_DATE >= '07/02/07';

-- �Ի����� '07/02/07' ���Ŀ� �Ի��� ����� ��¥�� ������������ ��ȸ
SELECT FIRST_NAME, HIRE_DATE, SALARY
FROM EMPLOYEES
WHERE HIRE_DATE >= '07/02/07'
ORDER BY HIRE_DATE;

-- �̸�, �Ի���, �޿�, �μ���ȣ �� ��ȸ, �μ��� ��������, �̸��� ��������
SELECT FIRST_NAME, HIRE_DATE, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
ORDER BY DEPARTMENT_ID ASC, FIRST_NAME ASC;

-- �̸�, �Ի���, �޿�, Ŀ�̼� ���� ��ȸ
SELECT FIRST_NAME, HIRE_DATE, SALARY, COMMISSION_PCT
FROM EMPLOYEES;

-- �̸�, �Ի���, �޿�, Ŀ�̼� ���� ��ȸ
-- Ŀ�̼� ������ ���� null�� �ִ� �����͸� �������� ����� �� : 
-- IS NULL, IS NOT NULL
SELECT FIRST_NAME, HIRE_DATE, SALARY, COMMISSION_PCT
FROM EMPLOYEES
WHERE  COMMISSION_PCT = NULL; -- (X)

-- Ŀ�̼��� �޴� �������
SELECT FIRST_NAME, HIRE_DATE, SALARY, COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;

-- Ŀ�̼��� �ȹ޴� �������
SELECT FIRST_NAME, HIRE_DATE, SALARY, COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

-- �Ŵ����� ���� ����� �̸�, ����, ������ ��ȸ
SELECT FIRST_NAME, LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;

-- '����� �̸��� Willam�Դϴ�.'
SELECT '����� �̸��� Willam�Դϴ�.' FROM DUAL;

-- ���ڿ� ���� ������ : || 
SELECT '����� �̸��� ' || FIRST_NAME || '�Դϴ�.' AS "�̸�"
FROM EMPLOYEES;




SELECT SYSDATE as ��¥, SYSTIMESTAMP as "������ �ð�" FROM DUAL;




-- ��(Literal)�� ǥ��
/*
���ڿ� : '' (""�� ���ͷ��� ������ �ʴ´�.)
���� : 24, 42.195
��¥ : '01/01/09'
*/
-- ������ Ÿ��
/*
char(ũ��) : �������̹��ڿ�
    char(10) : 'abc' -> 'abc       '
varchar2(ũ��) : �������̹��ڿ�
    varchar2(20) : 'abc'
number(3) : 999  , 1000  
number(3, 2) : 999.99
number 
date  '1919/03/01', sysdate

*/


-- SELECT �÷��� FROM ���̺��;
SELECT FIRST_NAME, LAST_NAME, SALARY FROM EMPLOYEES;

SELECT DEPARTMENT_ID FROM EMPLOYEES
ORDER BY DEPARTMENT_ID DESC;

SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES
ORDER BY DEPARTMENT_ID;

-- ���, �̸�, �μ���ȣ, �޿�, ����
SELECT EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID, SALARY, JOB_ID 
FROM EMPLOYEES;

-- ���, �̸�, �μ���ȣ, �޿�, ����, �̸� ���� ��������
SELECT EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID, SALARY, JOB_ID 
FROM EMPLOYEES
ORDER BY FIRST_NAME;

-- ���, �̸�, �μ���ȣ, �޿�, ���� �޿����� ��������
SELECT EMPLOYEE_ID, FIRST_NAME, DEPARTMENT_ID, SALARY, JOB_ID 
FROM EMPLOYEES
ORDER BY SALARY DESC;

