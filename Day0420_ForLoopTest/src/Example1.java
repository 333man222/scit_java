import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int money; // ��ȭ �Էº���
		int menu; // � ȭ��?
		double exchange ; //ȯ���� �ݾ�
		String unit; //ȭ������� �Է�
		
		System.out.println("�� ���� �ݾ� �Է� : ");
		money = input.nextInt();
		
		if(money<=0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		System.out.println("ȯ���� ȭ�� (1:�޷�, 2:��ȭ, 3:����ȭ)");
		menu = input.nextInt();
		
		
		switch(menu) {
		
		case 1 : 
			exchange = (money / 1000) * 0.82;
			unit = "�޷�";
			break;
		case 2 : 
			exchange = (money / 1000) * 88.24;
			unit = "��";
			break;
		case 3 : 
			exchange = (money / 1000) * 0.78;
			unit = "����";
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		System.out.printf("%d����%.2f%s�Դϴ�",money,exchange,unit);	
		
		
	}

}
