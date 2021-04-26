
public class MyMethod {
	public void output() {
		System.out.println("output() 메소드입니다.");
	}
	
	// 매개변수(parameter) 선언,
	// 매개변수는 여러개 선언 가능, 호출하는 쪽에서 데이터를 넣어서 호출하면 된다.
	public void printData(int value) { 
		System.out.println(value + "입니다.");
	}
	
	public int add(int a, int b) {
		int result = a + b ;
		return result;
	}
	
}
