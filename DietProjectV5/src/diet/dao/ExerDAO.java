package diet.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import diet.dao.MybatisConfig;
import diet.vo.Exer;
import diet.dao.ExerMapper;

public class ExerDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); 

	public int insertExer(Exer diet) {
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class); 	
		int result = mapper.insertExer(diet);
		System.out.println(result);
		session.commit();
		return result;
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
	public List<Exer> selectExer(Map<String, Object> map) {
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class);		
		List<Exer> list = mapper.selectExer(map);		
		return list;
	}


	public Exer selectExerNum(int check_seq) {
		SqlSession session = factory.openSession();
		ExerMapper mapper = session.getMapper(ExerMapper.class);
		Exer exer = mapper.selectExerNum(check_seq);
		mapper.updateHitcount(check_seq);
		session.commit();	
		return exer;
		}

}
