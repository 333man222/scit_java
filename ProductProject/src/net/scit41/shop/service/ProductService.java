package net.scit41.shop.service;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import net.scit41.shop.vo.ProductVO;

public class ProductService implements ProductInterface{
	List<ProductVO> list = new ArrayList<>();

	public ProductService() {
		load();
	}

	// ���α׷��� �����ϱ� �� �۾��ߴ� ��� �����͸� �����۾��� �ǽ�
	public void save() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("product.dat"));
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ���Ϸκ��� �����͸� �о���� �޼ҵ� 
	@SuppressWarnings("unchecked")
	public void load() {
		ObjectInputStream oii = null ; 
		File file = new File("product.dat");

		try { 
			if(!file.exists()) { //���� ���� �� product.dat ������ �ҷ����°��̱� ������ ����
				file.createNewFile();
				return; 
			}

			oii = new ObjectInputStream(new FileInputStream(file));
			list=  (ArrayList<ProductVO>) oii.readObject();
					//List=17��° �ٿ� ���� ���� �� ArrayList�� ��°�� �����ϱ�
		} catch(EOFException e) {	//EOF - ������ ���̻� ������ ����.!
			try {
				if(oii != null)oii.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}	

	@Override
	public int insert(ProductVO vo) {
		if(list.add(vo)) return 1;
			//vo�� add�� �Ƴ�? ������ true �̹Ƿ� �����ϰ� +1
		return 0;
	}

	@Override
	public List<ProductVO> selectAll() {
		return list;
	}

	@Override
	public ProductVO selectOne(String pid) {	//ArrayList�� �ִ°��� ������ �������� �ִ��� ã�� ��
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getPid().equals(pid)) 
				return list.get(i);
		}
		return null;
	}

	@Override
	public int update(ProductVO vo) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getPid().equals(vo.getPid()))  {
				list.get(i).setPname(vo.getPname());
				list.get(i).setUnitPrice(vo.getUnitPrice());
				list.get(i).setSalePrice(vo.getSalePrice());

				return 1;		///// return 1; return 0; ��? true? false? �ƴϸ� +1�̶�� ��
			}
		}
		return 0;
	}

	@Override
	public int delete(String pid) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getPid().equals(pid)) {
				//list���� �ϳ��� vo��ü�� ���� �� ��ü���� pid�� �������� ui���� �Է��� pid���� ������..�̶�� ��
				list.remove(i);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int productCount() {
		return list.size();
	}
}
