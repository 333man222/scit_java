package org.scit.apitest;

public class StringTest {

	public static void main(String[] args) {
		// 1)
		String a = "홍길동";
		String b = new String();
		String c = new String("손오공");
		
		// 2)
		byte[] temp = {65,66,77,88};
		String d = new String(temp);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}

}
