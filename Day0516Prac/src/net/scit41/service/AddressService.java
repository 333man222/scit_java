package net.scit41.service;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import net.scit41.shop.vo.AddressVO;

public class AddressService {
	List<AddressVO> list = new ArrayList<>();
	public AddressService() {
		load();
	}
	
	public void save() {
		
	}
	@SuppressWarnings("unchecked")
	public void load() {
		ObjectInputStream oii = null ; 
		File file = new File("address.dat");

		try { 
			if(!file.exists()) { //파일 오픈 후 product.dat 파일을 불러오는것이기 때문에 써줌
				file.createNewFile();
				return; 
			}

			oii = new ObjectInputStream(new FileInputStream(file));
			list=  (ArrayList<AddressVO>) oii.readObject();
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
}
