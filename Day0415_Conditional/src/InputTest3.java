//���� (m), ����(m) => ����� ���ϱ�(1.8181�� ����) ��ȯ
import java.util.Scanner;

public class InputTest3 {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in);
		double horizontal, vertical;
		double result;
		double pyung = 1.8181 * 1.8181;
		
		System.out.print("����ũ�� : ");
		horizontal = keyin.nextDouble();
		
		System.out.print("����ũ�� : ");
		vertical = keyin.nextDouble();
		
		result = horizontal * vertical / (1.8181 * 1.8181);
		
		System.out.println("���� " + horizontal + "���� " + vertical + "�� ũ��� " + result + "�� �Դϴ�.");
	}

}
