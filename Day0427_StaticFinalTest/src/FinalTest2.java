class Sample{
	final int value = 10; //멤버안에 있는 final의 값은 선언과 동시에 초기화도 시켜주어야 함
	static final int MY_DATA = 30; //상수화 되어버린 값
}
public class FinalTest2 {

	public static void main(String[] args) {
		Sample s = new Sample();
		
		int a = s.value; // final을 썼으므로 가져오는 것은 되고 새로운 숫자를 넣어 선언하는것은 안됨.
		
		int b= Sample.MY_DATA;
		double pi = Math.PI;	//위 아래 같은형태임 (public static final의 형태)
	}

}
