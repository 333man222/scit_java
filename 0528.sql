create table person (
	num		number		primary key,		--�Ϸù�ȣ
	name	varchar2(20) not null,			--�̸�
	age		number(3)						--����
);

--���� ���� ���̺��� �Ϸù�ȣ�� ����� ������
create sequence person_seq;

