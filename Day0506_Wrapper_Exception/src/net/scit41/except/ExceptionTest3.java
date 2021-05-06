package net.scit41.except;

public class ExceptionTest3 {
	public static void main(String[] args) throws Exception {
		int result = 0;						//예외를 전가했다
			
			result = add(10 , 10);	
	
		System.out.println("합계 : " + result);
		
	}
	// 합계는 0이 나오면 안된다(예외로 간주함)
	//예외를 생성할 수 있음(강제로 예외를 만들어 알려주기)
	public static int add(int a , int b) throws Exception {
		int result = a+b;
		
		if(result == 0)
			throw new Exception("합계가 0이 됨");
		return result;
	}
}
