package net.scit41.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("abc.txt");	//예외 발생 코드
			int data;
			int count = 0;
			while(true) {
			data = fis.read();
			if(data == -1) break;
			count++;
			System.out.print((char)data);
			}
			System.out.println("총 데이터 글자 수 " + count);
		} catch (FileNotFoundException e) {
			//에러시 수행
			e.printStackTrace();	//에러시 오류 출력
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {	//무조건 수행 (close역할)
				try {
					if(fis != null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
			
	}

}
