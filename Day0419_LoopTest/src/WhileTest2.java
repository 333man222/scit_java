import java.util.Scanner;

// 1) while���� �̿��� �ؼ� 1~9���� ��µǵ��� ���α׷���
// 2) Ű����κ��� ������ �Է¹޴´�. (data) ==> while�� ���ο��� data�� i�� ������ ���� ���
// 3) 2 * 1 = 2
public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int data , i = 1;

		System.out.println("�����Է� : ");
		data = scanner.nextInt();
		while (i<10) {
			System.out.println(data + "x" + i + " = " + data*i);
			i++;
		}
		System.out.println("End , " + data);
		
	}

}
