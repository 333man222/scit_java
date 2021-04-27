class Friend{
	String name;
	int age;
	public Friend() {} // 입력 안하면 자바가상머신(JVM)이 자동으로 만들어 주는 ** 생성자 **
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;   
	}	// Source -> Generate Constructor Using Field 에서 자동 생성 가능하다!
}

public class OverloadingTest {

	public static void main(String[] args) {
		Friend f = new Friend();
		f.name= "손오공";
		System.out.println(f.name);
		Friend f2 = new Friend("사오정", 25);
		System.out.println(f2.name);
		
		System.out.println(add(10, 15));
		System.out.println(add(100, 150, 200));
		System.out.println(add(10, 15));		//
		System.out.println(add(10, 15.0));		//15.0이 double 값이므로 int에 들어가지 못하고 double 타입으로 계산
		
		
	}
	
	public static int add(int a, int b) { 
		return a + b;
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	public static double add(double a , double b) {
		return a + b;
	}

	
}
