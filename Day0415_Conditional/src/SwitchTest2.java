import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int menu;
		int num1 = 10 , num2 = 15;
		System.out.println("       [ ¸Þ ´º ] ");
		System.out.println("      1. µ¡  ¼À");
		System.out.println("      2. »¬  ¼À");
		System.out.println("      3. °ö  ¼À");
		System.out.println("      4. ³ª´°¼À");
		System.out.println("===============");
		System.out.print("°í¸£½Ã¿À(1~4) : ");
		menu = keyin.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
			break;
		case 2 :
			System.out.println(num1 + " - " + num2 + " = " +(num1=num2));
			break;
		case 3 :
			System.out.println(num1 + " ¡¿ " + num2 + " = " +(num1*num2));
			break;
		case 4 :
			System.out.println(num1 + " ¡À " + num2 + " = " +((double)num1/num2));
			break;
		default : 
			System.out.println("Àß¸ø ÀÔ·Â ÇÏ¼Ì½À´Ï´Ù.");
		}
		
	}

}
