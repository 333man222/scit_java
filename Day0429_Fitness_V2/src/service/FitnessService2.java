package service;

import java.util.Scanner;

import vo.Fitness;

public class FitnessService2 {
	Scanner keyin = new Scanner(System.in);
	Fitness member;
	
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
				delete();
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
		if(member != null) {
			System.out.println("** 회원 가입을 할 수 없습니다.");
			return;
		}
		System.out.println("\n  [[ 회원가입 ]]");
		System.out.print("> 아이디를 입력 : ");
		String userid = keyin.next();
		
		System.out.print("> 이름 입력 : ");
		String name = keyin.next();
		
		System.out.print("> 키(cm)를 입력 : ");
		double height = keyin.nextDouble();
		
		System.out.print("> 몸무게(kg)를 입력 : ");
		double weight = keyin.nextDouble();
		
		member = new Fitness(userid, name, height, weight); 
		System.out.println("** 회원가입이 완료되었습니다.");
	}
	public void retrieve() {
		if(member == null) {
			System.out.println("** 조회할 내용이 없습니다.");
			return;
		}
		System.out.println("\n  [[ 조회된 정보 ]]");
		member.output();
	}
	// 키와 몸무게를 입력받는다.
	// setter
	public void update() {
		if(member == null) {
			System.out.println("** 정보가 없습니다.");
			return;
		}
		System.out.println("\n  [[ 정보 수정 ]]");
		System.out.print("> 키(cm)를 입력 : ");
		double height = keyin.nextDouble();
		
		System.out.print("> 몸무게(kg)를 입력 : ");
		double weight = keyin.nextDouble();	
	
		member.setWeight(weight);
		member.setHeight(height);
		System.out.println("** 수정이 완료되었습니다.");
	
	}
	
	public void delete() {
		if(member == null) {
			System.out.println("** 정보가 없습니다.");
			return;
		}
		System.out.println("\n  [[ 회원 탈퇴 ]]");
		
		member.output();
		
		String answer ;
		System.out.print("** 정말로 탈퇴하시겠습니까(Y/n)?? ");
		answer = keyin.next();
		
		if(answer.equals("Y")) {
			System.out.println("** 탈퇴 완료 되었습니다");
			member = null;
		}
		System.out.println("** 탈퇴 처리 취소되었습니다.");
	}
}
