class MyStaticClass{
	String name;
	int age;
	
	static String data;
	
	public static int multiply(int a, int b) {
		return a * b;
	}
}

public class StaticTest {
	// 파일명과 클래스명이 동일해야만 public을 가질 수 있음
	public static void main(String[] args) {
		MyStaticClass.data = "데이터입니다.";
		//클래스 안에 붙어있지만 클래스안에 포함되는 멤버는 아님
		// 그러므로 ms로는 입력되지 않고 따로 설정을 해줘야 함
		
		StaticTest st = new StaticTest();
		//우리클래스에 있으나 static이 없는 파일은 static값을 새로 만들어 준 후에 사용해야 함
		int result = st.add(20, 10);
		System.out.println(result);
		
		result = substract(20, 10);
		//우리클래스에 있는 static method 중 static값이 있으면 생성안해도 됨
		
		result = MyStaticClass.multiply(20, 10);
		// 남의 클래스에 있는 static을 사용하고 싶을 때
		MyStaticClass ms = new MyStaticClass();
		ms.name = "저팔계";
		ms.age = 25;
		
	}
	public int add(int a, int b) { 
	// ** non-static 메서드 이므로 static메서드는 접근불가 **
		return a + b;
	}
	public static int substract(int a, int b) {
		return a - b;
	}
}
