//이름, 국어, 영어, 수학 ==> row data, 평균 ==>계산된 데이터
public class Score {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private double avg;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calcAvg();
	}
	public void setEng(int eng) {
		this.eng=eng;
		calcAvg();
	}
	public void setMat(int mat) {
		this.mat=mat;
		calcAvg();
	}
	
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	
	public void calcAvg() {
		avg = (kor + eng + mat) / 3.0;
	}
	//
	public void output() {
		System.out.println(this.name + " : " + this.kor+ ", "+ eng + ", " + mat + "=>" + avg);
	}
}
