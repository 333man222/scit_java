import java.util.Scanner;

public class ForLoopTest1 {

	public static void main(String[] args) {

		// int total =0;
		//
		// for(int i = 0; i <= 10; ++i)
		// total +=i; // for문에서는 조건문장이 하나만 있을 때 중괄호 생략 가능
		// // ; 아무 의미없는 세미콜론 : Null statement .. 잘못된 식 오류는 안 나타나도 틀린 실행문이 될 수 있으니 주의할 것
		// System.out.println(total);

		// ====================================================

		// 키보드로부터 숫자를 입력받는다. (2~9) 범위 밖 숫자가 입력되면 프로그램 종료(메세지 하나 입력)
		// 원하는범위의 숫자면 구구단을 출력

		Scanner scanner = new Scanner(System.in);

		System.out.println("몇 단을 출력할까요 ? ");

		int num;
		num = scanner.nextInt();
		if (!(num >= 2 && num <= 9)) {
			System.out.println("2~9사이의 값을 입력하세요");
			return;
		}
		for (int i = 1; i < 10; ++i) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}
