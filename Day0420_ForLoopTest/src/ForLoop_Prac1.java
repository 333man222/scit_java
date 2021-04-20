import java.util.Scanner;
// 형식 변환 문자열 : %f : 실수, %d  : 정수, %c : 캐릭터 ,%s :스트링,, 문자열 , %% :%그 자체, %n :줄바꿈

public class ForLoop_Prac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int won, k;
		double  doll, yen, euro;
		
		doll = 0.00082;
		yen = 0.08824;
		euro = 0.00078;
		


			while(true) {
				System.out.print("금액 입력 : ");
				k = scanner.nextInt();
				if (k<0) {
					
					System.out.println("잘못 입력하셨습니다.");
				}

				won = scanner.nextInt();
				
				System.out.println("     1 . 달 러         ");
				System.out.println("     2 .  엔           ");
				System.out.println("     3 . 유 로         ");
				System.out.print("     번호 선택 :    ");
				

				switch(k) {
	
				case 1 : 
					System.out.println( won + "원은 , " + (won * doll) + "달러 입니다.");
					break;
				case 2 : 
					System.out.println( won + "원은 , " + (won * yen) + "엔 입니다.");
					break;
				case 3 : 
					System.out.println( won + "원은 , " + (won * euro) + "유로 입니다.");
					default :
						System.out.println("잘못 입력하셨습니다.");
				}
	
			}
		
		
	}

}
