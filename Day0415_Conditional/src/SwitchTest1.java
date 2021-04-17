import java.util.Scanner;

public class SwitchTest1 {
 public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	
	String family = keyin.nextLine();
	
	
	 switch (family) {
	case "father" : 
		System.out.println("아버지");
		break;
	case "mother" :
		System.out.println("어머니");
		break;
	case "brother" : 
	case "bro" :
		System.out.println("형제");
		break;
	case "sister" :
		System.out.println("자매");
		break;
	default :
		System.out.println("이웃사람");
	}
	 
	 System.out.println("끝");
}
}
