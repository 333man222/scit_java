package diet.vo;

public class Info {
	private String user_id;
	private String user_pwd;
	private String user_name;
	private int user_birth;
	private String user_gender;
	private String user_phone;
	private String user_area;
	private String reg_date;
	public Info() {
		// TODO Auto-generated constructor stub
	}
	public Info(String user_id, String user_pwd, String user_name, int user_birth, String user_gender,
			String user_phone, String user_area, String reg_date) {
		super();
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_name = user_name;
		this.user_birth = user_birth;
		this.user_gender = user_gender;
		this.user_phone = user_phone;
		this.user_area = user_area;
		this.reg_date = reg_date;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public int getUser_birth() {
		return user_birth;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public String getUser_area() {
		return user_area;
	}
	public String getReg_date() {
		return reg_date;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setUser_birth(int user_birth) {
		this.user_birth = user_birth;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public void setUser_area(String user_area) {
		this.user_area = user_area;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "Diet [user_id=" + user_id + ", user_pwd=" + user_pwd + ", user_name="
				+ user_name + ", user_birth=" + user_birth + ", user_gender=" + user_gender + ", user_phone="
				+ user_phone + ", user_area=" + user_area + ", reg_date=" + reg_date + "]";
	}
}

 
