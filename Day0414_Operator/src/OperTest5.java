
public class OperTest5 {
	public static void main(String[] args) {
		int age = 5;
		int price =12000;
		double discount = 0.05;
		int totalprice = 0;
		boolean result;
		
		// ���̰� 8�� �̸� �̰ų�, ���̰� 65�� �̻��̸� 5%������ �ݾ��� ���
		
		result = age < 8 || age >= 64 ;
		
		System.out.println(result);
		
		result = !(age >= 8 && age <64);
		System.out.println(result);
		
		double height = 181;
		
		//Ű�� 155~180�������� �Ǵ�
		result = height >= 155 && height <180;
		System.out.println(result);
		
		result = !(height < 155 || height >=180);
		System.out.println(result);
	}
}
