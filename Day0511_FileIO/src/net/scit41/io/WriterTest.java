package net.scit41.io;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		fr = new FileReader("song.txt");	//reader : 2byte�� ������
		fw = new FileWriter("songCopy.txt");
		
		int data = 0;
		int count = 0;
		while(true) {
			data = fr.read();
			if(data == -1) break;
			count++;
			System.out.print((char)data);
			fw.write(data);
		}
		System.out.println("\n\n��" + count);
		if(fr != null) fr.close();
		if(fr != null) fw.close();
	}

}
