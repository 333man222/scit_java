public class OperTest1 {
	public static void main(String[] args) {		
		double height = 157.5; //Å°°¡ 157.5 cm
		double weight = 41;
		double bmi;			//bmi = ¸ö¹«°Ô(kg) / ( Å°(m)ÀÇ Á¦°ö )
		
		height = height / 100;
		
		bmi = weight / (height * height) ;
		
		System.out.println(height);
		System.out.println(bmi);
	}

}
