// array(�迭) : **�����ڷ���**�� ������(����)�� ������ ����Ǿ� ���..
// �Ϲݺ��� : �ʱ�ȭ(;)�� �ݵ�� �ؾ��� ���ϸ� ����
// �迭�� �ڵ����� 0���� �ʱ�ȭ�� ���·� ������
// �⺻��(0, 0.0, false)�� �ʱ�ȭ��
// ����  1) ���α׷� ������ ũ�⸦ ������ �� ����!
//		2) ���������� ������Ÿ���� �ִ� �迭�� ���� �� ����.
// [] : 1���� �迭
// [][] : 2���� �迭

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] ary = new int[5];
		int[] a = {11, 15, 20, 30, 40, 1, 31, 302, 42, 67};
		int[] b;
		b = new int[10];
		
		System.out.println("���ǰ��� " +a.length);
		for(int i=0; i<a.length;++i)
			System.out.println(a[i]);
		
		//=========================
		char[] ch = {'a', 'b', 'c', 'D', '$'};
		for(int i=0;i<ch.length;++i)
			System.out.println(ch[i]);
		
		String[] names = {"ȫ�浿","�Ӳ���","�����","�տ���"};
		for(int i=0; i<names.length;++i) {
			System.out.println(names[i]);
		}
		System.out.println(names.length);
	}

}
