public class OperTest1 {
	public static void main(String[] args) {		
		double height = 157.5; //Ű�� 157.5 cm
		double weight = 41;
		double bmi;			//bmi = ������(kg) / ( Ű(m)�� ���� )
		
		height = height / 100;
		
		bmi = weight / (height * height) ;
		
		System.out.println(height);
		System.out.println(bmi);
	}

}
