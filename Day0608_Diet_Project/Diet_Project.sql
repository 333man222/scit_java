-- 체크리스트 테이블 
create table checklist
(   
    check_seq NUMBER primary key,
    user_id VARCHAR2(20),
    recom_id VARCHAR2(10),
    recom_exer varchar2(50) not null,
    exer_status varchar2(10) ,
    exer_date date 

);