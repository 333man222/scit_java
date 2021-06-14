package diet.dao;

import java.util.List;
import diet.vo.Diet_project;


/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface DietMapper {
	// CRUD

	public int updateDiet(Diet_project diet);
	public int deleteDiet(String userid);
	public Diet_project selectCheck(int recom_seq);
	public Diet_project insertStatus(Diet_project diet);

}
