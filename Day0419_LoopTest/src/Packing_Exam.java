import java.util.Scanner;

//� �ް��� ���Ը� �Է� �޴´�.
//������ ������ �ް� (5~7g) 5�̸�,7�ʰ� ����x
//10���� �ѽ� , 10�� �ԷµǸ� ���α׷��� ����
//���� 5g �̸��̸� "�ް��� �ʹ� �۾� ���� �Ұ�";
//���� 7g �ʰ��ϸ� "�ް��� �ʹ� Ŀ ���� �Ұ�";
//�����Է� : 6 , 1������
//�����Է� : 4 , �ް��� �ʹ� �۾� ����Ұ� 2������
public class Packing_Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int g, i = 0 ;

		
		while(true) {
			System.out.println("�׷��� �Է� : ");
			g = scanner.nextInt();
			if(g < 5 || g > 7) {
				System.out.println("���԰� �ʹ� �۰ų� Ů�ϴ�."); 
				continue;
			}

			
			++i;
			System.out.println("�����Է� : " + g +"\n " + i + "�� ����");
			if(i == 10) break;

	}
		System.out.println("10�� ���� �Ϸ�");
		}

}
