import java.util.Scanner;

public class Score_kaisetsu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1) 변수선언
		int kor, eng, mat;
		double avg;
		String score;
		
		// 2) 입력
		System.out.print("# 국어 :");
		kor = scanner.nextInt();
		
		System.out.print("# 영어 :");
		eng = scanner.nextInt();
		
		System.out.print("# 수학 :");
		mat = scanner.nextInt();
		
		avg = (kor + eng + mat) / 3.0; //double형
		
		 // double / int ==> double / double로 자동 변환
					// 95.5 ==>9.55
		
		switch((int)(avg / 10)) {
		case 10 :
		case 9 : score = "A 학점";
		break;
		
		case 8 : score = "B 학점";
		break;
		
		case 7 : score = "C 학점";
		break;
		
		case 6 : score = "D 학점";
		break;
		
		default : score = "F학점";
		
		}
		//System.out.println("평균 : " + avg + ", 학점 : " + score);
		
		// 형식 변환 문자열 : %f : 실수, %d  : 정수, %c : 캐릭터 ,%s :스트링,, 문자열 , %% :%그 자체, %n :줄바꿈
		System.out.printf("평균 : %.2f, 학점 : %s%n" , avg, score ); // printf는 포맷된 형태의 문자열이 가장 먼저 옴
		//%f가 의미하는 것 :  실수형 데이터를 불러오겠다,기본 소숫점 6자리까지만 데려오고 %.2f 는 소숫점 두자리까지만 불러온다는 뜻
		System.out.println("이상");
	}

}
