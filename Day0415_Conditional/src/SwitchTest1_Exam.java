import java.util.Scanner;

public class SwitchTest1_Exam {

	public static void main(String[] args) {
		Scanner keyin= new Scanner(System.in);
		Scanner set = new Scanner(System.in);
		int num1, num2;
		int menu;
		
		System.out.print("Ã¹¹øÂ° ¼ıÀÚ : ");
		num1 =keyin.nextInt();
		System.out.print("µÎ¹øÂ° ¼ıÀÚ : ");
		num2 =keyin.nextInt();
		
		System.out.println("       [ ¸Ş ´º ] ");
		System.out.println("      1. µ¡  ¼À");
		System.out.println("      2. »¬  ¼À");
		System.out.println("      3. °ö  ¼À");
		System.out.println("      4. ³ª´°¼À");
		System.out.println("===============");
		System.out.print("¼ıÀÚ¸¦ °í¸£¼¼¿ä(1~4) : ");
		menu = set.nextInt();
		
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
