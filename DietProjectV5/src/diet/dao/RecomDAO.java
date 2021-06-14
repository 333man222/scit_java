package diet.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import diet.dao.MybatisConfig;
import diet.vo.Recom;

public class RecomDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	// UI���� ���� ���������� mybatis�� ������ ��ϵǵ�����
	
	public int insertrecom(Recom recom) {
		SqlSession session = factory.openSession(); // 1) factory��ü���� session�� ����
		RecomMapper mapper = session.getMapper(RecomMapper.class);  // 2) interface�� ����
	
		int result = mapper.insertrecom(recom);
		session.commit();
		return result;
	}

	public Recom searchrecom(String recomid) {
		SqlSession session = factory.openSession(); 
		RecomMapper mapper = session.getMapper(RecomMapper.class);  
		Recom recom = mapper.searchrecom(recomid);
		
		return recom;
	}

	public int deleterecom(String recomid) {
		SqlSession session = factory.openSession(); 
		RecomMapper mapper = session.getMapper(RecomMapper.class);  
		
		int result = mapper.deleterecom(recomid);
		session.commit();
		
		return result;
	}

	public int updaterecom(Recom recom) {
		SqlSession session = factory.openSession(); 
		RecomMapper mapper = session.getMapper(RecomMapper.class);  
		
		int result = mapper.updaterecom(recom);
		session.commit();
		
		return result;
	}

	public List<Recom> selectAllrecom() {
		SqlSession session = factory.openSession(); 
		RecomMapper mapper = session.getMapper(RecomMapper.class);  
		
		List<Recom> list=mapper.selectAllrecom();
		return list;
	}

	public List<Recom> searchtyperecom(String type) {
		SqlSession session = factory.openSession(); 
		RecomMapper mapper = session.getMapper(RecomMapper.class);  
		
		List<Recom> list=mapper.searchtyperecom(type);
		return list;
	}
}
