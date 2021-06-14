package diet.vo;

import java.util.Date;
/**
 * 개인 정보를 저장할 VO 클래스
 */
public class Diet_project {
	private int check_seq;
	private String user_id;
	private String recom_id;
	private String recom_exer;
	private String exer_status;
	private String exer_date;
	public Diet_project() {
	}
	public Diet_project(int check_seq, String user_id, String recom_id, String recom_exer, String exer_status,
			String exer_date) {
		super();
		this.check_seq = check_seq;
		this.user_id = user_id;
		this.recom_id = recom_id;
		this.recom_exer = recom_exer;
		this.exer_status = exer_status;
		this.exer_date = exer_date;
	}
	public int getCheck_seq() {
		return check_seq;
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
	public void setCheck_seq(int check_seq) {
		this.check_seq = check_seq;
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
		return "Diet_project [check_seq=" + check_seq + ", user_id=" + user_id + ", recom_id=" + recom_id
				+ ", recom_exer=" + recom_exer + ", exer_status=" + exer_status + ", exer_date=" + exer_date + "]";
	}
}// 기본생성자 만들기