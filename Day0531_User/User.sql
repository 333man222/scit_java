DROP TABLE USERINFO;

CREATE TABLE USERINFO
(
	userid varchar2(20) primary key,
	userpwd varchar2(20) not null,
	username varchar2(15) not null,
	phone varchar2(20),
	birth date
);

insert into
values
('test01', 'test01', '¼Õ¿À°ø', '010-1111-2222', '91/01/01');

select * from userinfo;




