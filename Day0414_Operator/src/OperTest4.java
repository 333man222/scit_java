	//논리 연산자 : 두개의 boolean값을 가지고 계산하는것 (&&: logical and, ||: logical or, ! : logical not)
public class OperTest4 {
	public static void main(String[] args) {
		boolean a,b;
		boolean result;
		
		a = true;
		b = false;
		
		result = a && b;
		System.out.println(result);

		result = a||b ;
		System.out.println(result);
		
		result = !a;
		System.out.println(result);
		
		// >= !를 쓰면 < , <= !를쓰면 >
	}

}
