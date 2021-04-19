// 1) 1~10까지 증가 시켜서 정수들의 합을 구해 출력
public class Whiletest3 {

	public static void main(String[] args) {
		
		int total = 0;
		int i = 1 ;
		
		while(i <= 10) {
			total = total + i; // total += i;
			i++;

		}
		System.out.println("1 ~ 10까지의 합계 : " + total);
		//============================
		/*
		int productal = 1;
		int j ;
		j = 5 ;
		while(true) {
			
			productal = productal * j;
			j--;
			
			if(j == 0) break;
			 
			System.out.println(productal);
		}
		System.out.println("5! = " + productal);
	*/
		
		int product = 1;
		i = 1;
		while (i <= 5) {
			product *= i;
			i++;
		}
		System.out.println("5! = " + product);
	}

}
