//2과목 시험에서
//평균이 60점이상이면 "합격"
//각 과목이 40점 미만이면 평균이 60이상이어도 "불합격"
public class IfTest2 {

	public static void main(String[] args) {
		int score1 = 80, score2 = 42 , total;
		double avg;
		String result;
/*		total = score1 + score2;
		avg = total / 2.0;
		
		if(score1 < 40 && score2 <40) {
			System.out.println("불합격");
		}
		if(avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
*/		
		total = score1 + score2;
		avg = total / 2.0;
		
		if(avg >=60 && score1>= 40 && score2>=40) {
			result = "합격";
		} else {
			result = "불합격";
		}
		System.out.println(result);
	}

}
