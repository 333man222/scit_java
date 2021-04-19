import java.util.Scanner;

//어떤 달걀의 무게를 입력 받는다.
//포장이 가능한 달걀 (5~7g) 5미만,7초과 포장x
//10개가 한쌍 , 10개 입력되면 프로그래밍 종료
//만약 5g 미만이면 "달걀이 너무 작아 포장 불가";
//만약 7g 초과하면 "달걀이 너무 커 포장 불가";
//무게입력 : 6 , 1개포장
//무게입력 : 4 , 달걀이 너무 작아 포장불가 2개포장
public class Packing_Kaisetsu {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scanner = new Scanner(System.in);
		
		double eggWeight = 0.0 ;
		int packingCount = 0;
		
		
		while(true) {
			System.out.print("달걀무게 입력 : ");
			eggWeight = scanner.nextDouble();
			if(eggWeight >= 5 && eggWeight <= 7) {
				++packingCount;				
			} else if(eggWeight < 5) { 
				System.out.println("달걀이 너무 작아 포장 불가");
			  } else if(eggWeight > 7) {
					System.out.println("달걀이 너무 커 포장 불가");				  
			  } if (packingCount == 10) break;
			System.out.println("무게입력 : " + eggWeight +"\n " + packingCount + "개 포장");
			

	}
		System.out.println("** 포장이 완료되었습니다.");
		}

}