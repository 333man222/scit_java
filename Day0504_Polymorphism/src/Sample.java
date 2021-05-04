
interface Sample {
	public static final int TEMP = 10; // final�̹Ƿ� �빮�ڷ� ����
	// public static final ���� ����,, ���� �������� �ʾƵ� �������̽��� �ڵ������� final�� �������
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