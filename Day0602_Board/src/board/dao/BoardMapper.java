package board.dao;

import java.util.List;
import java.util.Map;

import board.vo.Board;

// 글등록, 글 전체 조회, 글 한 개 조회, 조회수 증가, 글 삭제, 글 검색, 글 수정
public interface BoardMapper {
	// 글 등록
	public int insertBoard(Board board);
	// 전체 글 조회
	public List<Board> selectAll();
	// 글 한 개 조회
	public Board selectOne(int board_seq);
	// 조회수 증가
	public int updateHitcount(int board_seq);
	// 글 삭제
	public int deleteBoard(int board_seq);
	// 글 수정
	public int updateBoard(Board board);
	// 글 검색 (작성자, 제목, 글내용)
	public List<Board> searchBoard(Map<String, Object> map);
}






