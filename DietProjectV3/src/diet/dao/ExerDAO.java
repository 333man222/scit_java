package diet.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import diet.dao.MybatisConfig;
import diet.vo.Exer;
import diet.dao.ExerMapper;

public class ExerDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체

	public int insertExer(Exer diet) {
		SqlSession session = factory.openSession(); //get a session from factory
		ExerMapper mapper = session.getMapper(ExerMapper.class); //get an interface
		
		int result = mapper.insertExer(diet);
		System.out.println(result);
		session.commit();
		return result;
	}

	public Exer selectExer(int exer_seq) {
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class);
		Exer exer = mapper.selectExer(exer_seq);
		return exer;
	}
	
	public int deleteExer(int exer_seq) {
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class);
		
		int result = mapper.deleteExer(exer_seq);
		session.commit();
		return result;
	}
	
	public int updateExer(Exer diet) {
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class);
		int result = mapper.updateExer(diet);
		session.commit();
		return result;
	}
	

	
	public List<Exer> searchtypeexer(String diet){
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class);
		List<Exer> exer = mapper.searchtypeexer(diet);
		return exer;
	}

	public List<Exer> selectAll() {
		SqlSession session = factory.openSession(); 
		ExerMapper mapper = session.getMapper(ExerMapper.class);  
		
		List<Exer> list=mapper.selectAll();
		return list;
	}

	public Exer selectExerId(String userid) {
		SqlSession session = factory.openSession(); 
		ExerMapper mapper = session.getMapper(ExerMapper.class);  
		Exer exer = mapper.selectExerId(userid);
		return exer;		
	}

	public List<Exer> searchExer(Map<String, Object> map) {
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class);		
		List<Exer> list = mapper.searchExer(map);		
		return list;
	}


}
