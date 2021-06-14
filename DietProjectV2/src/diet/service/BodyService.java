package diet.service;

import org.apache.ibatis.session.SqlSession;

import diet.dao.BodyDAO;
import diet.vo.Body;


public class BodyService {
	BodyDAO dao = new BodyDAO();
	public int insertBody(Body diet) {
		int result = dao.insertBody(diet);
		return result;
	}
	public Body selectBody(String userid) {
		Body diet = dao.selectBody(userid);
		return diet;
	}
	public int deleteBody(String userid) {

		int result = dao.deleteBody(userid);
		return result;
	}
	
	public int updateBody(Body diet) {
		int result = dao.updateBody(diet);
		return result;
	}

}
