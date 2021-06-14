package diet.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import diet.dao.MybatisConfig;
import diet.vo.Diet_project;
import diet.dao.DietMapper;

/**
 * DB���� ó�� Ŭ����
 */
public class DietDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//ȸ������ ����
	public int inputStatus(Diet_project diet) {
		SqlSession session = factory.openSession(); //get a session from factory
		DietMapper mapper = session.getMapper(DietMapper.class); //get an interface
		
		int result = mapper.inputStatus(diet);
		session.commit();
		return result;
	}
	// � ���� ��� 
	public Diet_project insertStatus(Diet_project diet) {
		SqlSession session = factory.openSession();
		DietMapper mapper = session.getMapper(DietMapper.class);
		
		Diet_project result = mapper.insertStatus(diet);
		session.commit();
		return diet;
	}
	//� ��� ��ȸ
	
	public Diet_project selectCheck(int recom_seq) {
		SqlSession session = factory.openSession();
		DietMapper mapper = session.getMapper(DietMapper.class);
		
		Diet_project diet = mapper.selectCheck(recom_seq);
		
		session.commit(); // update�� �����Ƿ� �ݵ�� commit�� �ؾ���!
		
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
