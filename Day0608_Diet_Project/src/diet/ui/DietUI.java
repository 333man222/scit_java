package diet.ui;

import java.util.Scanner;


import diet.service.ExerService;
import diet.vo.Diet_project;


// inputStatus/ selectCheck 추가하기

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
               inputStatus();	//운동 여부 기록
               break;
            case "3":
               checklist();	//운동 기록 조회
               break;
            case "4":
               deleteCheck();
               break;
            case "5":
               selectCheck();
               break;
            case "0":
               System.out.println("**프로그램이 종료됐습니다.");
               return;
            default:
               System.out.println("**번호를 잘못 입력했습니다.");
               continue;
            }
         }
      
      }
   
 private void selectCheck() {
	 System.out.println("\n [[회원 정보 조회]]");
	   System.out.println("=====================");
	   
	   String userid;
	   
	   System.out.print("> ID: ");
	   userid = keyin.next();
	   

	   
	   if(userid == null) System.out.println("** NO INFO");
	   else System.out.println(userid);
	      
	
}

	//  운동 여부 기록			// 추가하기 int result
	private void inputStatus() {
		String id, type, time, intensity;
		System.out.println(" \n     [[ 운동 여부 기록 ]]");
		System.out.println(" ================== ");
		
		System.out.println("> 유저 아이디 : ");
		id = keyin.next();
		keyin.nextLine();	// 입력버퍼에 남아있던 엔터를 지우는 역할  
		
		System.out.println("> 운동 종류 : ");
		type = keyin.nextLine();
		
		System.out.println("> 운동 시간 : ");
		time = keyin.nextLine();
		
		System.out.println("> 운동 강도 : ");
		intensity = keyin.nextLine();
		
		Diet_project diet = new Diet_project(0, id, type, time, intensity, null);
	
		int result = dietService.inputStatus(diet);
		
		if(result == 0) 
			System.out.println("기록 실패");
		else 			
			System.out.println("** 기록 성공");
		
	}
	// 운동 기록 조회
	private void checklist() {
		
	 while(true) {
		  System.out.println("\n [[회원 신체정보 관리]]");
		  System.out.println("=================");
		  System.out.println("1. 회원 신체 정보 입력");
	      System.out.println("2. 회원 신체 정보 조회");
	      System.out.println("3. 회원 신체 정보 수정");
	      System.out.println("4. 회원 신체 정보 삭제");
	      System.out.println("0. 종                 료");   
		  System.out.println("=======================");
		  System.out.print("> 번호 입력 : ");
			      
		  String num2 = keyin.nextLine(); 
		   		
		   switch(num2) {
		   case "2" : 
		
			System.out.println(" \n    [[ 운동 기록 조회 ]]");
			System.out.println(" ================== ");
			int recom_seq;
					
			System.out.print("> 번호:");
			try{
				recom_seq = keyin.nextInt();
			} catch (Exception e) {
				System.out.println("** 번호를 숫자로 입력하시오");
				keyin.nextLine();
				return;
			}
			
			int check = dietService.checklist(recom_seq);
					
			if(check == 0) {
				System.out.println("** 기록이 존재하지 않습니다.");
			} else { 
				System.out.println(check);
			}}}
		   }
	
	

//	private void selectOne() {
//	   System.out.println("\n [[회원 정보 조회]]");
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
	   System.out.println("\n [[회원 탈퇴]]");
	   System.out.println("=====================");
	   
	   String userid;
	   
	   System.out.print("> ID: ");
	   userid = keyin.next();
	   
	   int result = dietService.deleteCheck(recom_seq);
	   
	   if(result == 0) System.out.println("** 회원 정보 없음");
	   else System.out.println("**회원 탈퇴 성공");
	      
	   }


	private void update() {
	   System.out.println("\n [[회원 정보 수정]]");
	   System.out.println("=====================");
	   
	   String userid, userpwd, userphone, userbirth, userarea;
	   
	   System.out.print(">ID: ");
	   userid = keyin.next();
	   
	   int result = dietService.selectCheck(recom_seq);
	   
	   if(result == 0) {
	      System.out.println("**정보 없음.");
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
	      System.out.println("**정보 수정 실패.");
	   }else System.out.println("**정보 수정 성공.");
	}
	
	
	private void inputinfo() {
	   System.out.println("\n [[회원 정보 입력]]");
	   System.out.println("=====================");
	   
	   String userid, userpwd, username, userbirth, usergender, userphone, userarea, regdate;
	   
	   System.out.print("> ID: ");
	   userid = keyin.next();
	   
	   Check d = dietService.selectCheck(check);
	   
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
	
	
	public void menu() {
	   System.out.println("\n [[회원 운동 관리]]");
	   System.out.println("=================");
	   System.out.println("1. 회원 정보 입력");
	   System.out.println("2. 회원 신체 정보 입력");
	   System.out.println("3. 운동 여부 기록");	//input
	   System.out.println("4. 운동 기록 조회");  //selectCheck
	   System.out.println("5. 유저 한명 조회");
	   System.out.println("6. 회원 탈퇴");
	   System.out.println("7. 회원 정보 조회");
	   System.out.println("0. 프로그램 종료");
	   System.out.println("=================");
	   System.out.print(">>선택하세요: ");
	   }
	}