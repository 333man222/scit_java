package diet.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import diet.vo.Body;
import diet.dao.MybatisConfig;
import diet.dao.BodyMapper;


public class BodyDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public int insertBody(Body body) {
		SqlSession session = factory.openSession(); //get a session from factory
		BodyMapper mapper = session.getMapper(BodyMapper.class); //get an interface
		int result = mapper.insertBody(body);
		session.commit();
		return result;
	}

	public Body selectBody(String userid) {
		SqlSession session = factory.openSession();
		BodyMapper mapper = session.getMapper(BodyMapper.class);
		
		Body body = mapper.selectBody(userid);
		return body;
	}
	
	public int deleteBody(String userid) {
		SqlSession session = factory.openSession();
		BodyMapper mapper = session.getMapper(BodyMapper.class);
		int result = mapper.deleteBody(userid);
		session.commit();
		return result;
	}
	
	public int updateBody(Body body) {
		SqlSession session = factory.openSession();
		BodyMapper mapper = session.getMapper(BodyMapper.class);
		int result = mapper.updateBody(body);
		session.commit();
		return result;
	}
	
}
