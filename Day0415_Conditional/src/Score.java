import java.util.Scanner;

/*Ű����κ���3������ ������ �Է¹޾� ����� ���� ��,
  90���̻� A,80���̻� B. 70���̻� C,60���̻�D, ���� F
  switch~case�� ���Ұ�!	
 */  
public class Score {

	public static void main(String[] args) {
		System.out.println("��������, ��������, ���������� �Է��Ͻÿ�");
		Scanner keyin = new Scanner(System.in);
		int kor, mat, eng, total; 
		kor = keyin.nextInt();
		mat = keyin.nextInt();
		eng = keyin.nextInt();
		total = (kor + mat + eng) / 3;
		
		switch(total / 10) {
		case 10:
		case 9:
			System.out.println("����� ��������� " + total + "���̰�, A���� �Դϴ�.");
			break;
		case 8:
			System.out.println("����� ��������� " + total + "���̰�, B���� �Դϴ�.");		
			break;
		case 7:
			System.out.println("����� ��������� " + total + "���̰�, C���� �Դϴ�.");
			break;
		case 6:
			System.out.println("����� ��������� " + total + "���̰�, D���� �Դϴ�.");
			break;
		default :
			System.out.println("����� ��������� " + total + "���̰�, F���� �Դϴ�.");
		}
	}

}


