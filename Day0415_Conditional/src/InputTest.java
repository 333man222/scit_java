import java.util.Scanner;
public class InputTest {

	public static void main(String[] args) {
		//��ü����
		Scanner keyin = new Scanner(System.in);
		int data;
		double dbl;
		
		System.out.print("�����͸� �Է����ּ��� : ");
		data = keyin.nextInt();
		
		System.out.print("�Ǽ� �����͸� �Է����ּ��� : ");
		dbl =keyin.nextDouble();
		System.out.println("�Է��� ���� �� : " + data + ", �Ǽ��� : " + dbl);
	}

}
