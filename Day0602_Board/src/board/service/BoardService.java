package board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.dao.BoardDao;
import board.vo.Board;

public class BoardService {
	BoardDao boardDao = new BoardDao();
	
	public int insertBoard(Board board) {
		int result = boardDao.insertBoard(board);
		return result;
	}

	public List<Board> selectAll() {
		return boardDao.selectAll();
	}

	public Board selectOne(int board_seq) {
		return boardDao.selectOne(board_seq);
	}

	public int deleteBoard(int board_seq) {
		return boardDao.deleteBoard(board_seq);
	}

	public List<Board> searchBoard(String searchItem, String searchWord) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("searchItem", searchItem);
		map.put("searchWord", searchWord);
		
		List<Board> list = boardDao.searchBoard(map);
		return list;
	}
}





