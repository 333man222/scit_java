import java.util.Scanner;

public class IfTest3 {
	public static void main (String[] args) {
		Scanner keyin = new Scanner(System.in);
		int mat, kor, eng ;
		double score;
		
		System.out.println("��������, ��������, ���������� �Է��Ͻÿ�.");
		System.out.print("���� : ");
		mat = keyin.nextInt();
		System.out.print("���� : ");
		kor = keyin.nextInt();
		System.out.print("���� : ");
		eng = keyin.nextInt();
		score = (mat + kor + eng) / 3.0;
		
		if (score>=90) {
			System.out.println("����� ��������� " + score + "���̰�, A���� �Դϴ�.");
		} else if (score >=80) {
			System.out.println("����� ��������� " + score + "���̰�, B���� �Դϴ�.");
			} else if (score >=70) {
			System.out.println("����� ��������� " + score + "���̰�, C���� �Դϴ�.");
			} else if (score >=60) {
			System.out.println("����� ��������� " + score + "���̰�, D���� �Դϴ�.");
		} else {
			System.out.println("����� ��������� " + score + "���̰�, F���� �Դϴ�.");
		}
		
	}
}
