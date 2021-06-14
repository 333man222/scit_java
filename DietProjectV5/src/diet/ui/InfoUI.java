package diet.ui;

// checklist ��ȸ�� check_seq ���� ���� 0���� ����, checklist�� 2.� ��� �Է� ����� ����

import java.util.List;
import java.util.Scanner;

import diet.service.InfoService;
import diet.service.BodyService;
import diet.service.ExerService;
import diet.service.RecomService;
import diet.vo.Body;
import diet.vo.Info;
import diet.vo.Exer;
import diet.vo.Recom;


public class InfoUI {
	Scanner keyin = new Scanner(System.in);
	InfoService service = new InfoService();
	BodyService b = new BodyService();
	RecomService re = new RecomService();
	ExerService exer = new ExerService();

	public InfoUI() {
		String choice = null;
		String select = null;
		while(true) {
			menu();
			choice = keyin.nextLine();

			switch(choice) {
			case "1":
				System.out.println("\n [[ȸ�� ���� ����]]");
				System.out.println("=================");
				System.out.println("1. ȸ�� ���� �Է�");
				System.out.println("2. ȸ�� ���� ��ȸ");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ���� ����");
				System.out.println("5. �޴� ���ư���");
				System.out.println("0. ��                 ��");	
				System.out.println("=======================");
				System.out.print("> ��ȣ �Է� : ");

				String choice1 = keyin.nextLine(); 

				switch(choice1) {
				case "1" : 					
					inputInfo();
					break;
				case "2":
					selectInfo();
					break;
				case "3":
					updateInfo();
					break;
				case "4":
					deleteInfo();
					break;
				case "5":
					break;
				case "0":
					System.out.println("**���α׷��� ����ƽ��ϴ�.");
					return;
				default:
					System.out.println("**��ȣ�� �߸� �Է��߽��ϴ�.");
					continue;
				}
				break;


			case "2" :
				System.out.println("\n [[ȸ�� ��ü���� ����]]");
				System.out.println("=================");
				System.out.println("1. ȸ�� ��ü ���� �Է�");
				System.out.println("2. ȸ�� ��ü ���� ��ȸ");
				System.out.println("3. ȸ�� ��ü ���� ����");
				System.out.println("4. ȸ�� ��ü ���� ����");
				System.out.println("5. �޴� ���ư���");
				System.out.println("0. ��                 ��");	
				System.out.println("=======================");
				System.out.print("> ��ȣ �Է� : ");
				String choice2 = keyin.nextLine(); 
				switch (choice2) {
				case "1" :
					insertBody();
					break;
				case "2" :
					selectBody();
					break;
				case "3" :
					updateBody();
					break;
				case "4" :
					deleteBody();
					break;
				case "5":
					break;
				case "0":
					System.out.println("**���α׷��� ����ƽ��ϴ�.");
					return;
				default:
					System.out.println("**��ȣ�� �߸� �Է��߽��ϴ�.");
					continue;	
				}
				break;


			case "3" :
				System.out.println("\n [[��ü Ÿ�Ժ� ��õ � ����]]");
				System.out.println("=================");
				System.out.println("1. ��õ � �Է� ");
				System.out.println("2. ��õ � ��ü ��ȸ");
				System.out.println("3. Ÿ�Կ� ���� ��õ � �˻�");
				System.out.println("4. ��õ � ��ȸ");
				System.out.println("5. ��õ � ����");
				System.out.println("6. ��õ � ����");
				System.out.println("7. �޴� ���ư���");
				System.out.println("0. ��                 ��");	
				System.out.println("=======================");
				System.out.print("> ��ȣ �Է� : ");
				String recom = keyin.nextLine(); 

				switch(recom) {
				case "1" : 
					insertrecom();
					break;
				case "2" :
					selectAllrecom();
					break;
				case "3" :     
					searchtyperecom();
					break;
				case "4" :
					searchrecom();
					break;
				case "5" :
					updaterecom();
					break;
				case "6" :
					deleterecom();
					break;
				case "7" :
					break;
				case "0" :
					System.out.println("**���α׷��� ����ƽ��ϴ�.");
					return;
				default:
					System.out.println("**��ȣ�� �߸� �Է��߽��ϴ�.");
					continue;					
				}
				break;

			case "4" :
				System.out.println("\n [[ � Ȯ�� ]]");
				System.out.println("=================");
				System.out.println("1. ȸ�� ���� & � �Է�");
				System.out.println("2. � ��� �Է�");
				System.out.println("3. � ��� ��ȸ");
				System.out.println("4. ��ü � ��� ��ȸ");
				System.out.println("5. � ��� ����");
				System.out.println("6. � ��� ����");
				System.out.println("7. �޴� ���ư���");
				System.out.println("0. ��                 ��");	
				System.out.println("=======================");
				System.out.print("> ��ȣ �Է� : ");
				String choice4 = keyin.nextLine(); 

				switch(choice4) {
				case "1" :
					insertExer();
					break;
				case "2" :
					insertExerId();
					break;
				case "3" :
					selectExer();
					break;
				case "4" :
					selectAll();
					break;
				case "5" :
					updateExer();
					break;
				case "6" :
					deleteExer();
					break;
				case "7" :
					break;
				case "0" :
					System.out.println("**���α׷��� ����ƽ��ϴ�.");
					return;
				default:
					System.out.println("**��ȣ�� �߸� �Է��߽��ϴ�.");
					continue;	
				}
				break;
			case "0" :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("**��ȣ�� �߸� �Է��߽��ϴ�.");
				continue;	
			}

		}
	}


	private void deleteExer() {
		System.out.println("\n  [[ � ��� ���� ]]");
		System.out.println("=======================");
		System.out.println(exer.selectAll());
		int seq;
		System.out.print("> ������ � ��ȣ :");
		try {
			seq = keyin.nextInt();
		} catch (Exception e) {
			System.out.println(" � ��ȣ�� ���ڸ� �Է� �����մϴ�.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		int result = exer.deleteExer(seq);

		if(result == 0) {
			System.out.println("** ����� �������� �ʾ� ���� ����.");
		} else {
			System.out.println("** ���� �Ϸ�");	
		}

	}


	private void updateExer() {
		System.out.println("\n  [[ ��� ���� ���� ]]");
		System.out.println("=======================");

		String  id, exerstat, exerdate;

		int exertime;


			System.out.print("> user id �Է� : ");
			id = keyin.nextLine();

		keyin.nextLine();

		Exer ex = exer.selectExerId(id);
		System.out.println(ex);
		if(ex == null) {
			System.out.println("** �ش� ��ȣ�� �������� �ʽ��ϴ�.");
			return;
		}		

		System.out.print("> � ���� ����(o,x �θ� �Է�) : ");
		exerstat = keyin.nextLine();

		if((!exerstat.equals("o"))  && (!exerstat.equals("x"))) {
			System.out.println("**� ���δ� o/x�θ� �Է� �����մϴ�!");
			return;
		}

		try {
			System.out.print("��ð� �Է�");
			exertime = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();

		System.out.print("� ��¥ �Է�");
		exerdate = keyin.nextLine();
		if((exerdate.length() != 9)) {
			System.out.println("��¥ �Է� ���� ��) 2021-06-05");
			return;
		}else if((exerdate.charAt(4) != '-')) {
			System.out.println("��¥ �Է� ���� ��) 2021-06-05");
			return;
		} else if(exerdate.charAt(7) != '-') {
			System.out.println("��¥ �Է� ���� ��) 2021-06-05");
			return;
		}

		Exer exe = new Exer(ex.getCheck_seq(), 0,null, null, null, exerstat, exertime, exerdate);
		int result = exer.updateExer(exe);

		if(result == 0) 
			System.out.println("���� ����");
		else 			
			System.out.println("** ���� ����");

	}

	private void selectAll() {
		System.out.println("\n    [[ ��ü ��ȸ ]]");
		System.out.println("=======================");

		List<Exer> list= exer.selectAll();

		for(Exer temp:list)
			System.out.println(temp);		
	}



	private void selectExer() {
			subMenu();
			String choice = keyin.next();
			String searchItem = null;
			String searchWord = null;
			
			switch(choice) {
			case "1" : 
				searchItem="user_id"; break;
			case "2" : 
				searchItem="recom_id"; break;
			case "3" : 
				searchItem="recom_exer"; break;
			case "0" :
				return;
			default : 
				System.out.println("** �޴� ������ �߸��߽��ϴ�.");
				return ;
			}
			
			System.out.print("> �˻� Ű���� �Է� : ");
			searchWord = keyin.next();

			List<Exer> list = exer.selectExer(searchItem, searchWord);
			if(list == null) {
				System.out.println("** �˻��� ������ �����ϴ�.");
				return;
			}
			
			for(Exer b : list)
				System.out.println(b);
		}
	private void subMenu() {
		System.out.println("\n    [[ � �˻� ]]");
		System.out.println("=======================");
		System.out.println("    1) user id�� �˻�");
		System.out.println("    2) ���ȣ(recom_id)�� �˻�");
		System.out.println("    3) ��̸����� �˻�");
		System.out.println("    0) ��������");
		System.out.println("=======================");
		System.out.print  ("       > ���� : ");
		
	}
	
	private void insertExerId() {

		String userid, exerstat;
		int  time;
		System.out.print("> ID: ");
		userid = keyin.nextLine();
		Exer exe = exer.selectExerId(userid);
		if (exe == null) {
			System.out.println("**üũ����Ʈ �� ���� �ۼ����ּ���");
			return;
		}
		System.out.print("> � ���� (o,x �θ� �Է�) : ");
		exerstat = keyin.nextLine();

		if((!exerstat.equals("o"))  && (!exerstat.equals("x"))) {
			System.out.println("**� ���δ� o/x�θ� �Է� �����մϴ�!");
			return;
		}
		int t = 0;
		if(exerstat.equals("o")) {

			try {
				System.out.println("> � �ð�(��) : ");
				time = keyin.nextInt();
				keyin.nextLine();	
			} catch (Exception e) {
				System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
				keyin.nextLine();
				return;
			}
			time = t;
		}
		Exer ser = new Exer(0, 0,exe.getUser_id(),exe.getRecom_id(), exe.getRecom_exer(), exerstat, t, null);

		int result = exer.insertExer(ser);

		if(result == 0) 
			System.out.println("��� ����");
		else 			
			System.out.println("** ��� ����");	
	}

	private void insertExer() {
		System.out.println("[[ȸ�� � ��� �Է�]]");
		System.out.println("==================");

		String userid, recomid, recomexer, exerstat;
		int  time;
		System.out.print("> ID: ");
		userid = keyin.nextLine();
		Info d = service.selectOne(userid);

		if (d == null) {
			System.out.println("**ȸ�� ������ ���� �Է��� �ּ���");
			return;
		}

		System.out.print("> EXCERCISE ID: ");
		recomid = keyin.nextLine();
		Recom recom = re.searchrecom(recomid);

		if (recom == null) {
			System.out.println("** Ÿ�Ժ� ��õ� ��ȣ�� ���� Ȯ���� �ּ���");
			return;
		}

		System.out.println("> � ���� : ");
		recomexer = keyin.nextLine();

		System.out.print("> � ���� (o,x �θ� �Է�) : ");
		exerstat = keyin.nextLine();

		if((!exerstat.equals("o"))  && (!exerstat.equals("x"))) {
			System.out.println("**� ���δ� o/x�θ� �Է� �����մϴ�!");
			return;
		}
		int t = 0;
		if(exerstat.equals("o")) {
			

			try {
				System.out.println("> � �ð�(��) : ");
				time = keyin.nextInt();
				keyin.nextLine();	
			} catch (Exception e) {
				System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
				keyin.nextLine();
				return;
			}
			time = t;
		}


		Exer ser = new Exer(0,0, d.getUser_id(),recom.getRecom_id(), recomexer,exerstat, t, null);

		int result = exer.insertExer(ser);

		if(result == 0) 
			System.out.println("��� ����");
		else 			
			System.out.println("** ��� ����");		
	}


	private void deleterecom() {
		System.out.println("\n  [[ � ���� ]]");
		System.out.println("=======================");

		String recomid;

		System.out.print("> � ID : ");
		recomid = keyin.nextLine();

		int result = re.deleterecom(recomid);

		if(result == 0) System.out.println("** ���� ����");
		else System.out.println("** ���� ����");
	}

	private void updaterecom() {
		System.out.println("\n  [[ � ���� ���� ]]");
		System.out.println("=======================");

		String recomid, recomexer; int kcal;

		System.out.print("> � ID : ");
		recomid = keyin.nextLine();

		Recom r = re.searchrecom(recomid);
		if(r == null) {
			System.out.println("** �������� �ʴ� ���̵��Դϴ�.");
			return;
		}		

		System.out.print("> ��õ�: ");
		recomexer = keyin.nextLine();
		if(recomexer == null) {
			System.out.println("**��õ��� �Է��ϼ���!");
		}

		try {
			System.out.print("> �Ҹ�Į�θ�: ");
			kcal = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		Recom recom = new Recom(recomid, recomexer, kcal);
		int result = re.updaterecom(recom);

		if(result == 0) System.out.println("** ���� ����");
		else System.out.println("** ���� ����");

	}

	private void searchrecom() {
		System.out.println("\n  [[ � ��ȸ ]]");
		System.out.println("=======================");

		String recomid;

		System.out.print("> � ID : ");
		recomid = keyin.nextLine();

		Recom recom = re.searchrecom(recomid);

		if(recom == null) System.out.println("** ������ �������� ����");
		else System.out.println(recom);
	}

	private void searchtyperecom() {
		System.out.println("\n  [[ Ÿ�Ժ� � ��ȸ ]]");
		System.out.println("=======================");

		String type;
//exception a~e �� �Է¹ޱ�
		System.out.print("> �˻��� Ÿ��(a~e) : ");
		type = keyin.nextLine();
		
//		int s;
//		 s = Integer.parseInt(type);
//		if(!(97 <= s && s <= 102)) {
//			System.out.println("a~e������ ���ڿ��� �Է� �����մϴ�.");
//			return;
//		}
		
		List<Recom> list= re.searchtyperecom(type);

		if(list == null) System.out.println("** ������ �������� ����");
		else System.out.println(list);

	}

	private void selectAllrecom() {
		System.out.println("\n    [[ ��ü ��ȸ ]]");
		System.out.println("=======================");

		List<Recom> list= re.selectAllrecom();

		for(Recom temp:list)
			System.out.println(temp);
	}

	private void insertrecom() {
		System.out.println("\n [[� ���� �Է�]]");
		System.out.println("=====================");

		String recomid, recomexer; int kcal;

		System.out.print("> � ID : ");
		recomid = keyin.nextLine();

		Recom r = re.searchrecom(recomid);
		if(r != null) {
			System.out.println("** ��� �Ұ����� ���̵��Դϴ�.");
			return;
		}

		System.out.print("> ��õ�: ");
		recomexer = keyin.nextLine();
		if(recomexer == null) {
			System.out.println("**��õ��� �Է��ϼ���!");
		}
		try {
			System.out.print("> �Ҹ�Į�θ�: ");
			kcal = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		if(kcal == 0) {
			System.out.println("**�Ҹ�Į�θ��� �Է��ϼ���!");
		}

		Recom recom = new Recom(recomid, recomexer,kcal);

		int result = re.insertrecom(recom);

		if(result == 0) System.out.println("** �Է� ����");
		else            System.out.println("** �Է� ����");
	}


	private void deleteBody() {

		System.out.println("\n [[ȸ�� Ż��]]");
		System.out.println("=====================");

		String user_id;
		System.out.print("> ID: ");
		user_id = keyin.nextLine();

		int result2 = b.deleteBody(user_id);

		if(result2 == 0) System.out.println("** ȸ�� ���� ����");
		else System.out.println("**ȸ�� Ż�� ����");
	}


	private void updateBody() {

		String user_id, body_type, recom_id = null;
		int height, weight, intensity;
		double body_bmi;	

		System.out.println("\n [[ȸ�� ��ü ���� ����]]");
		System.out.println("=====================");
		System.out.print(">ID: ");
		user_id = keyin.next();

		Body bodyinfo1 = b.selectBody(user_id);
		System.out.println(bodyinfo1);
		if( bodyinfo1 == null) {
			System.out.println("**���� ����.");
			return;
		}

		try {	
			System.out.print(" ����(cm) ���� >> ");
			height = keyin.nextInt();
			System.out.print(" ü��(kg) ���� >> ");
			weight = keyin.nextInt();
			System.out.print("> � ���� ���� (1(��)~5(��)�ܰ�) >> ");
			intensity = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		if (!(1<= intensity && intensity<=5)) {
			System.out.println("1 (������) ~ 5 (������) ������ ���ڸ� �Է� �����մϴ�.");
			return;
		}
		body_bmi = (double)weight * 9998 / ((double)height * (double)height);
		Math.round((double)(body_bmi*100)/100);

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

		Body body = new Body(bodyinfo1.getUser_id(), height, weight, body_bmi, body_type, recom_id);

		int result1 = b.updateBody(body);

		if(result1 == 0) {
			System.out.println("**���� ���� ����.");
		}else System.out.println("**���� ���� ����.");
	}


	private void selectBody() {
		System.out.println("\n [[ȸ�� ��ü ���� ��ȸ]]");
		System.out.println("=====================");
		String user_id;
		System.out.print("> ID: ");
		user_id = keyin.nextLine();

		Body bodyinfo = b.selectBody(user_id);

		if(bodyinfo == null) System.out.println("** ȸ�� ������ �����ϴ�.");
		else System.out.println(bodyinfo);		
	}


	private void insertBody() {

		String user_id, body_type, recom_id = null;
		int height, weight, intensity;
		double body_bmi;				

		System.out.print("> ���̵� �Է� : ");
		user_id = keyin.next(); 
		keyin.nextLine();
		Info d = service.selectOne(user_id);

		if(d == null) {
			System.out.println("**ȸ�� ������ ���� �Է��� �ּ���");
			return;
		}

		try {
			System.out.print("> Ű(cm) : ");
			height = keyin.nextInt();
			System.out.print("> ������(kg) : ");
			weight = keyin.nextInt();
			System.out.print("> � ���� (1(��)~5(��)�ܰ�) : ");
			intensity = keyin.nextInt(); 
		} catch (Exception e) {
			System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		body_bmi = (double)weight * 9998 / ((double)height * (double)height);
		Math.round((body_bmi*100)/100.0);

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

		int result = b.insertBody(new Body(user_id, height, weight, body_bmi, body_type, recom_id));		
		if(result == 1)
			System.out.println("** ��ü���� ���� �Ϸ�");
		else
			System.out.println("** ��ü���� ���� ����");

	}


	private void deleteInfo() {
		System.out.println("\n [[ȸ�� Ż��]]");
		System.out.println("=====================");
		String userid;
		System.out.print("> ID: ");
		userid = keyin.nextLine();

		int result2 = service.deleteOne(userid);

		if(result2 == 0) System.out.println("** ȸ�� ���� ����");
		else System.out.println("**ȸ�� Ż�� ����");
	}




	private void updateInfo() {
		System.out.println("\n [[ȸ�� ���� ����]]");
		System.out.println("=====================");

		String userid, userpwd, userphone, userarea;

		System.out.print(">ID: ");
		userid = keyin.nextLine();

		Info d2 = service.selectOne(userid);

		if(d2 == null) {
			System.out.println("���̵� �ٽ� Ȯ���� �ּ���.");
			return;
		}

		System.out.print("> ��й�ȣ ���� : ");
		userpwd = keyin.nextLine();

		System.out.print("> ��ȭ��ȣ ���� : ");
		userphone = keyin.nextLine();
		if((userphone.length() != 13)) {
			System.out.println("�߸��� ��ȭ��ȣ �Դϴ�.");
			return;
		}else if((userphone.charAt(3) != '-')) {
			System.out.println("�߸��� ��ȭ��ȣ �Դϴ�.");
			return;
		} else if(userphone.charAt(8) != '-') {
			System.out.println("�߸��� ��ȭ��ȣ �Դϴ�.");
			return;
		}

		System.out.print("> �ּ� ���� : ");
		userarea = keyin.nextLine();

		Info diet = new Info(d2.getUser_id(), userpwd, null, 0, null, userphone, userarea, null);

		int result1 = service.update(diet);

		if(result1 == 0) 
			System.out.println("**���� ���� ����.");
		else System.out.println("**���� ���� ����.");

	}

	private void selectInfo() {
		System.out.println("\n [[ȸ�� ���� ��ȸ]]");
		System.out.println("=====================");

		String userid;
		System.out.print("> ID: ");
		userid = keyin.nextLine();

		Info userinfo = service.selectOne(userid);

		if(userinfo == null) System.out.println("** NO INFO");
		else System.out.println(userinfo);		
	}

	private void inputInfo() {
		System.out.println("\n [[ȸ�� ���� �Է�]]");
		System.out.println("=====================");

		String userid, userpwd, username, usergender, userphone, userarea;
		int userbirth;

		System.out.print("> ID: ");
		userid = keyin.nextLine();

		Info d = service.selectOne(userid);

		if(d != null) {
			System.out.println("**�ߺ��� ���̵��Դϴ�!");
			return;
		}
		else System.out.println("** ��� ������ ���̵��Դϴ�.");

		System.out.print("> PW: ");
		userpwd = keyin.nextLine();
		if(userpwd == null) {
			System.out.println("**��й�ȣ�� �Է��ϼ���!");
		}

		System.out.print("> NAME: ");
		username = keyin.nextLine();
		if(username == null) {
			System.out.println("**�̸��� �Է��ϼ���!");
		}

		System.out.print("> AGE: ");
		try 
		{ 
			userbirth = keyin.nextInt(); 

		} catch (Exception e) {
			System.out.println("** ���ڷθ� �Է��� �����մϴ�.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();

		System.out.print("> GENDER(��/���θ� �Է��� �ּ���): ");
		usergender = keyin.nextLine();
		if((!usergender.equals("��"))  && (!usergender.equals("��"))) {
			System.out.println("������ ��/���θ� �Է� �����մϴ�!");
			return;
		}

		System.out.print("> PHONE NUMBER: ");
		userphone = keyin.nextLine();
		if((userphone.length() != 13)) {
			System.out.println("�߸��� ��ȭ��ȣ");
			return;
		}else if((userphone.charAt(3) != '-')) {
			System.out.println("�߸��� ��ȭ��ȣ");
			return;
		} else if(userphone.charAt(8) != '-') {
			System.out.println("�߸��� ��ȭ��ȣ");
			return;
		}

		System.out.print("> ADDRESS: ");
		userarea = keyin.nextLine();


		int result = service.insertDiet(new Info(userid, userpwd, username, userbirth, usergender, userphone, userarea, null));
		if(result == 0) System.out.println("** ��ü ���� �Է� ����");
		else            System.out.println("** ��ü ���� �Է� ����");

	}



	public void menu() {
		System.out.println("\n [[ȸ�� � ����]]");
		System.out.println("=================");
		System.out.println("1. ȸ�� ���� �Է�");
		System.out.println("2. ȸ�� ��ü ���� ");
		System.out.println("3. Ÿ�Ժ� ��õ � ");
		System.out.println("4. � checklist");
		System.out.println("0. ���α׷� ����");
		System.out.println("=================");
		System.out.print(" >>��ȣ�� �Է� : ");
	}
}
