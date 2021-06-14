package vo;
import java.util.Scanner;

import vo.PhoneTest;
import vo.PhoneVO;

public class PhoneService {
	Scanner keyin = new Scanner(System.in);
	PhoneVO[] list = new PhoneVO[20];
	int count = 0;

	public PhoneService() {
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
				System.out.println("***프로그램을 종료합니다.");
				return;
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
		System.out.println("   1) 친          구		 ");
		System.out.println("   2) 학          교		 ");
		System.out.println("   3) 회          사		 ");
		System.out.println("----------------------");
		System.out.print  ("     > 선 택 : ");
		String relationship = keyin.next();

		PhoneVO phoneVO = new PhoneVO();
		switch(relationship) {			
		case "1" :
			phoneVO.setRelationship("친구");
			System.out.println("1)친구로 등록");
			break;
		case "2" : 
			phoneVO.setRelationship("학교");
			System.out.println("2)학교로 등록");
			break;
		case "3" : 
			phoneVO.setRelationship("회사");
			System.out.println("3)회사로 등록");
			break;
		default : 
			System.out.println("번호를 잘 못 입력하셨습니다.");
			return;
		}


		System.out.print("\n> 이름을 입력 : ");
		String name  = keyin.next();

		phoneVO.setName(name);
		for(int i = 0; i<count;++i) {
			if(list[i].getName().equals(name)) {
				System.out.println("동일한 아이디가 존재합니다.");
				return;
			}
		}
		System.out.print("> 전화번호를 입력 : ");
		String PhoneNo  = keyin.next();
		phoneVO.setPhone(PhoneNo);
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
		//		list[count] = new PhoneVO(relationship,name,PhoneNo);
		list[count] = phoneVO;
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
		System.out.print("> 이름을 입력 : ");
		String name  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getName();
			if(uid.equals(name)) {
				System.out.println("\n   [[ 이    름 ]]");
				list[i].output();
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
		System.out.print("> 1)친구 2)학교 3)회사 : ");
		String relationship  = keyin.next();
		switch(relationship) {
		case "1" : relationship = "친구"; break;
		case "2" : relationship = "학교"; break;
		case "3" : relationship = "회사"; break;
		}			
		for(int i=0; i<count; ++i)
			if(list[i].getRelationship().equals(relationship)) {
				list[i].output();
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
