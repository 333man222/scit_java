package diet.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import diet.dao.MybatisConfig;
import diet.vo.Info;
import diet.dao.InfoMapper;

/**
 * DB���� ó�� Ŭ����
 */
public class InfoDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//ȸ������ ����
	public int insertDiet(Info diet) {
		SqlSession session = factory.openSession(); //get a session from factory
		InfoMapper mapper = session.getMapper(InfoMapper.class); //get an interface
		
		int result = mapper.insertDiet(diet);
		System.out.println(result);
		session.commit();
		return result;
	}

	public Info selectOne(String userid) {
		SqlSession session = factory.openSession();
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		Info diet = mapper.selectDiet(userid);
		return diet;
	}
	
	public int deleteOne(String userid) {
		SqlSession session = factory.openSession();
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		
		int result = mapper.deleteDiet(userid);
		session.commit();
		return result;
	}
	
	public int update(Info diet) {
		SqlSession session = factory.openSession();
		InfoMapper mapper = session.getMapper(InfoMapper.class);
		
		int result = mapper.updateDiet(diet);
		session.commit();
		return result;
	}


}
