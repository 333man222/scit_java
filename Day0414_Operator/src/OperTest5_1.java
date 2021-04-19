
public class OperTest5_1 {
	public static void main (String[] args) {
		//목욕탕 요금은 8세미만 무료, 8세~ 13세미만, 65세 이상 10%할인
		
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
