package service;
import java.util.Scanner;

import vo.FitnessVO;

// CRUD = Create, Read, Update, Delete
//����� �����ϴ� Ŭ����, ����(Create), ��ȸ(Read, Retrieve), ����(Update), Ż��(Delete) ==>ó���ϴ°͵� �̹Ƿ� �����
public class FitnessService {
	Scanner keyin = new Scanner(System.in);
	FitnessVO[] list = new FitnessVO[2];
	int count = 0;		// ȸ���� Ȯ���� ���� ��
	
	
	public FitnessService() {
		int choice;
		
		while(true) {
			menu();	// refactoring => ���� ȿ�����̰� �ڵ带 �ٲ㳪���� ��
			
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
				System.out.println("***���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�޴������� �� �� �Ǿ����ϴ�.");
			}
		}
	}
	//ȭ�鿡 ����ϴ� �޴�
	public void menu() {
		System.out.println("   [ SCIT Fitness Club ]   ");
		System.out.println("===========================");
		System.out.println("       1 ) ȸ �� �� ��            ");
		System.out.println("       2 ) ȸ �� �� ȸ            ");
		System.out.println("       3 ) �� �� �� ��            ");
		System.out.println("       4 ) Ż	    ��            ");
		System.out.println("       5 ) �� ü �� ��            ");
		System.out.println("       0 ) ��	    ��            ");
		System.out.println("===========================");
		System.out.print("             >> ���� : ");

	}
	public void create() {
		if(count >= list.length) {
			System.out.println("������ �ʰ��Ǿ� ȸ�� ������ �� ��  �����ϴ�.");
			return;
		}
		
		System.out.println("\n   [[ ȸ������ ]]");
		System.out.print("> ���̵� �Է� : ");
		String userid  = keyin.next(); // ������ �Էµ� �������� ���� ���̵� �ִ��� Ȯ��
				//create��� ������ ��� �� �ܼ��� ��������
		for(int i = 0; i<count; ++i) {

			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("������ ���̵� �����մϴ�.");
				return;
			}
		}
				
		System.out.print(">  �̸� �Է� : ");
		String name = keyin.next();
		
		System.out.print(">  Ű(cm) �Է� : ");
		double height = keyin.nextDouble();
		
		System.out.print(">  ������(kg) �Է� : ");
		double weight = keyin.nextDouble();
		
		
		list[count] = new FitnessVO(userid, name, height, weight);
		count++;
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}
	// ��ȸ
	public void select() { // select = read = retrieve
		if(count == 0) {
			System.out.println("ȸ����ȸ�� �� ������ �����ϴ�.");
			return;
		}
		
		System.out.print("> ���̵� �Է� : ");
		String userid  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("\n   [[ ȸ�� ���� ]]");
	list[i].output();				//���
				return;
			}
		}	
		System.out.println("��ȸ�� ȸ���� �����ϴ�.");  
	}
	
//	// ������ Ű�� ������ �Ѵ� �Է¹޴´�.
//	// setter(���� ���ִ� �Լ�..)
	public void update() {
		if(count == 0) {
			System.out.println("��ȸ�� ������ �����ϴ�.");
			return;
		}
		
		System.out.print("> ���̵� �Է� : ");
		String userid  = keyin.next();
		
		for(int i = 0;i<count;++i) {
			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("\n   [[ ���� ���� ]]");
				list[i].output();	//��� - ���� ã�� ����

				System.out.print(">  Ű(cm) �Է� : ");
				double height = keyin.nextDouble();
				
				System.out.print(">  ������(kg) �Է� : ");
				double weight = keyin.nextDouble();
		
				list[i].setHeight(height);	
				list[i].setWeight(weight);	
				
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				
				return;
			}
		}  // end forLoop : ��ü ȸ���� �� ������	
		System.out.println("��ϵ� ȸ�������� �����ϴ�.");
	}
	
	//ȸ�� ���� ����
	public void delete() {
		if(count == 0) {
			System.out.println("** ������ �����ϴ�.");
			return;
		}
		System.out.print("> ���̵� �Է� : ");
		String userid  = keyin.next();
		for(int i = 0;i<count;++i) {
			String uid = list[i].getUserid();
			if(uid.equals(userid)) {
				System.out.println("\n   [[ ȸ�� ���� ]]");
				list[i].output();
				
				String answer ;
				System.out.print("** ������ Ż���Ͻðڽ��ϱ�(Y/n)?? ");
				answer = keyin.next();
				
				if(answer.equals("Y") || answer.equals("y") ) {
					for(int j=i;j < count-1; ++j)
						list[j] = list[j+1];
					count--;
					System.out.println("** Ż�� �Ϸ� �Ǿ����ϴ�");
					return;					
				} else {
					System.out.println("** Ż�� ó�� ��ҵǾ����ϴ�.");
				}
			}		
		}		
	System.out.println("\n  ��ϵ� ȸ���� �ƴϰų� �� �� �Է��ϼ̽��ϴ�.");
	

}

	//	��ü ȸ����� ���
	public void printAll() {
		if(count == 0) {
			System.out.println("��� �� ȸ���� �����ϴ�.");
			return;
		}
		System.out.println("\n  [[ ��ü ȸ�� ��� ]]");
		for(int i=0; i<count;++i) {
			list[i].output();
		}
		
	}
//	
}
