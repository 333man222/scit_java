import java.util.Scanner;

//� �ް��� ���Ը� �Է� �޴´�.
//������ ������ �ް� (5~7g) 5�̸�,7�ʰ� ����x
//10���� �ѽ� , 10�� �ԷµǸ� ���α׷��� ����
//���� 5g �̸��̸� "�ް��� �ʹ� �۾� ���� �Ұ�";
//���� 7g �ʰ��ϸ� "�ް��� �ʹ� Ŀ ���� �Ұ�";
//�����Է� : 6 , 1������
//�����Է� : 4 , �ް��� �ʹ� �۾� ����Ұ� 2������
public class Packing_Kaisetsu {

	public static void main(String[] args) {
		// ���� ����
		Scanner scanner = new Scanner(System.in);
		
		double eggWeight = 0.0 ;
		int packingCount = 0;
		
		
		while(true) {
			System.out.print("�ް����� �Է� : ");
			eggWeight = scanner.nextDouble();
			if(eggWeight >= 5 && eggWeight <= 7) {
				++packingCount;				
			} else if(eggWeight < 5) { 
				System.out.println("�ް��� �ʹ� �۾� ���� �Ұ�");
			  } else if(eggWeight > 7) {
					System.out.println("�ް��� �ʹ� Ŀ ���� �Ұ�");				  
			  } if (packingCount == 10) break;
			System.out.println("�����Է� : " + eggWeight +"\n " + packingCount + "�� ����");
			

	}
		System.out.println("** ������ �Ϸ�Ǿ����ϴ�.");
		}

}