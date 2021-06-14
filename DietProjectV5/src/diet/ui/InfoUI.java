package diet.ui;

// checklist 조회시 check_seq 값이 전부 0으로 나옴, checklist쪽 2.운동 기록 입력 실행시 오류

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
				System.out.println("\n [[회원 정보 관리]]");
				System.out.println("=================");
				System.out.println("1. 회원 정보 입력");
				System.out.println("2. 회원 정보 조회");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 정보 삭제");
				System.out.println("5. 메뉴 돌아가기");
				System.out.println("0. 종                 료");	
				System.out.println("=======================");
				System.out.print("> 번호 입력 : ");

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
					System.out.println("**프로그램이 종료됐습니다.");
					return;
				default:
					System.out.println("**번호를 잘못 입력했습니다.");
					continue;
				}
				break;


			case "2" :
				System.out.println("\n [[회원 신체정보 관리]]");
				System.out.println("=================");
				System.out.println("1. 회원 신체 정보 입력");
				System.out.println("2. 회원 신체 정보 조회");
				System.out.println("3. 회원 신체 정보 수정");
				System.out.println("4. 회원 신체 정보 삭제");
				System.out.println("5. 메뉴 돌아가기");
				System.out.println("0. 종                 료");	
				System.out.println("=======================");
				System.out.print("> 번호 입력 : ");
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
					System.out.println("**프로그램이 종료됐습니다.");
					return;
				default:
					System.out.println("**번호를 잘못 입력했습니다.");
					continue;	
				}
				break;


			case "3" :
				System.out.println("\n [[신체 타입별 추천 운동 관리]]");
				System.out.println("=================");
				System.out.println("1. 추천 운동 입력 ");
				System.out.println("2. 추천 운동 전체 조회");
				System.out.println("3. 타입에 따른 추천 운동 검색");
				System.out.println("4. 추천 운동 조회");
				System.out.println("5. 추천 운동 수정");
				System.out.println("6. 추천 운동 삭제");
				System.out.println("7. 메뉴 돌아가기");
				System.out.println("0. 종                 료");	
				System.out.println("=======================");
				System.out.print("> 번호 입력 : ");
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
					System.out.println("**프로그램이 종료됐습니다.");
					return;
				default:
					System.out.println("**번호를 잘못 입력했습니다.");
					continue;					
				}
				break;

			case "4" :
				System.out.println("\n [[ 운동 확인 ]]");
				System.out.println("=================");
				System.out.println("1. 회원 정보 & 운동 입력");
				System.out.println("2. 운동 기록 입력");
				System.out.println("3. 운동 기록 조회");
				System.out.println("4. 전체 운동 기록 조회");
				System.out.println("5. 운동 기록 수정");
				System.out.println("6. 운동 기록 삭제");
				System.out.println("7. 메뉴 돌아가기");
				System.out.println("0. 종                 료");	
				System.out.println("=======================");
				System.out.print("> 번호 입력 : ");
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
					System.out.println("**프로그램이 종료됐습니다.");
					return;
				default:
					System.out.println("**번호를 잘못 입력했습니다.");
					continue;	
				}
				break;
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("**번호를 잘못 입력했습니다.");
				continue;	
			}

		}
	}


	private void deleteExer() {
		System.out.println("\n  [[ 운동 기록 삭제 ]]");
		System.out.println("=======================");
		System.out.println(exer.selectAll());
		int seq;
		System.out.print("> 삭제할 운동 번호 :");
		try {
			seq = keyin.nextInt();
		} catch (Exception e) {
			System.out.println(" 운동 번호는 숫자만 입력 가능합니다.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		int result = exer.deleteExer(seq);

		if(result == 0) {
			System.out.println("** 기록이 존재하지 않아 삭제 실패.");
		} else {
			System.out.println("** 삭제 완료");	
		}

	}


	private void updateExer() {
		System.out.println("\n  [[ 기록 정보 수정 ]]");
		System.out.println("=======================");

		String  id, exerstat, exerdate;

		int exertime;


			System.out.print("> user id 입력 : ");
			id = keyin.nextLine();

		keyin.nextLine();

		Exer ex = exer.selectExerId(id);
		System.out.println(ex);
		if(ex == null) {
			System.out.println("** 해당 번호가 존재하지 않습니다.");
			return;
		}		

		System.out.print("> 운동 여부 수정(o,x 로만 입력) : ");
		exerstat = keyin.nextLine();

		if((!exerstat.equals("o"))  && (!exerstat.equals("x"))) {
			System.out.println("**운동 여부는 o/x로만 입력 가능합니다!");
			return;
		}

		try {
			System.out.print("운동시간 입력");
			exertime = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** 숫자로만 입력이 가능합니다.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();

		System.out.print("운동 날짜 입력");
		exerdate = keyin.nextLine();
		if((exerdate.length() != 9)) {
			System.out.println("날짜 입력 형식 예) 2021-06-05");
			return;
		}else if((exerdate.charAt(4) != '-')) {
			System.out.println("날짜 입력 형식 예) 2021-06-05");
			return;
		} else if(exerdate.charAt(7) != '-') {
			System.out.println("날짜 입력 형식 예) 2021-06-05");
			return;
		}

		Exer exe = new Exer(ex.getCheck_seq(), 0,null, null, null, exerstat, exertime, exerdate);
		int result = exer.updateExer(exe);

		if(result == 0) 
			System.out.println("수정 실패");
		else 			
			System.out.println("** 수정 성공");

	}

	private void selectAll() {
		System.out.println("\n    [[ 전체 조회 ]]");
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
				System.out.println("** 메뉴 선택을 잘못했습니다.");
				return ;
			}
			
			System.out.print("> 검색 키워드 입력 : ");
			searchWord = keyin.next();

			List<Exer> list = exer.selectExer(searchItem, searchWord);
			if(list == null) {
				System.out.println("** 검색된 정보가 없습니다.");
				return;
			}
			
			for(Exer b : list)
				System.out.println(b);
		}
	private void subMenu() {
		System.out.println("\n    [[ 운동 검색 ]]");
		System.out.println("=======================");
		System.out.println("    1) user id로 검색");
		System.out.println("    2) 운동번호(recom_id)로 검색");
		System.out.println("    3) 운동이름으로 검색");
		System.out.println("    0) 메인으로");
		System.out.println("=======================");
		System.out.print  ("       > 선택 : ");
		
	}
	
	private void insertExerId() {

		String userid, exerstat;
		int  time;
		System.out.print("> ID: ");
		userid = keyin.nextLine();
		Exer exe = exer.selectExerId(userid);
		if (exe == null) {
			System.out.println("**체크리스트 를 먼저 작성해주세요");
			return;
		}
		System.out.print("> 운동 여부 (o,x 로만 입력) : ");
		exerstat = keyin.nextLine();

		if((!exerstat.equals("o"))  && (!exerstat.equals("x"))) {
			System.out.println("**운동 여부는 o/x로만 입력 가능합니다!");
			return;
		}
		int t = 0;
		if(exerstat.equals("o")) {

			try {
				System.out.println("> 운동 시간(분) : ");
				time = keyin.nextInt();
				keyin.nextLine();	
			} catch (Exception e) {
				System.out.println("** 숫자로만 입력이 가능합니다.");
				keyin.nextLine();
				return;
			}
			time = t;
		}
		Exer ser = new Exer(0, 0,exe.getUser_id(),exe.getRecom_id(), exe.getRecom_exer(), exerstat, t, null);

		int result = exer.insertExer(ser);

		if(result == 0) 
			System.out.println("기록 실패");
		else 			
			System.out.println("** 기록 성공");	
	}

	private void insertExer() {
		System.out.println("[[회원 운동 기록 입력]]");
		System.out.println("==================");

		String userid, recomid, recomexer, exerstat;
		int  time;
		System.out.print("> ID: ");
		userid = keyin.nextLine();
		Info d = service.selectOne(userid);

		if (d == null) {
			System.out.println("**회원 정보를 먼저 입력해 주세요");
			return;
		}

		System.out.print("> EXCERCISE ID: ");
		recomid = keyin.nextLine();
		Recom recom = re.searchrecom(recomid);

		if (recom == null) {
			System.out.println("** 타입별 추천운동 번호를 먼저 확인해 주세요");
			return;
		}

		System.out.println("> 운동 종류 : ");
		recomexer = keyin.nextLine();

		System.out.print("> 운동 여부 (o,x 로만 입력) : ");
		exerstat = keyin.nextLine();

		if((!exerstat.equals("o"))  && (!exerstat.equals("x"))) {
			System.out.println("**운동 여부는 o/x로만 입력 가능합니다!");
			return;
		}
		int t = 0;
		if(exerstat.equals("o")) {
			

			try {
				System.out.println("> 운동 시간(분) : ");
				time = keyin.nextInt();
				keyin.nextLine();	
			} catch (Exception e) {
				System.out.println("** 숫자로만 입력이 가능합니다.");
				keyin.nextLine();
				return;
			}
			time = t;
		}


		Exer ser = new Exer(0,0, d.getUser_id(),recom.getRecom_id(), recomexer,exerstat, t, null);

		int result = exer.insertExer(ser);

		if(result == 0) 
			System.out.println("기록 실패");
		else 			
			System.out.println("** 기록 성공");		
	}


	private void deleterecom() {
		System.out.println("\n  [[ 운동 삭제 ]]");
		System.out.println("=======================");

		String recomid;

		System.out.print("> 운동 ID : ");
		recomid = keyin.nextLine();

		int result = re.deleterecom(recomid);

		if(result == 0) System.out.println("** 삭제 실패");
		else System.out.println("** 삭제 성공");
	}

	private void updaterecom() {
		System.out.println("\n  [[ 운동 정보 수정 ]]");
		System.out.println("=======================");

		String recomid, recomexer; int kcal;

		System.out.print("> 운동 ID : ");
		recomid = keyin.nextLine();

		Recom r = re.searchrecom(recomid);
		if(r == null) {
			System.out.println("** 존재하지 않는 아이디입니다.");
			return;
		}		

		System.out.print("> 추천운동: ");
		recomexer = keyin.nextLine();
		if(recomexer == null) {
			System.out.println("**추천운동을 입력하세요!");
		}

		try {
			System.out.print("> 소모칼로리: ");
			kcal = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** 숫자로만 입력이 가능합니다.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		Recom recom = new Recom(recomid, recomexer, kcal);
		int result = re.updaterecom(recom);

		if(result == 0) System.out.println("** 수정 오류");
		else System.out.println("** 수정 성공");

	}

	private void searchrecom() {
		System.out.println("\n  [[ 운동 조회 ]]");
		System.out.println("=======================");

		String recomid;

		System.out.print("> 운동 ID : ");
		recomid = keyin.nextLine();

		Recom recom = re.searchrecom(recomid);

		if(recom == null) System.out.println("** 정보가 존재하지 않음");
		else System.out.println(recom);
	}

	private void searchtyperecom() {
		System.out.println("\n  [[ 타입별 운동 조회 ]]");
		System.out.println("=======================");

		String type;
//exception a~e 만 입력받기
		System.out.print("> 검색할 타입(a~e) : ");
		type = keyin.nextLine();
		
//		int s;
//		 s = Integer.parseInt(type);
//		if(!(97 <= s && s <= 102)) {
//			System.out.println("a~e까지의 문자열만 입력 가능합니다.");
//			return;
//		}
		
		List<Recom> list= re.searchtyperecom(type);

		if(list == null) System.out.println("** 정보가 존재하지 않음");
		else System.out.println(list);

	}

	private void selectAllrecom() {
		System.out.println("\n    [[ 전체 조회 ]]");
		System.out.println("=======================");

		List<Recom> list= re.selectAllrecom();

		for(Recom temp:list)
			System.out.println(temp);
	}

	private void insertrecom() {
		System.out.println("\n [[운동 정보 입력]]");
		System.out.println("=====================");

		String recomid, recomexer; int kcal;

		System.out.print("> 운동 ID : ");
		recomid = keyin.nextLine();

		Recom r = re.searchrecom(recomid);
		if(r != null) {
			System.out.println("** 사용 불가능한 아이디입니다.");
			return;
		}

		System.out.print("> 추천운동: ");
		recomexer = keyin.nextLine();
		if(recomexer == null) {
			System.out.println("**추천운동을 입력하세요!");
		}
		try {
			System.out.print("> 소모칼로리: ");
			kcal = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** 숫자로만 입력이 가능합니다.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		if(kcal == 0) {
			System.out.println("**소모칼로리를 입력하세요!");
		}

		Recom recom = new Recom(recomid, recomexer,kcal);

		int result = re.insertrecom(recom);

		if(result == 0) System.out.println("** 입력 실패");
		else            System.out.println("** 입력 성공");
	}


	private void deleteBody() {

		System.out.println("\n [[회원 탈퇴]]");
		System.out.println("=====================");

		String user_id;
		System.out.print("> ID: ");
		user_id = keyin.nextLine();

		int result2 = b.deleteBody(user_id);

		if(result2 == 0) System.out.println("** 회원 정보 없음");
		else System.out.println("**회원 탈퇴 성공");
	}


	private void updateBody() {

		String user_id, body_type, recom_id = null;
		int height, weight, intensity;
		double body_bmi;	

		System.out.println("\n [[회원 신체 정보 수정]]");
		System.out.println("=====================");
		System.out.print(">ID: ");
		user_id = keyin.next();

		Body bodyinfo1 = b.selectBody(user_id);
		System.out.println(bodyinfo1);
		if( bodyinfo1 == null) {
			System.out.println("**정보 없음.");
			return;
		}

		try {	
			System.out.print(" 신장(cm) 변경 >> ");
			height = keyin.nextInt();
			System.out.print(" 체중(kg) 변경 >> ");
			weight = keyin.nextInt();
			System.out.print("> 운동 강도 변경 (1(고)~5(저)단계) >> ");
			intensity = keyin.nextInt();
		} catch (Exception e) {
			System.out.println("** 숫자로만 입력이 가능합니다.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		if (!(1<= intensity && intensity<=5)) {
			System.out.println("1 (강도↑) ~ 5 (강도↓) 까지의 숫자만 입력 가능합니다.");
			return;
		}
		body_bmi = (double)weight * 9998 / ((double)height * (double)height);
		Math.round((double)(body_bmi*100)/100);

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

		Body body = new Body(bodyinfo1.getUser_id(), height, weight, body_bmi, body_type, recom_id);

		int result1 = b.updateBody(body);

		if(result1 == 0) {
			System.out.println("**정보 수정 실패.");
		}else System.out.println("**정보 수정 성공.");
	}


	private void selectBody() {
		System.out.println("\n [[회원 신체 정보 조회]]");
		System.out.println("=====================");
		String user_id;
		System.out.print("> ID: ");
		user_id = keyin.nextLine();

		Body bodyinfo = b.selectBody(user_id);

		if(bodyinfo == null) System.out.println("** 회원 정보가 없습니다.");
		else System.out.println(bodyinfo);		
	}


	private void insertBody() {

		String user_id, body_type, recom_id = null;
		int height, weight, intensity;
		double body_bmi;				

		System.out.print("> 아이디 입력 : ");
		user_id = keyin.next(); 
		keyin.nextLine();
		Info d = service.selectOne(user_id);

		if(d == null) {
			System.out.println("**회원 정보를 먼저 입력해 주세요");
			return;
		}

		try {
			System.out.print("> 키(cm) : ");
			height = keyin.nextInt();
			System.out.print("> 몸무게(kg) : ");
			weight = keyin.nextInt();
			System.out.print("> 운동 강도 (1(고)~5(저)단계) : ");
			intensity = keyin.nextInt(); 
		} catch (Exception e) {
			System.out.println("** 숫자로만 입력이 가능합니다.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();
		body_bmi = (double)weight * 9998 / ((double)height * (double)height);
		Math.round((body_bmi*100)/100.0);

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

		int result = b.insertBody(new Body(user_id, height, weight, body_bmi, body_type, recom_id));		
		if(result == 1)
			System.out.println("** 신체정보 저장 완료");
		else
			System.out.println("** 신체정보 저장 실패");

	}


	private void deleteInfo() {
		System.out.println("\n [[회원 탈퇴]]");
		System.out.println("=====================");
		String userid;
		System.out.print("> ID: ");
		userid = keyin.nextLine();

		int result2 = service.deleteOne(userid);

		if(result2 == 0) System.out.println("** 회원 정보 없음");
		else System.out.println("**회원 탈퇴 성공");
	}




	private void updateInfo() {
		System.out.println("\n [[회원 정보 수정]]");
		System.out.println("=====================");

		String userid, userpwd, userphone, userarea;

		System.out.print(">ID: ");
		userid = keyin.nextLine();

		Info d2 = service.selectOne(userid);

		if(d2 == null) {
			System.out.println("아이디를 다시 확인해 주세요.");
			return;
		}

		System.out.print("> 비밀번호 변경 : ");
		userpwd = keyin.nextLine();

		System.out.print("> 전화번호 변경 : ");
		userphone = keyin.nextLine();
		if((userphone.length() != 13)) {
			System.out.println("잘못된 전화번호 입니다.");
			return;
		}else if((userphone.charAt(3) != '-')) {
			System.out.println("잘못된 전화번호 입니다.");
			return;
		} else if(userphone.charAt(8) != '-') {
			System.out.println("잘못된 전화번호 입니다.");
			return;
		}

		System.out.print("> 주소 변경 : ");
		userarea = keyin.nextLine();

		Info diet = new Info(d2.getUser_id(), userpwd, null, 0, null, userphone, userarea, null);

		int result1 = service.update(diet);

		if(result1 == 0) 
			System.out.println("**정보 수정 실패.");
		else System.out.println("**정보 수정 성공.");

	}

	private void selectInfo() {
		System.out.println("\n [[회원 정보 조회]]");
		System.out.println("=====================");

		String userid;
		System.out.print("> ID: ");
		userid = keyin.nextLine();

		Info userinfo = service.selectOne(userid);

		if(userinfo == null) System.out.println("** NO INFO");
		else System.out.println(userinfo);		
	}

	private void inputInfo() {
		System.out.println("\n [[회원 정보 입력]]");
		System.out.println("=====================");

		String userid, userpwd, username, usergender, userphone, userarea;
		int userbirth;

		System.out.print("> ID: ");
		userid = keyin.nextLine();

		Info d = service.selectOne(userid);

		if(d != null) {
			System.out.println("**중복된 아이디입니다!");
			return;
		}
		else System.out.println("** 사용 가능한 아이디입니다.");

		System.out.print("> PW: ");
		userpwd = keyin.nextLine();
		if(userpwd == null) {
			System.out.println("**비밀번호를 입력하세요!");
		}

		System.out.print("> NAME: ");
		username = keyin.nextLine();
		if(username == null) {
			System.out.println("**이름을 입력하세요!");
		}

		System.out.print("> AGE: ");
		try 
		{ 
			userbirth = keyin.nextInt(); 

		} catch (Exception e) {
			System.out.println("** 숫자로만 입력이 가능합니다.");
			keyin.nextLine();
			return;
		}
		keyin.nextLine();

		System.out.print("> GENDER(남/여로만 입력해 주세요): ");
		usergender = keyin.nextLine();
		if((!usergender.equals("남"))  && (!usergender.equals("여"))) {
			System.out.println("성별은 남/여로만 입력 가능합니다!");
			return;
		}

		System.out.print("> PHONE NUMBER: ");
		userphone = keyin.nextLine();
		if((userphone.length() != 13)) {
			System.out.println("잘못된 전화번호");
			return;
		}else if((userphone.charAt(3) != '-')) {
			System.out.println("잘못된 전화번호");
			return;
		} else if(userphone.charAt(8) != '-') {
			System.out.println("잘못된 전화번호");
			return;
		}

		System.out.print("> ADDRESS: ");
		userarea = keyin.nextLine();


		int result = service.insertDiet(new Info(userid, userpwd, username, userbirth, usergender, userphone, userarea, null));
		if(result == 0) System.out.println("** 신체 정보 입력 실패");
		else            System.out.println("** 신체 정보 입력 성공");

	}



	public void menu() {
		System.out.println("\n [[회원 운동 관리]]");
		System.out.println("=================");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 신체 정보 ");
		System.out.println("3. 타입별 추천 운동 ");
		System.out.println("4. 운동 checklist");
		System.out.println("0. 프로그램 종료");
		System.out.println("=================");
		System.out.print(" >>번호를 입력 : ");
	}
}
