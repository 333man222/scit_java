interface MyInterface{
	public void method3();
}

abstract class MyAbstract { // 객체생성이 목적이 아닌 상속을 목적으로 하는 클래스
	int member;
	public MyAbstract() { 	//객체생성은 못하나 자식을 위해 생성자를 만듬
	}
	public void method1() {
		System.out.println("일반 메소드");
	}
	public abstract void method2();
}

class ConcreateClass extends MyAbstract implements MyInterface {

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {		
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		MyAbstract tmp = new ConcreateClass();
		MyInterface tin = new ConcreateClass();
		
	}

}
