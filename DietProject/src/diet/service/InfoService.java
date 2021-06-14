package diet.service;

import diet.dao.InfoDAO;
import diet.vo.Info;

public class InfoService {
	InfoDAO dao = new InfoDAO();
	
	public int insertDiet(Info diet) {
		int result = dao.insertDiet(diet);
		return result;
	}

	public Info selectOne(String userid) {
		Info diet = dao.selectOne(userid);
		return diet;
	}
	
	public int deleteOne(String userid) {
		int result = dao.deleteOne(userid);
		return result;
	}
	
	public int update(Info diet) {
		int result = dao.update(diet);
		return result;
	}
}
