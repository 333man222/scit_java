package net.scit41.except;

public class ExceptionTest3 {
	public static void main(String[] args) throws Exception {
		int result = 0;						//���ܸ� �����ߴ�
			
			result = add(10 , 10);	
	
		System.out.println("�հ� : " + result);
		
	}
	// �հ�� 0�� ������ �ȵȴ�(���ܷ� ������)
	//���ܸ� ������ �� ����(������ ���ܸ� ����� �˷��ֱ�)
	public static int add(int a , int b) throws Exception {
		int result = a+b;
		
		if(result == 0)
			throw new Exception("�հ谡 0�� ��");
		return result;
	}
}
