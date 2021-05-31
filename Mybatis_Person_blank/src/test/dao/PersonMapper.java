package test.dao;

import java.util.ArrayList;

import test.vo.Person;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface PersonMapper {
	//Person객체 데이터베이스에 저장
	public int insertPerson(Person p);
	public int deletePerson(int num); // 정보 삭제시 사용
	public int updatePerson(Person p); // 정보 수정
//	public Person selectPerson(int num); 조회

}
