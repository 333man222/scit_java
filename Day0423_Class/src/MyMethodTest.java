
public class MyMethodTest {

	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		m.output();  // �޼ҵ� ȣ��
		
		System.out.println("���� ����");
		int value = 25;
		m.printData(value); // ȣ�� : argument
		
		m.printData(13);
		m.output();
		
		m.add(5, 7);
		
		int c = m.add(5, 7);
		System.out.println(c);
	}

}
