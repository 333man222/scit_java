--��ü����(self join)
--�̸�, �Ŵ�����
SELECT
    e1.first_name, e2.first_name
FROM
    employees e1, employees e2
WHERE
    e1.manager_id = e2.employee_id
ORDER BY e1.employee_id;

--������ �𵨸� (������ �𵨸�, ���� �𵨸�) (����ȭ ->join-> ������ȭ) ������ �𵨸�
--Application(java ���α׷�)�� ����
--JDBC, Framework���(Mybatis)
--������ �� �ִ� ���� ���