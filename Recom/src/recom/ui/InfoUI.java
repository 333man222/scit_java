package recom.ui;

import java.util.List;
import java.util.Scanner;
import recom.vo.Recom;
import recom.service.RecomService;

public class InfoUI {
	Scanner keyin = new Scanner(System.in);
	RecomService r = new RecomService();
	
	public InfoUI() {
		String exer= null;
		
		while(true) {
			menu();
			exer = keyin.next();
			
			switch(exer) {
			case "1" : 
				insertrecom();
				break;
			case "2" :
				selectAllrecom();
				break;
			case "3" :     //타입별 운동 조회
				searchtyperecom();
				break;
			case "4" :
				searchrecom();
				break;
			case "5" :
				deleterecom();
				break;
			case "6" :
				updaterecom();
				break;
			case "7" :
			case "0" : 
				System.out.println("** 프로그램을 종료합니다");
				return;
			default : 
				System.out.println("** 메뉴를 다시 선택해주세요");
			}
			break;
		}
	}
	private void searchtyperecom() {
			System.out.println("\n  [[ 타입별 운동 조회 ]]");
			System.out.println("=======================");

			String type;
			
			System.out.print("> 검색할 타입 : ");
			type = keyin.next();
			
			List<Recom> list=service.searchtyperecom(type);
			
			if(list == null) System.out.println("** 정보가 존재하지 않음");
			else System.out.println(list);
		
		
	}
	private void selectAllrecom() {
		System.out.println("\n    [[ 전체 조회 ]]");
		System.out.println("=======================");
		
		List<Recom> list=service.selectAllrecom();
		
		for(Recom temp:list)
			System.out.println(temp);
	}
	private void updaterecom() {
		System.out.println("\n  [[ 운동 정보 수정 ]]");
		System.out.println("=======================");

		String recomid, recomexer; int kcal;
		
		System.out.print("> 운동 ID : ");
		recomid = keyin.next();
		
		Recom r = service.searchrecom(recomid);
		if(r == null) {
			System.out.println("** 존재하지 않는 아이디입니다.");
			return;
		}		
		
		System.out.print("> 추천운동: ");
		recomexer = keyin.next();
		if(recomexer == null) {
			System.out.println("**추천운동을 입력하세요!");
		}
		
		System.out.print("> 소모칼로리: ");
		kcal = keyin.nextInt();
		if(kcal == 0) {
			System.out.println("**소모칼로리를 입력하세요!");
		}
		
		Recom recom = new Recom(recomid, recomexer, kcal);
		int result = service.updaterecom(recom);
		
		if(result == 0) System.out.println("** 수정 오류");
		else System.out.println("** 수정 성공");
		
	}
	private void deleterecom() {
		System.out.println("\n  [[ 운동 삭제 ]]");
		System.out.println("=======================");

		String recomid;
		
		System.out.print("> 운동 ID : ");
		recomid = keyin.next();
		
		int result = service.deleterecom(recomid);
		
		if(result == 0) System.out.println("** 삭제 실패");
		else System.out.println("** 삭제 성공");
	}
	
	private void searchrecom() {
		System.out.println("\n  [[ 운동 조회 ]]");
		System.out.println("=======================");

		String recomid;
		
		System.out.print("> 운동 ID : ");
		recomid = keyin.next();
		
		Recom recom = service.searchrecom(recomid);
		
		if(recom == null) System.out.println("** 정보가 존재하지 않음");
		else System.out.println(recom);
	}
	
	private void insertrecom() {
		System.out.println("\n [[운동 정보 입력]]");
		System.out.println("=====================");
		
		String recomid, recomexer; int kcal;
		
		System.out.print("> 운동 ID: ");
		recomid = keyin.next();
		
		Recom r = service.searchrecom(recomid);
		if(r != null) {
			System.out.println("** 사용 불가능한 아이디입니다.");
			return;
		}
				
		System.out.print("> 추천운동: ");
		recomexer = keyin.next();
		if(recomexer == null) {
			System.out.println("**추천운동을 입력하세요!");
		}
		
		System.out.print("> 소모칼로리: ");
		kcal = keyin.nextInt();
		if(kcal == 0) {
			System.out.println("**소모칼로리를 입력하세요!");
		}
		
		Recom recom = new Recom(recomid, recomexer,kcal);
		
		int result = service.insertrecom(recom);
		
		if(result == 0) System.out.println("** 입력 실패");
		else            System.out.println("** 입력 성공");
	}
	
//	case "4"{
//	
//	   while(true) {
//		      System.out.println("\n [[추천 운동정보 관리]]");
//		      System.out.println("=================");
//		      System.out.println("1. 회원 신체 정보 입력");
//		      System.out.println("2. 회원 신체 정보 조회");
//		      System.out.println("3. 회원 신체 정보 수정");
//		      System.out.println("4. 회원 신체 정보 삭제");
//		      System.out.println("0. 종                 료");   
//		      System.out.println("=======================");
//		      System.out.print("> 번호 입력 : ");
//		      num4 = keyin.nextLine(); 
//
//		      switch(num4) {
//		      case "1" :    
//		      }
//		 }
//	  }
	
	private void menu() {
		System.out.println("\n [[추천 운동 정보 관리]]");
		System.out.println("=================");
		System.out.println("1. 운동 정보 입력");
		System.out.println("2. 전체운동목록 조회");
		System.out.println("3. 타입별 운동 조회");
		System.out.println("4. 운동 정보 조회");
		System.out.println("5. 운동 종류 삭제");
		System.out.println("6. 운동 정보 수정");		
		System.out.println("0. 프로그램 종료");
		System.out.println("=================");
		System.out.print(">>당신의 선택: ");
		
	}
}
















