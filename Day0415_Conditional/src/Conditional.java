
public class Conditional {

	public static void main(String[] args) {
		// ���� = (���ǽ�) ? ���ϰ���� �� : ������ ����� ��;
		int value = 34;
		String result;
		
		result = ( value % 2 == 0 ) ? "¦��" : "Ȧ��" ;

		System.out.println(value + "�� ����" + result + "�Դϴ�.");
		value = 3;
		
		result = ( value  > 0 ) ? "���" : "����" ;
		System.out.println(value + "�� ����" + result + "�Դϴ�.");
	}

}
