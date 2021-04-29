package service;

import java.util.Scanner;

import vo.Fitness;

public class FitnessService2 {
	Scanner keyin = new Scanner(System.in);
	Fitness[] list = new Fitness[50];
	int count = 0;
	
	public FitnessService2() {
		int choice;
		
		while(true) {
			choice = menu();
			
			switch(choice) {
			case 1 :
				create();
				break;
			case 2 :
				retrieve();
				break;
			case 3 :
				update();
				break;
			case 4 :
				// delete();
				break;
			case 0 :
				System.out.println("*** 프로그램 종료합니다.");
				return;
			default : 
				System.out.println("*** 메뉴 선택 오류.");
			}
		}
	}
	// 화면에 출력하는 메뉴 
	public int menu() {
		System.out.println("  [ SCIT Fitness Club ] ");
		System.out.println("=========================");
		System.out.println("       1) 회 원 가 입");
		System.out.println("       2) 회 원 조 회");
		System.out.println("       3) 정 보 수 정");
		System.out.println("       4) 탈         퇴");
		System.out.println("       0) 종         료");
		System.out.println("=========================");
		System.out.print  ("         >> 선 택 : ");
		int choice = keyin.nextInt();
		return choice;
	}
	public void create() {
			
		if(count >= list.length) {
			System.out.println("** 회원 가입을 할 수 없습니다.");
			return;
		}
		System.out.println("\n  [[ 회원가입 ]]");
		System.out.print("> 아이디를 입력 : ");
		String userid = keyin.next();
		for(int i =0; i<count;++i) {
			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("동일한 아이디가 존재합니다.");
				return;
			}
		}
		
		System.out.print("> 이름 입력 : ");
		String name = keyin.next();
		
		System.out.print("> 키(cm)를 입력 : ");
		double height = keyin.nextDouble();
		
		System.out.print("> 몸무게(kg)를 입력 : ");
		double weight = keyin.nextDouble();
		
		list[count] = new Fitness(userid, name, height, weight); 
		count++;
		System.out.println("** 회원가입이 완료되었습니다.");
		
		
	}
	public void retrieve() {
		if(list[count] == null) {
			System.out.println("** 조회할 내용이 없습니다.");
			return;
		}
		System.out.print("> 아이디를 입력 : ");
		String userid = keyin.next();
		for(int i =0; i<count;++i) {
			if(list[i].getUserid() == userid) {
				System.out.println("회원 정보");
				list[i].output();
				return;
			}
		}
		System.out.println("일치하는 정보가 없습니다.");

	}
//	// 키와 몸무게를 입력받는다.
//	// setter
	public void update() {
		if(list[count] == null) {
			System.out.println("** 정보가 없습니다.");
			return;
		}
	
		
		System.out.println("변경 하고 싶은 항목 입력");
		System.out.println("     1) 신장 수정          ");
		System.out.println("     2) 몸무게 수정       ");
		System.out.println("======================");
		System.out.print("번호 입력 : ");
		int set = keyin.nextInt();

		while(true) {
			switch(set){
			case 1 :
				System.out.println("\n  [[ 정보 수정 ]]");
				System.out.print("> 키(cm)를 입력 : ");
				double height = keyin.nextDouble();
				list[count].setHeight(height);
				break;
			case 2 :
				System.out.print("> 몸무게(kg)를 입력 : ");
				double weight = keyin.nextDouble();
				list[count].setWeight(weight);
				break;
				
			default : 
				System.out.println("번호를 잘 못 입력하셨습니다.");
				return;
			}	
			System.out.println("** 수정이 완료되었습니다.");
		}
		
	}
//	
//	public void delete() {
//		if(member == null) {
//			System.out.println("** 정보가 없습니다.");
//			return;
//		}
//		System.out.println("\n  [[ 회원 탈퇴 ]]");
//		
//		member.output();
//		
//		String answer ;
//		System.out.print("** 정말로 탈퇴하시겠습니까(Y/n)?? ");
//		answer = keyin.next();
//		
//		if(answer.equals("Y")) {
//			System.out.println("** 탈퇴 완료 되었습니다");
//			member = null;
//		}
//		System.out.println("** 탈퇴 처리 취소되었습니다.");
//	}
}
