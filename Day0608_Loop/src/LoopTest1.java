import java.util.Scanner;

public class LoopTest1 {

	public static void main(String[] args) {
		//����� ���� ; ���ǽ�(if); ������
		Scanner keyin = new Scanner (System.in);
		
		int dan = 3; //��������
		
		for(int i =1; i<10;i=i+i) {
			System.out.println(dan * i);
		}
		
	/*
	 * �ΰ��� ������ �Է¹ް� �����ϰ��� �ϴ� ������ �Է� �޾Ƽ� 
	 * ������ �ϼ��ϴ� �ڵ带 �ۼ��Ͻÿ�.
	 * ù���� ���� : 	_
	 * �ι��� ���� : 	_
	 * 1.����
	 * 2.����
	 * 3.����
	 * 4.������
	 * ================
	 * ���꼱�� : 
	 * ��� : 
	 * 
	 * 	
	 */
	int a,b;
	int cal;
	System.out.print("ù��° ���� �Է� : ");
	a = keyin.nextInt();
	System.out.print("�ι�° ���� �Է� : ");
	b= keyin.nextInt();

	
	while(true) {
		
		System.out.println("� ����?");
		System.out.println(" 1. ����");
		System.out.println(" 2. ����");
		System.out.println(" 3. ����");
		System.out.println(" 4. ������");
		System.out.print("���� ���� : ");
		cal = keyin.nextInt();
		
		
		switch(cal) {
		case 1:
			System.out.println(a+"+"+b+"="+(a+b));
			return;
		case 2:
			System.out.println(a+"-"+b+"="+(a-b));
			return;
		case 3:
			System.out.println(a+"*"+b+"="+(a*b));
			return;
		case 4:
			System.out.println(a+"/"+b+"="+(a/b));
			return;
			default :
			System.out.println("��ȣ ���Է�");
			continue;
		}
	}
		
		
	}

}
