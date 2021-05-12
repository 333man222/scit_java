package net.scit41.shop;

import java.util.List;


public interface ProductInterface {
	public int insert(ProductVO vo);		// �������� (�����ϱ�) �Ϸ������� ���ڷ� �����ϱ� ���� ����Ÿ�� ��Ʈ
	public List<ProductVO> selectAll();		// ��ü ��� ��ȸ(Array List)
	public ProductVO selectOne(String pid);	// Ư�� ��ǰ �ϳ��� ��ȸ�ϱ� ���� ��(������ ID���� �ʿ��ϱ� ������ �������ڷ� String pid)
	public int update(ProductVO vo);		// �������� ������ ��ȭ�߰ų� ���� �� �����ϱ� ���� �޼ҵ�
	public int delete(String pid);			// �����Ϸ��� pid���� ���������� 1 �ƴϸ� 0���� �ֱ����� ����Ÿ��int
	public int productCount();				// ��ǰ �Ǹŷ� ������ �˱� ���� ProductCount
}
