package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.Reply;

public class ReplyDao {
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public List<Reply> selectAll(int board_seq) {
		SqlSession session = factory.openSession();
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		
		List<Reply> list = mapper.listReply(board_seq);
		return list;
	}

	public int insertReply(Reply temp) {
		SqlSession session = factory.openSession();
		ReplyMapper mapper = session.getMapper(ReplyMapper.class);
		
		int result = mapper.insertReply(temp);
		session.commit();
		
		return result;
	}
}






