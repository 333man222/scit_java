package net.scit41.shop.service;

import java.util.List;

import net.scit41.shop.vo.ProductVO;

public interface ProductInterface {	//��� ���� �Ұ��� �̸� ������ ���� ��
	// CRUD 
	public int insert(ProductVO vo);
	public List<ProductVO> selectAll();
	public ProductVO selectOne(String pid);
	public int update(ProductVO vo);
	public int delete(String pid);
	public int productCount();
}
