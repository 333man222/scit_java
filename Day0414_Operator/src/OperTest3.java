
public class OperTest3 {
	public static void main(String[] args) {
		// ������ ������  %
		// ��� Ư���� ���� 3�ǹ���ΰ� Ȧ���ΰ� ¦���ΰ� ��� ���� ����
		// a�� �𸣴� ���¿��� 5�ǹ���ΰ�?
		int a = 5123415;
		int b = 5;
		
		int result = a % b;
		System.out.println(result);
		
		//=====�� ������======
		// >(�ʰ�), <(�̸�), >=(�̻�), <=(����), ==(����), !=(�����ʴ�)
		//����� �׻� boolean�� ������ ����
		int x = 30;
		int y = 23;
		boolean z;
		z = x > y;
		System.out.println(z);
		
		//a�� 5�� ������ ��������(5�� ����̸�) z�� true�� �Էµǵ��� ���α׷� �ۼ�
		
		z = a % 5 == 0;
		
		System.out.println(z);
	}

}
