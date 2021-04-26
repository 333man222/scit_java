//멤버 변수는 막 접근하지 못하도록 private하게
//외부에서 접근할때는 멤버 메소드를 이용하여 접근하도록 public으로 선언
public class Score {
	private String name; //멤버변수에만 private 붙일 수 있다.
	private int kor;
	private int eng;
	private int mat;
	private double avg;
}
