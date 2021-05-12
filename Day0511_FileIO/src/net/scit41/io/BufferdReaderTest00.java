package net.scit41.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdReaderTest00 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = null;		//���ڷ����� ���� (������ �ִ� ����� Ȯ����Ѽ� ���� ��)
		BufferedWriter bw = null;
		
		bfr = new BufferedReader(new FileReader("score.txt"));
				//���۵带 ����� �ϴ� �޾Ҵٰ� ó���� �� ������ ó��
		bw = new BufferedWriter(new FileWriter("scoreResult.txt"));
		String data = null;
		
		bw.write("         [ 3�г� 1�� ������� ]\n");
		bw.write("  �̸�   ����    ����    ����    �հ�    ���\n");
		bw.write("=====================================\n");
		
		while(true) {
		data = bfr.readLine();
		if(data == null) break;			
		String [] sp = data.split(" ");
		String name = sp[0];
		int kor = Integer.parseInt(sp[1]);
		int eng = Integer.parseInt(sp[2]);
		int mat = Integer.parseInt(sp[3]);
		
		int total = kor + eng + mat;
		
		double avg = total / 3.0;
		
		String tmp = String.format ("%s %5d %5d %5d %5d %.2f%n", name, kor, eng, mat, total, avg);
		bw.write(tmp);
		System.out.print(tmp);
		}
		System.out.println("---��---");
		if ( bfr != null) bfr.close();
		if ( bw != null) bw.close();
		
		
	}

}
