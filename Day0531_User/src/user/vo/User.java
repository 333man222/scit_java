package user.vo;

public class User {
	private String userid;
	private String userpwd;
	private String username;
	private String phone;
	private String birth;
	
	public User() {
		
	}

	public User(String userid, String userpwd, String username, String phone, String birth) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
		this.phone = phone;
		this.birth = birth;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", phone=" + phone
				+ ", birth=" + birth + "]";
	}

}
