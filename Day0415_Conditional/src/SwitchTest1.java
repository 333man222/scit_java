import java.util.Scanner;

public class SwitchTest1 {
 public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	
	String family = keyin.nextLine();
	
	
	 switch (family) {
	case "father" : 
		System.out.println("�ƹ���");
		break;
	case "mother" :
		System.out.println("��Ӵ�");
		break;
	case "brother" : 
	case "bro" :
		System.out.println("����");
		break;
	case "sister" :
		System.out.println("�ڸ�");
		break;
	default :
		System.out.println("�̿����");
	}
	 
	 System.out.println("��");
}
}
