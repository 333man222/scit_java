package net.scit41.wrapper;

// Integer Ŭ����
public class WrapperTest1 {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		String tmp = "34";
		int a = 10;
		System.out.println(Integer.parseInt(tmp) + a);
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		
		int sum = i1 + i2;	// auto unboxing(��ü�����ְ� �ڵ����� �Ϲ��ڷ������� �ٲ�)
		System.out.println(sum);
		
		Integer i3 = 11;	// auto boxing (�ڵ����� ��ü�� ��ȯ)
		Integer i4 = 12;
		System.out.println(i3+i4);
		
	}

}
