import java.util.Scanner;

// 1) while문을 이용을 해서 1~9까지 출력되도록 프로그래밍
// 2) 키보드로부터 정수를 입력받는다. (data) ==> while문 내부에서 data와 i가 곱해진 값을 출력
// 3) 2 * 1 = 2
public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int data , i = 1;

		System.out.println("정수입력 : ");
		data = scanner.nextInt();
		while (i<10) {
			System.out.println(data + "x" + i + " = " + data*i);
			i++;
		}
		System.out.println("End , " + data);
		
	}

}
