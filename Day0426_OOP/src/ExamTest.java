
public class ExamTest {

	public static void main(String[] args) {
		Exam e = new Exam();
		FitnessVO vo = new FitnessVO();
		vo.calcBmi();
		
		e.setBookCode("1111");
		e.setHyouka(5);
		e.setTitle("���ƿ�");
		e.setReview("����ſ�");
		e.setUserid("userid");
		e.setDay("2021.04.26");
		e.setCount(1);
		
		e.output();
		
	}

}
