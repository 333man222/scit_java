
public class DataType {
	public static void main(String[] args) {
	/**
	 * ������ ���� �ּ�(�����ּ�) /**�� ���� �ۼ� ��
	 */
		// ���� ���� �� �ʱ�ȭ
		byte bt = 1; //bt��� �̸��� ������ �޸𸮿� �����޶�� ��. ���� : Ÿ�� ������
		short sh = 10;
		int it = 100;  // ������ �⺻ Ÿ�� �ڿ� L�� �� �� ������ �⺻������ int����
		long ln = 200L; // �� 200�� long���̴� ��� ��
		
		System.out.println(bt);
		System.out.println(sh);
		System.out.println(it);
		System.out.println(ln);
		
		//=====================
		float fl = 3.14159F;
		double db = 3.14159; // ������ �⺻Ÿ��
		System.out.println(fl);
		System.out.println(db);
		
		//======================
		boolean bool = false; //�񱳿��� �������� ����� ����
		System.out.println( fl == db );
		System.out.println( bt < sh );
		System.out.println(bool);
		
		//=======================
		char ch = '=';
		System.out.println(ch);
		
		//=======================
		String name = "ȫ�浿"; //"", " ","��" ū����ǥ�� ������ ���ڰ� �ȵ��� ���ڿ��� �ν�
		System.out.println(name);
	}
}
