interface MyInterface{
	public void method3();
}

abstract class MyAbstract { // ��ü������ ������ �ƴ� ����� �������� �ϴ� Ŭ����
	int member;
	public MyAbstract() { 	//��ü������ ���ϳ� �ڽ��� ���� �����ڸ� ����
	}
	public void method1() {
		System.out.println("�Ϲ� �޼ҵ�");
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
