import java.util.Scanner;

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
		if(count >= 20) {
			System.out.println("\n\n-------------------------");
			System.out.println("** 더 이상 정보를 입력할 수 없습니다.");
			System.out.println("-------------------------\n\n");
			return;
		}
		
		PhoneVO phoneVO = new PhoneVO();
		
		System.out.println("\n이름을 입력해 주세요.");
		phoneVO.setName(keyin.next());
		
		System.out.println("\n전화번호를 입력해주세요.");
		phoneVO.setPhone(keyin.next());
		
		System.out.println("\n관계를 선택해주세요. (1:친구, 2:학교, 3:회사)");		
		int choice = keyin.nextInt();
		String relationship = "";
		
		switch (choice) {
			case 1:
				relationship = "친구";
				break;
				
			case 2:
				relationship = "학교";
				break;
				
			case 3:
				relationship = "회사";
				break;
				
			default:
				System.out.println("\n\n-------------------------");
				System.out.println("1~3 옵션 중에 선택해주세요.");
				System.out.println("-------------------------\n\n");
		}
		phoneVO.setRelationship(relationship);
		
		output(phoneVO, "입력 결과");
		
		list[count] = phoneVO;
		count++;
	}
	/**
	 * 이름을 입력받아 조회하여 출력
	 */
	public void selectName() {
		if(count == 0) {
			System.out.println("\n\n-------------------------");
			System.out.println("** 정보가 없습니다.");
			System.out.println("-------------------------\n\n");
			return;
		}
		
		System.out.println("\n [검색] 이름을 입력해주세요.");
		String name = keyin.next();
		
		PhoneVO phoneVO = null;
		for (int i=0; i<list.length; i++) {
			if (list[i] == null) {
				continue;
			}
			
			if (list[i].getName().equalsIgnoreCase(name)) {
				phoneVO = list[i];
				break;
			}
		}
		
		if (phoneVO == null) {
			System.out.println("\n\n-------------------------");
			System.out.println(" " + name + "님의 정보가 없습니다.");
			System.out.println("-------------------------\n\n");
			return;
		}
		
		output(phoneVO, name);
	}
	/**
	 * 관계를 입력받아 해당 관계의 데이터를 전부 출력
	 * 1)친구, 2)학교, 3)회사 중 하나를 입력받아 출력
	 */
	public void selectRelation() {
		if(count == 0) {
			System.out.println("\n\n-------------------------");
			System.out.println("** 정보가 없습니다.");
			System.out.println("-------------------------\n\n");
			return;
		}
		
		System.out.println("\n [검색] 관계를 선택해주세요. (1:친구, 2:학교, 3:회사)");
		int choice = keyin.nextInt();
		String relationship = "";
		
		switch (choice) {
			case 1:
				relationship = "친구";
				break;
				
			case 2:
				relationship = "학교";
				break;
				
			case 3:
				relationship = "회사";
				break;
				
			default:
				System.out.println("\n\n-------------------------");
				System.out.println("관계를 올바르게 선택해주세요.");
				System.out.println("-------------------------\n\n");
				return;
		}
		
		PhoneVO[] relationshipList = new PhoneVO[count];
		boolean isMatch = false;
		for (int i=0; i<list.length; i++) {
			if (list[i] == null) {
				continue;
			}
			
			if (list[i].getRelationship().equalsIgnoreCase(relationship)) {
				relationshipList[i] = list[i];
				isMatch = true;
			}
		}
		
		if (!isMatch) {
			System.out.println("\n\n-------------------------");
			System.out.println(" " + relationship + "와 관계된 정보가 없습니다.");
			System.out.println("-------------------------\n\n");
			return;
		}
		
		output(relationshipList, relationship + " 관계");
	}
	
	/**
	 * 전체 데이터 조회
	 */
	public void printAll() {
		if(count == 0) {
			System.out.println("\n\n-------------------------");
			System.out.println("** 정보가 없습니다.");
			System.out.println("-------------------------\n\n");
			return;
		}
		
		output(list, "전체");
	}
	
	/**
	 * 출력문 (PhoneVO)
	 */
	public void output(PhoneVO phoneVO, String title) {
		System.out.println("\n\n   [[ " + title + " 조회 ]]");
		System.out.println("----------------------------");
		System.out.println("   이름 : " + phoneVO.getName());
		System.out.println("   전화번호 : " + phoneVO.getPhone());
		System.out.println("   관계 : " + phoneVO.getRelationship());
		System.out.println("----------------------------\n\n\n\n");

	}

	/**
	 * 출력문 (PhoneVO[])
	 */
	public void output(PhoneVO[] list, String title) {
		System.out.println("\n\n   [[ " + title + " 조회 ]]");
		System.out.println("----------------------------");
		for (int i=0; i<list.length; i++) {
			if (list[i] == null) {
				continue;
			}
			
			System.out.println("   이름 : " + list[i].getName());
			System.out.println("   전화번호 : " + list[i].getPhone());
			System.out.println("   관계 : " + list[i].getRelationship());			
			System.out.println();			
		}
		System.out.println("----------------------------\n\n\n\n");
	}
}