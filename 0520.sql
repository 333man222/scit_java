
-- 데이터 3개 입력해보기
INSERT INTO mymember
    (userid, userpwd, username, phone, birth, email, gender, address)
VALUES
    ('aaa', 'aaa', '손오공', '010-1111-1111', '91/12/25', 'aaa@abc.net', '남', '서울시 양천구');
INSERT INTO mymember
-- 전체데이터를 순서대로 넣을 때에는 컬럼명을 생략할 수 있다.
VALUES
    ('bbb', 'bbb', '사오정', '010-1111-2222', '89/02/25', 'bbb@abc.net', '남', '서울시 강서구');
INSERT INTO mymember
    (userid, userpwd, username, phone, email)
VALUES
    ('ccc', 'ccc', '아피치', '010-1111-3333', 'ccc@abc.net');

SELECT * FROM mymember;

commit;
rollback;
-- 수정 ( 기존에 존재하는 레코드의 값을 수정할 때.. 반드시 WHERE절을 써야 한다)
/*
UPDATE 테이블명
SET
    컬럼명 = 값, 컬럼명 = 값, 컬럼명 = 값
WHERE
    조건절;
*/

UPDATE mymember SET birth = '97/12/08' WHERE userid = 'ccc';
UPDATE mymember SET address = '서울시 종로구' WHERE userid = 'ccc';
commit;
--where문을 안쓰면 전체데이터가 바뀌어버림

-- 삭제 : DELETE
/*
DELETE 테이블명
WHERE 조건;
*/

DELETE mymember
WHERE USERID = 'ccc';

rollback;

COMMIT;

/* user table 만들기
    - userid, userpwd, username
    guestbook : bookseqno(num), userid(fk), text(1000글자까지), regdate(생략했으면 sysdate) 
*/

CREATE TABLE userinfo
(
    userid VARCHAR2(20) constraint user_id_pk primary key,
    userpwd VARCHAR(20) constraint user_pwd_nn not null,
    username VARCHAR(15) constraint user_name_nn not null
);
-- 제약조건명은 유일한 값(user)

-- user 3명 입력(

INSERT INTO userinfo
VALUES ('hong', '123', '홍길동');

INSERT INTO userinfo
VALUES ('jeon', '123', '전우치');

INSERT INTO userinfo
VALUES ('soony', '123', '홍길순');

/*
userInfo를 부모로하는 게스트를 하나 더 만들기

INSERT INTO userinfo
VALUES ('aaa', '123', '홍길동');
*/
CREATE TABLE guestbook
(
    bookseqno NUMBER primary key,
    userid VARCHAR(20) references userinfo(userid),
    text VARCHAR(1000),
    regdate date default sysdate
);
DROP TABLE guestbook;

-- on delete cascade를 설정한 테이블
CREATE TABLE guestbook
(
    bookseqno NUMBER primary key,
    userid VARCHAR(20) references userinfo(userid)on delete cascade,
    text VARCHAR(1000),
    regdate date default sysdate
);

INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES 
    (1, 'hong', '홍길동입니다');

--부모테이블에 존재하지 않는 PK 데이터를 넣으면 에러    
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES 
    (2, 'hong', '홍길동입니다');

--PK가 동일한 값이 들어가면 오류(bookseqno가 같음)
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES 
    (1, 'jeon', '전우치입니다.');
    
--삭제 해보기

DELETE userinfo WHERE username = '전우치';
--자식레코드가 있으므로 삭제할 수 없다.(자식데이터를 먼저 지우고 부모테이블을 지우는 것은 가능)
--부모테이블의 글을 지우면 자식테이블의 모든 글이 전부 삭제되도록 할 수 있다.
-- on delete cascade : 자식테이블 생성 시 on delete cascade를 써 주면 부모쪽 삭제시, 자식 함께 삭제가능

DELETE userinfo WHERE username = '홍길순';
--부모레코드만 존재했으므로 삭제가능

DROP TABLE userinfo;
--자식테이블이 있으므로 테이블을 바로 삭제할 수 없다(자식먼저 지운 후 삭제 가능)

UPDATE guestbook SET text ='홍길동 입니다!' WHERE bookseqno =2;

-- 일련번호 발생기(sequence)와 함께 데이터 입력하기
CREATE SEQUENCE guestbookseq;
drop sequence guestbookseq;
select * from guestbook;

delete from guestbook;

/*
[increment by 1 start with maxvalue 10000
    1부터 시작하고 10000까지 발생시킨다는 것 잘 사용하지는 않음, 알아만 둘 것
*/

INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES
    (guestbookseq.nextval, 'hong', '홍길동입니다.');
  
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES
    (guestbookseq.nextval, 'jeon', '전우치입니다.');
    
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES
    (guestbookseq.nextval, 'soony', '홍길순입니다.');
    
/*
userinfo 그대로 사용(부모)
bookinfo(책 정보) : isbn(pk), 책이름, 저자, 가격(부모)
saleinfo(판매 정보) : saleseq(일련번호 pk), userid, isbn(자식)
*/

ALTER TABLE userinfo add price NUMBER(15) constraint book_price_nn null;

ALTER TABLE userinfo DROP COLUMN price;

SELECT * FROM USERINFO;

CREATE TABLE userinfo
(
    userid VARCHAR2(20) constraint user_id_pk primary key,
    userpwd VARCHAR(20) constraint user_pwd_nn not null,
    username VARCHAR(15) constraint user_name_nn not null
);

CREATE TABLE bookinfo
(
    isbn VARCHAR2(20) primary key,
    booktitle VARCHAR2(40) not null,
    writer VARCHAR2(30) not null,
    price number(10) not null
);

CREATE TABLE saleinfo
(
    saleseq NUMBER PRIMARY KEY,
    isbn VARCHAR2(20) references bookinfo(isbn) on delete cascade,
    userid VARCHAR2(20) references userinfo(userid) on delete cascade
);
DROP TABLE saleinfo;

CREATE SEQUENCE saleinfoseq;

-- 1 : 다 관계 (일 대 다 관계)
-- 부모1개 : 자식 여러개
-- 다 : 다 관계 : 개념적 모델링에서는 존재하지만, 물리적모델링(실제 설계시)에서는 존재하지 않음

