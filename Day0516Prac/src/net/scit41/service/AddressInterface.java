package net.scit41.service;

import java.util.List;

import net.scit41.shop.vo.AddressVO;

public interface AddressInterface {
	public int insert(AddressVO vo);
	public List<AddressVO> selectAll();
	public AddressVO selectOne(String name);
	public AddressVO selectList(String relationship);
	
}
