package board.dao;

import java.util.List;
import board.vo.Reply;

public interface ReplyMapper {
	// ��� ��ü ��� ==> Ư�� �Խñۿ� ���� ��� ��ü ����� �ǹ�
	public List<Reply> listReply(int board_seq);
	// ��� ����
	public int insertReply(Reply reply);
}
