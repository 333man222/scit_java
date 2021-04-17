import java.util.Scanner;

public class IfTest3 {
	public static void main (String[] args) {
		Scanner keyin = new Scanner(System.in);
		int mat, kor, eng ;
		double score;
		
		System.out.println("수학점수, 국어점수, 영어점수를 입력하시오.");
		System.out.print("수학 : ");
		mat = keyin.nextInt();
		System.out.print("국어 : ");
		kor = keyin.nextInt();
		System.out.print("영어 : ");
		eng = keyin.nextInt();
		score = (mat + kor + eng) / 3.0;
		
		if (score>=90) {
			System.out.println("당신의 평균점수는 " + score + "점이고, A학점 입니다.");
		} else if (score >=80) {
			System.out.println("당신의 평균점수는 " + score + "점이고, B학점 입니다.");
			} else if (score >=70) {
			System.out.println("당신의 평균점수는 " + score + "점이고, C학점 입니다.");
			} else if (score >=60) {
			System.out.println("당신의 평균점수는 " + score + "점이고, D학점 입니다.");
		} else {
			System.out.println("당신의 평균점수는 " + score + "점이고, F학점 입니다.");
		}
		
	}
}
