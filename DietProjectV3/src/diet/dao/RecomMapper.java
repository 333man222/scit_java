package diet.dao;

import java.util.List;
import diet.vo.Recom;

public interface RecomMapper {
	// CRUD
	public int insertrecom(Recom recom);     // 회원가입
	public int deleterecom(String recomid); // 회원 탈퇴
	public int updaterecom(Recom recom);     // 회원 정보수정
	public Recom searchrecom(String recomid);// 회원1명 정보 조회
	public List<Recom> selectAllrecom();		  // 회원 전체 정보 조회
	public List<Recom> searchtyperecom(String type);
}
