package net.scit41.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = null;		//���ڷ����� ���� (������ �ִ� ����� Ȯ����Ѽ� ���� ��)
		
		bfr = new BufferedReader(new FileReader("score.txt"));
				//���۵带 ����� �ϴ� �޾Ҵٰ� ó���� �� ������ ó��
		String data = null;
		
		
		while(true) {
		data = bfr.readLine();
		if(data == null) break;			//ȫ�浿 100 98 67  split(" ") ==> "100" ==> parseInt
		// ���� => �迭�� ���� split()		//split(" ")���� ���ڿ��� �߶� ���� ��� 
		// 1,2,3 �濡 ����ִ� ������ ==>Integer.parseInt();  // ����(" ") = ������	
		// �������� �հ� , ��� ���Ѵ�.
		String [] strary = data.split(" ");
		int count = 0;
		for(int i = 1; i<strary.length;++i) {
			count += Integer.parseInt(strary[i]);
			count++;
		}
		System.out.println(strary[0] + "�� �հ� ���� " + (count-3));
		System.out.println("�� ���� ���" + ((count - 3) / 3.0 ));
		}									
		
		System.out.println("---��---");
		if ( bfr != null) bfr.close();
		
		
	}

}
