
public class Example2 {
	public static void main (String[] args) {
		int radius = 5;		// ���� ������
		int edge = 5, height = 3;		// �ﰢ�� �� ���� ���̿� ����
		double pi, circleArea, triangleArea ;
		
		pi = 3.141592 ;
		circleArea = radius * radius * pi ;
		triangleArea = edge * height /2.0;
		
		System.out.println("������ 5�� ������" + circleArea + "�Դϴ�.");
		System.out.println("�Ѻ��� ���̰� 5�� �ﰢ���� ������" + triangleArea + "�Դϴ�.");
	}
}
