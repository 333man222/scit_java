import java.util.Scanner;

/*키보드로부터3과목의 점수를 입력받아 평균을 구한 후,
  90점이상 A,80점이상 B. 70점이상 C,60점이상D, 이하 F
  switch~case로 구할것!	
 */  

public class Score_Exam {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int kor, mat, eng, avg;
		
		System.out.print("국어점수 : ");
		kor = keyin.nextInt();
		System.out.print("수힉점수 : ");
		mat = keyin.nextInt();
		System.out.print("영어점수 : ");
		eng = keyin.nextInt();
		avg = (kor + mat + eng) / 3;
		switch(avg /10) {
		case 10:
		case 9:
			System.out.println("평균점수 : " + avg + ", A 학점");
		break;
		case 8:
			System.out.println("평균점수 : " + avg + ", B 학점");
		break;
		case 7:
			System.out.println("평균점수 : " + avg + ", C 학점");
		break;
		case 6:
			System.out.println("평균점수 : " + avg + ", D 학점");
		break;
		default :
			System.out.println("평균점수 : " + avg + ", F 학점");
		}
		
		

	}

}
