package net.scit41.wrapper;
// Double�� Wrapper Ŭ����
public class WrapperTest2 {

	public static void main(String[] args) {
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		String tmp = "3.14E2";	//E = 10�� �����Ҷ� ��
		double d = Double.parseDouble(tmp);
		System.out.println(d * 2);
		System.out.println(Double.isFinite(d/0));	// ���� ���Ѵ�����? ���� �� (���Ѵ��̹Ƿ� false)
		
	}

}
