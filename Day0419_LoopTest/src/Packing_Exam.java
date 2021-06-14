import java.util.Scanner;

//어떤 달걀의 무게를 입력 받는다.
//포장이 가능한 달걀 (5~7g) 5미만,7초과 포장x
//10개가 한쌍 , 10개 입력되면 프로그래밍 종료
//만약 5g 미만이면 "달걀이 너무 작아 포장 불가";
//만약 7g 초과하면 "달걀이 너무 커 포장 불가";
//무게입력 : 6 , 1개포장
//무게입력 : 4 , 달걀이 너무 작아 포장불가 2개포장
public class Packing_Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int g, i = 0 ;

		
		while(true) {
			System.out.println("그램수 입력 : ");
			g = scanner.nextInt();
			if(g < 5 || g > 7) {
				System.out.println("무게가 너무 작거나 큽니다."); 
				continue;
			}

			
			++i;
			System.out.println("무게입력 : " + g +"\n " + i + "개 포장");
			if(i == 10) break;

	}
		System.out.println("10개 포장 완료");
		}

}
