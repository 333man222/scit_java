package net.scit41.file;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		File f1 = new File("Test.java");
		File f2 = new File("c:\\tmp");
		
		System.out.println(f1.exists());		// 이런 애가 존재하는지 확인하는 boolean타입
		System.out.println(f1.isFile());		// 파일인지 확인하는 boolean형
		System.out.println(f1.isDirectory()); 	// 디렉토리인지 확인
		System.out.println(f1.getName());		//이름확인
		System.out.println(f1.getPath());		//
		System.out.println("-----------");
		System.out.println(f2.exists());		
		System.out.println(f2.isFile());		
		System.out.println(f2.isDirectory());
		System.out.println(f2.getName());		
		System.out.println(f2.getPath());		//  :\를 tap키로 잘 못 인식하므로 :\\로 두개 넣어줌
		
		File f3 = new File("abc.txt");
		try {
			if(f3.createNewFile()) System.out.println("파일이 생성됨");
			else System.out.println("파일 생성 실패");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f4 = new File("./sub");	//현재 디렉토리 안의 하위 디렉토리 만들기
		
		if(f4.mkdir()) System.out.println("디렉토리 생성");
		else System.out.println("디렉토리 생성 실패");
	}

}

/* . 현재경로
 * .. 상위경로
 *	C:\temp 
 *
 */