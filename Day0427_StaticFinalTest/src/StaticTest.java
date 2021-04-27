class MyStaticClass{
	String name;
	int age;
	
	static String data;
	
	public static int multiply(int a, int b) {
		return a * b;
	}
}

public class StaticTest {
	// ���ϸ�� Ŭ�������� �����ؾ߸� public�� ���� �� ����
	public static void main(String[] args) {
		MyStaticClass.data = "�������Դϴ�.";
		//Ŭ���� �ȿ� �پ������� Ŭ�����ȿ� ���ԵǴ� ����� �ƴ�
		// �׷��Ƿ� ms�δ� �Էµ��� �ʰ� ���� ������ ����� ��
		
		StaticTest st = new StaticTest();
		//�츮Ŭ������ ������ static�� ���� ������ static���� ���� ����� �� �Ŀ� ����ؾ� ��
		int result = st.add(20, 10);
		System.out.println(result);
		
		result = substract(20, 10);
		//�츮Ŭ������ �ִ� static method �� static���� ������ �������ص� ��
		
		result = MyStaticClass.multiply(20, 10);
		// ���� Ŭ������ �ִ� static�� ����ϰ� ���� ��
		MyStaticClass ms = new MyStaticClass();
		ms.name = "���Ȱ�";
		ms.age = 25;
		
	}
	public int add(int a, int b) { 
	// ** non-static �޼��� �̹Ƿ� static�޼���� ���ٺҰ� **
		return a + b;
	}
	public static int substract(int a, int b) {
		return a - b;
	}
}
