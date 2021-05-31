CREATE TABLE USER_INFO (
    info_seq NUMBER,
    user_id VARCHAR2(20) constraint user_info_id_pk primary key,
    user_name VARCHAR2(20) constraint user_info_name_nn not null,
    user_age CHAR(6) constraint user_info_age_nn not null,
    user_gender CHAR(2) CONSTRAINT USER_INFO_user_gender_ck CHECK (user_gender IN('³²', '¿©')),
    user_phone VARCHAR2(20),
    user_area VARCHAR2(50),
    reg_date date default sysdate);
CREATE SEQUENCE info_seq;
CREATE TABLE USER_BODY (
    user_id VARCHAR2(20) references user_info(user_id) on delete cascade,
    height NUMBER not null,
    weight NUMBER not null,
    body_bmi NUMBER not null,
    body_type VARCHAR2(20) CONSTRAINT body_type_pk primary key);
    
CREATE TABLE menu (
    menu_seq NUMBER primary key,
    menu_name VARCHAR2(50) NOT NULL,
    menu_kal NUMBER,
    menu_type VARCHAR2(20),
    body_type VARCHAR2(20) references user_body(body_type) on delete cascade);
CREATE SEQUENCE menu_seq;

DROP TABLE user_info;