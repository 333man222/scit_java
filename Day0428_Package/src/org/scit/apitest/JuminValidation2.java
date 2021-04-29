package org.scit.apitest;

import java.util.Scanner;

public class JuminValidation2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String jumin;

		// 주민번호 입력
		System.out.print("주민 번호를 입력하세요 : ");
		jumin = keyin.next();
		
		
		// 1) 주민번호가 14자리인지, 가운데 '-'가 들어갔는지 확인
		
		System.out.println("검증시작");
		
		// 2) 성별을 제대로 입력했는지 확인
		
		if(!isValid(jumin)) {
			System.out.println("잘못된 주민번호 입니다.");
			return;
		}
		
		// 3) - 표시의 앞,뒤 데이터가 숫자인지 확인 isNumeric
		
//		if(!(isNumeric(jumin.substring(0,6))) || (!(isNumeric(jumin.substring(7))){
//			System.out.println("숫자로 입력되어야 합니다.");
//			return;
//		}
		if(!(isNumeric(jumin.split("-")[0])) || (!(isNumeric(jumin.split("-")[1])))) {
			System.out.println("숫자로 입력되어야 합니다.");
			return;
		}
		
		//check
		if(!check(jumin)) {
			System.out.println("유효하지 않은 주민번호입니다.");
			return;
		}
		String year = jumin.substring(0,2);
		String month = jumin.substring(2,4);
		String day = jumin.substring(4,6);
		char g = jumin.charAt(7);
		
		String gender = (g == '1' || g == '3') ? "남자" : "여자";
		year = (g == '1' || g == '2') ? "19" + year : "20" + year;
				
		
		System.out.printf("당신은 %s년 %s월 %s일에 태어난, %s입니다.",year,month,day,gender);
		
	}
	/**
	 * 파라미터로 전달받은 주민번호가 유효한지 검증.
	 * @param jumin : 유효성을 검증하기 위한 주민번호
	 * @return : 주민번호 유효성 여부에따라 true / false
	 */
	public static boolean isValid(String jumin) {
		if (jumin.length() != 14 || jumin.charAt(6) != '-') {
			return false;
		}
		
		char g = jumin.charAt(7);
		if(!(g >= '1' && g <= '4')) {
			return false;
		}
		return true;
	}
	
	public static boolean isNumeric(String jumin) {
		for(int i=0; i<jumin.length();++i) {
			if(!(jumin.charAt(i) >= '0' && jumin.charAt(i) <='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean check(String jumin) {
		int sum = 0;
		int cnt = 2;
		
		int checkNumber = jumin.charAt(jumin.length()-1) - 48;
		
		for(int i = 0; i<jumin.length()-1; ++i) {
			if(jumin.charAt(i) == '-')	continue;
			sum += ( jumin.charAt(i) - 48 ) * cnt;	// '9'-48 =>9
			cnt++;
			if(cnt == 10) {
				cnt = 2; 
				continue;
			}
		}
		int temp = (11 - (sum % 11)) % 10;
		if(temp != checkNumber)
			return false;
		
		return true;
		// System.out.println("마지막 뜯어온 코드값 " + checkNumber + ", " + temp);
	}
}
