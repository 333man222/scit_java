package net.scit41.except;

import java.util.Scanner;

// ����(����) 5�� �Է¹޾� �հ� ���ϴ� ���α׷�
// 
public class ExceptionTest2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int sum = 0, input;
		int i = 0;
		
		while(true) {
			try {	
				System.out.print("> ���� �Է� : ");
				input = keyin.nextInt();
				sum += input;
				i++;
				System.out.println(i + "ȸ : �հ�=> " + sum);
				if(i>=5) break;
			} catch(Exception e) {
				// e.printStackTrace();
				keyin.nextLine();	//stdin(�Է¹���)�� ����� ���� ����
				
			} 
		}
		System.out.println("��");
		
	}

}

//if (PhoneNo.charAt(i) < '0' || PhoneNo.charAt(i) > '9') {
//	System.out.println("��ȭ��ȣ�� �ݵ�� ���ڷθ� �̷���� �־�� �մϴ�.");
//	return;
//}