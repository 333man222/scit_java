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
			
//			if(k == 1) {
//				System.out.printf("%d 원은\t%.2f달러 입니다.", won,(won * doll));
//			} else if (k == 2) {
//				System.out.printf("%d 원은\t%.2f엔 입니다.", won,(won * yen));
//				} else if (k == 3) {
//					System.out.printf("%d 원은\t%.2f유로 입니다.", won,(won * euro));
//			} else {
//				System.out.println("번호를 잘못 입력 하셨습니다."); 
//				return;
//			}
			
			
//			if(!(menu >=1 && menu <=3)) {
//				System.out.println("잘못 입력하셨습니다.");
//				return;
			switch(k) {

			case 1 : 
				System.out.printf("%d 원은\t%.2f달러 입니다.", won,(won * doll));
				break;
			case 2 : 
				System.out.printf("%d 원은\t%.2f유로 입니다.", won,(won * yen));
				break;
			case 3 : 
				System.out.printf("%d 원은\t%.2f유로 입니다.", won,(won * euro));
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				return;
			}



		}
	}	
}
