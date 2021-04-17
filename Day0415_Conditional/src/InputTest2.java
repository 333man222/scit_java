import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		//변수 선언
		
		Scanner keyin = new Scanner(System.in);
		int value;
		String result;

		// value에 정수값 입력할 것
		System.out.print("정수를 입력해주세요 : ");
		
		value = keyin.nextInt();
		// 입력받은 데이터가 짝수인지 홀수인지 판단할 것
		if(value % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		// result = (value%2 == 0 ) ? "짝수" : "홀수" ;
		System.out.println(value + " : " + result);
	}

}
