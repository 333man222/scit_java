
public class Example1 {
	public static void main(String[] args) {
		String name = "�����";
		int kor, eng, mat, total;
		double avg,avg2;
		
		kor = 91;
		eng = 87;
		mat = 97;
		total = kor+eng+mat ;
		avg = total / 3; // 275 / 3 ==> 91.666
		avg2 = total / 3.0;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		System.out.println("��� : " + avg2);
		System.out.println("��� : " + (10 + 20 + 30));
		
	}
}
