package net.scit41.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = null;		//데코레이터 패턴 (기존에 있던 기능을 확장시켜서 쓰는 것)
		
		bfr = new BufferedReader(new FileReader("score.txt"));
		
		String data = null;
		
		
		while(true) {
		data = bfr.readLine();
		if(data == null) break;			//홍길동 100 98 67  split(" ") ==> "100" ==> parseInt
		// 분해 => 배열로 리턴 split()		//split(" ")으로 문자열을 잘라서 각각 계산 
		// 1,2,3 방에 들어있는 데이터 ==>Integer.parseInt();  // 공백(" ") = 구분자	
		// 덧셈으로 합계 , 평균 구한다.
				
		}									
		
		System.out.println("---끝---");
		if ( bfr != null) bfr.close();
		
		
	}

}
