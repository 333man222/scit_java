import java.util.Scanner;

/*키보드로부터3과목의 점수를 입력받아 평균을 구한 후,
  90점이상 A,80점이상 B. 70점이상 C,60점이상D, 이하 F
  switch~case로 구할것!	
 */  
public class Score {

	public static void main(String[] args) {
		System.out.println("국어점수, 수학점수, 영어점수를 입력하시오");
		Scanner keyin = new Scanner(System.in);
		int kor, mat, eng, total; 
		kor = keyin.nextInt();
		mat = keyin.nextInt();
		eng = keyin.nextInt();
		total = (kor + mat + eng) / 3;
		
		switch(total / 10) {
		case 10:
		case 9:
			System.out.println("당신의 평균점수는 " + total + "점이고, A학점 입니다.");
			break;
		case 8:
			System.out.println("당신의 평균점수는 " + total + "점이고, B학점 입니다.");		
			break;
		case 7:
			System.out.println("당신의 평균점수는 " + total + "점이고, C학점 입니다.");
			break;
		case 6:
			System.out.println("당신의 평균점수는 " + total + "점이고, D학점 입니다.");
			break;
		default :
			System.out.println("당신의 평균점수는 " + total + "점이고, F학점 입니다.");
		}
	}

}


