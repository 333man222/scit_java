class Sample{
	final int value = 10; //����ȿ� �ִ� final�� ���� ����� ���ÿ� �ʱ�ȭ�� �����־�� ��
	static final int MY_DATA = 30; //���ȭ �Ǿ���� ��
}
public class FinalTest2 {

	public static void main(String[] args) {
		Sample s = new Sample();
		
		int a = s.value; // final�� �����Ƿ� �������� ���� �ǰ� ���ο� ���ڸ� �־� �����ϴ°��� �ȵ�.
		
		int b= Sample.MY_DATA;
		double pi = Math.PI;	//�� �Ʒ� ���������� (public static final�� ����)
	}

}
