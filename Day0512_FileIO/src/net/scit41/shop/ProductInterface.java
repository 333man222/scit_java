package net.scit41.shop;

import java.util.List;


public interface ProductInterface {
	public int insert(ProductVO vo);		// 전달인자 (저장하기) 완료했으면 숫자로 리턴하기 위해 리턴타입 인트
	public List<ProductVO> selectAll();		// 전체 목록 조회(Array List)
	public ProductVO selectOne(String pid);	// 특정 제품 하나만 조회하기 위한 것(정보의 ID값이 필요하기 때문에 전달인자로 String pid)
	public int update(ProductVO vo);		// 데이터의 가격이 변화했거나 했을 떄 수정하기 위한 메소드
	public int delete(String pid);			// 삭제하려는 pid값이 삭제됐으면 1 아니면 0으로 넣기위해 리턴타입int
	public int productCount();				// 제품 판매량 갯수를 알기 위해 ProductCount
}
