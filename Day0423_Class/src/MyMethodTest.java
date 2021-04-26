
public class MyMethodTest {

	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		m.output();  // 메소드 호출
		
		System.out.println("갔다 왔음");
		int value = 25;
		m.printData(value); // 호출 : argument
		
		m.printData(13);
		m.output();
		
		m.add(5, 7);
		
		int c = m.add(5, 7);
		System.out.println(c);
	}

}
