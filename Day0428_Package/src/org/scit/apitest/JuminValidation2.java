package org.scit.apitest;

import java.util.Scanner;

public class JuminValidation2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String jumin;

		// �ֹι�ȣ �Է�
		System.out.print("�ֹ� ��ȣ�� �Է��ϼ��� : ");
		jumin = keyin.next();
		
		
		// 1) �ֹι�ȣ�� 14�ڸ�����, ��� '-'�� ������ Ȯ��
		
		System.out.println("��������");
		
		// 2) ������ ����� �Է��ߴ��� Ȯ��
		
		if(!isValid(jumin)) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
			return;
		}
		
		// 3) - ǥ���� ��,�� �����Ͱ� �������� Ȯ�� isNumeric
		
//		if(!(isNumeric(jumin.substring(0,6))) || (!(isNumeric(jumin.substring(7))){
//			System.out.println("���ڷ� �ԷµǾ�� �մϴ�.");
//			return;
//		}
		if(!(isNumeric(jumin.split("-")[0])) || (!(isNumeric(jumin.split("-")[1])))) {
			System.out.println("���ڷ� �ԷµǾ�� �մϴ�.");
			return;
		}
		
		//check
		if(!check(jumin)) {
			System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");
			return;
		}
		String year = jumin.substring(0,2);
		String month = jumin.substring(2,4);
		String day = jumin.substring(4,6);
		char g = jumin.charAt(7);
		
		String gender = (g == '1' || g == '3') ? "����" : "����";
		year = (g == '1' || g == '2') ? "19" + year : "20" + year;
				
		
		System.out.printf("����� %s�� %s�� %s�Ͽ� �¾, %s�Դϴ�.",year,month,day,gender);
		
	}
	/**
	 * �Ķ���ͷ� ���޹��� �ֹι�ȣ�� ��ȿ���� ����.
	 * @param jumin : ��ȿ���� �����ϱ� ���� �ֹι�ȣ
	 * @return : �ֹι�ȣ ��ȿ�� ���ο����� true / false
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
		// System.out.println("������ ���� �ڵ尪 " + checkNumber + ", " + temp);
	}
}
