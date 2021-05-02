package vo;
import java.util.Scanner;

import vo.PhoneTest;
import vo.PhoneVO;

public class PhoneService2 {
	Scanner keyin = new Scanner(System.in);
	PhoneVO[] list = new PhoneVO[20];
	int count = 0;
	
	public PhoneService2() {
		int choice;
		
		while(true) {
			menu();
			choice = keyin.nextInt();
			switch(choice) {
			case 1 :
				input();
				break;
			case 2 :
				selectName();
				break;
			case 3 :
				selectRelation();
				break;
			case 4 :
				printAll();
				break;
			case 0 :
				
				break;
			default :
				System.out.println("** 메뉴 선택 오류. 다시 선택해 주세요");
			}
		}
	}
	/**
	 * 메뉴 화면
	 */
	public void menu() {
		System.out.println("   [[ 전화번호부 관리 ]]");
		System.out.println("-------------------------");
		System.out.println("   1) 입 력 ");
		System.out.println("   2) 이름으로 조회 ");
		System.out.println("   3) 관계로 조회 ");
		System.out.println("   4) 전체 출력 ");
		System.out.println("   0) 종 료 ");
		System.out.println("-------------------------");
		System.out.print  ("     > 선 택 : ");
	}
	/**
	 * 친구 정보 입력 : 나와의 관계를 입력할 때는 1)친구, 2)학교, 3)회사 외에는 입력불가
	 * 1을 선택하면 친구, 2를 선택하면 학교, 3을 선택하면 각 관계에 맞게 입력한다.
	 * 
	 */
	public void input() {
		if(count >= list.length) {
			System.out.println("** 더 이상 등록 할 수 없습니다.");
			return;
		}
		System.out.println("   [[ 본인과의 관계 ]]");
		System.out.println("----------------------");
		System.out.println("    친          구		 ");
		System.out.println("    학          교		 ");
		System.out.println("    회          사		 ");
		System.out.println("----------------------");
		System.out.print("     > 선 택 : ");		
		String relationship = keyin.next();
		
		String Friend = "친구";
		String School = "학교";
		String Company = "회사";
		for(int i=0;i<count;++i) {
			if(relationship == "1") {
				list[i].setRelationship(Friend);
				System.out.println("친구로 등록");
			} else if(relationship == "2") {
				list[i].setRelationship(School);
				System.out.println("학교로 등록");
			} else if(relationship == "3") {
				list[i].setRelationship(Company);
				System.out.println("회사로 등록");
			} else {
				System.out.println("문자를 잘 못 입력하셨습니다.");
			}
		}
		
		System.out.println();
		System.out.print("\n> 아이디를 입력 : ");
		String name  = keyin.next();
		for(int i = 0; i<count;++i) {
			if(list[i].getName().equals(name)) {
				System.out.println("동일한 아이디가 존재합니다.");
				return;
			}
		}
		System.out.print("> 전화번호를 입력 : ");
		String PhoneNo  = keyin.next();
		for (int i = 0; i < PhoneNo.length(); i++) {

			if (PhoneNo.charAt(i) < '0' || PhoneNo.charAt(i) > '9') {
				System.out.println("전화번호는 반드시 숫자로만 이루어져 있어야 합니다.");
				return;
			}
		}
		for(int i = 0; i<count;++i) {
			if(list[i].getPhone().equals(PhoneNo)) {
				System.out.println("동일한 전화번호가 존재합니다.");
				return;
			}
		}
		
		list[count] = new PhoneVO(relationship,name,PhoneNo);
		count++;
		System.out.println("가입이 완료 되었습니다.");
	}
	/**
	 * 이름을 입력받아 조회하여 출력
	 */
	public void selectName() {
		if(count == 0) {
			System.out.println("** 정보가 없습니다.");
			return;
		}
		System.out.print("> 아이디를 입력 : ");
		String name  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getName();
			if(uid.equals(name)) {
			System.out.println("\n   [[ 이    름 ]]");
			list[i].output();
			return;
			}
		}	
	}
	/**
	 * 관계를 입력받아 해당 관계의 데이터를 전부 출력
	 * 1)친구, 2)학교, 3)회사 중 하나를 입력받아 출력
	 */
	public void selectRelation() {
		if(count == 0) {
			System.out.println("** 정보가 없습니다.");
			return;
		}
		System.out.print("> 관계를 입력 : ");
		String relationship  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getRelationship();
			if(uid.equals(relationship)) {
			System.out.println("\n   [[ 본인과의 관계]]");
			list[i].output();
			return;
			}
		}	
	}
	
	/**
	 * 전체 데이터 조회
	 */
	public void printAll() {
		if(count == 0) {
			System.out.println("** 정보가 없습니다.");
			return;
		}
		System.out.println("\n  [[ 전체 회원 목록 ]]");
		for(int i=0; i<count;++i) {
			list[i].output();
		}
	}
}
