package diet.dao;

import java.util.List;
import diet.vo.Info;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface InfoMapper {
	
	public int insertDiet(Info diet);

	public Info selectDiet(String userid);

	public int updateDiet(Info diet);

	public int deleteDiet(String userid);

}
