import java.util.Scanner;

public class ScannerIf_Exam {

	public static void main(String[] args) {
		Scanner set=new Scanner(System.in);
		int kor, mat, eng;
		double total;
		
		System.out.print("���� : ");
		kor = set.nextInt();
		System.out.print("���� : ");
		mat = set.nextInt();
		System.out.print("���� : ");
		eng = set.nextInt();
		
		total = (kor + mat + eng) / 3.0;
		if(total >=90) {
			System.out.println("A����");
		} else if (total>=80) {
			System.out.println("B����");
		} else if (total>=70) {
			System.out.println("C����");
		} else if (total>=60) {
			System.out.println("D����");
		} else {
			System.out.println("F����");
		}

	}

}
