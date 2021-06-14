DROP TABLE reply;
DROP TABLE board;
DROP SEQUENCE boardseq;
DROP SEQUENCE replyseq;

-- �Խ���
CREATE TABLE board
(
	board_seq number    constraint board_boardseq_pk primary key,
	writer varchar2(50) constraint board_writer_nn   not null,
	title  varchar2(200) constraint board_title_nn   not null,
	textcontent varchar2(2000) constraint board_content_nn   not null,
	hitcount number default 0,
	regdate date default sysdate
);

-- ������ 
CREATE SEQUENCE boardseq;

-- �Խñ� ���� ��
INSERT INTO board 
(board_seq, writer, title, textcontent)
VALUES
(boardseq.nextval, 'ȫ�浿', '������', '�Խñ۳����Դϴ�.');

-- ���
CREATE TABLE reply
(
	reply_seq number  primary key,
	board_seq number  references board(board_seq) on delete cascade,
	writer varchar2(50)  not null,
	text varchar2(1000)  not null,
	regdate date default sysdate
);

-- ��ۿ� ������ ��ü
CREATE SEQUENCE replyseq;

-- ��� ��
INSERT INTO reply
(reply_seq, board_seq, writer, text)
VALUES
(replyseq.nextval, 1, '�տ���', '���� ����� ���ϴ�.');



