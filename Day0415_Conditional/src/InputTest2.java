import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		//���� ����
		
		Scanner keyin = new Scanner(System.in);
		int value;
		String result;

		// value�� ������ �Է��� ��
		System.out.print("������ �Է����ּ��� : ");
		
		value = keyin.nextInt();
		// �Է¹��� �����Ͱ� ¦������ Ȧ������ �Ǵ��� ��
		if(value % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		
		// result = (value%2 == 0 ) ? "¦��" : "Ȧ��" ;
		System.out.println(value + " : " + result);
	}

}
