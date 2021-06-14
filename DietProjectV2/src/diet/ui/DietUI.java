package diet.ui;

import java.util.Scanner;

import diet.service.BodyService;
import diet.service.InfoService;
import diet.vo.Info;
import diet.vo.Body;

public class DietUI {
	Scanner keyin = new Scanner(System.in);
	InfoService Info = new InfoService();
	BodyService Body = new BodyService();
	public DietUI() {
		String choice = null;
		
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : 
				insertInfo();
				break;
			case "2" :
				insertBody();
				break;
			case "3" :
				checklist();
				break;
			case "4" : 
				break;
			case "5" :
				break;
			case "6" :
				break;
			case "7" : 
				break;
			case "0" : 
				System.out.println("** ���α׷��� �����մϴ�");
				return;
			default : 
				System.out.println("** �޴��� �ٽ� �������ּ���");
			}
		
		
		}
		
		
	}
	private void checklist() {
		
		
	}
	private void insertBody() {
		String user_id, body_type, recom_id = null;
		int height, weight, intensity;
		double body_bmi;

		System.out.println("\n    [[ ȸ�� ��ü���� �Է� ]]");
		System.out.println("=======================");
		
		System.out.print("> ���̵� : ");
		user_id = keyin.next(); 
		keyin.nextLine();
		if(Body != null) {
			System.out.println("**�ߺ��� ���̵��Դϴ�!");
			return;
		}
		else System.out.println("** ��� ������ ���̵��Դϴ�.");
		System.out.print("> Ű(cm) : ");
		height = keyin.nextInt();

		System.out.print("> ������(kg) : ");
		weight = keyin.nextInt();

		body_bmi = (double)weight * 9998 / ((double)height * (double)height);
		System.out.printf("%.2f",body_bmi);
		
		System.out.print("> � ���� (1(��)~5(��)�ܰ�) : ");
		intensity = keyin.nextInt(); 
	

			if (body_bmi >= 30) {
				body_type= "����";
					if(intensity ==1) recom_id = "a01";
					else if(intensity == 2) recom_id = "a02";
					else if(intensity == 3) recom_id = "a03";
					else if(intensity == 4) recom_id = "a04";
					else if(intensity == 5) recom_id = "a05";
			}
			else if (body_bmi >= 25) {
				body_type = "��";
					if(intensity ==1) recom_id = "b01";
					else if(intensity == 2) recom_id = "b02";
					else if(intensity == 3) recom_id = "b03";
					else if(intensity == 4) recom_id = "b04";
					else if(intensity == 5) recom_id = "b05";	
			}
			else if (body_bmi >= 23) {
				body_type = "��ü��";
					if(intensity ==1) recom_id = "c01";
					else if(intensity == 2) recom_id = "c02";
					else if(intensity == 3) recom_id = "c03";
					else if(intensity == 4) recom_id = "c04";
					else if(intensity == 5) recom_id = "c05";
				
			}	
			else if (body_bmi >= 18.5) {
				body_type = "��   ��";
					if(intensity ==1) recom_id = "d01";
					else if(intensity == 2) recom_id = "d02";
					else if(intensity == 3) recom_id = "d03";
					else if(intensity == 4) recom_id = "d04";
					else if(intensity == 5) recom_id = "d05";
				}
				
			else {
				body_type = "��ü��";
				if(intensity ==1) recom_id = "e01";
				else if(intensity == 2) recom_id = "e02";
				else if(intensity == 3) recom_id = "e03";
				else if(intensity == 4) recom_id = "e04";
				else if(intensity == 5) recom_id = "e05";
			}
		
		//Body diet = new Body(user_id, height, weight, body_bmi, body_type, recom_id);
		int result = Body.insertBody(new Body(user_id, height, weight, body_bmi, body_type, recom_id));		
		if(result == 1)
			System.out.println("** ��ü���� ���� �Ϸ�");
		else
			System.out.println("** ��ü���� ���� ����");		
	}
	private void insertInfo() {
		   System.out.println("\n [[ȸ�� ���� �Է�]]");
		   System.out.println("=====================");
		   
		   String userid, userpwd, username, userbirth, usergender, userphone, userarea, regdate;
		   
		   System.out.print("> ID: ");
		   userid = keyin.next();
		   
		   Info d = Info.selectOne(userid);
		   
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
	private void menu() {
		System.out.println("    [[ ȸ�� ���� ]]");
		System.out.println("=======================");
		System.out.println("     1. ���� ��������");
		System.out.println("     2. ���� ��ü����");
		System.out.println("     3. � ���� ���");
		System.out.println("     4. � ��� ��ȸ");		
		System.out.println("     5. ���� �Ѹ� ��ȸ");
		System.out.println("     6. ��õ � ���");
		System.out.println("     7. ���� ����");
		System.out.println("     8. ���� ����");
		System.out.println("     0. �� ��");
		System.out.println("=======================");
		System.out.print  ("    ���� > ");
		
	}
}
