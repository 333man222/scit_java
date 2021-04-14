
public class OperTest3 {
	public static void main(String[] args) {
		// 나머지 연산자  %
		// 어떠한 특정한 값이 3의배수인가 홀수인가 짝수인가 등에서 자주 쓰임
		// a를 모르는 상태에서 5의배수인가?
		int a = 5123415;
		int b = 5;
		
		int result = a % b;
		System.out.println(result);
		
		//=====비교 연산자======
		// >(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(같지않다)
		//결과는 항상 boolean형 값으로 나옴
		int x = 30;
		int y = 23;
		boolean z;
		z = x > y;
		System.out.println(z);
		
		//a를 5로 나누어 떨어지면(5의 배수이면) z에 true가 입력되도록 프로그램 작성
		
		z = a % 5 == 0;
		
		System.out.println(z);
	}

}
