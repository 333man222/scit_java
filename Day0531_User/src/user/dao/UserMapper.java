package user.dao;

import java.util.List;
import user.vo.User;

public interface UserMapper {
	//CRUD
	public int insertUser(User user);		//회원가입
	public int deleteUser(String userid); 	//회원탈퇴
	public int updateUser(User user);		//정보수정
	public User selectUser(String userid);	//회원 1명 조회 
	public List<User>selectAll();			//회원전체조회
}
