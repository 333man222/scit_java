import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		int total = 0;
		int temp;
		//1) arr �� �濡 �����͸� �Է� , ����ϱ�
		//2) �Է��� �������� �� �հ踦 ���Ͽ� ���
		//3) �Է��� 3�ǹ���� �ޱ�
		//4) 3,6,9,12,15 ==> 0����� 4���� �ڸ� �ٲٱ�, 1����� 3���� �ڸ��ٲٱ�
		for(int i = 0; i<arr.length;++i) {
			System.out.print((i+1) + "��° ���� �Է� : ");
			arr[i] = scanner.nextInt();

			if(arr[i] % 3 != 0 || arr[i] == 0) {
				System.out.println("3�ǹ���� �Է����ּ���");
				--i;
				continue;
			}
			total += arr[i];
		}
		for(int i =0; i<arr.length/2; ++i) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.println("*** �Էµ� ������");
		for(int i = 0; i<arr.length;++i)  
			System.out.print(arr[i] + "  ");
			System.out.println();


		System.out.println("������ �� �� : " + total);


	}

}
