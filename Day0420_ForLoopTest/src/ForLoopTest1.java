import java.util.Scanner;

public class ForLoopTest1 {

	public static void main(String[] args) {

		// int total =0;
		//
		// for(int i = 0; i <= 10; ++i)
		// total +=i; // for�������� ���ǹ����� �ϳ��� ���� �� �߰�ȣ ���� ����
		// // ; �ƹ� �ǹ̾��� �����ݷ� : Null statement .. �߸��� �� ������ �� ��Ÿ���� Ʋ�� ���๮�� �� �� ������ ������ ��
		// System.out.println(total);

		// ====================================================

		// Ű����κ��� ���ڸ� �Է¹޴´�. (2~9) ���� �� ���ڰ� �ԷµǸ� ���α׷� ����(�޼��� �ϳ� �Է�)
		// ���ϴ¹����� ���ڸ� �������� ���

		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ���� ����ұ�� ? ");

		int num;
		num = scanner.nextInt();
		if (!(num >= 2 && num <= 9)) {
			System.out.println("2~9������ ���� �Է��ϼ���");
			return;
		}
		for (int i = 1; i < 10; ++i) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}
