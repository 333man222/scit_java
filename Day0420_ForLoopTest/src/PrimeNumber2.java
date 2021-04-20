import java.util.Scanner;

// 값을 입력받아 소수인지 아닌지 판별
// 4 (소수가 아니라고 출력) 5(소수라 출력)
public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, i;
		
		System.out.print("숫자 입력 : ");
		num = scanner.nextInt();
		
		
		for(i = 2; i <num;i++) 
			if (num % i == 0) {
				System.out.println(num + "의 값은 소수입니다.");
				return;
			} 
		
			System.out.println(num + "의 값은 소수가 아닙니다.");
		



	}	
}	