import java.util.Scanner;

public class InputTest4 {
	public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	
	int totalLeg, chicken, pig;
	System.out.print("�� ������ :");
	chicken = keyin.nextInt();
	
	System.out.print("���� ������ : ");
	pig = keyin.nextInt();
	
	totalLeg = chicken * 2 + pig * 4;
	
	System.out.println("��" + chicken + "����, ����" + pig + "���� \n�� �ٸ��� =>" + totalLeg);
	
	}
}
