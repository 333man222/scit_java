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
		System.out.println("    ģ          ��		 ");
		System.out.println("    ��          ��		 ");
		System.out.println("    ȸ          ��		 ");
		System.out.println("----------------------");
		System.out.print("     > �� �� : ");		
		String relationship = keyin.next();
		
		String Friend = "ģ��";
		String School = "�б�";
		String Company = "ȸ��";
		for(int i=0;i<count;++i) {
			if(relationship == "1") {
				list[i].setRelationship(Friend);
				System.out.println("ģ���� ���");
			} else if(relationship == "2") {
				list[i].setRelationship(School);
				System.out.println("�б��� ���");
			} else if(relationship == "3") {
				list[i].setRelationship(Company);
				System.out.println("ȸ��� ���");
			} else {
				System.out.println("���ڸ� �� �� �Է��ϼ̽��ϴ�.");
			}
		}
		
		System.out.println();
		System.out.print("\n> ���̵� �Է� : ");
		String name  = keyin.next();
		for(int i = 0; i<count;++i) {
			if(list[i].getName().equals(name)) {
				System.out.println("������ ���̵� �����մϴ�.");
				return;
			}
		}
		System.out.print("> ��ȭ��ȣ�� �Է� : ");
		String PhoneNo  = keyin.next();
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
		
		list[count] = new PhoneVO(relationship,name,PhoneNo);
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
		System.out.print("> ���̵� �Է� : ");
		String name  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getName();
			if(uid.equals(name)) {
			System.out.println("\n   [[ ��    �� ]]");
			list[i].output();
			return;
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
		System.out.print("> ���踦 �Է� : ");
		String relationship  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getRelationship();
			if(uid.equals(relationship)) {
			System.out.println("\n   [[ ���ΰ��� ����]]");
			list[i].output();
			return;
			}
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
