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

	// 프로그램을 종료하기 전 작업했던 모든 데이터를 저장작업을 실시
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
	
	// 파일로부터 데이터를 읽어오는 메소드 
	@SuppressWarnings("unchecked")
	public void load() {
		ObjectInputStream oii = null ; 
		File file = new File("product.dat");

		try { 
			if(!file.exists()) { //파일 오픈 후 product.dat 파일을 불러오는것이기 때문에 써줌
				file.createNewFile();
				return; 
			}

			oii = new ObjectInputStream(new FileInputStream(file));
			list=  (ArrayList<ProductVO>) oii.readObject();
					//List=17번째 줄에 있음 저장 시 ArrayList를 통째로 저장하기
		} catch(EOFException e) {	//EOF - 파일이 더이상 읽을게 없다.!
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
			//vo가 add가 됐나? 됐으면 true 이므로 리턴하고 +1
		return 0;
	}

	@Override
	public List<ProductVO> selectAll() {
		return list;
	}

	@Override
	public ProductVO selectOne(String pid) {	//ArrayList에 있는것을 뒤져서 같은것이 있는지 찾는 것
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

				return 1;		///// return 1; return 0; 뜻? true? false? 아니면 +1이라는 뜻
			}
		}
		return 0;
	}

	@Override
	public int delete(String pid) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getPid().equals(pid)) {
				//list에서 하나의 vo객체를 꺼낸 후 객체안의 pid를 꺼낸값이 ui에서 입력한 pid값과 같으면..이라는 뜻
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
