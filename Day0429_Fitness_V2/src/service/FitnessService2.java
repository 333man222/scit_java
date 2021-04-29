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
				System.out.println("*** ���α׷� �����մϴ�.");
				return;
			default : 
				System.out.println("*** �޴� ���� ����.");
			}
		}
	}
	// ȭ�鿡 ����ϴ� �޴� 
	public int menu() {
		System.out.println("  [ SCIT Fitness Club ] ");
		System.out.println("=========================");
		System.out.println("       1) ȸ �� �� ��");
		System.out.println("       2) ȸ �� �� ȸ");
		System.out.println("       3) �� �� �� ��");
		System.out.println("       4) Ż         ��");
		System.out.println("       0) ��         ��");
		System.out.println("=========================");
		System.out.print  ("         >> �� �� : ");
		int choice = keyin.nextInt();
		return choice;
	}
	public void create() {
		if(member != null) {
			System.out.println("** ȸ�� ������ �� �� �����ϴ�.");
			return;
		}
		System.out.println("\n  [[ ȸ������ ]]");
		System.out.print("> ���̵� �Է� : ");
		String userid = keyin.next();
		
		System.out.print("> �̸� �Է� : ");
		String name = keyin.next();
		
		System.out.print("> Ű(cm)�� �Է� : ");
		double height = keyin.nextDouble();
		
		System.out.print("> ������(kg)�� �Է� : ");
		double weight = keyin.nextDouble();
		
		member = new Fitness(userid, name, height, weight); 
		System.out.println("** ȸ�������� �Ϸ�Ǿ����ϴ�.");
	}
	public void retrieve() {
		if(member == null) {
			System.out.println("** ��ȸ�� ������ �����ϴ�.");
			return;
		}
		System.out.println("\n  [[ ��ȸ�� ���� ]]");
		member.output();
	}
	// Ű�� �����Ը� �Է¹޴´�.
	// setter
	public void update() {
		if(member == null) {
			System.out.println("** ������ �����ϴ�.");
			return;
		}
		System.out.println("\n  [[ ���� ���� ]]");
		System.out.print("> Ű(cm)�� �Է� : ");
		double height = keyin.nextDouble();
		
		System.out.print("> ������(kg)�� �Է� : ");
		double weight = keyin.nextDouble();	
	
		member.setWeight(weight);
		member.setHeight(height);
		System.out.println("** ������ �Ϸ�Ǿ����ϴ�.");
	
	}
	
	public void delete() {
		if(member == null) {
			System.out.println("** ������ �����ϴ�.");
			return;
		}
		System.out.println("\n  [[ ȸ�� Ż�� ]]");
		
		member.output();
		
		String answer ;
		System.out.print("** ������ Ż���Ͻðڽ��ϱ�(Y/n)?? ");
		answer = keyin.next();
		
		if(answer.equals("Y")) {
			System.out.println("** Ż�� �Ϸ� �Ǿ����ϴ�");
			member = null;
		}
		System.out.println("** Ż�� ó�� ��ҵǾ����ϴ�.");
	}
}
