import java.util.Scanner;

public class SwitchTest1_Exam {

	public static void main(String[] args) {
		Scanner keyin= new Scanner(System.in);
		Scanner set = new Scanner(System.in);
		int num1, num2;
		int menu;
		
		System.out.print("ù��° ���� : ");
		num1 =keyin.nextInt();
		System.out.print("�ι�° ���� : ");
		num2 =keyin.nextInt();
		
		System.out.println("       [ �� �� ] ");
		System.out.println("      1. ��  ��");
		System.out.println("      2. ��  ��");
		System.out.println("      3. ��  ��");
		System.out.println("      4. ������");
		System.out.println("===============");
		System.out.print("���ڸ� ������(1~4) : ");
		menu = set.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
			break;
		case 2 :
			System.out.println(num1 + " - " + num2 + " = " +(num1=num2));
			break;
		case 3 :
			System.out.println(num1 + " �� " + num2 + " = " +(num1*num2));
			break;
		case 4 :
			System.out.println(num1 + " �� " + num2 + " = " +((double)num1/num2));
			break;
		default : 
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		

	}
	}

}
