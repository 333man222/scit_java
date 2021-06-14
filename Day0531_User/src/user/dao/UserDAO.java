package user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import user.dao.MybatisConfig;
import user.vo.User;

public class UserDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//UI���� ���� user�� ������ mybatis�� ������ ��� �ǵ��� ��
	public int insert(User user) {
		SqlSession session = factory.openSession();				//1) factory��ü���� session�� ����
		UserMapper mapper = session.getMapper(UserMapper.class);//2) interface�� ����
		
		int result = mapper.insertUser(user);
		session.commit();
		return result;
	}

	public User seletOne(String userid) {
		SqlSession session = factory.openSession();	
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectUser(userid);
		return user;
	}

	public int delete(String userid) {
		SqlSession session = factory.openSession();	
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		int result = mapper.deleteUser(userid);
		session.commit();
		return result;
	}

	public int update(User user) {
		SqlSession session = factory.openSession();	
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		int result = mapper.updateUser(user);
		session.commit();
		return result;
	}

	public List<User> selectAll() {
		SqlSession session = factory.openSession();	
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		List<User> list = mapper.selectAll();
		
		return list;
	}

}
