
public class OperTest5 {
	public static void main(String[] args) {
		int age = 5;
		int price =12000;
		double discount = 0.05;
		int totalprice = 0;
		boolean result;
		
		// 나이가 8세 미만 이거나, 나이가 65세 이상이면 5%할인한 금액을 출력
		
		result = age < 8 || age >= 64 ;
		
		System.out.println(result);
		
		result = !(age >= 8 && age <64);
		System.out.println(result);
		
		double height = 181;
		
		//키가 155~180사이인지 판단
		result = height >= 155 && height <180;
		System.out.println(result);
		
		result = !(height < 155 || height >=180);
		System.out.println(result);
	}
}
