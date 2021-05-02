package service;
import java.util.Scanner;

import vo.FitnessVO;

// CRUD = Create, Read, Update, Delete
//기능을 수행하는 클래스, 가입(Create), 조회(Read, Retrieve), 수정(Update), 탈퇴(Delete) ==>처리하는것들 이므로 기능임
public class FitnessService {
	Scanner keyin = new Scanner(System.in);
	FitnessVO[] list = new FitnessVO[2];
	int count = 0;		// 회원수 확인을 위한 값
	
	
	public FitnessService() {
		int choice;
		
		while(true) {
			menu();	// refactoring => 보다 효율적이게 코드를 바꿔나가는 것
			
			choice = keyin.nextInt();
			switch(choice) {
			case 1 : 
				create();
				break;
			case 2 : 
				select();
				break;
			case 3 : 
				update();
				break;
			case 4 : 
				delete();
				break;
			case 5 :
				printAll();
				break;
			case 0 : 
				System.out.println("***프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("메뉴선택이 잘 못 되었습니다.");
			}
		}
	}
	//화면에 출력하는 메뉴
	public void menu() {
		System.out.println("   [ SCIT Fitness Club ]   ");
		System.out.println("===========================");
		System.out.println("       1 ) 회 원 가 입            ");
		System.out.println("       2 ) 회 원 조 회            ");
		System.out.println("       3 ) 정 보 수 정            ");
		System.out.println("       4 ) 탈	    퇴            ");
		System.out.println("       5 ) 전 체 출 력            ");
		System.out.println("       0 ) 종	    료            ");
		System.out.println("===========================");
		System.out.print("             >> 선택 : ");

	}
	public void create() {
		if(count >= list.length) {
			System.out.println("정원이 초과되어 회원 가입을 할 수  없습니다.");
			return;
		}
		
		System.out.println("\n   [[ 회원가입 ]]");
		System.out.print("> 아이디를 입력 : ");
		String userid  = keyin.next(); // 기존에 입력된 데이터중 동일 아이디가 있는지 확인
				//create라는 곳에서 사용 할 단순한 지역변수
		for(int i = 0; i<count; ++i) {

			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("동일한 아이디가 존재합니다.");
				return;
			}
		}
				
		System.out.print(">  이름 입력 : ");
		String name = keyin.next();
		
		System.out.print(">  키(cm) 입력 : ");
		double height = keyin.nextDouble();
		
		System.out.print(">  몸무게(kg) 입력 : ");
		double weight = keyin.nextDouble();
		
		
		list[count] = new FitnessVO(userid, name, height, weight);
		count++;
		System.out.println("가입이 완료 되었습니다.");
	}
	// 조회
	public void select() { // select = read = retrieve
		if(count == 0) {
			System.out.println("회원조회를 할 내용이 없습니다.");
			return;
		}
		
		System.out.print("> 아이디를 입력 : ");
		String userid  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("\n   [[ 회원 정보 ]]");
	list[i].output();				//출력
				return;
			}
		}	
		System.out.println("조회된 회원이 없습니다.");  
	}
	
//	// 수정은 키와 몸무게 둘다 입력받는다.
//	// setter(수정 해주는 함수..)
	public void update() {
		if(count == 0) {
			System.out.println("조회할 내용이 없습니다.");
			return;
		}
		
		System.out.print("> 아이디를 입력 : ");
		String userid  = keyin.next();
		
		for(int i = 0;i<count;++i) {
			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("\n   [[ 정보 수정 ]]");
				list[i].output();	//출력 - 내가 찾은 정보

				System.out.print(">  키(cm) 입력 : ");
				double height = keyin.nextDouble();
				
				System.out.print(">  몸무게(kg) 입력 : ");
				double weight = keyin.nextDouble();
		
				list[i].setHeight(height);	
				list[i].setWeight(weight);	
				
				System.out.println("수정이 완료되었습니다.");
				
				return;
			}
		}  // end forLoop : 전체 회원을 다 뒤져봄	
		System.out.println("등록된 회원정보가 없습니다.");
	}
	
	//회원 정보 삭제
	public void delete() {
		if(count == 0) {
			System.out.println("** 정보가 없습니다.");
			return;
		}
		System.out.print("> 아이디를 입력 : ");
		String userid  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("\n   [[ 회원 정보 ]]");
				list[i].output();
				
				String answer ;
				System.out.print("** 정말로 탈퇴하시겠습니까(Y/n)?? ");
				answer = keyin.next();
				
				if(answer.equals("Y") || answer.equals("y") ) {
					for(int j=i;j < count-1; ++j)
						list[j] = list[j+1];
					count--;
					System.out.println("** 탈퇴 완료 되었습니다");
					return;					
				} else {
					System.out.println("** 탈퇴 처리 취소되었습니다.");
				}
			}		
		}		
	System.out.println("\n  등록된 회원이 아니거나 잘 못 입력하셨습니다.");
	

}

	//	전체 회원목록 출력
	public void printAll() {
		if(count == 0) {
			System.out.println("등록 된 회원이 없습니다.");
			return;
		}
		System.out.println("\n  [[ 전체 회원 목록 ]]");
		for(int i=0; i<count;++i) {
			list[i].output();
		}
		
	}
//	
}
