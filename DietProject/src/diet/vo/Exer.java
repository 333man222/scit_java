package diet.vo;



public class Exer {
	private String user_id;
	private String recom_id;
	private String recom_exer;
	private String exer_status;
	private String exer_date;
	public Exer(String user_id, String recom_id, String recom_exer, String exer_status, String exer_date) {
		super();
		this.user_id = user_id;
		this.recom_id = recom_id;
		this.recom_exer = recom_exer;
		this.exer_status = exer_status;
		this.exer_date = exer_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getRecom_id() {
		return recom_id;
	}
	public String getRecom_exer() {
		return recom_exer;
	}
	public String getExer_status() {
		return exer_status;
	}
	public String getExer_date() {
		return exer_date;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public void setRecom_id(String recom_id) {
		this.recom_id = recom_id;
	}
	public void setRecom_exer(String recom_exer) {
		this.recom_exer = recom_exer;
	}
	public void setExer_status(String exer_status) {
		this.exer_status = exer_status;
	}
	public void setExer_date(String exer_date) {
		this.exer_date = exer_date;
	}
	@Override
	public String toString() {
		return "Exer [user_id=" + user_id + ", recom_id=" + recom_id + ", recom_exer=" + recom_exer + ", exer_status="
				+ exer_status + ", exer_date=" + exer_date + "]";
	}
}
