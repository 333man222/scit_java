
-- ������ 3�� �Է��غ���
INSERT INTO mymember
    (userid, userpwd, username, phone, birth, email, gender, address)
VALUES
    ('aaa', 'aaa', '�տ���', '010-1111-1111', '91/12/25', 'aaa@abc.net', '��', '����� ��õ��');
INSERT INTO mymember
-- ��ü�����͸� ������� ���� ������ �÷����� ������ �� �ִ�.
VALUES
    ('bbb', 'bbb', '�����', '010-1111-2222', '89/02/25', 'bbb@abc.net', '��', '����� ������');
INSERT INTO mymember
    (userid, userpwd, username, phone, email)
VALUES
    ('ccc', 'ccc', '����ġ', '010-1111-3333', 'ccc@abc.net');

SELECT * FROM mymember;

commit;
rollback;
-- ���� ( ������ �����ϴ� ���ڵ��� ���� ������ ��.. �ݵ�� WHERE���� ��� �Ѵ�)
/*
UPDATE ���̺��
SET
    �÷��� = ��, �÷��� = ��, �÷��� = ��
WHERE
    ������;
*/

UPDATE mymember SET birth = '97/12/08' WHERE userid = 'ccc';
UPDATE mymember SET address = '����� ���α�' WHERE userid = 'ccc';
commit;
--where���� �Ⱦ��� ��ü�����Ͱ� �ٲ�����

-- ���� : DELETE
/*
DELETE ���̺��
WHERE ����;
*/

DELETE mymember
WHERE USERID = 'ccc';

rollback;

COMMIT;

/* user table �����
    - userid, userpwd, username
    guestbook : bookseqno(num), userid(fk), text(1000���ڱ���), regdate(���������� sysdate) 
*/

CREATE TABLE userinfo
(
    userid VARCHAR2(20) constraint user_id_pk primary key,
    userpwd VARCHAR(20) constraint user_pwd_nn not null,
    username VARCHAR(15) constraint user_name_nn not null
);
-- �������Ǹ��� ������ ��(user)

-- user 3�� �Է�(

INSERT INTO userinfo
VALUES ('hong', '123', 'ȫ�浿');

INSERT INTO userinfo
VALUES ('jeon', '123', '����ġ');

INSERT INTO userinfo
VALUES ('soony', '123', 'ȫ���');

/*
userInfo�� �θ���ϴ� �Խ�Ʈ�� �ϳ� �� �����

INSERT INTO userinfo
VALUES ('aaa', '123', 'ȫ�浿');
*/
CREATE TABLE guestbook
(
    bookseqno NUMBER primary key,
    userid VARCHAR(20) references userinfo(userid),
    text VARCHAR(1000),
    regdate date default sysdate
);
DROP TABLE guestbook;

-- on delete cascade�� ������ ���̺�
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
    (1, 'hong', 'ȫ�浿�Դϴ�');

--�θ����̺� �������� �ʴ� PK �����͸� ������ ����    
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES 
    (2, 'hong', 'ȫ�浿�Դϴ�');

--PK�� ������ ���� ���� ����(bookseqno�� ����)
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES 
    (1, 'jeon', '����ġ�Դϴ�.');
    
--���� �غ���

DELETE userinfo WHERE username = '����ġ';
--�ڽķ��ڵ尡 �����Ƿ� ������ �� ����.(�ڽĵ����͸� ���� ����� �θ����̺��� ����� ���� ����)
--�θ����̺��� ���� ����� �ڽ����̺��� ��� ���� ���� �����ǵ��� �� �� �ִ�.
-- on delete cascade : �ڽ����̺� ���� �� on delete cascade�� �� �ָ� �θ��� ������, �ڽ� �Բ� ��������

DELETE userinfo WHERE username = 'ȫ���';
--�θ��ڵ常 ���������Ƿ� ��������

DROP TABLE userinfo;
--�ڽ����̺��� �����Ƿ� ���̺��� �ٷ� ������ �� ����(�ڽĸ��� ���� �� ���� ����)

UPDATE guestbook SET text ='ȫ�浿 �Դϴ�!' WHERE bookseqno =2;

-- �Ϸù�ȣ �߻���(sequence)�� �Բ� ������ �Է��ϱ�
CREATE SEQUENCE guestbookseq;
drop sequence guestbookseq;
select * from guestbook;

delete from guestbook;

/*
[increment by 1 start with maxvalue 10000
    1���� �����ϰ� 10000���� �߻���Ų�ٴ� �� �� ��������� ����, �˾Ƹ� �� ��
*/

INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES
    (guestbookseq.nextval, 'hong', 'ȫ�浿�Դϴ�.');
  
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES
    (guestbookseq.nextval, 'jeon', '����ġ�Դϴ�.');
    
INSERT INTO guestbook
    (bookseqno, userid, text)
VALUES
    (guestbookseq.nextval, 'soony', 'ȫ����Դϴ�.');
    
/*
userinfo �״�� ���(�θ�)
bookinfo(å ����) : isbn(pk), å�̸�, ����, ����(�θ�)
saleinfo(�Ǹ� ����) : saleseq(�Ϸù�ȣ pk), userid, isbn(�ڽ�)
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

-- 1 : �� ���� (�� �� �� ����)
-- �θ�1�� : �ڽ� ������
-- �� : �� ���� : ������ �𵨸������� ����������, �������𵨸�(���� �����)������ �������� ����

