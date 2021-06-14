package diet.dao;


import java.util.List;
import java.util.Map;

import diet.vo.Exer;

public interface ExerMapper {
	
	public int insertExer(Exer diet);

	public Exer selectExerNum(int check_seq);
	
	public List<Exer> selectAll();
		
	public int updateExer(Exer diet);

	public int deleteExer(int check_seq);

	public Exer selectExerId(String userid);
	
	public int updateHitcount(int check_seq);
	
	public List<Exer> selectExer(Map<String, Object> map);
}
