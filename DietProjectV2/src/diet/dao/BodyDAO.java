package diet.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import diet.vo.Body;
import diet.dao.MybatisConfig;


public class BodyDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	public int insertBody(Body diet) {
		SqlSession session = factory.openSession(); //get a session from factory
		BodyMapper mapper = session.getMapper(BodyMapper.class); //get an interface
		
		int result = mapper.insertBody(diet);
		session.commit();
		return result;
	}

	public Body selectBody(String userid) {
		SqlSession session = factory.openSession();
		BodyMapper mapper = session.getMapper(BodyMapper.class);
		Body diet = mapper.selectBody(userid);
		return diet;
	}
	
	public int deleteBody(String userid) {
		SqlSession session = factory.openSession();
		BodyMapper mapper = session.getMapper(BodyMapper.class);
		
		int result = mapper.deleteBody(userid);
		session.commit();
		return result;
	}
	
	public int updateBody(Body diet) {
		SqlSession session = factory.openSession();
		BodyMapper mapper = session.getMapper(BodyMapper.class);
		
		int result = mapper.updateBody(diet);
		session.commit();
		return result;
	}
	
}
