package user.service;

import java.util.List;

import user.dao.UserDAO;
import user.vo.User;

public class UserService {
	UserDAO dao = new UserDAO();
	public int insert(User user) {
		int result = dao.insert(user);
		return result;
	}
public User selectOne(String userid) {
	User user = dao.seletOne(userid);
	
	return user;
	}

public int delete(String userid) {
	int result = dao.delete(userid);
	
	return result;
}
public int update(User user) {
	int result = dao.update(user);
	
	return result;
}
public List<User> selectAll() {
	List<User> list = dao.selectAll();
	return list;
}

}
