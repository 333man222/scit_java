package org.scit.apitest;

import java.util.Scanner;

public class JuminValidation {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String jumin;
		String gender;

		int[] Num = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int sum = 0;
		int check;
		int temp;
		// 주민번호 입력
		System.out.print("주민 번호를 입력하세요 : ");
		jumin = keyin.next();

		if (jumin.length() != 14) {
			System.out.println("잘못된 주민번호 입니다.");
			return;
		}
		if (jumin.charAt(6) != '-') {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		System.out.println("검증시작");

		String jumin1 = jumin.replace("-", "").trim();
		
		for (int i = 0; i < jumin1.length(); i++) {

			if (jumin1.charAt(i) < '0' || jumin1.charAt(i) > '9') {
				System.out.println("주민번호는 반드시 숫자로만 이루어져 있어야 합니다.");
				return;
			}
		}
		if (jumin1.charAt(6) == '1' || jumin1.charAt(6) == '3') {
			gender = "남자";
		} else if (jumin1.charAt(6) == '2' || jumin1.charAt(6) == '4') {
			gender = "여자";
		} else {
			System.out.println("성별을 잘못입력하셨습니다.");
			return;
		}

		for (int i = 0; i < Num.length; ++i)
			sum += Integer.parseInt(jumin1.substring(i, i + 1)) * Num[i];

		check = Integer.parseInt(jumin1.substring(12, 13));
		temp = (11 - (sum % 11)) % 10;

		String year = jumin.substring(0, 2);
		String month = jumin.substring(2, 4);
		String day = jumin.substring(4, 6);

		if (temp == check) {
			System.out.println("당신은 " + year + "년 " + month + "월 " + day + "일생 " + gender + "입니다. ");
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}

	}

}
