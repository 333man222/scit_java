package net.scit41.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;	//Stream : 1 byte단위로 읽어냄, 영어 외 문자는 출력 할 수 없음 
		FileOutputStream fos = null;

		fis = new FileInputStream("dog.jpg");	//예외 발생 코드
		fos = new FileOutputStream("dogCopy.jpg");
		
		int data;
		int count = 0;
		while(true) {
			data = fis.read();
			if(data == -1) break;
			count++;
			System.out.print((char)data);
			fos.write(data);
		}	//영어가 아닌 문자는 복사는 되나 출력하면 이상한 문자로 뜸
		System.out.println(count + "개 복사 완료");
		
		if(fos != null) fos.close();
		if(fis != null) fis.close();


	}

}
