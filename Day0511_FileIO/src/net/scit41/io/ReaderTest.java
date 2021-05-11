package net.scit41.io;

import java.io.IOException;
import java.io.FileReader;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		
		fr = new FileReader("song.txt");	//reader : 2byte·Î »ý¼ºµÊ
		int data = 0;
		int count = 0;
		while(true) {
			data = fr.read();
			if(data == -1) break;
			count++;
			System.out.print((char)data);
		}
		System.out.println("\n\n³¡" + count);
		if(fr != null) fr.close();
		
	}

}
