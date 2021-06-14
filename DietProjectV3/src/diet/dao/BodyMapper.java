package diet.dao;

import diet.vo.Body;


public interface BodyMapper {
		
		public int insertBody(Body body);

		public Body selectBody(String userid);

		public int updateBody(Body body);

		public int deleteBody(String userid);


}
