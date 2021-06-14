package board.dao;

import java.util.List;
import java.util.Map;

import board.vo.Board;

// �۵��, �� ��ü ��ȸ, �� �� �� ��ȸ, ��ȸ�� ����, �� ����, �� �˻�, �� ����
public interface BoardMapper {
	// �� ���
	public int insertBoard(Board board);
	// ��ü �� ��ȸ
	public List<Board> selectAll();
	// �� �� �� ��ȸ
	public Board selectOne(int board_seq);
	// ��ȸ�� ����
	public int updateHitcount(int board_seq);
	// �� ����
	public int deleteBoard(int board_seq);
	// �� ����
	public int updateBoard(Board board);
	// �� �˻� (�ۼ���, ����, �۳���)
	public List<Board> searchBoard(Map<String, Object> map);
}






