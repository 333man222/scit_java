
interface Sample {
	public static final int TEMP = 10; // final이므로 대문자로 써줌
	// public static final 생략 가능,, 값을 지정하지 않아도 인터페이스는 자동적으로 final로 만들어짐
	public double calc();
	public int add(int a, int b);
	public int multiply(int a, int b);
}

class SampleImpl implements Sample {

	@Override
	public double calc() {
		return 2 * Math.PI;
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}
	
}