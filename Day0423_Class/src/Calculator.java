
public class Calculator {
	

	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	public int substract(int a, int b) {
		int result1 = a - b;
		return result1;
	}
	public int multiply(int a, int b) {
		int result2 = a * b;
		return result2;
	}
	public double divide(int a , int b) {
		double result3 = a / (double)b;
		return result3;
	}

	public int mod(int c , int d ) {//������ ���ϱ� (3,2)
		int result4 = c % d;
		return result4;
	}
	public int power(int e , int f) {  //�ŵ����� ���ϱ�(3,4) �ʹ� ū ���� ������ �ʵ��� ��
		int result5 =1;
		for(int i=0;i<f; ++i)
			result5 *= e;
		return result5;
	}	
}
