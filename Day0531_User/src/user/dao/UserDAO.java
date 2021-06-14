package user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import user.dao.MybatisConfig;
import user.vo.User;

public class UserDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//UI에서 보낸 user의 정보를 mybatis에 보내서 등록 되도록 함
	public int insert(User user) {
		SqlSession session = factory.openSession();				//1) factory객체에ㅓ session을 얻어옴
		UserMapper mapper = session.getMapper(UserMapper.class);//2) interface를 얻어옴
		
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
