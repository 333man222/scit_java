import java.util.Scanner;

// ���� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ�
// 4 (�Ҽ��� �ƴ϶�� ���) 5(�Ҽ��� ���)
public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, i;
		
		System.out.print("���� �Է� : ");
		num = scanner.nextInt();
		
		
		for(i = 2; i <num;i++) 
			if (num % i == 0) {
				System.out.println(num + "�� ���� �Ҽ��Դϴ�.");
				return;
			} 
		
			System.out.println(num + "�� ���� �Ҽ��� �ƴմϴ�.");
		



	}	
}	