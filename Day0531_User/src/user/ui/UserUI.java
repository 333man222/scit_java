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
				System.out.println("** ���α׷� ����");
				return;
			default : 
				System.out.println("** �޴����� ����");
				continue;
			}
		}
	}	
	private void selectAll() {
		System.out.println("\n  [[ ��ü ȸ�� ���� ��ȸ ]]   ");
		System.out.println("============================");
		
		List<User> list = service.selectAll();
		
		for( User temp : list)
			System.out.println(temp);
	}

	private void update() {
		System.out.println("\n    [[ ȸ�� ���� ���� ]]    ");
		System.out.println("========================");
		String userid, userpwd, phone;
		
		System.out.print("  > �� �� �� : ");
		userid = keyin.next();
		
		User u = service.selectOne(userid);
		if(u == null) {
			System.out.println("**�������� �ʴ� ���̵��Դϴ�.");
			return;		
		}
		
		System.out.print("> ��й�ȣ : ");
		userpwd = keyin.next();
		
		System.out.print("> ��ȭ��ȣ(010-xxxx-xxxx) : ");
		phone = keyin.next();
		
		User user = new User(userid, userpwd, null, phone, null);
		int result = service.update(user);
		if(result == 0) System.out.println("** ���� ����");
		else System.out.println("** ���� �Ϸ�");
		
	}

	private void delete() {
		System.out.println("\n    [[ ȸ�� ���� ]]    ");
		System.out.println("========================");
		String userid;
		
		System.out.print("  > �� �� �� : ");
		userid = keyin.next();
		
		int result = service.delete(userid); 
		if(result == 0) System.out.println("** ������ �������� ����");
		else System.out.println("** ���� �Ϸ�");
	}

	private void selectOne() {
		System.out.println("\n    [[ ���� ��ȸ ]]    ");
		System.out.println("========================");
		String userid;
		
		System.out.print("  > �� �� �� : ");
		userid = keyin.next();
		
		User user = service.selectOne(userid);
		if(user == null) System.out.println("** ������ �������� ����");
		else System.out.println(user);
				
	}

	private void input() {
		System.out.println("\n    [[ ȸ�� ���� ]]    ");
		System.out.println("========================");
		
		String userid, userpwd, username, phone, birth;
		
		System.out.print("> �� �� �� : ");
		userid = keyin.next();
		
		User u = service.selectOne(userid);
		if(u != null) {
			System.out.println("** ��� �Ұ����� ���̵�");
			return;		
		}
		// CRUD ,, Ʈ����� commit
		System.out.print("> ��й�ȣ : ");
		userpwd = keyin.next();
		
		System.out.print("> ��      �� : ");
		username = keyin.next();
		
		System.out.print("> ��ȭ��ȣ(010-xxxx-xxxx) : ");
		phone = keyin.next();

		System.out.print("> �������(yy/mm/dd) : ");
		birth = keyin.next();
		
		User user = new User(userid, userpwd, username, phone, birth);

		int result = service.insert(user);
		
		
		if(result == 0) System.out.println("**ȸ������ ����");
		else System.out.println("** ȸ������ ����");
	}

	public void menu() {
		System.out.println("\n    [[ȸ�� ���� ����]]    ");
		System.out.println("==========================");
		System.out.println("      1) ȸ�� ����             ");
		System.out.println("      2) ȸ�� ���� ����      ");
		System.out.println("      3) ȸ�� ���� ����     ");
		System.out.println("      4) ȸ�� ���� ��ȸ      ");
		System.out.println("      5) ��ü ��ȸ             ");
		System.out.println("      0) ��       ��             ");
		System.out.println("=========================");
		System.out.print("          ���� > ");
	}
	
}
