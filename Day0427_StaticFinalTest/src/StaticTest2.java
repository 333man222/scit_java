//�������� 5�� ���� ������ ���ϱ� .... ����* ������(���� * 5 * 5)


public class StaticTest2 {

	public static void main(String[] args) {
		int radius = 5;
		double area;
		
		area = Math.PI * radius * radius;
		
		area = Math.floor(area); // �Ҽ��� ���� ���ڵ� ���� ����
		System.out.println(area);
		
		area = Math.PI * radius * radius;
		
		area = Math.ceil(area);  // �Ҽ��� ���� ���ڵ� �����ø�
		System.out.println(area);
	}

}
