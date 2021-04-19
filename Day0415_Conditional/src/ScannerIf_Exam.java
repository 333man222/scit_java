import java.util.Scanner;

public class ScannerIf_Exam {

	public static void main(String[] args) {
		Scanner set=new Scanner(System.in);
		int kor, mat, eng;
		double total;
		
		System.out.print("국어 : ");
		kor = set.nextInt();
		System.out.print("수학 : ");
		mat = set.nextInt();
		System.out.print("영어 : ");
		eng = set.nextInt();
		
		total = (kor + mat + eng) / 3.0;
		if(total >=90) {
			System.out.println("A학점");
		} else if (total>=80) {
			System.out.println("B학점");
		} else if (total>=70) {
			System.out.println("C학점");
		} else if (total>=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}

}
