
public class Example1 {
	public static void main(String[] args) {
		int money = 254860;
		int a, b, c, d, e, f, g, h ;
		a = money / 50000 ;
		b = money % 50000 / 10000 ;
		c = money % 10000 / 5000 ;
		d = money % 5000 / 1000 ;
		e = money % 1000 / 500 ;
		f = money % 500 / 100 ;
		g = money % 100 / 50 ;
		h = money % 50 / 10 ;
		System.out.println("�������� : " + a + " ��");
		System.out.println("������ : " + b + " ��");
		System.out.println("��õ���� : " + c + " ��");
		System.out.println("õ���� : " + d + " ��");
		System.out.println("�����¥�� : " + e + " ��");
		System.out.println("���¥�� : " + f + "��");
		System.out.println("���ʿ�¥�� : " + g + " ��");
		System.out.println("�ʿ�¥�� : " + h + "��");
		
	}
	/*		int money = 254860;
		int m50000, m10000, m5000, m1000, m500, m100, m10, temp ;
		
		m50000 = money / 50000;
		temp = money - (m50000 * 50000);
		System.out.println("50000��¥�� : " + m50000);
		
		m10000 = temp / 10000;
		temp = temp - (m10000 * 10000);
		System.out.println("10000��¥�� : " + m10000);

		m5000 = temp / 5000;
		temp = temp - (m5000 * 5000);
		System.out.println("5000��¥�� : " + m5000);

		m1000 = temp / 1000;
		temp = temp - (m1000 * 1000);
		System.out.println("1000��¥�� : " + m1000);

		m500 = temp / 500;
		temp = temp - (m500 * 500);
		System.out.println("500��¥�� : " + m500);
		
		m100 = temp / 100;
		temp = temp - (m100 * 100);
		System.out.println("100��¥�� : " + m100);
		
		m10 = temp / 10;
		System.out.println("10��¥�� : " + m10);

		
	} */

}
