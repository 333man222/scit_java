import java.util.Scanner;

public class Score_kaisetsu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1) ��������
		int kor, eng, mat;
		double avg;
		String score;
		
		// 2) �Է�
		System.out.print("# ���� :");
		kor = scanner.nextInt();
		
		System.out.print("# ���� :");
		eng = scanner.nextInt();
		
		System.out.print("# ���� :");
		mat = scanner.nextInt();
		
		avg = (kor + eng + mat) / 3.0; //double��
		
		 // double / int ==> double / double�� �ڵ� ��ȯ
					// 95.5 ==>9.55
		
		switch((int)(avg / 10)) {
		case 10 :
		case 9 : score = "A ����";
		break;
		
		case 8 : score = "B ����";
		break;
		
		case 7 : score = "C ����";
		break;
		
		case 6 : score = "D ����";
		break;
		
		default : score = "F����";
		
		}
		//System.out.println("��� : " + avg + ", ���� : " + score);
		
		// ���� ��ȯ ���ڿ� : %f : �Ǽ�, %d  : ����, %c : ĳ���� ,%s :��Ʈ��,, ���ڿ� , %% :%�� ��ü, %n :�ٹٲ�
		System.out.printf("��� : %.2f, ���� : %s%n" , avg, score ); // printf�� ���˵� ������ ���ڿ��� ���� ���� ��
		//%f�� �ǹ��ϴ� �� :  �Ǽ��� �����͸� �ҷ����ڴ�,�⺻ �Ҽ��� 6�ڸ������� �������� %.2f �� �Ҽ��� ���ڸ������� �ҷ��´ٴ� ��
		System.out.println("�̻�");
	}

}
