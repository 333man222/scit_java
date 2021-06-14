package diet.dao;


import java.util.List;
import java.util.Map;

import diet.vo.Exer;

public interface ExerMapper {
	
	public int insertExer(Exer diet);

	public Exer selectExer(int check_seq);
	
	public List<Exer> selectAll();
	
	public List<Exer> searchtypeexer(String diet);
	
	public int updateExer(Exer diet);

	public int deleteExer(int check_seq);

	public Exer selectExerId(String userid);

	public List<Exer> searchExer(Map<String, Object> map);
}
