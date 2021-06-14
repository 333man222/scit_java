package diet.dao;


import java.util.List;
import diet.vo.Exer;

public interface ExerMapper {
	
	public int insertExer(Exer diet);

	public Exer selectExer(String userid);
	
	public List<Exer> selectAll(int exer_seq);
	
	public List<Exer> searchtypeexer(String diet);
	
	public int updateExer(Exer diet);

	public int deleteExer(String userid);
}
