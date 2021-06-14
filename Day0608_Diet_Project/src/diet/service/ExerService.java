package diet.service;

import diet.dao.CheckDAO;
import diet.vo.Diet_project;
//CRUD
public class ExerService {
	CheckDAO dao = new CheckDAO();
	
	
	public int inputStatus(Diet_project check) {
		int result = dao.inputStatus(check);
		return result;
		
	}

	public Diet_project selectCheck(int recom_seq) {
		Diet_project check = dao.selectCheck(recom_seq);
		return check;
	}
	
	public int deleteCheck(int recom_seq) {
		int result = dao.deletecheck(recom_seq);
		return result;
	}
	
	public int updateCheck(Diet_project check) {
		int result = dao.updatecheck(check);
		return result;
	}

	public int checklist(int recom_seq) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
