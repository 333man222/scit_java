
public class Conditional {

	public static void main(String[] args) {
		// 변수 = (조건식) ? 참일경우의 값 : 거짓일 경우의 값;
		int value = 34;
		String result;
		
		result = ( value % 2 == 0 ) ? "짝수" : "홀수" ;

		System.out.println(value + "의 값은" + result + "입니다.");
		value = 3;
		
		result = ( value  > 0 ) ? "양수" : "음수" ;
		System.out.println(value + "의 값은" + result + "입니다.");
	}

}
