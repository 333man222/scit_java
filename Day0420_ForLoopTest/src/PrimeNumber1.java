import java.util.Scanner;

// ���� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ�
// 4 (�Ҽ��� �ƴ϶�� ���) 5(�Ҽ��� ���)
public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("���� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		for(int i = 2; i<num ; i++) 
			if(num % i ==0) {
				System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
				return;
			} 
			System.out.println(num + "�� �Ҽ��Դϴ�.");
			scanner.close();			
	}

}
