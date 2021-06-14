package user.ui;

import java.util.List;
import java.util.Scanner;

import user.service.UserService;
import user.vo.User;

public class UserUI {
	Scanner keyin = new Scanner(System.in);
	UserService service = new UserService();
	public UserUI() {
		String choice = null;
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" :
				input();
				break;
			case "2" :
				update();			
				break;
			case "3" :
				delete();
				break;
			case "4" :
				selectOne();
				break;
			case "5" :
				selectAll();
				break;
			case "0" :
				System.out.println("** 프로그램 종료");
				return;
			default : 
				System.out.println("** 메뉴선택 오류");
				continue;
			}
		}
	}	
	private void selectAll() {
		System.out.println("\n  [[ 전체 회원 정보 조회 ]]   ");
		System.out.println("============================");
		
		List<User> list = service.selectAll();
		
		for( User temp : list)
			System.out.println(temp);
	}

	private void update() {
		System.out.println("\n    [[ 회원 정보 수정 ]]    ");
		System.out.println("========================");
		String userid, userpwd, phone;
		
		System.out.print("  > 아 이 디 : ");
		userid = keyin.next();
		
		User u = service.selectOne(userid);
		if(u == null) {
			System.out.println("**존재하지 않는 아이디입니다.");
			return;		
		}
		
		System.out.print("> 비밀번호 : ");
		userpwd = keyin.next();
		
		System.out.print("> 전화번호(010-xxxx-xxxx) : ");
		phone = keyin.next();
		
		User user = new User(userid, userpwd, null, phone, null);
		int result = service.update(user);
		if(result == 0) System.out.println("** 수정 오류");
		else System.out.println("** 수정 완료");
		
	}

	private void delete() {
		System.out.println("\n    [[ 회원 삭제 ]]    ");
		System.out.println("========================");
		String userid;
		
		System.out.print("  > 아 이 디 : ");
		userid = keyin.next();
		
		int result = service.delete(userid); 
		if(result == 0) System.out.println("** 정보가 존재하지 않음");
		else System.out.println("** 삭제 완료");
	}

	private void selectOne() {
		System.out.println("\n    [[ 정보 조회 ]]    ");
		System.out.println("========================");
		String userid;
		
		System.out.print("  > 아 이 디 : ");
		userid = keyin.next();
		
		User user = service.selectOne(userid);
		if(user == null) System.out.println("** 정보가 존재하지 않음");
		else System.out.println(user);
				
	}

	private void input() {
		System.out.println("\n    [[ 회원 가입 ]]    ");
		System.out.println("========================");
		
		String userid, userpwd, username, phone, birth;
		
		System.out.print("> 아 이 디 : ");
		userid = keyin.next();
		
		User u = service.selectOne(userid);
		if(u != null) {
			System.out.println("** 사용 불가능한 아이디");
			return;		
		}
		// CRUD ,, 트랜잭션 commit
		System.out.print("> 비밀번호 : ");
		userpwd = keyin.next();
		
		System.out.print("> 이      름 : ");
		username = keyin.next();
		
		System.out.print("> 전화번호(010-xxxx-xxxx) : ");
		phone = keyin.next();

		System.out.print("> 생년월일(yy/mm/dd) : ");
		birth = keyin.next();
		
		User user = new User(userid, userpwd, username, phone, birth);

		int result = service.insert(user);
		
		
		if(result == 0) System.out.println("**회원가입 실패");
		else System.out.println("** 회원가입 성공");
	}

	public void menu() {
		System.out.println("\n    [[회원 정보 관리]]    ");
		System.out.println("==========================");
		System.out.println("      1) 회원 가입             ");
		System.out.println("      2) 회원 정보 수정      ");
		System.out.println("      3) 회원 정보 삭제     ");
		System.out.println("      4) 회원 정보 조회      ");
		System.out.println("      5) 전체 조회             ");
		System.out.println("      0) 종       료             ");
		System.out.println("=========================");
		System.out.print("          선택 > ");
	}
	
}
