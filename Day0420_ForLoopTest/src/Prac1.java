import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  won, k;
		double  doll, yen, euro;

		doll = 0.00082;
		yen = 0.08824;
		euro = 0.00078;

		while(true) {
			System.out.print("금액 입력 : ");
			won = scanner.nextInt();
			if (won<= 0) {
				System.out.println("금액을 정확히 입력해주세요.");
				continue;
			}


			System.out.println("     1 . 달 러         ");
			System.out.println("     2 .  엔           ");
			System.out.println("     3 . 유 로         ");
			System.out.print("     번호 선택 :    ");

			k = scanner.nextInt();
			switch(k) {

			case 1 : 
				System.out.println( won + "원은 , " + (won * doll) + "달러 입니다.");
				break;
			case 2 : 
				System.out.println( won + "원은 , " + (won * yen) + "엔 입니다.");
				break;
			case 3 : 
				System.out.println( won + "원은 , " + (won * euro) + "유로 입니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				return;
			}



		}
	}	
}
