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
				System.out.println("** 프로그램을 종료합니다");
				return;
			default : 
				System.out.println("** 메뉴를 다시 선택해주세요");
			}
		
		
		}
		
		
	}
	private void checklist() {
		
		
	}
	private void insertBody() {
		String user_id, body_type, recom_id = null;
		int height, weight, intensity;
		double body_bmi;

		System.out.println("\n    [[ 회원 신체정보 입력 ]]");
		System.out.println("=======================");
		
		System.out.print("> 아이디 : ");
		user_id = keyin.next(); 
		keyin.nextLine();
		if(Body != null) {
			System.out.println("**중복된 아이디입니다!");
			return;
		}
		else System.out.println("** 사용 가능한 아이디입니다.");
		System.out.print("> 키(cm) : ");
		height = keyin.nextInt();

		System.out.print("> 몸무게(kg) : ");
		weight = keyin.nextInt();

		body_bmi = (double)weight * 9998 / ((double)height * (double)height);
		System.out.printf("%.2f",body_bmi);
		
		System.out.print("> 운동 강도 (1(고)~5(저)단계) : ");
		intensity = keyin.nextInt(); 
	

			if (body_bmi >= 30) {
				body_type= "고도비만";
					if(intensity ==1) recom_id = "a01";
					else if(intensity == 2) recom_id = "a02";
					else if(intensity == 3) recom_id = "a03";
					else if(intensity == 4) recom_id = "a04";
					else if(intensity == 5) recom_id = "a05";
			}
			else if (body_bmi >= 25) {
				body_type = "비만";
					if(intensity ==1) recom_id = "b01";
					else if(intensity == 2) recom_id = "b02";
					else if(intensity == 3) recom_id = "b03";
					else if(intensity == 4) recom_id = "b04";
					else if(intensity == 5) recom_id = "b05";	
			}
			else if (body_bmi >= 23) {
				body_type = "과체중";
					if(intensity ==1) recom_id = "c01";
					else if(intensity == 2) recom_id = "c02";
					else if(intensity == 3) recom_id = "c03";
					else if(intensity == 4) recom_id = "c04";
					else if(intensity == 5) recom_id = "c05";
				
			}	
			else if (body_bmi >= 18.5) {
				body_type = "정   상";
					if(intensity ==1) recom_id = "d01";
					else if(intensity == 2) recom_id = "d02";
					else if(intensity == 3) recom_id = "d03";
					else if(intensity == 4) recom_id = "d04";
					else if(intensity == 5) recom_id = "d05";
				}
				
			else {
				body_type = "저체중";
				if(intensity ==1) recom_id = "e01";
				else if(intensity == 2) recom_id = "e02";
				else if(intensity == 3) recom_id = "e03";
				else if(intensity == 4) recom_id = "e04";
				else if(intensity == 5) recom_id = "e05";
			}
		
		//Body diet = new Body(user_id, height, weight, body_bmi, body_type, recom_id);
		int result = Body.insertBody(new Body(user_id, height, weight, body_bmi, body_type, recom_id));		
		if(result == 1)
			System.out.println("** 신체정보 저장 완료");
		else
			System.out.println("** 신체정보 저장 실패");		
	}
	private void insertInfo() {
		   System.out.println("\n [[회원 정보 입력]]");
		   System.out.println("=====================");
		   
		   String userid, userpwd, username, userbirth, usergender, userphone, userarea, regdate;
		   
		   System.out.print("> ID: ");
		   userid = keyin.next();
		   
		   Info d = Info.selectOne(userid);
		   
		   if(d != null) {
		      System.out.println("**중복된 아이디입니다!");
		      return;
		   }
		   else System.out.println("** 사용 가능한 아이디입니다.");
		   
		   System.out.print("> PW: ");
		   userpwd = keyin.next();
		   if(userpwd == null) {
		      System.out.println("**비밀번호를 입력하세요!");
		   }
		   
		   System.out.print("> NAME: ");
		   username = keyin.next();
		   if(username == null) {
		      System.out.println("**이름을 입력하세요!");
		   }
		   
		   System.out.print("> AGE: ");
		   userbirth = keyin.next();
		   if(userbirth == null) {
		      System.out.println("**나이를 입력하세요!");
		   }
		   
		   System.out.print("> GENDER: ");
		   usergender = keyin.next();
		   if(usergender != "남") {
		      System.out.println("**여자입니까?");
		   } else if(usergender != "여") {
		      System.out.println("**성별은 남/여 로만 입력해 주세요!");
		   }
		   
		   System.out.print("> PHONE NUMBER: ");
		   userphone = keyin.next();
		   
		   System.out.print("> ADDRESS: ");
		   userarea = keyin.next();
		   
		   System.out.print("> REGISTER DATE: ");
		   regdate = keyin.next();
	}
	private void menu() {
		System.out.println("    [[ 회원 관리 ]]");
		System.out.println("=======================");
		System.out.println("     1. 유저 개인정보");
		System.out.println("     2. 유저 신체정보");
		System.out.println("     3. 운동 여부 기록");
		System.out.println("     4. 운동 기록 조회");		
		System.out.println("     5. 유저 한명 조회");
		System.out.println("     6. 추천 운동 목록");
		System.out.println("     7. 정보 수정");
		System.out.println("     8. 유저 삭제");
		System.out.println("     0. 종 료");
		System.out.println("=======================");
		System.out.print  ("    선택 > ");
		
	}
}
