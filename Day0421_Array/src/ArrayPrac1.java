import java.util.Scanner;

public class ArrayPrac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//자리 뒤집기 2의배수만 받기 
		int[] arr = new int[4];
		int total = 0;
		int temp;

		for(int i = 0;i<arr.length;++i) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = scanner.nextInt();
			if(arr[i] % 2!=0 || arr[i] ==0) {
				System.out.println("2의배수만 입력하세요");
			}
		}
		System.out.println();
		for(int i = 0;i<arr.length;++i)
			total += arr[i];
			System.out.print("총 합 : " + total);
		
	}

}
