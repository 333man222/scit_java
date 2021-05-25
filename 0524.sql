/*

1) �����Լ�
�����Լ�   : round(), ceil(), floor(),...
���ڿ��Լ� : lower(), upper(), length(), substr()
��¥�Լ�   : +, add_month(), months_between()
��ȯ�Լ�   : to_char(), to_date(), nvl(�÷�, ��)
           decode(�÷�, ��, �۾�, ��, �۾�, ��, �۾�, �۾�)
           
2) �׷��Լ� : Ư�� row�� �������� �׷�ȭ ���Ѽ� �����ϴ� �Լ� (~��)
   - select ��, group by
   - ����! : where ==> ������ row�� ������ �ٶ� ����ϴ� ����
                  ==> �׷�ȭ�� �����Ϳ� ������ �� ���� where�� ��� ����. ��� having�̶�� ��ɹ� ���
   - count(�÷���), sum(), avg(), max(), min(), stdenv(), variance()
*/

SELECT FIRST_NAME, SALARY, COMMISSION_PCT, nvl(COMMISSION_PCT, 0) Ŀ�̼Ǿ׼�
FROM EMPLOYEES; -- nvl�� ����ϸ� null���� �ȳ����� ����(���ڸ� �����Է�, ���ڸ� ���ڿ��Է�)

-- ��ü ������ �ο���
SELECT COUNT(*) FROM EMPLOYEES;

-- Ư�� �÷����� �����ϸ� NULL�� ������ �������� ���ڸ� ����.
SELECT COUNT(COMMISSION_PCT) FROM EMPLOYEES;

-- 'Steven King' �� MANAGER�� �����Ƿ� 
SELECT COUNT(MANAGER_ID) FROM EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, MANAGER_ID FROM EMPLOYEES;

SELECT ROUND(AVG(SALARY),2) AS ��տ���, SUM(SALARY) AS �����հ� 
FROM EMPLOYEES;

SELECT ROUND(AVG(COMMISSION_PCT),3) Ŀ�̼���� FROM EMPLOYEES;

SELECT MIN(SALARY), MAX(SALARY) FROM EMPLOYEES;

SELECT DISTINCT DEPARTMENT_ID FROM EMPLOYEES ORDER BY 1;

-- �μ��� �޿� ���
SELECT
    FIRST_NAME, ROUND(AVG(SALARY),2)
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
ORDER BY 1;

-- ���޺� �޿� �Ѿ�
SELECT JOB_ID, SUM(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID
ORDER BY SUM(SALARY) DESC;

-- �μ��� �޿� ��� (�޿� ����� 8000�� �ʰ��ϴ� �μ���)
-- WHERE ���� ���� ROW �� ������ �ɰ��� �� �� ���
-- HAVING�̶�� ���� ���

SELECT
    DEPARTMENT_ID, ROUND(AVG(SALARY),2) AS �޿����
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING
    AVG(SALARY) >8000
ORDER BY
    1;

-- 1. 80�� �μ��� �޿����, �ְ�, ����, �ο��� ��ȸ
SELECT
    DEPARTMENT_ID, ROUND(AVG(SALARY),1)AS �޿����, MAX(SALARY), MIN(SALARY), COUNT(*)
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING
    DEPARTMENT_ID = 80;
    
-- 2. �� �μ��� �޿��� ���, �ְ�, ����, �ο����� ��ȸ
SELECT 
    DEPARTMENT_ID, ROUND(AVG(SALARY), 2) �޿����, MAX(SALARY) �޿��ְ��, MIN(SALARY) �޿��ּҾ�, COUNT(*)
FROM 
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
ORDER BY 1;    

-- 3. �� �μ��� �޿��� ���, �ְ�, ����, �ο����� ��ȸ�ϵ� �μ���ȣ�� NULL�� �����ʹ� ��µ��� �ʵ��� ������ �ο�
SELECT 
    DEPARTMENT_ID, ROUND(AVG(SALARY), 2) �޿����, MAX(SALARY) �޿��ְ��, MIN(SALARY) �޿��ּҾ�, COUNT(*)
FROM 
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID
HAVING DEPARTMENT_ID IS NOT NULL
ORDER BY 1;  

-- 4. �� �μ��� ���� ������ �ϴ� ����� �ο����� ���Ͽ� �μ���ȣ, ������, �ο��� ��ȸ   
SELECT
    DEPARTMENT_ID, JOB_ID, COUNT(*)
FROM
    EMPLOYEES
GROUP BY
    DEPARTMENT_ID, JOB_ID
ORDER BY 1;


-- 5. ���� ������ �ϴ� ����� ���� 4�� �̻��� ������ �ο��� ��ȸ
SELECT JOB_ID, COUNT(JOB_ID)
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING COUNT(JOB_ID) >= 4
ORDER BY 1;

-- 6. ������� �Ի翬���� �������� �μ��� ����� �Ի��ߴ��� ���
SELECT
    DEPARTMENT_ID, SUBSTR(TO_CHAR(HIRE_DATE),1,2),COUNT(*)
FROM
    EMPLOYEES
GROUP BY
    SUBSTR(TO_CHAR(HIRE_DATE),1,2), DEPARTMENT_ID
ORDER BY 2;

-- 7. Ŀ�̼��� �޴� ����� ���� �ʴ� ����� �ο����� ���
SELECT
    SUM(COUNT(COMMISSION_PCT)) Ŀ�̼ǹ޴»����
FROM
    EMPLOYEES
GROUP BY
    COMMISSION_PCT
HAVING
    COMMISSION_PCT IS NOT NULL;    


SELECT 
    'o' ���ɿ���, SUM(COUNT(COMMISSION_PCT)) Ŀ�̼Ǽ����ڼ�
FROM EMPLOYEES
GROUP BY COMMISSION_PCT
HAVING COMMISSION_PCT IS NOT NULL;

-- 8. �� �μ��� �Ի� ������ �����, �ְ�޿�, �޿���, ��ձ޿�

SELECT
    SUBSTR(TO_CHAR(HIRE_DATE),1,2)AS �Ի翬��, COUNT(*) AS �����������, MAX(SALARY), SUM(SALARY), ROUND(AVG(SALARY),1) �޿����
FROM
    EMPLOYEES
GROUP BY
    SUBSTR(TO_CHAR(HIRE_DATE),1,2)
ORDER BY 1;