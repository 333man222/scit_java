package net.scit41.shop;

import java.util.Scanner;

public class ProductUI {	//사용자에게 보여지는 화면 전부 여기에서 처리...화면에 보여지는 모든 처리를 담당
							// 입력과 출력 결과에 관련한 모든 게 여기 담겨짐
	Scanner keyin = new Scanner(System.in);
	ProductService service = new ProductService();
	
	public ProductUI() { 
		String choice = null;
		
		while(true) {
			menu();
			choice = keyin.next();
			switch(choice) {
			
			case "1" :
				
				break;
			case "2" :
				
				break;
			case "3" :
				
				break;
			case "4" :
				
				break;
			case "5" :
				
				break;
			case "0" :
				System.out.println("**프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("메뉴 선택 오류");
				continue;
			}
		}
	}
	public void menu() {
		System.out.println("     [ 제품 정보 관리 ]      ");
		System.out.println("       1. 제품 등록                ");
		System.out.println("       2. 제품 조회                ");
		System.out.println("       3. 제품 전체조회         ");	//productCount도 같이 여기에 입력
		System.out.println("       4. 제품 수정                ");
		System.out.println("       5. 제품 삭제                ");
		System.out.println("       0. 종        료                ");
		System.out.println("============================");
		System.out.print("           번호 선택 > ");
		
	}

}
