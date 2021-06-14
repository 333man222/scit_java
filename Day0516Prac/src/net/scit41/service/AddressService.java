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
			if(!file.exists()) { //���� ���� �� product.dat ������ �ҷ����°��̱� ������ ����
				file.createNewFile();
				return; 
			}

			oii = new ObjectInputStream(new FileInputStream(file));
			list=  (ArrayList<AddressVO>) oii.readObject();
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
}
