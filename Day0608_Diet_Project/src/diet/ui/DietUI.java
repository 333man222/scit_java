package diet.ui;

import java.util.Scanner;


import diet.service.ExerService;
import diet.vo.Diet_project;


// inputStatus/ selectCheck �߰��ϱ�

public class DietUI {
   Scanner keyin = new Scanner(System.in);
   ExerService dietService = new ExerService();
   
   public DietUI() {
      String choice = null;
      
      while(true) {
         menu();
         choice = keyin.next();
         
            switch(choice) {
            case "1":
               inputinfo();
               break;
            case "2":
               inputStatus();	//� ���� ���
               break;
            case "3":
               checklist();	//� ��� ��ȸ
               break;
            case "4":
               deleteCheck();
               break;
            case "5":
               selectCheck();
               break;
            case "0":
               System.out.println("**���α׷��� ����ƽ��ϴ�.");
               return;
            default:
               System.out.println("**��ȣ�� �߸� �Է��߽��ϴ�.");
               continue;
            }
         }
      
      }
   
 private void selectCheck() {
	 System.out.println("\n [[ȸ�� ���� ��ȸ]]");
	   System.out.println("=====================");
	   
	   String userid;
	   
	   System.out.print("> ID: ");
	   userid = keyin.next();
	   

	   
	   if(userid == null) System.out.println("** NO INFO");
	   else System.out.println(userid);
	      
	
}

	//  � ���� ���			// �߰��ϱ� int result
	private void inputStatus() {
		String id, type, time, intensity;
		System.out.println(" \n     [[ � ���� ��� ]]");
		System.out.println(" ================== ");
		
		System.out.println("> ���� ���̵� : ");
		id = keyin.next();
		keyin.nextLine();	// �Է¹��ۿ� �����ִ� ���͸� ����� ����  
		
		System.out.println("> � ���� : ");
		type = keyin.nextLine();
		
		System.out.println("> � �ð� : ");
		time = keyin.nextLine();
		
		System.out.println("> � ���� : ");
		intensity = keyin.nextLine();
		
		Diet_project diet = new Diet_project(0, id, type, time, intensity, null);
	
		int result = dietService.inputStatus(diet);
		
		if(result == 0) 
			System.out.println("��� ����");
		else 			
			System.out.println("** ��� ����");
		
	}
	// � ��� ��ȸ
	private void checklist() {
		
	 while(true) {
		  System.out.println("\n [[ȸ�� ��ü���� ����]]");
		  System.out.println("=================");
		  System.out.println("1. ȸ�� ��ü ���� �Է�");
	      System.out.println("2. ȸ�� ��ü ���� ��ȸ");
	      System.out.println("3. ȸ�� ��ü ���� ����");
	      System.out.println("4. ȸ�� ��ü ���� ����");
	      System.out.println("0. ��                 ��");   
		  System.out.println("=======================");
		  System.out.print("> ��ȣ �Է� : ");
			      
		  String num2 = keyin.nextLine(); 
		   		
		   switch(num2) {
		   case "2" : 
		
			System.out.println(" \n    [[ � ��� ��ȸ ]]");
			System.out.println(" ================== ");
			int recom_seq;
					
			System.out.print("> ��ȣ:");
			try{
				recom_seq = keyin.nextInt();
			} catch (Exception e) {
				System.out.println("** ��ȣ�� ���ڷ� �Է��Ͻÿ�");
				keyin.nextLine();
				return;
			}
			
			int check = dietService.checklist(recom_seq);
					
			if(check == 0) {
				System.out.println("** ����� �������� �ʽ��ϴ�.");
			} else { 
				System.out.println(check);
			}}}
		   }
	
	

//	private void selectOne() {
//	   System.out.println("\n [[ȸ�� ���� ��ȸ]]");
//	   System.out.println("=====================");
//	   
//	   String userid;
//	   
//	   System.out.print("> ID: ");
//	   userid = keyin.next();
//	   
//	
//	   
//	   if(userid == null) System.out.println("** NO INFO");
//	   else System.out.println(userid);
//	      
//	  
//	
//	}


	private void deleteCheck() {
	   System.out.println("\n [[ȸ�� Ż��]]");
	   System.out.println("=====================");
	   
	   String userid;
	   
	   System.out.print("> ID: ");
	   userid = keyin.next();
	   
	   int result = dietService.deleteCheck(recom_seq);
	   
	   if(result == 0) System.out.println("** ȸ�� ���� ����");
	   else System.out.println("**ȸ�� Ż�� ����");
	      
	   }


	private void update() {
	   System.out.println("\n [[ȸ�� ���� ����]]");
	   System.out.println("=====================");
	   
	   String userid, userpwd, userphone, userbirth, userarea;
	   
	   System.out.print(">ID: ");
	   userid = keyin.next();
	   
	   int result = dietService.selectCheck(recom_seq);
	   
	   if(result == 0) {
	      System.out.println("**���� ����.");
	      return;
	   }
	   
	   System.out.print(">PW: ");
	   userpwd = keyin.next();
	   
	   System.out.print("PHONE >> ");
	   userphone = keyin.next();
	   
	   System.out.print("BIRTH >> ");
	   userbirth = keyin.next();
	   
	   System.out.print("AREA >> ");
	   userarea = keyin.next();
	   
	  
	   int result = dietService.updateCheck(recom_seq);
	   
	   if(result == 0) {
	      System.out.println("**���� ���� ����.");
	   }else System.out.println("**���� ���� ����.");
	}
	
	
	private void inputinfo() {
	   System.out.println("\n [[ȸ�� ���� �Է�]]");
	   System.out.println("=====================");
	   
	   String userid, userpwd, username, userbirth, usergender, userphone, userarea, regdate;
	   
	   System.out.print("> ID: ");
	   userid = keyin.next();
	   
	   Check d = dietService.selectCheck(check);
	   
	   if(d != null) {
	      System.out.println("**�ߺ��� ���̵��Դϴ�!");
	      return;
	   }
	   else System.out.println("** ��� ������ ���̵��Դϴ�.");
	   
	   System.out.print("> PW: ");
	   userpwd = keyin.next();
	   if(userpwd == null) {
	      System.out.println("**��й�ȣ�� �Է��ϼ���!");
	   }
	   
	   System.out.print("> NAME: ");
	   username = keyin.next();
	   if(username == null) {
	      System.out.println("**�̸��� �Է��ϼ���!");
	   }
	   
	   System.out.print("> AGE: ");
	   userbirth = keyin.next();
	   if(userbirth == null) {
	      System.out.println("**���̸� �Է��ϼ���!");
	   }
	   
	   System.out.print("> GENDER: ");
	   usergender = keyin.next();
	   if(usergender != "��") {
	      System.out.println("**�����Դϱ�?");
	   } else if(usergender != "��") {
	      System.out.println("**������ ��/�� �θ� �Է��� �ּ���!");
	   }
	   
	   System.out.print("> PHONE NUMBER: ");
	   userphone = keyin.next();
	   
	   System.out.print("> ADDRESS: ");
	   userarea = keyin.next();
	   
	   System.out.print("> REGISTER DATE: ");
	   regdate = keyin.next();
	}
	
	
	public void menu() {
	   System.out.println("\n [[ȸ�� � ����]]");
	   System.out.println("=================");
	   System.out.println("1. ȸ�� ���� �Է�");
	   System.out.println("2. ȸ�� ��ü ���� �Է�");
	   System.out.println("3. � ���� ���");	//input
	   System.out.println("4. � ��� ��ȸ");  //selectCheck
	   System.out.println("5. ���� �Ѹ� ��ȸ");
	   System.out.println("6. ȸ�� Ż��");
	   System.out.println("7. ȸ�� ���� ��ȸ");
	   System.out.println("0. ���α׷� ����");
	   System.out.println("=================");
	   System.out.print(">>�����ϼ���: ");
	   }
	}