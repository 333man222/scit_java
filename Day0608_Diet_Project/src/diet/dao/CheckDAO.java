package diet.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import diet.dao.MybatisConfig;
import diet.vo.Diet_project;
import diet.dao.CheckMapper;

/**
 * DB���� ó�� Ŭ����
 */
public class CheckDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//ȸ������ ����
	public int inputStatus(Diet_project check) {
		SqlSession session = factory.openSession(); //get a session from factory
		CheckMapper mapper = session.getMapper(CheckMapper.class); //get an interface
		
		int result = mapper.inputStatus(check);
		session.commit();
		return result;
	}
	// � ���� ��� 
	public Diet_project insertStatus(Diet_project check) {
		SqlSession session = factory.openSession();
		CheckMapper mapper = session.getMapper(CheckMapper.class);
		
		Diet_project result = mapper.insertStatus(check);
		session.commit();
		return check;
	}
	//� ��� ��ȸ
	
	public Diet_project selectCheck(int recom_seq) {
		SqlSession session = factory.openSession();
		CheckMapper mapper = session.getMapper(CheckMapper.class);
		
		Diet_project check = mapper.selectCheck(recom_seq);
		
		session.commit(); // update�� �����Ƿ� �ݵ�� commit�� �ؾ���!
		
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
