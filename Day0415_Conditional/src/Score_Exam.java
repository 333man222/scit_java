import java.util.Scanner;

/*Ű����κ���3������ ������ �Է¹޾� ����� ���� ��,
  90���̻� A,80���̻� B. 70���̻� C,60���̻�D, ���� F
  switch~case�� ���Ұ�!	
 */  

public class Score_Exam {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int kor, mat, eng, avg;
		
		System.out.print("�������� : ");
		kor = keyin.nextInt();
		System.out.print("�������� : ");
		mat = keyin.nextInt();
		System.out.print("�������� : ");
		eng = keyin.nextInt();
		avg = (kor + mat + eng) / 3;
		switch(avg /10) {
		case 10:
		case 9:
			System.out.println("������� : " + avg + ", A ����");
		break;
		case 8:
			System.out.println("������� : " + avg + ", B ����");
		break;
		case 7:
			System.out.println("������� : " + avg + ", C ����");
		break;
		case 6:
			System.out.println("������� : " + avg + ", D ����");
		break;
		default :
			System.out.println("������� : " + avg + ", F ����");
		}
		
		

	}

}
