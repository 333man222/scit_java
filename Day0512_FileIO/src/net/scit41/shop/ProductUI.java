package net.scit41.shop;

import java.util.Scanner;

public class ProductUI {	//����ڿ��� �������� ȭ�� ���� ���⿡�� ó��...ȭ�鿡 �������� ��� ó���� ���
							// �Է°� ��� ����� ������ ��� �� ���� �����
	Scanner keyin = new Scanner(System.in);
	ProductService service = new ProductService();
	
	public ProductUI() { 
		String choice = null;
		
		while(true) {
			menu();
			choice = keyin.next();
			switch(choice) {
			
			case "1" :
				
				break;
			case "2" :
				
				break;
			case "3" :
				
				break;
			case "4" :
				
				break;
			case "5" :
				
				break;
			case "0" :
				System.out.println("**���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�޴� ���� ����");
				continue;
			}
		}
	}
	public void menu() {
		System.out.println("     [ ��ǰ ���� ���� ]      ");
		System.out.println("       1. ��ǰ ���                ");
		System.out.println("       2. ��ǰ ��ȸ                ");
		System.out.println("       3. ��ǰ ��ü��ȸ         ");	//productCount�� ���� ���⿡ �Է�
		System.out.println("       4. ��ǰ ����                ");
		System.out.println("       5. ��ǰ ����                ");
		System.out.println("       0. ��        ��                ");
		System.out.println("============================");
		System.out.print("           ��ȣ ���� > ");
		
	}

}
