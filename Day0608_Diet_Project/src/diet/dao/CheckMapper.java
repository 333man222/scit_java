package diet.dao;

import java.util.List;


import diet.vo.Diet_project;


/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface CheckMapper {
	// CRUD
	public int inputStatus(Diet_project check);
	public int updatecheck(Diet_project check);
	public int deletecheck(int recom_seq);
	public Diet_project selectCheck(int recom_seq);
	public Diet_project insertStatus(Diet_project check);
	

}
