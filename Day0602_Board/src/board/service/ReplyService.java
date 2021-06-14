package board.service;

import java.util.List;

import board.dao.ReplyDao;
import board.vo.Reply;

public class ReplyService {
	ReplyDao replyDao = new ReplyDao();
	
	public List<Reply> selectAll(int board_seq) {
		List<Reply> list = replyDao.selectAll(board_seq);
		return list;
	}

	public int insertReply(Reply temp) {
		return replyDao.insertReply(temp);
	}
}
