package diet.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import diet.dao.MybatisConfig;
import diet.vo.Diet_project;
import diet.dao.CheckMapper;

/**
 * DB관련 처리 클래스
 */
public class CheckDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	//회원정보 저장
	public int inputStatus(Diet_project check) {
		SqlSession session = factory.openSession(); //get a session from factory
		CheckMapper mapper = session.getMapper(CheckMapper.class); //get an interface
		
		int result = mapper.inputStatus(check);
		session.commit();
		return result;
	}
	// 운동 여부 기록 
	public Diet_project insertStatus(Diet_project check) {
		SqlSession session = factory.openSession();
		CheckMapper mapper = session.getMapper(CheckMapper.class);
		
		Diet_project result = mapper.insertStatus(check);
		session.commit();
		return check;
	}
	//운동 기록 조회
	
	public Diet_project selectCheck(int recom_seq) {
		SqlSession session = factory.openSession();
		CheckMapper mapper = session.getMapper(CheckMapper.class);
		
		Diet_project check = mapper.selectCheck(recom_seq);
		
		session.commit(); // update를 했으므로 반드시 commit을 해야함!
		
		return check;
	}
					//	//	//   ()	- recom_seq / userid?
	public int deletecheck(int recom_seq) {
		SqlSession session = factory.openSession();
		CheckMapper mapper = session.getMapper(CheckMapper.class);
		
		int result = mapper.deletecheck(recom_seq);
		session.commit();
		return result;
	}
	
	public int updatecheck(Diet_project check) {
		SqlSession session = factory.openSession();
		CheckMapper mapper = session.getMapper(CheckMapper.class);
		
		int result = mapper.updatecheck(check);
		session.commit();
		return result;
	}
	
	public int checklist(int recom_seq) {
		// TODO Auto-generated method stub
		return 0;
	}


}
