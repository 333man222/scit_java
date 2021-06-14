package diet.dao;

import java.util.List;
import diet.vo.Info;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface InfoMapper {
	
	public int insertDiet(Info diet);

	public Info selectDiet(String userid);

	public int updateDiet(Info diet);

	public int deleteDiet(String userid);

}
