class Friend{
	String name;
	int age;
	public Friend() {} // �Է� ���ϸ� �ڹٰ���ӽ�(JVM)�� �ڵ����� ����� �ִ� ** ������ **
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;   
	}	// Source -> Generate Constructor Using Field ���� �ڵ� ���� �����ϴ�!
}

public class OverloadingTest {

	public static void main(String[] args) {
		Friend f = new Friend();
		f.name= "�տ���";
		System.out.println(f.name);
		Friend f2 = new Friend("�����", 25);
		System.out.println(f2.name);
		
		System.out.println(add(10, 15));
		System.out.println(add(100, 150, 200));
		System.out.println(add(10, 15));		//
		System.out.println(add(10, 15.0));		//15.0�� double ���̹Ƿ� int�� ���� ���ϰ� double Ÿ������ ���
		
		
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
