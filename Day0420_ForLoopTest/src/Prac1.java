import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  won, k;
		double  doll, yen, euro;

		doll = 0.00082;
		yen = 0.08824;
		euro = 0.00078;

		while(true) {
			System.out.print("�ݾ� �Է� : ");
			won = scanner.nextInt();
			if (won<= 0) {
				System.out.println("�ݾ��� ��Ȯ�� �Է����ּ���.");
				continue;
			}


			System.out.println("     1 . �� ��         ");
			System.out.println("     2 .  ��           ");
			System.out.println("     3 . �� ��         ");
			System.out.print("     ��ȣ ���� :    ");

			k = scanner.nextInt();
			switch(k) {

			case 1 : 
				System.out.println( won + "���� , " + (won * doll) + "�޷� �Դϴ�.");
				break;
			case 2 : 
				System.out.println( won + "���� , " + (won * yen) + "�� �Դϴ�.");
				break;
			case 3 : 
				System.out.println( won + "���� , " + (won * euro) + "���� �Դϴ�.");
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}



		}
	}	
}
