
public class FinalTest1 {

	public static void main(String[] args) {
		int value = 10;
		//local value �տ��� static�� ���� �� ����
		value = value * 2;
		
		final int mydata = 20;
		// mydata = 30; // final������ ���� �ѹ� �����ϸ� ������ �� ����.
		
		int value2;
		
		value2 = 30;
		value2++;
		
		final int mydata2;
		mydata2 = 40; //���� �ϰ� ���� ���� ���ؼ� �ѹ��� ���� �Է�(�ʱ�ȭ)����
	}

}
