import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int x;
		System.out.print("정수 입력 : "); 
		x=keyin.nextInt();
		
		if(((char)x >='A' && (char)x<='Z') || ((char)x >='a' && (char)x<='z')) 
		System.out.println((char)x);
		else {
			System.out.println("알파벳을 입력");

		}
	}

}
