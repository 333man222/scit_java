//가로 (m), 세로(m) => 평수로 구하기(1.8181의 제곱) 변환
import java.util.Scanner;

public class InputTest3 {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in);
		double horizontal, vertical;
		double result;
		double pyung = 1.8181 * 1.8181;
		
		System.out.print("가로크기 : ");
		horizontal = keyin.nextDouble();
		
		System.out.print("세로크기 : ");
		vertical = keyin.nextDouble();
		
		result = horizontal * vertical / (1.8181 * 1.8181);
		
		System.out.println("가로 " + horizontal + "세로 " + vertical + "의 크기는 " + result + "평 입니다.");
	}

}
