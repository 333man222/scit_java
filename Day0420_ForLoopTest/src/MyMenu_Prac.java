import java.util.Scanner;

// 1.�Է� 2.��� 3. ���� 4. ���� �׿� �ٸ��� �ٽ� �Է��� �ּ��� ���� 0��
public class MyMenu_Prac {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;

		while(true) {
			System.out.println("     [ �� ��  ]     ");
			System.out.println("     1 . �� ��         ");
			System.out.println("     2 . �� ��         ");
			System.out.println("     3 . �� ��         ");
			System.out.println("     4 . �� ��         ");
			System.out.println("     0 . �� ��         ");
			System.out.println("-------------------");
			System.out.print("��ȣ�� ���� ���ּ��� : ");
			input = scanner.nextInt();

			switch(input){
			case 1 :
				System.out.println("�� ��");
				break;
			case 2 :
				System.out.println("�� ��");
				break;
			case 3 :
				System.out.println("�� ��");
				break;
			case 4 :
				System.out.println("�� ��");
				break;
			case 0 :
				System.out.println("�� ��");
				return;
			default : 
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
			scanner.close();
		}
		
	}

}
