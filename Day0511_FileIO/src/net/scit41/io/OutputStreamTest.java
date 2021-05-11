package net.scit41.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;	//Stream : 1 byte������ �о, ���� �� ���ڴ� ��� �� �� ���� 
		FileOutputStream fos = null;

		fis = new FileInputStream("dog.jpg");	//���� �߻� �ڵ�
		fos = new FileOutputStream("dogCopy.jpg");
		
		int data;
		int count = 0;
		while(true) {
			data = fis.read();
			if(data == -1) break;
			count++;
			System.out.print((char)data);
			fos.write(data);
		}	//��� �ƴ� ���ڴ� ����� �ǳ� ����ϸ� �̻��� ���ڷ� ��
		System.out.println(count + "�� ���� �Ϸ�");
		
		if(fos != null) fos.close();
		if(fis != null) fis.close();


	}

}
