package board.dao;

import java.util.List;
import board.vo.Reply;

public interface ReplyMapper {
	// 댓글 전체 목록 ==> 특정 게시글에 대한 댓글 전체 목록을 의미
	public List<Reply> listReply(int board_seq);
	// 댓글 저장
	public int insertReply(Reply reply);
}
