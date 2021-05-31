
drop table guestbook;
drop TABLE USERINFO;

CREATE TABLE USERINFO
(
	userid varchar2(20) primary key,
	userpwd varchar2(20) not null,
	username varchar2(20) not null,
	phone varchar2(20),
	birth date
);

alter table userinfo
add
	birth date;
    
select * from userinfo;