CREATE TABLE USER_INFO (
    info_seq NUMBER(4) constraint user_info_seq_uq UNIQUE NOT NULL,
    user_id VARCHAR2(20) constraint user_info_user_id_pk primary key,
    user_pwd VARCHAR2(30) constraint user_info_user_pwd_nn not null,
    user_name VARCHAR2(20) constraint user_info_user_name_nn not null,
    user_birth VARCHAR2(10) constraint user_info_user_birth not null,
    user_gender CHAR(4) constraint USER_INFO_user_gender_ck CHECK (user_gender IN('남', '여')),
    user_phone VARCHAR2(30),
    user_area VARCHAR2(50),
    reg_date date default sysdate);
    COMMENT ON COLUMN USER_INFO.info_seq IS '사용자 정보 순서 type) unique not null';
    COMMENT ON COLUMN USER_INFO.user_id  IS '아이디 입력 type)primary key';
    COMMENT ON COLUMN USER_INFO.user_pwd  IS '패스워드 입력';    
    COMMENT ON COLUMN USER_INFO.user_name  IS '이름 입력 예) 홍길동 type)not null';
    COMMENT ON COLUMN USER_INFO.user_birth  IS '생년월일 입력 예)91/01/01 type)not null';
    COMMENT ON COLUMN USER_INFO.user_gender  IS '성별 남, 여 로만 입력';
    COMMENT ON COLUMN USER_INFO.user_phone  IS '전화번호 예)010-xxxx-xxxx';
    COMMENT ON COLUMN USER_INFO.user_area  IS '주소 입력 예)서울시 강남구';
    COMMENT ON COLUMN USER_INFO.reg_date  IS '등록날짜 default 오늘날짜';

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

--평균 연령보다 높은 회원의 이름, 체형타입, 연령, 추천운동명
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
(INFO_SEQ.nextval, 'bkkang', 'aaa', '강백호', 25, '남', '010-0000-0000', '서울시 강남구');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'tssong','aaa', '송태섭', 28, '남', '010-1111-0000', '서울시 동작구');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'yplee', 'aaa', '이용팔', 37, '남', '010-2222-0000', '서울시 강남구');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'sychae', 'aaa', '채소연', 30, '여', '010-3333-0000', '서울시 송파구');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'hsahn', 'aaa', '안한수', 53, '남', '010-4444-0000', '경기도 수원시');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'oban', 'aaa', '손오반', 57, '남', '010-5555-0000', '경기도 분당시');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'piccolo', 'aaa', '피콜로', 63, '남', '010-6666-0000', '서울시 강서구');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'gil-sun', 'aaa', '홍길순', 38, '여', '010-7777-0000', '경기도 분당시');


INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'gil-ja', 'aaa', '홍길자', 56, '여', '010-8888-0000', '경기도 일산시');

INSERT INTO user_info
(INFO_SEQ, user_id, user_pwd, user_name, user_birth, user_gender, user_phone, user_area)
VALUES
(INFO_SEQ.nextval, 'gildong', 'aaa', '홍길동', 61, '남', '010-9999-0000', '서울시 양천구');

select * from user_info;

commit;



CREATE TABLE USER_BODY (
    body_code VARCHAR(20) constraint user_body_body_code_pk primary key,
    user_id VARCHAR2(20) references user_info(user_id) on delete cascade,
    height NUMBER constraint user_body_height_nn not null,
    weight NUMBER constraint user_body_weight_nn not null,
    body_bmi NUMBER(5) constraint user_body_body_bmi_nn not null,
    body_type VARCHAR2(50) constraint body_type_nn not null);
   
    COMMENT ON COLUMN USER_BODY.body_code IS '초고도비만a, 고도비만b, 과체중c, 정상d, 저체중e 숫자 4자리 입력(0000부터 시작) 예)a0000,a0001';
    COMMENT ON COLUMN USER_BODY.user_id IS '아이디 입력';  
    COMMENT ON COLUMN USER_BODY.height IS '키 숫자만 입력!';  
    COMMENT ON COLUMN USER_BODY.weight IS '몸무게 숫자만 입력!';  
    COMMENT ON COLUMN USER_BODY.body_bmi IS 'bmi 지수 입력';  
    COMMENT ON COLUMN USER_BODY.body_type IS 'bmi에 따른 체형 타입 (과체중, 고도비만, 정상, 저체중)';      

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('a0000', 'yplee', 162, 95, 36.2, '초고도비만');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('a0001', 'gil-ja', 161, 85, 32.79, '초고도비만');


insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('b0000', 'hsahn', 177, 88, 28.09, '고도비만');    

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('b0001', 'gil-sun', 160, 71, 27.39, '고도비만');    

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('c0000', 'bkkang', 189, 83, 23.24,'과체중');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('c0001', 'piccolo', 185, 85, 24.84,'과체중');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('d0000', 'oban', 167, 58, 20.8, '정상');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('d0001', 'tssong', 168, 59,20.9, '정상');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('e0000', 'sychae', 156, 43, 17.67, '저체중');

insert into user_body
(body_code, user_id, height, weight, body_bmi, body_type)
values
('e0001', 'gildong', 176, 56, 18.08, '저체중');

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
    
    COMMENT ON COLUMN recommend.body_code IS 'id입력_bmi에 따른 체형 (초고도비만a, 고도비만b, 과체중c, 정상d, 저체중e)';      
    COMMENT ON COLUMN recommend.age_group IS '연령층 기록 "청년층(~50세), 중장년층(50세~)"';
    COMMENT ON COLUMN recommend.recom_exer IS '연령 / bmi에 따른 추천운동명';
    COMMENT ON COLUMN recommend.kcal IS '운동 예상 소모 칼로리(10분)';

CREATE SEQUENCE recom_seq;
DROP SEQUENCE recom_seq;

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval,'a0000','청년층', '자전거빨리', 85);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval,'a0001','중장년층', '빨리걷기', 60);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'b0000', '청년층', '줄넘기', 140);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'b0001','중장년층', '조깅', 110);

insert into recommend
(recom_seq,body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'c0000', '청년층', '빨리뛰기', 140);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'c0001', '중장년층', '계단오르내리기', 80);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'd0000', '청년층', '팔굽혀펴기', 45);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'd0001', '중장년층', '등산', 84);
 
insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'e0000', '청년층', '윗몸일으키기', 80);

insert into recommend
(recom_seq, body_code, age_group, recom_exer, kcal)
values
(recom_seq.nextval, 'e0001', '중장년층', '스트레칭체조', 70);

select * from recommend;
 
DROP TABLE EXERCISE;   

CREATE TABLE exercise (
    exer_seq NUMBER constraint exer_seq_pk primary key,
    body_code VARCHAR2(20) references user_body(body_code) on delete cascade,
    recom_seq NUMBER references recommend(recom_seq) on delete cascade,
    exer_time NUMBER(5),
    exer_date date default sysdate
       ); 
    COMMENT ON COLUMN exercise.uid_body_type IS 'id입력_bmi에 따른 체형(과체중, 고도비만, 정상, 저체중) 예)id_과체중';      
    COMMENT ON COLUMN exercise.recom_exer IS '연령 / bmi에 따른 추천운동';
    COMMENT ON COLUMN exercise.exer_time IS '운동 시간 기록(분 단위)';
    COMMENT ON COLUMN exercise.exer_date IS '운동 날짜(미 기록시 오늘 날짜 등록)';
    COMMENT ON COLUMN exercise.total_kcal IS '총 소모 칼로리';

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