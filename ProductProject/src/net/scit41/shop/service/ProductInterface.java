package net.scit41.shop.service;

import java.util.List;

import net.scit41.shop.vo.ProductVO;

public interface ProductInterface {	//어떠한 일을 할건지 미리 설계해 놓은 것
	// CRUD 
	public int insert(ProductVO vo);
	public List<ProductVO> selectAll();
	public ProductVO selectOne(String pid);
	public int update(ProductVO vo);
	public int delete(String pid);
	public int productCount();
}
