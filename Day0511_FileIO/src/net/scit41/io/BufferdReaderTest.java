package net.scit41.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = null;		//���ڷ����� ���� (������ �ִ� ����� Ȯ����Ѽ� ���� ��)
		
		bfr = new BufferedReader(new FileReader("score.txt"));
		
		String data = null;
		
		
		while(true) {
		data = bfr.readLine();
		if(data == null) break;			//ȫ�浿 100 98 67  split(" ") ==> "100" ==> parseInt
		// ���� => �迭�� ���� split()		//split(" ")���� ���ڿ��� �߶� ���� ��� 
		// 1,2,3 �濡 ����ִ� ������ ==>Integer.parseInt();  // ����(" ") = ������	
		// �������� �հ� , ��� ���Ѵ�.
				
		}									
		
		System.out.println("---��---");
		if ( bfr != null) bfr.close();
		
		
	}

}
