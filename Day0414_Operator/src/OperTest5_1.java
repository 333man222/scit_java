
public class OperTest5_1 {
	public static void main (String[] args) {
		//����� ����� 8���̸� ����, 8��~ 13���̸�, 65�� �̻� 10%����
		
		int age = 5;
		int price = 8000;
		double discount = 0.1;
		
		boolean result, result1;
		result = age < 8 ;
		result1 = age < 8 && age <13 || age >= 65;
		System.out.println(result);
		
		result1 = !(age >= 8 || age >= 13 && age < 65 );
		System.out.println(result1);
		
	}
}
