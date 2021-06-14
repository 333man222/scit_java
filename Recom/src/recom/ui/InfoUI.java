package recom.ui;

import java.util.List;
import java.util.Scanner;
import recom.vo.Recom;
import recom.service.RecomService;

public class InfoUI {
	Scanner keyin = new Scanner(System.in);
	RecomService r = new RecomService();
	
	public InfoUI() {
		String exer= null;
		
		while(true) {
			menu();
			exer = keyin.next();
			
			switch(exer) {
			case "1" : 
				insertrecom();
				break;
			case "2" :
				selectAllrecom();
				break;
			case "3" :     //Ÿ�Ժ� � ��ȸ
				searchtyperecom();
				break;
			case "4" :
				searchrecom();
				break;
			case "5" :
				deleterecom();
				break;
			case "6" :
				updaterecom();
				break;
			case "7" :
			case "0" : 
				System.out.println("** ���α׷��� �����մϴ�");
				return;
			default : 
				System.out.println("** �޴��� �ٽ� �������ּ���");
			}
			break;
		}
	}
	private void searchtyperecom() {
			System.out.println("\n  [[ Ÿ�Ժ� � ��ȸ ]]");
			System.out.println("=======================");

			String type;
			
			System.out.print("> �˻��� Ÿ�� : ");
			type = keyin.next();
			
			List<Recom> list=service.searchtyperecom(type);
			
			if(list == null) System.out.println("** ������ �������� ����");
			else System.out.println(list);
		
		
	}
	private void selectAllrecom() {
		System.out.println("\n    [[ ��ü ��ȸ ]]");
		System.out.println("=======================");
		
		List<Recom> list=service.selectAllrecom();
		
		for(Recom temp:list)
			System.out.println(temp);
	}
	private void updaterecom() {
		System.out.println("\n  [[ � ���� ���� ]]");
		System.out.println("=======================");

		String recomid, recomexer; int kcal;
		
		System.out.print("> � ID : ");
		recomid = keyin.next();
		
		Recom r = service.searchrecom(recomid);
		if(r == null) {
			System.out.println("** �������� �ʴ� ���̵��Դϴ�.");
			return;
		}		
		
		System.out.print("> ��õ�: ");
		recomexer = keyin.next();
		if(recomexer == null) {
			System.out.println("**��õ��� �Է��ϼ���!");
		}
		
		System.out.print("> �Ҹ�Į�θ�: ");
		kcal = keyin.nextInt();
		if(kcal == 0) {
			System.out.println("**�Ҹ�Į�θ��� �Է��ϼ���!");
		}
		
		Recom recom = new Recom(recomid, recomexer, kcal);
		int result = service.updaterecom(recom);
		
		if(result == 0) System.out.println("** ���� ����");
		else System.out.println("** ���� ����");
		
	}
	private void deleterecom() {
		System.out.println("\n  [[ � ���� ]]");
		System.out.println("=======================");

		String recomid;
		
		System.out.print("> � ID : ");
		recomid = keyin.next();
		
		int result = service.deleterecom(recomid);
		
		if(result == 0) System.out.println("** ���� ����");
		else System.out.println("** ���� ����");
	}
	
	private void searchrecom() {
		System.out.println("\n  [[ � ��ȸ ]]");
		System.out.println("=======================");

		String recomid;
		
		System.out.print("> � ID : ");
		recomid = keyin.next();
		
		Recom recom = service.searchrecom(recomid);
		
		if(recom == null) System.out.println("** ������ �������� ����");
		else System.out.println(recom);
	}
	
	private void insertrecom() {
		System.out.println("\n [[� ���� �Է�]]");
		System.out.println("=====================");
		
		String recomid, recomexer; int kcal;
		
		System.out.print("> � ID: ");
		recomid = keyin.next();
		
		Recom r = service.searchrecom(recomid);
		if(r != null) {
			System.out.println("** ��� �Ұ����� ���̵��Դϴ�.");
			return;
		}
				
		System.out.print("> ��õ�: ");
		recomexer = keyin.next();
		if(recomexer == null) {
			System.out.println("**��õ��� �Է��ϼ���!");
		}
		
		System.out.print("> �Ҹ�Į�θ�: ");
		kcal = keyin.nextInt();
		if(kcal == 0) {
			System.out.println("**�Ҹ�Į�θ��� �Է��ϼ���!");
		}
		
		Recom recom = new Recom(recomid, recomexer,kcal);
		
		int result = service.insertrecom(recom);
		
		if(result == 0) System.out.println("** �Է� ����");
		else            System.out.println("** �Է� ����");
	}
	
//	case "4"{
//	
//	   while(true) {
//		      System.out.println("\n [[��õ ����� ����]]");
//		      System.out.println("=================");
//		      System.out.println("1. ȸ�� ��ü ���� �Է�");
//		      System.out.println("2. ȸ�� ��ü ���� ��ȸ");
//		      System.out.println("3. ȸ�� ��ü ���� ����");
//		      System.out.println("4. ȸ�� ��ü ���� ����");
//		      System.out.println("0. ��                 ��");   
//		      System.out.println("=======================");
//		      System.out.print("> ��ȣ �Է� : ");
//		      num4 = keyin.nextLine(); 
//
//		      switch(num4) {
//		      case "1" :    
//		      }
//		 }
//	  }
	
	private void menu() {
		System.out.println("\n [[��õ � ���� ����]]");
		System.out.println("=================");
		System.out.println("1. � ���� �Է�");
		System.out.println("2. ��ü���� ��ȸ");
		System.out.println("3. Ÿ�Ժ� � ��ȸ");
		System.out.println("4. � ���� ��ȸ");
		System.out.println("5. � ���� ����");
		System.out.println("6. � ���� ����");		
		System.out.println("0. ���α׷� ����");
		System.out.println("=================");
		System.out.print(">>����� ����: ");
		
	}
}
















