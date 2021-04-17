import java.util.Scanner;
public class InputTest {

	public static void main(String[] args) {
		//객체생성
		Scanner keyin = new Scanner(System.in);
		int data;
		double dbl;
		
		System.out.print("데이터를 입력해주세요 : ");
		data = keyin.nextInt();
		
		System.out.print("실수 데이터를 입력해주세요 : ");
		dbl =keyin.nextDouble();
		System.out.println("입력한 정수 값 : " + data + ", 실수값 : " + dbl);
	}

}
