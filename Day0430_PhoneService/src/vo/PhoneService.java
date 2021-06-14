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
				System.out.println("***���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("** �޴� ���� ����. �ٽ� ������ �ּ���");
			}
		}
	}
	/**
	 * �޴� ȭ��
	 */
	public void menu() {
		System.out.println("   [[ ��ȭ��ȣ�� ���� ]]");
		System.out.println("-------------------------");
		System.out.println("   1) �� �� ");
		System.out.println("   2) �̸����� ��ȸ ");
		System.out.println("   3) ����� ��ȸ ");
		System.out.println("   4) ��ü ��� ");
		System.out.println("   0) �� �� ");
		System.out.println("-------------------------");
		System.out.print  ("     > �� �� : ");
	}
	/**
	 * ģ�� ���� �Է� : ������ ���踦 �Է��� ���� 1)ģ��, 2)�б�, 3)ȸ�� �ܿ��� �ԷºҰ�
	 * 1�� �����ϸ� ģ��, 2�� �����ϸ� �б�, 3�� �����ϸ� �� ���迡 �°� �Է��Ѵ�.
	 * 
	 */
	public void input() {
		if(count >= list.length) {
			System.out.println("** �� �̻� ��� �� �� �����ϴ�.");
			return;
		}
		System.out.println("   [[ ���ΰ��� ���� ]]");
		System.out.println("----------------------");
		System.out.println("   1) ģ          ��		 ");
		System.out.println("   2) ��          ��		 ");
		System.out.println("   3) ȸ          ��		 ");
		System.out.println("----------------------");
		System.out.print  ("     > �� �� : ");
		String relationship = keyin.next();

		PhoneVO phoneVO = new PhoneVO();
		switch(relationship) {			
		case "1" :
			phoneVO.setRelationship("ģ��");
			System.out.println("1)ģ���� ���");
			break;
		case "2" : 
			phoneVO.setRelationship("�б�");
			System.out.println("2)�б��� ���");
			break;
		case "3" : 
			phoneVO.setRelationship("ȸ��");
			System.out.println("3)ȸ��� ���");
			break;
		default : 
			System.out.println("��ȣ�� �� �� �Է��ϼ̽��ϴ�.");
			return;
		}


		System.out.print("\n> �̸��� �Է� : ");
		String name  = keyin.next();

		phoneVO.setName(name);
		for(int i = 0; i<count;++i) {
			if(list[i].getName().equals(name)) {
				System.out.println("������ ���̵� �����մϴ�.");
				return;
			}
		}
		System.out.print("> ��ȭ��ȣ�� �Է� : ");
		String PhoneNo  = keyin.next();
		phoneVO.setPhone(PhoneNo);
		for (int i = 0; i < PhoneNo.length(); i++) {

			if (PhoneNo.charAt(i) < '0' || PhoneNo.charAt(i) > '9') {
				System.out.println("��ȭ��ȣ�� �ݵ�� ���ڷθ� �̷���� �־�� �մϴ�.");
				return;
			}
		}
		for(int i = 0; i<count;++i) {
			if(list[i].getPhone().equals(PhoneNo)) {
				System.out.println("������ ��ȭ��ȣ�� �����մϴ�.");
				return;
			}
		}
		//		list[count] = new PhoneVO(relationship,name,PhoneNo);
		list[count] = phoneVO;
		count++;
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}
	/**
	 * �̸��� �Է¹޾� ��ȸ�Ͽ� ���
	 */
	public void selectName() {
		if(count == 0) {
			System.out.println("** ������ �����ϴ�.");
			return;
		}
		System.out.print("> �̸��� �Է� : ");
		String name  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getName();
			if(uid.equals(name)) {
				System.out.println("\n   [[ ��    �� ]]");
				list[i].output();
			}
		}	
	}
	/**
	 * ���踦 �Է¹޾� �ش� ������ �����͸� ���� ���
	 * 1)ģ��, 2)�б�, 3)ȸ�� �� �ϳ��� �Է¹޾� ���
	 */
	public void selectRelation() {
		if(count == 0) {
			System.out.println("** ������ �����ϴ�.");
			return;
		}
		System.out.print("> 1)ģ�� 2)�б� 3)ȸ�� : ");
		String relationship  = keyin.next();
		switch(relationship) {
		case "1" : relationship = "ģ��"; break;
		case "2" : relationship = "�б�"; break;
		case "3" : relationship = "ȸ��"; break;
		}			
		for(int i=0; i<count; ++i)
			if(list[i].getRelationship().equals(relationship)) {
				list[i].output();
			}
	}

	/**
	 * ��ü ������ ��ȸ
	 */
	public void printAll() {
		if(count == 0) {
			System.out.println("** ������ �����ϴ�.");
			return;
		}
		System.out.println("\n  [[ ��ü ȸ�� ��� ]]");
		for(int i=0; i<count;++i) {
			list[i].output();
		}
	}
}
