package diet.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import diet.dao.MybatisConfig;
import diet.vo.Diet_project;
import diet.dao.DietMapper;

/**
 * DB관련 처리 클래스
 */
public class DietDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	//회원정보 저장
	public int inputStatus(Diet_project diet) {
		SqlSession session = factory.openSession(); //get a session from factory
		DietMapper mapper = session.getMapper(DietMapper.class); //get an interface
		
		int result = mapper.inputStatus(diet);
		session.commit();
		return result;
	}
	// 운동 여부 기록 
	public Diet_project insertStatus(Diet_project diet) {
		SqlSession session = factory.openSession();
		DietMapper mapper = session.getMapper(DietMapper.class);
		
		Diet_project result = mapper.insertStatus(diet);
		session.commit();
		return diet;
	}
	//운동 기록 조회
	
	public Diet_project selectCheck(int recom_seq) {
		SqlSession session = factory.openSession();
		DietMapper mapper = session.getMapper(DietMapper.class);
		
		Diet_project diet = mapper.selectCheck(recom_seq);
		
		session.commit(); // update를 했으므로 반드시 commit을 해야함!
		
		return diet;
	}
	
	public int deleteOne(String userid) {
		SqlSession session = factory.openSession();
		DietMapper mapper = session.getMapper(DietMapper.class);
		
		int result = mapper.deleteDiet(userid);
		session.commit();
		return result;
	}
	
	public int update(Diet_project diet) {
		SqlSession session = factory.openSession();
		DietMapper mapper = session.getMapper(DietMapper.class);
		
		int result = mapper.updateDiet(diet);
		session.commit();
		return result;
	}
	public Diet_project insertStatus(String userid) {
		// TODO Auto-generated method stub
		return null;
	}


}
