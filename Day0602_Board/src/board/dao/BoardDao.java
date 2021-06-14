package board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import board.vo.Board;

public class BoardDao {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public int insertBoard(Board board) {
		SqlSession session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		int result = mapper.insertBoard(board);
		session.commit();
		
		return result;
	}

	public List<Board> selectAll() {
		SqlSession session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		List<Board> list = mapper.selectAll();
		
		return list;
	}

	public Board selectOne(int board_seq) {
		SqlSession session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		Board board = mapper.selectOne(board_seq);
		mapper.updateHitcount(board_seq); // ��ȸ�� �ø��� ������ �ѹ� �� ȣ�� // update 
		
		session.commit(); // update�� �����Ƿ� �ݵ�� commit�� �ؾ���!
		
		return board;
	}

	public int deleteBoard(int board_seq) {
		SqlSession session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		int result = mapper.deleteBoard(board_seq);
		session.commit();
		return result;
	}

	public List<Board> searchBoard(Map<String, Object> map) {
		SqlSession session = factory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		List<Board> list = mapper.searchBoard(map);
		
		return list;
	}
}





