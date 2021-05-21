-- * HR ������ ���� �����͸� �̿��Ͽ� ���� ���� �´� ����� �����ϴ� SQL���� ����Ͻÿ�.                                

-- 1.	��� ����� �̸���, ��ȭ��ȣ ù 3�ڸ��� ����Ͻÿ�.
SELECT FIRST_NAME, LAST_NAME, (SUBSTR(PHONE_NUMBER, 1, 3)) PHONE_NUMBER FROM EMPLOYEES;

-- 2.	��� ����� �̸��� ��, �׸��� (�̸��� ���� ���� ���ڼ�)�� ����Ͻÿ�. (LENGTH �Լ��̿�)
SELECT FIRST_NAME, LAST_NAME, LENGTH(FIRST_NAME || LAST_NAME) ���ڼ� FROM EMPLOYEES;

-- 3.	��� ����� �̸��� ���� �Ӹ����ڸ� ����Ͻÿ�. (��. A.A)
SELECT SUBSTR(FIRST_NAME, 1, 1) || '.' || SUBSTR(LAST_NAME, 1, 1) FROM EMPLOYEES;

-- 4.	JOB_ID�� ù ��°�� �� ��° ���ڰ� "SA"�� ������� ��� ������ ����Ͻÿ�. (SUBSTR �Լ��̿�)
SELECT * FROM EMPLOYEES WHERE SUBSTR(JOB_ID, 1, 2) = 'SA';

-- 5.	��� ����� �̸��� ���� �빮�ڷ� ����Ͻÿ�.
SELECT UPPER(FIRST_NAME) FIRST_NAME, UPPER(LAST_NAME) LAST_NAME 
FROM EMPLOYEES;

-- 6.	��� ����� ��ȭ��ȣ�� '.' ��ȣ�� '-'�� ġȯ�Ͽ� �̸��� �Բ� ����Ͻÿ�.
SELECT FIRST_NAME, LAST_NAME, REPLACE(PHONE_NUMBER, '.', '-') 
FROM EMPLOYEES;

-- 7.	��� �޿��� 30���� ���� ���� �Ҽ��� ��° �ڸ����� �ݿø��Ͽ� ����Ͻÿ�.
SELECT ROUND(SALARY / 30, 2) FROM EMPLOYEES;

-- 8.	��� ����� �Ի��ϰ�, �Ի��� ���� 100��° �Ǵ� ���� ������ ���� �������� ����Ͻÿ�.
SELECT 
    EMPLOYEE_ID AS �����ȣ,
    HIRE_DATE AS �Ի���, 
    TO_CHAR(HIRE_DATE+100, 'YYYYMMDD') AS ������
FROM EMPLOYEES;

-- 9.	�Ի��� ���� ���ñ����� ��¥���� ������ ���� ����Ͻÿ�. �ֱ� �Ի��� ��������� ����.
 SELECT EMPLOYEE_ID �����ȣ, HIRE_DATE �Ի���, TRUNC(SYSDATE - HIRE_DATE) �ٹ��ϼ� 
 FROM EMPLOYEES 
 ORDER BY HIRE_DATE DESC;

-- 10.	�Ի��� ���� ���ñ����� �������� ������ ���� ����Ͻÿ�.
SELECT 
    EMPLOYEE_ID �����ȣ, HIRE_DATE �Ի���, TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) �ٹ������� 
FROM EMPLOYEES;

-- 11.	�Ի����� ������ ���� �������� ����Ͻÿ�.
SELECT TO_CHAR(HIRE_DATE, 'YYYY"��" MM"��" DD"��" DAY') HIRE_DATE FROM EMPLOYEES;

-- 12.	�Ի����� 3���� ��� ����� ������ ����Ͻÿ�.
SELECT * FROM EMPLOYEES WHERE TO_CHAR(HIRE_DATE, 'MM') = '03';

-- 13.	���� �ð��� ������ ���� �������� ����Ͻÿ�.
SELECT 
    TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') 
FROM DUAL;

-- 14.	����̸��� �μ����� ����ϵ�, �μ��ڵ尡 40�̸� '�λ�', 60�̸� '����', 80�̸� '����' �׿ܴ� '��Ÿ' ��� ����Ѵ�.
SELECT 
    FIRST_NAME, LAST_NAME, 
    DECODE(DEPARTMENT_ID, 40, '�λ�', 60, '����', 80, '����', '��Ÿ') �μ� 
FROM EMPLOYEES;
