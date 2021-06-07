CREATE TABLE USER_INFO (
    info_seq NUMBER(4) constraint user_info_seq_uq UNIQUE NOT NULL,
    user_id VARCHAR2(20) constraint user_info_user_id_pk primary key,
    user_pwd VARCHAR2(30) constraint user_info_user_pwd_nn not null,
    user_name VARCHAR2(20) constraint user_info_user_name_nn not null,
    user_birth VARCHAR2(10) constraint user_info_user_birth not null,
    user_gender CHAR(4) constraint USER_INFO_user_gender_ck CHECK (user_gender IN('��', '��')),
    user_phone VARCHAR2(30),
    user_area VARCHAR2(50),
    reg_date date default sysdate);
    COMMENT ON COLUMN USER_INFO.info_seq IS '����� ���� ���� type) unique not null';
    COMMENT ON COLUMN USER_INFO.user_id  IS '���̵� �Է� type)primary key';
    COMMENT ON COLUMN USER_INFO.user_pwd  IS '�н����� �Է�';    
    COMMENT ON COLUMN USER_INFO.user_name  IS '�̸� �Է� ��) ȫ�浿 type)not null';
    COMMENT ON COLUMN USER_INFO.user_birth  IS '������� �Է� ��)91/01/01 type)not null';
    COMMENT ON COLUMN USER_INFO.user_gender  IS '���� ��, �� �θ� �Է�';
    COMMENT ON COLUMN USER_INFO.user_phone  IS '��ȭ��ȣ ��)010-xxxx-xxxx';
    COMMENT ON COLUMN USER_INFO.user_area  IS '�ּ� �Է� ��)����� ������';
    COMMENT ON COLUMN USER_INFO.reg_date  IS '��ϳ�¥ default ���ó�¥';

CREATE SEQUENCE info_seq;
DROP SEQUENCE info_seq;
DROP TABLE USER_INFO; 

SELECT i.user_name, i.user_birth, d.body_type, r.recom_exer,  e.exer_date
FROM  user_info i, user_body d, recommend r, exercise e
where 
        i.user_id = d.user_id
AND   d.body_code = r.body_code
AND   r.recom_seq = e.recom_seq
AND i.user_birth < (SELECT i.user_birth FROM user_info where user_id = 'tssong');

--��� ���ɺ��� ���� ȸ���� �̸�, ü��Ÿ��, ����, ��õ���
SELECT i.user_name, i.user_birth, d.body_type, r.recom_exer
FROM  user_info i, user_body d, recommend r
where  i.user_id = d.user_id
AND   d.body_code = r.body_code
AND user_birth > (select avg(user_birth) from user_info);

select i.user_name, i.user_gender, b.body_type, b.body_code, r.age_group, r.recom_exer
from user_info i, user_body b, recommend r
where i.user_id = b.user_id
and	b.body_code = r. body_code
and kcal > (select avg(kcal) from recommend);
select * from user_body where height >= 170 order by weight desc;

select i.user_name, d.height, d.weight
from user_info i ,user_body d
where i.user_id = d.user_id
AND body_code like 'a%';

select i.user_name, i.user_gender, b.weight, b.body_bmi, e.recom_seq
from user_info i, user_body b, exercise e
where i.user_id = b.user_id
and b.body_code = e.body_code;


select user_id, user_name
from user_info
where user_birth > (select user_birth from user_info where user_id='tssong');

select i.user_name, d.height, d.weight
from user_info i ,user_body d
where i.user_id = d.user_id
AND body_code like 'a%';
select i.user_name, i.user_gender, b.weight, b.body_bmi, r.recom_exer
from user_info i, user_body b, recommend r
where i.user_id = b.user_id
and b.body_code = r.body_code;



INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'bkkang', 'aaa', '����ȣ', 25, '��', '010-0000-0000', '����� ������');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'tssong','aaa', '���¼�', 28, '��', '010-1111-0000', '����� ���۱�');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'yplee', 'aaa', '�̿���', 37, '��', '010-2222-0000', '����� ������');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'sychae', 'aaa', 'ä�ҿ�', 30, '��', '010-3333-0000', '����� ���ı�');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'hsahn', 'aaa', '���Ѽ�', 53, '��', '010-4444-0000', '��⵵ ������');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'oban', 'aaa', '�տ���', 57, '��', '010-5555-0000', '��⵵ �д��');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'piccolo', 'aaa', '���ݷ�', 63, '��', '010-6666-0000', '����� ������');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'gil-sun', 'aaa', 'ȫ���', 38, '��', '010-7777-0000', '��⵵ �д��');


INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'gil-ja', 'aaa', 'ȫ����', 56, '��', '010-8888-0000', '��⵵ �ϻ��');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'gildong', 'aaa', 'ȫ�浿', 61, '��', '010-9999-0000', '����� ��õ��');

select * from user_info;

commit;



CREATE TABLE USER_BODY (
    body_code VARCHAR(20) constraint user_body_body_code_pk primary key,
    user_id VARCHAR2(20) references user_info(user_id) on delete cascade,
    height NUMBER constraint user_body_height_nn not null,
    weight NUMBER constraint user_body_weight_nn not null,
    body_bmi NUMBER(5) constraint user_body_body_bmi_nn not null,
    body_type VARCHAR2(50) constraint body_type_nn not null);
   
    COMMENT ON COLUMN USER_BODY.body_code IS '�ʰ���a, ����b, ��ü��c, ����d, ��ü��e ���� 4�ڸ� �Է�(0000���� ����) ��)a0000,a0001';
    COMMENT ON COLUMN USER_BODY.user_id IS '���̵� �Է�';  
    COMMENT ON COLUMN USER_BODY.height IS 'Ű ���ڸ� �Է�!';  
    COMMENT ON COLUMN USER_BODY.weight IS '������ ���ڸ� �Է�!';  
    COMMENT ON COLUMN USER_BODY.body_bmi IS 'bmi ���� �Է�';  
    COMMENT ON COLUMN USER_BODY.body_type IS 'bmi�� ���� ü�� Ÿ�� (��ü��, ����, ����, ��ü��)';      

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('a0000', 'yplee', 162, 95, 36.2, '�ʰ���');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('a0001', 'gil-ja', 161, 85, 32.79, '�ʰ���');


insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('b0000', 'hsahn', 177, 88, 28.09, '����');    

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('b0001', 'gil-sun', 160, 71, 27.39, '����');    

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('c0000', 'bkkang', 189, 83, 23.24,'��ü��');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('c0001', 'piccolo', 185, 85, 24.84,'��ü��');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('d0000', 'oban', 167, 58, 20.8, '����');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('d0001', 'tssong', 168, 59,20.9, '����');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('e0000', 'sychae', 156, 43, 17.67, '��ü��');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('e0001', 'gildong', 176, 56, 18.08, '��ü��');

select * FROM user_body;
    
    
DROP TABLE user_body;    
DROP TABLE recommend;    
 
CREATE TABLE recommend (
    recom_seq NUMBER constraint recommend_recom_seq_pk primary key,
    body_code VARCHAR2(20) references user_body(body_code) on delete cascade,
    age_group VARCHAR2(20)constraint recommend_age_group not null,
    recom_exer VARCHAR2(50) constraint recommend_exer_nn not null,
    kcal NUMBER constraint recommend_kcal not null
    );
    
    COMMENT ON COLUMN recommend.body_code IS 'id�Է�_bmi�� ���� ü�� (�ʰ���a, ����b, ��ü��c, ����d, ��ü��e)';      
    COMMENT ON COLUMN recommend.age_group IS '������ ��� "û����(~50��), �������(50��~)"';
    COMMENT ON COLUMN recommend.recom_exer IS '���� / bmi�� ���� ��õ���';
    COMMENT ON COLUMN recommend.kcal IS '� ���� �Ҹ� Į�θ�(10��)';

CREATE SEQUENCE recom_seq;
DROP SEQUENCE recom_seq;

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval,'a0000','û����', '�����Ż���', 85);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval,'a0001','�������', '�����ȱ�', 60);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'b0000', 'û����', '�ٳѱ�', 140);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'b0001','�������', '����', 110);

insert into recommend
(recom_seq,body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'c0000', 'û����', '�����ٱ�', 140);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'c0001', '�������', '��ܿ���������', 80);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'd0000', 'û����', '�ȱ������', 45);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'd0001', '�������', '���', 84);
 
insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'e0000', 'û����', '��������Ű��', 80);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'e0001', '�������', '��Ʈ��Īü��', 70);

select * from recommend;
 
DROP TABLE EXERCISE;   

CREATE TABLE exercise (
    exer_seq NUMBER constraint exer_seq_pk primary key,
    body_code VARCHAR2(20) references user_body(body_code) on delete cascade,
    recom_seq NUMBER references recommend(recom_seq) on delete cascade,
    exer_time NUMBER(5),
    exer_date date default sysdate
       ); 
    COMMENT ON COLUMN exercise.uid_body_type IS 'id�Է�_bmi�� ���� ü��(��ü��, ����, ����, ��ü��) ��)id_��ü��';      
    COMMENT ON COLUMN exercise.recom_exer IS '���� / bmi�� ���� ��õ�';
    COMMENT ON COLUMN exercise.exer_time IS '� �ð� ���(�� ����)';
    COMMENT ON COLUMN exercise.exer_date IS '� ��¥(�� ��Ͻ� ���� ��¥ ���)';
    COMMENT ON COLUMN exercise.total_kcal IS '�� �Ҹ� Į�θ�';

CREATE SEQUENCE exer_seq;
DROP SEQUENCE exer_seq;    





INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'a0000', 1,40);
INSERT INTO exercise
    (exer_seq, body_code,  recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'a0001', 2, 20);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'b0000', 3, 50);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'b0001', 4, 30);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'c0000', 5, 60);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'c0001', 6, 30);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'd0000', 7, 50);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'd0001', 8, 30);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'e0000', 9, 30);
INSERT INTO exercise
    (exer_seq, body_code, recom_seq, exer_time)
VALUES
    (exer_seq.nextval, 'e0001', 10, 40);
    
select * from exercise;

commit;