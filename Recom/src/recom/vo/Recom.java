package recom.vo;

public class Recom {
	private String recom_id;
	private String recom_exer;
	private int kcal;
	public Recom() {
	}
	public Recom(String recom_id, String recom_exer, int kcal) {
		super();
		this.recom_id = recom_id;
		this.recom_exer = recom_exer;
		this.kcal = kcal;
	}
	public String getRecom_id() {
		return recom_id;
	}
	public String getRecom_exer() {
		return recom_exer;
	}
	public int getKcal() {
		return kcal;
	}
	public void setRecom_id(String recom_id) {
		this.recom_id = recom_id;
	}
	public void setRecom_exer(String recom_exer) {
		this.recom_exer = recom_exer;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	public String toString() {
		return "Recom [recom_id=" + recom_id + ", recom_exer=" + recom_exer + ", kcal=" + kcal + "]";
	}
	
	
	
	
	
}
