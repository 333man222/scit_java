
public class FinalTest1 {

	public static void main(String[] args) {
		int value = 10;
		//local value 앞에는 static을 붙일 수 없다
		value = value * 2;
		
		final int mydata = 20;
		// mydata = 30; // final변수는 값을 한번 설정하면 변경할 수 없다.
		
		int value2;
		
		value2 = 30;
		value2++;
		
		final int mydata2;
		mydata2 = 40; //선언만 하고 값은 설정 안해서 한번만 값을 입력(초기화)가능
	}

}
