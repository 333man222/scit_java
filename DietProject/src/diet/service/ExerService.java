package diet.service;

import java.util.List;
import diet.dao.ExerDAO;
import diet.vo.Exer;

public class ExerService {
	
	ExerDAO dao = new ExerDAO();
	
	public int insertExer(Exer diet) {
		int result = dao.insertExer(diet);
		return result;
	}
	
	public Exer selectOne(String userid) {
		Exer exer = dao.selectOne(userid);
		return exer;
	}
	
	public int deleteOne(String userid) {
		int result = dao.deleteOne(userid);
		return result;
	}
	
	public int update(Exer diet) {
		int result = dao.update(diet);
		return result;
	}
	
	public List<Exer> selectAll(int exer_seq){
		List<Exer> exer = dao.selectAll(exer_seq);
		return exer;
	}
	
	public List<Exer> searchtypeexer(String diet){
		List<Exer> exer = dao.searchtypeexer(diet);
		return exer;
	}
}
