import java.util.Scanner;

// Ű����κ��� ������ �ݺ������� �Է¹޾� �Է¹��� ���ڸ� �״�� ���
// ���� : �Է¹��� �����Ͱ� �����̸� while���� Ż�� �ϵ��� ����
//break : Switch���忡�� Ż���ϴ� ����, �ݺ��������� ��� ����!
public class WhileTest1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int data;
		
		data = 0;
		while(true) {	//���� loop , true�� �� ��� �ϴ� while���� ������ ����
			System.out.print("������ �Է��ϼ��� : ");
			data = scanner.nextInt();
			
			System.out.println("�Է��� ������ ==> " + data);
			if(data < 0) break;	//while���� ���������� break���� Ż���� �� �ִ� �������� Ȯ��
		}	//dead code
		System.out.println("End " + data);
	}

}
