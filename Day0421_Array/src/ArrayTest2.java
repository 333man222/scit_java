import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		int total = 0;
		int temp;
		//1) arr 각 방에 데이터를 입력 , 출력하기
		//2) 입력한 데이터의 총 합계를 구하여 출력
		//3) 입력을 3의배수만 받기
		//4) 3,6,9,12,15 ==> 0번방과 4번방 자리 바꾸기, 1번방과 3번방 자리바꾸기
		for(int i = 0; i<arr.length;++i) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = scanner.nextInt();

			if(arr[i] % 3 != 0 || arr[i] == 0) {
				System.out.println("3의배수만 입력해주세요");
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

		System.out.println("*** 입력된 데이터");
		for(int i = 0; i<arr.length;++i)  
			System.out.print(arr[i] + "  ");
			System.out.println();


		System.out.println("정수의 총 합 : " + total);


	}

}
