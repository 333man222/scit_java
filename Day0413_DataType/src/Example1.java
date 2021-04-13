
public class Example1 {
	public static void main(String[] args) {
		String name = "사오정";
		int kor, eng, mat, total;
		double avg,avg2;
		
		kor = 91;
		eng = 87;
		mat = 97;
		total = kor+eng+mat ;
		avg = total / 3; // 275 / 3 ==> 91.666
		avg2 = total / 3.0;
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + avg2);
		System.out.println("결과 : " + (10 + 20 + 30));
		
	}
}
