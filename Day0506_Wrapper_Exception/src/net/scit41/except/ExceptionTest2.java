package net.scit41.except;

import java.util.Scanner;

// 숫자(정수) 5개 입력받아 합계 구하는 프로그램
// 
public class ExceptionTest2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int sum = 0, input;
		int i = 0;
		
		while(true) {
			try {	
				System.out.print("> 값을 입력 : ");
				input = keyin.nextInt();
				sum += input;
				i++;
				System.out.println(i + "회 : 합계=> " + sum);
				if(i>=5) break;
			} catch(Exception e) {
				// e.printStackTrace();
				keyin.nextLine();	//stdin(입력버퍼)을 지우는 역할 수행
				
			} 
		}
		System.out.println("끝");
		
	}

}

//if (PhoneNo.charAt(i) < '0' || PhoneNo.charAt(i) > '9') {
//	System.out.println("전화번호는 반드시 숫자로만 이루어져 있어야 합니다.");
//	return;
//}