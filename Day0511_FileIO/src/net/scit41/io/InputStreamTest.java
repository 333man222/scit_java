package net.scit41.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("abc.txt");	//���� �߻� �ڵ�
			int data;
			int count = 0;
			while(true) {
			data = fis.read();
			if(data == -1) break;
			count++;
			System.out.print((char)data);
			}
			System.out.println("�� ������ ���� �� " + count);
		} catch (FileNotFoundException e) {
			//������ ����
			e.printStackTrace();	//������ ���� ���
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {	//������ ���� (close����)
				try {
					if(fis != null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
			
	}

}
