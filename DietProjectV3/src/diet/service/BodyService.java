package diet.service;


import diet.dao.BodyDAO;
import diet.vo.Body;


public class BodyService {
	BodyDAO dao = new BodyDAO();
	
	public int insertBody(Body body) {
		int result = dao.insertBody(body);
		return result;
	}
	public Body selectBody(String userid) {
		Body body = dao.selectBody(userid);
		return body;
	}
	public int deleteBody(String userid) {
		int result1 = dao.deleteBody(userid);
		return result1;
	}
	
	public int updateBody(Body body) {
		int result = dao.updateBody(body);
		return result;
	}

}
