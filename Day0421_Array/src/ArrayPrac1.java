import java.util.Scanner;

public class ArrayPrac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�ڸ� ������ 2�ǹ���� �ޱ� 
		int[] arr = new int[4];
		int total = 0;
		int temp;

		for(int i = 0;i<arr.length;++i) {
			System.out.print((i+1) + "��° ���� �Է� : ");
			arr[i] = scanner.nextInt();
			if(arr[i] % 2!=0 || arr[i] ==0) {
				System.out.println("2�ǹ���� �Է��ϼ���");
			}
		}
		System.out.println();
		for(int i = 0;i<arr.length;++i)
			total += arr[i];
			System.out.print("�� �� : " + total);
		
	}

}
