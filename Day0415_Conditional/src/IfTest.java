
public class IfTest {

	public static void main(String[] args) {
		int kor, eng, mat, total;
		double avg;
		kor = 89;
		eng = 88;
		mat = 86;
		
		total = kor + eng + mat;
		avg = total / 3.0; 
		
		//버전 1 : 평균 80점 이상이면 "참, 잘했습니다."
		
		if(avg >=80) {
			System.out.println("참, 잘했습니다.");
		}
		//버전 2 : 평균이 80점 이상이면 "Pass", "Fail"
		if(avg>=80) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		//버전 3 : 90>=A, 80>=B, 70>=C, 60>=D, F)
		if(avg >=90) {
			System.out.println("A");
		} else if(avg>=80) {
			System.out.println("B");
		} else if(avg>=70) {
			System.out.println("C");
		} else if(avg >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
