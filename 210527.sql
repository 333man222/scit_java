--자체조인(self join)
--이름, 매니저명
SELECT
    e1.first_name, e2.first_name
FROM
    employees e1, employees e2
WHERE
    e1.manager_id = e2.employee_id
ORDER BY e1.employee_id;

--데이터 모델링 (개념적 모델링, 논리적 모델링) (정규화 ->join-> 역정규화) 물리적 모델링
--Application(java 프로그램)과 연결
--JDBC, Framework사용(Mybatis)
--연결할 수 있는 파일 사용