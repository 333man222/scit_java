
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
		System.out.println("오만원권 : " + a + " 개");
		System.out.println("만원권 : " + b + " 개");
		System.out.println("오천원권 : " + c + " 개");
		System.out.println("천원권 : " + d + " 개");
		System.out.println("오백원짜리 : " + e + " 개");
		System.out.println("백원짜리 : " + f + "개");
		System.out.println("오십원짜리 : " + g + " 개");
		System.out.println("십원짜리 : " + h + "개");
		
	}
	/*		int money = 254860;
		int m50000, m10000, m5000, m1000, m500, m100, m10, temp ;
		
		m50000 = money / 50000;
		temp = money - (m50000 * 50000);
		System.out.println("50000원짜리 : " + m50000);
		
		m10000 = temp / 10000;
		temp = temp - (m10000 * 10000);
		System.out.println("10000원짜리 : " + m10000);

		m5000 = temp / 5000;
		temp = temp - (m5000 * 5000);
		System.out.println("5000원짜리 : " + m5000);

		m1000 = temp / 1000;
		temp = temp - (m1000 * 1000);
		System.out.println("1000원짜리 : " + m1000);

		m500 = temp / 500;
		temp = temp - (m500 * 500);
		System.out.println("500원짜리 : " + m500);
		
		m100 = temp / 100;
		temp = temp - (m100 * 100);
		System.out.println("100원짜리 : " + m100);
		
		m10 = temp / 10;
		System.out.println("10원짜리 : " + m10);

		
	} */

}
