package user.dao;

import java.util.List;
import user.vo.User;

public interface UserMapper {
	//CRUD
	public int insertUser(User user);		//ȸ������
	public int deleteUser(String userid); 	//ȸ��Ż��
	public int updateUser(User user);		//��������
	public User selectUser(String userid);	//ȸ�� 1�� ��ȸ 
	public List<User>selectAll();			//ȸ����ü��ȸ
}
