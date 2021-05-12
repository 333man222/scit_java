package net.scit41.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdReaderTest00 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = null;		//데코레이터 패턴 (기존에 있던 기능을 확장시켜서 쓰는 것)
		BufferedWriter bw = null;
		
		bfr = new BufferedReader(new FileReader("score.txt"));
				//버퍼드를 사용해 일단 받았다가 처리할 수 있을때 처리
		bw = new BufferedWriter(new FileWriter("scoreResult.txt"));
		String data = null;
		
		bw.write("         [ 3학년 1반 성적결과 ]\n");
		bw.write("  이름   국어    영어    수학    합계    평균\n");
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
		System.out.println("---끝---");
		if ( bfr != null) bfr.close();
		if ( bw != null) bw.close();
		
		
	}

}
