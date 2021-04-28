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
		// �ֹι�ȣ �Է�
		System.out.print("�ֹ� ��ȣ�� �Է��ϼ��� : ");
		jumin = keyin.next();

		if (jumin.length() != 14) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
			return;
		}
		if (jumin.charAt(6) != '-') {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}

		System.out.println("��������");

		String jumin1 = jumin.replace("-", "").trim();
		
		for (int i = 0; i < jumin1.length(); i++) {

			if (jumin1.charAt(i) < '0' || jumin1.charAt(i) > '9') {
				System.out.println("�ֹι�ȣ�� �ݵ�� ���ڷθ� �̷���� �־�� �մϴ�.");
				return;
			}
		}
		if (jumin1.charAt(6) == '1' || jumin1.charAt(6) == '3') {
			gender = "����";
		} else if (jumin1.charAt(6) == '2' || jumin1.charAt(6) == '4') {
			gender = "����";
		} else {
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
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
			System.out.println("����� " + year + "�� " + month + "�� " + day + "�ϻ� " + gender + "�Դϴ�. ");
		} else {
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		}

	}

}
