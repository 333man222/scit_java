package diet.service;

import java.util.List;

import diet.dao.RecomDAO;
import diet.vo.Recom;


public class RecomService {
	RecomDAO dao = new RecomDAO();
	
	public int insertrecom(Recom recom) {
		int result = dao.insertrecom(recom);
		return result;
	}

	public Recom searchrecom(String recomid) {
		Recom recom = dao.searchrecom(recomid);
		return recom;
	}

	public int deleterecom(String recomid) {
		int result = dao.deleterecom(recomid);
		return result;
	}

	public int updaterecom(Recom recom) {
		int result = dao.updaterecom(recom);
		return result;
	}

	public List<Recom> selectAllrecom() {
		List<Recom> list=dao.selectAllrecom();
		return list;
	}

	public List<Recom> searchtyperecom(String type) {
		List<Recom> list=dao.searchtyperecom(type);
		return list;
	}
}
