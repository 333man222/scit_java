import java.util.Scanner;

// CRUD = Create, Read, Update, Delete
//����� �����ϴ� Ŭ����, ����(Create), ��ȸ(Read, Retrieve), ����(Update), Ż��(Delete) ==>ó���ϴ°͵� �̹Ƿ� �����
public class FitnessService {
	Scanner keyin = new Scanner(System.in);
	FitnessVO member;
	
	public FitnessService() {


		int choice;
		while(true) {
			choice = menu();
			
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
			case 0 : 
				System.out.println("***���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�޴������� �� �� �Ǿ����ϴ�.");
			}
		}
	}
	//ȭ�鿡 ����ϴ� �޴�
	public int menu() {
		System.out.println("   [ SCIT Fitness Club ]   ");
		System.out.println("===========================");
		System.out.println("       1 ) ȸ �� �� ��            ");
		System.out.println("       2 ) ȸ �� �� ȸ            ");
		System.out.println("       3 ) �� �� �� ��            ");
		System.out.println("       4 ) Ż	    ��            ");
		System.out.println("       0 ) ��	    ��            ");
		System.out.println("===========================");
		System.out.print("             >> ���� : ");
		int choice = keyin.nextInt();
		return choice;
	}
	public void create() {
		if(member != null) {
			System.out.println("������ �ʰ��Ǿ� ȸ�� ������ �� ��  �����ϴ�.");
			return;
		}
		System.out.println("\n   [[ ȸ������ ]]");
		System.out.print("> ���̵� �Է� : ");
		String userid  = keyin.next();
				//create��� ������ ��� �� �ܼ��� ��������
		System.out.print(">  �̸� �Է� : ");
		String name = keyin.next();
		
		System.out.print(">  Ű(cm) �Է� : ");
		double height = keyin.nextDouble();
		
		System.out.print(">  ������(kg) �Է� : ");
		double weight = keyin.nextDouble();
		
		member = new FitnessVO(userid, name, height, weight); ///<<<<<<<<<
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}
	public void select() { // select = read = retrieve
		if(member == null) {
			System.out.println("��� �� ȸ���� ȸ����ȸ�� �� �� �ֽ��ϴ�.");
			return;
		}
		System.out.println("\n   [[ ȸ�� ���� ]]");
		member.output();  
	}
	// ������ Ű�� ������ �Ѵ� �Է¹޴´�.
	// setter(���� ���ִ� �Լ�..)
	public void update() {
		if(member == null) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		System.out.println("\n   [[ ���� ���� ]]");
		System.out.print(">  Ű(cm) �Է� : ");
		double height = keyin.nextDouble();
		
		System.out.print(">  ������(kg) �Է� : ");
		double weight = keyin.nextDouble();
		
		member.setHeight(height);	
		member.setWeight(weight);	
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
	}
	public void delete() {
		System.out.println("Ż�� ����!\n");
	}
}
