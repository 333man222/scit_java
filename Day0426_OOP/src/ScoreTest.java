
public class ScoreTest {
	public static void main(String[] args) {
		// constructor은 사용자가 안 만들어도 JVM이 만들어준다.
		// 객체를 생성하고, 초기화 시키는 역할
		Score s = new Score(); // new에 의해서 Score 개체(생성자)를 생성.. ()안에 아무것도 안들어가면 기본생성자 라고 부름
								// 생성 : 기본값으로 생성됨(0, false, null(문자열))
		s.output();
		
		s.setName("홍길동");
		s.setKor(90);
		s.setEng(88);
		s.setMat(82);
		s.output();
		
		s.setMat(90);
		s.output();

		
	}

}
