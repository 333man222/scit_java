DROP TABLE reply;
DROP TABLE board;
DROP SEQUENCE boardseq;
DROP SEQUENCE replyseq;

-- 게시판
CREATE TABLE board
(
	board_seq number    constraint board_boardseq_pk primary key,
	writer varchar2(50) constraint board_writer_nn   not null,
	title  varchar2(200) constraint board_title_nn   not null,
	textcontent varchar2(2000) constraint board_content_nn   not null,
	hitcount number default 0,
	regdate date default sysdate
);

-- 시퀀스 
CREATE SEQUENCE boardseq;

-- 게시글 저장 예
INSERT INTO board 
(board_seq, writer, title, textcontent)
VALUES
(boardseq.nextval, '홍길동', '글제목', '게시글내용입니다.');

-- 댓글
CREATE TABLE reply
(
	reply_seq number  primary key,
	board_seq number  references board(board_seq) on delete cascade,
	writer varchar2(50)  not null,
	text varchar2(1000)  not null,
	regdate date default sysdate
);

-- 댓글용 시퀀스 객체
CREATE SEQUENCE replyseq;

-- 댓글 예
INSERT INTO reply
(reply_seq, board_seq, writer, text)
VALUES
(replyseq.nextval, 1, '손오공', '나는 댓글을 씁니다.');



