import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int money; // 원화 입력변수
		int menu; // 어떤 화폐?
		double exchange ; //환전된 금액
		String unit; //화폐단위를 입력
		
		System.out.println("원 단위 금액 입력 : ");
		money = input.nextInt();
		
		if(money<=0) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.println("환전할 화폐 (1:달러, 2:엔화, 3:유로화)");
		menu = input.nextInt();
		
		
		switch(menu) {
		
		case 1 : 
			exchange = (money / 1000) * 0.82;
			unit = "달러";
			break;
		case 2 : 
			exchange = (money / 1000) * 88.24;
			unit = "엔";
			break;
		case 3 : 
			exchange = (money / 1000) * 0.78;
			unit = "유로";
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.printf("%d원은%.2f%s입니다",money,exchange,unit);	
		
		
	}

}
