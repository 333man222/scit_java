package test.dao;

import java.util.ArrayList;

import test.vo.Person;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface PersonMapper {
	//Person��ü �����ͺ��̽��� ����
	public int insertPerson(Person p);
	public int deletePerson(int num); // ���� ������ ���
	public int updatePerson(Person p); // ���� ����
//	public Person selectPerson(int num); ��ȸ

}
