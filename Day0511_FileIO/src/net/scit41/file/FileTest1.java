package net.scit41.file;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		File f1 = new File("Test.java");
		File f2 = new File("c:\\tmp");
		
		System.out.println(f1.exists());		// �̷� �ְ� �����ϴ��� Ȯ���ϴ� booleanŸ��
		System.out.println(f1.isFile());		// �������� Ȯ���ϴ� boolean��
		System.out.println(f1.isDirectory()); 	// ���丮���� Ȯ��
		System.out.println(f1.getName());		//�̸�Ȯ��
		System.out.println(f1.getPath());		//
		System.out.println("-----------");
		System.out.println(f2.exists());		
		System.out.println(f2.isFile());		
		System.out.println(f2.isDirectory());
		System.out.println(f2.getName());		
		System.out.println(f2.getPath());		//  :\�� tapŰ�� �� �� �ν��ϹǷ� :\\�� �ΰ� �־���
		
		File f3 = new File("abc.txt");
		try {
			if(f3.createNewFile()) System.out.println("������ ������");
			else System.out.println("���� ���� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f4 = new File("./sub");	//���� ���丮 ���� ���� ���丮 �����
		
		if(f4.mkdir()) System.out.println("���丮 ����");
		else System.out.println("���丮 ���� ����");
	}

}

/* . ������
 * .. �������
 *	C:\temp 
 *
 */