import java.util.Scanner;

public class String_Next_Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		
		System.out.print("이름을 입력 : ");
		name = scanner.next(); // 하나의 단어만 입력할 수 있다. ex)홍길동 o, 홍 길 동 x
		System.out.println("입력한 이름은 : " + name);
		
	}

}
