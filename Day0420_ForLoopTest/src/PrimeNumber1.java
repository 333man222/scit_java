import java.util.Scanner;

// 값을 입력받아 소수인지 아닌지 판별
// 4 (소수가 아니라고 출력) 5(소수라 출력)
public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("값을 입력하세요 : ");
		int num = scanner.nextInt();
		for(int i = 2; i<num ; i++) 
			if(num % i ==0) {
				System.out.println(num + "은 소수가 아닙니다.");
				return;
			} 
			System.out.println(num + "은 소수입니다.");
			scanner.close();			
	}

}
