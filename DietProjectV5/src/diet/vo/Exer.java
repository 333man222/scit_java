package diet.vo;



public class Exer {
	private int check_seq;
	private int hitcount;
	private String user_id;
	private String recom_id;
	private String recom_exer;
	private String exer_status;
	private int exer_time;
	private String exer_date;
	public Exer() {}
	public Exer(int check_seq, int hitcount, String user_id, String recom_id, String recom_exer, String exer_status,
			int exer_time, String exer_date) {
		super();
		this.check_seq = check_seq;
		this.hitcount = hitcount;
		this.user_id = user_id;
		this.recom_id = recom_id;
		this.recom_exer = recom_exer;
		this.exer_status = exer_status;
		this.exer_time = exer_time;
		this.exer_date = exer_date;
	}
	public int getCheck_seq() {
		return check_seq;
	}
	public void setCheck_seq(int check_seq) {
		this.check_seq = check_seq;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRecom_id() {
		return recom_id;
	}
	public void setRecom_id(String recom_id) {
		this.recom_id = recom_id;
	}
	public String getRecom_exer() {
		return recom_exer;
	}
	public void setRecom_exer(String recom_exer) {
		this.recom_exer = recom_exer;
	}
	public String getExer_status() {
		return exer_status;
	}
	public void setExer_status(String exer_status) {
		this.exer_status = exer_status;
	}
	public int getExer_time() {
		return exer_time;
	}
	public void setExer_time(int exer_time) {
		this.exer_time = exer_time;
	}
	public String getExer_date() {
		return exer_date;
	}
	public void setExer_date(String exer_date) {
		this.exer_date = exer_date;
	}
	@Override
	public String toString() {
		return "Exer [check_seq=" + check_seq + ", hitcount=" + hitcount + ", user_id=" + user_id + ", recom_id="
				+ recom_id + ", recom_exer=" + recom_exer + ", exer_status=" + exer_status + ", exer_time=" + exer_time
				+ ", exer_date=" + exer_date + "]";
	}


}