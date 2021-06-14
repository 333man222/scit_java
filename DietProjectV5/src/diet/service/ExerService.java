package diet.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import diet.dao.ExerDAO;
import diet.vo.Exer;

public class ExerService {
	
	ExerDAO dao = new ExerDAO();
	
	public int insertExer(Exer diet) {
		int result = dao.insertExer(diet);
		return result;
	}
	
	public List<Exer> selectExer(String searchItem, String searchWord) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("searchItem", searchItem);
		map.put("searchWord", searchWord);		
		List<Exer> list = dao.selectExer(map);
		return list;
	}
	
	public Exer selectExerNum(int check_seq) {
		return 	dao.selectExerNum(check_seq);
	}
	
	public int updateExer(Exer diet) {
		int result = dao.updateExer(diet);
		return result;
	}
	
	public List<Exer> selectAll(){
		List<Exer> exer = dao.selectAll();
		return exer;
	}
	

	public int deleteExer(int exer_seq) {
		int result = dao.deleteExer(exer_seq);
		return result;
	}

	public Exer selectExerId(String userid) {
		Exer exer = dao.selectExerId(userid);
		return exer;
	}


}
