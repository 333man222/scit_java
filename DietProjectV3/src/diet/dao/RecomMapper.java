package diet.dao;

import java.util.List;
import diet.vo.Recom;

public interface RecomMapper {
	// CRUD
	public int insertrecom(Recom recom);     // ȸ������
	public int deleterecom(String recomid); // ȸ�� Ż��
	public int updaterecom(Recom recom);     // ȸ�� ��������
	public Recom searchrecom(String recomid);// ȸ��1�� ���� ��ȸ
	public List<Recom> selectAllrecom();		  // ȸ�� ��ü ���� ��ȸ
	public List<Recom> searchtyperecom(String type);
}
