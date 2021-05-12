package net.scit41.shop;

import java.util.List;

public class ProductService implements ProductInterface {	//인터페이스를 구현해준다(Add unimplements method)

	@Override
	public int insert(ProductVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductVO selectOne(String pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ProductVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String pid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int productCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
