package diet.dao;

import diet.vo.Body;


public interface BodyMapper {
		
		public int insertBody(Body b);

		public Body selectBody(String userid);

		public int updateBody(Body diet);

		public int deleteBody(String userid);


}
